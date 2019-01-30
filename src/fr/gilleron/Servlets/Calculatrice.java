package fr.gilleron.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public Calculatrice() {
        super();

    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		//ADDITION
		int addition1 = 0;
        int addition2 = 0;
        
		try {
			addition1 = Integer.parseInt(request.getParameter("addition1"));	
        } catch (java.lang.NumberFormatException e) {	
        }
        request.setAttribute("addition1", addition1);
        

        try {
            addition2 = Integer.parseInt(request.getParameter("addition2"));
        } catch (java.lang.NumberFormatException e) {
        }
        request.setAttribute("addition2", addition2);
        
        if (request.getParameter("opperation").equals("plus")) {  	
            String reponseAddition = "Le resultat de " + addition1 + " + " + addition2 + " est égal à " + (addition1 + addition2);
            request.setAttribute("reponseAddition", reponseAddition);
        }

        
        //SOUSTRACTION
		int soustraction1 = 0;
        int soustraction2 = 0;
        
		try {
			soustraction1 = Integer.parseInt(request.getParameter("soustraction1"));	
        } catch (java.lang.NumberFormatException e) {	
        }
        request.setAttribute("soustraction1", soustraction1);
        
        try {
        	soustraction2 = Integer.parseInt(request.getParameter("soustraction2"));
        } catch (java.lang.NumberFormatException e) {
        }
        request.setAttribute("soustraction2", soustraction2);
        
        if (request.getParameter("opperation").equals("moin")) {
        String reponseSoustraction = "Le resultat de " + soustraction1 + " - " + soustraction2 + " est égal à " + (soustraction1 - soustraction2);
        request.setAttribute("reponseSoustraction", reponseSoustraction);
        }
        
        //DIVISION
		int division1 = 0;
		try {
			division1 = Integer.parseInt(request.getParameter("division1"));	
        } catch (java.lang.NumberFormatException e) {	
        }
        request.setAttribute("division1", division1);
        
        int division2 = 1;
        try {
        	division2 = Integer.parseInt(request.getParameter("division2"));
        } catch (java.lang.NumberFormatException e) {
        }
        request.setAttribute("division2", division2);
        
        if (request.getParameter("opperation").equals("division")) {
        String reponseDivision = "Le resultat de " + division1 + " / " + division2 + " est égal à " + (division1 / division2);
        request.setAttribute("reponseDivision", reponseDivision);
        }
        
        //DIVISION
		int multiplication1 = 0;
		try {
			multiplication1 = Integer.parseInt(request.getParameter("multiplication1"));	
        } catch (java.lang.NumberFormatException e) {	
        }
        request.setAttribute("multiplication1", multiplication1);
        
        int multiplication2 = 0;
        try {
        	multiplication2 = Integer.parseInt(request.getParameter("multiplication2"));
        } catch (java.lang.NumberFormatException e) {
        }
        request.setAttribute("multiplication2", multiplication2);
        
        if (request.getParameter("opperation").equals("multi")) {
        String reponseMultiplication = "Le resultat de " + multiplication1 + " * " + multiplication2 + " est égal à " + (multiplication1 * multiplication2);
        request.setAttribute("reponseMultiplication", reponseMultiplication);
        }
        
        
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
	}

}
