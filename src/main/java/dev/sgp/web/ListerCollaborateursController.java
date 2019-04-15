package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {

	public ListerCollaborateursController() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
//		resp.getWriter().write("Hello ListerCollaborateursController et tous les petits chatons!");
//		
//		// recupere la valeur d&#39;un parametre dont le nom est avecPhoto
//		String avecPhotoParam = req.getParameter("avecPhoto");
//		// recupere la valeur d&#39;un parametre dont le nom est departement
//		String departementParam = req.getParameter("departement");
//		resp.setContentType("text/html");
//		// code HTML ecrit dans le corps de la reponse
//		resp.getWriter().write("<h1>Liste des collabo</h1>"
//				+ "<ul>"
//				+ "<li>avec Photo=" + avecPhotoParam + "</li>"
//				+ "<li>avec département=" + departementParam+ "</li>"
//				+ "</ul>");
	}

}
