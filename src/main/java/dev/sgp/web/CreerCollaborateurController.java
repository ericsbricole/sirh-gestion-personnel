package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateurController extends HttpServlet {

	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	 private ResourceBundle bundle = ResourceBundle.getBundle("application");
	private String defaultImg = "/WEB-INF/resources/images/user.png";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numSS = req.getParameter("numSS");
		if (numSS.length() != 15) {
			resp.setStatus(400);
		} else {
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String sDateDeNaissance = req.getParameter("dateDeNaissance");
			LocalDate dateDeNaissance = LocalDate.parse(sDateDeNaissance);
			String adresse = req.getParameter("adresse");

			String matricule = nom.charAt(0) + Integer.toString(collabService.listerCollaborateurs().size());
			String emailPro = prenom + nom + "@" + bundle.getString("societe.nom");

			ZonedDateTime creationDateTime = ZonedDateTime.now();
			Collaborateur collaborateur = new Collaborateur(matricule, nom, prenom, dateDeNaissance, adresse, numSS,
					emailPro, defaultImg, creationDateTime, true);
			collabService.sauvegarderCollaborateur(collaborateur);
			req.getRequestDispatcher("/collaborateurs/lister").forward(req, resp);
		}

	}

}
