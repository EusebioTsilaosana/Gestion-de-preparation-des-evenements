package com.eusebio.tsilaosana.controleur;

import java.io.IOException;
import java.security.SecureRandom;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eusebio.tsilaosana.modele.Evenement;
import com.eusebio.tsilaosana.repository.InterfaceRepoEvenement;


/**
 * Servlet implementation class SaisieEventControleur
 */
//@WebServlet("/SaisieEventControleur")
public class SaisieEventControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final SecureRandom RANDOM = new SecureRandom();
	//private final InterfaceRepoEvenement evenementRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static final String VUE_FORMULAIRE = "/WEB-INF/jsp-admin/vueEvenement/saisieDonneEvent.jsp";
	private static final String VUE_RESULTAT = "/WEB-INF/jsp-admin/vueEvenement/evenement.jsp";
	
   /* public SaisieEventControleur(InterfaceRepoEvenement evenementRepository) {
        this.evenementRepository = evenementRepository;
    }*/
    

	public SaisieEventControleur() {
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int nombre = RANDOM.nextInt(100000);
		String idEvenement = "E-" + String.format("%05d", nombre);
		String titre = request.getParameter("titre");
		String status = "a venir";
		String dateDebutString = request.getParameter("dateDebut");
		LocalDate dateDebut = LocalDate.parse(dateDebutString);
		String dateFinString = request.getParameter("dateFin");
		LocalDate dateFin = LocalDate.parse(dateFinString);
		
		Evenement evenement = new Evenement(idEvenement, titre, status, dateDebut, dateFin);
		System.out.println(evenement.getIdEvenement());
		//evenementRepository.ajoutEvenement(evenement);
		getServletContext().getRequestDispatcher(VUE_RESULTAT).forward(request, response);
	}

}
