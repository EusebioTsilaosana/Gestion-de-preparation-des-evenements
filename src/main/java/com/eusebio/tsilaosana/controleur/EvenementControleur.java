package com.eusebio.tsilaosana.controleur;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eusebio.tsilaosana.modele.Evenement;
import com.eusebio.tsilaosana.service.EvenementService;

public class EvenementControleur extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String VUE_LISTE = "/WEB-INF/jsp-admin/vueEvenement/listeEvenements.jsp";
    private static final String VUE_FORMULAIRE = "/WEB-INF/jsp-admin/vueEvenement/formulaireEvenement.jsp";

    private EvenementService service = new EvenementService();

    public EvenementControleur() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null || action.equals("list")) {
            request.setAttribute("evenements", service.lister());
            getServletContext().getRequestDispatcher(VUE_LISTE).forward(request, response);
            return;
        }

        if (action.equals("create")) {
            getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
            return;
        }

        if (action.equals("edit")) {
            String id = request.getParameter("id");
            Evenement evenement = service.trouverParId(id);
            request.setAttribute("evenement", evenement);
            getServletContext().getRequestDispatcher(VUE_FORMULAIRE).forward(request, response);
            return;
        }

        if (action.equals("delete")) {
            String id = request.getParameter("id");
            service.supprimer(id);
            response.sendRedirect(request.getContextPath() + "/EvenementControleur?action=list");
            return;
        }

        request.setAttribute("evenements", service.lister());
        getServletContext().getRequestDispatcher(VUE_LISTE).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("idEvenement");
        String titre = request.getParameter("titre");
        String status = request.getParameter("status");
        String dateDebutStr = request.getParameter("date_heure_debut");
        String dateFinStr = request.getParameter("date_heure_fin");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDebut = null;
        Date dateFin = null;

        try {
            if (dateDebutStr != null && !dateDebutStr.isEmpty()) {
                dateDebut = sdf.parse(dateDebutStr);
            }
        } catch (Exception e) {
            dateDebut = null;
        }

        try {
            if (dateFinStr != null && !dateFinStr.isEmpty()) {
                dateFin = sdf.parse(dateFinStr);
            }
        } catch (Exception e) {
            dateFin = null;
        }

        Evenement evenement = new Evenement();
        evenement.setIdEvenement(id);
        evenement.setTitre(titre);
        evenement.setStatus(status);
        evenement.setDate_heure_debut(dateDebut);
        evenement.setDate_heure_fin(dateFin);

        if (id == null || id.trim().isEmpty()) {
            service.creer(evenement);
        } else {
            service.modifier(evenement);
        }

        response.sendRedirect(request.getContextPath() + "/EvenementControleur?action=list");
    }
}
