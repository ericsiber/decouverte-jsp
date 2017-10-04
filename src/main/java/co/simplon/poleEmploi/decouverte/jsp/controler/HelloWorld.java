package co.simplon.poleEmploi.decouverte.jsp.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.poleEmploi.decouverte.jsp.model.Personne;

public class HelloWorld extends HttpServlet {

	private String messageGet;
	private String messagePut;

	public void init() throws ServletException {
		messageGet = "Hello ";
		messagePut = "Bonjour ";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = messageGet;
		String parametre = request.getParameter("nom");
		if (parametre != null) {
			message += parametre;
		} else {
			message += "World";
		}

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		String p1Nom = request.getParameter("nom1");
		String p1Prenom = request.getParameter("prenom1");
		Personne p1 = new Personne(p1Prenom, p1Nom.toUpperCase());
		String p2Nom = request.getParameter("nom2");
		String p2Prenom = request.getParameter("prenom2");
		Personne p2 = new Personne(p2Prenom, p2Nom.toUpperCase());

		List<Personne> personnes = new ArrayList<>();
		personnes.add(p1);
		personnes.add(p2);
		
		request.setAttribute("personnes", personnes);
		request.setAttribute("currentDate", new Date());
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/hello.jsp");
		dispatcher.forward(request, response);
	}

	public void destroy() {

	}
}
