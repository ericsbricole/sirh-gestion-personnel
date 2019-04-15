package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

public class EditerCollaborateurController extends HttpServlet {

	public EditerCollaborateurController(){
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		if (StringUtils.isNotEmpty(matricule)){
			PrintWriter pw = resp.getWriter();
			pw.append("<h1>Édition de collaborateur</h1>")
			.append("<b>")
			.append("<p>Matricule : " + matricule + "</p>");
		}
		else{
			resp.getWriter().write("Un matricule est attendu");
			resp.setStatus(400);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		if (StringUtils.isEmpty(matricule) || StringUtils.isEmpty(titre) || StringUtils.isEmpty(nom) || StringUtils.isEmpty(prenom)) {			
			resp.setStatus(400);
			resp.getWriter().write("<span style='{color:red}'> Au moins un des paramètres n'est pas renseigné</span>");
		}
		else {
			resp.setStatus(201);
			resp.getWriter().write("Création d'un collaborateur abec les informations suivantes");
			resp.getWriter().write("<span matricule = "+matricule+", titre = "+titre+",nom ="+nom+", prenom = "+prenom);			
		}
	}
	
	
}
