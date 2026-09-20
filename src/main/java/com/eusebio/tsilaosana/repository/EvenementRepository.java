package com.eusebio.tsilaosana.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.eusebio.tsilaosana.modele.Evenement;

public class EvenementRepository {

    private static List<Evenement> evenements = new ArrayList<>();
    private static int compteur = 1;

    static {
        evenements.add(new Evenement(String.valueOf(compteur++), "Conference Java", "A venir", new Date(), new Date()));
        evenements.add(new Evenement(String.valueOf(compteur++), "Mariage Dupont", "En cours", new Date(), new Date()));
    }

    public List<Evenement> findAll() {
        return evenements;
    }

    public Evenement findById(String id) {
        if (id == null) {
            return null;
        }
        for (Evenement e : evenements) {
            if (id.equals(e.getIdEvenement())) {
                return e;
            }
        }
        return null;
    }

    public void save(Evenement e) {
        e.setIdEvenement(String.valueOf(compteur++));
        evenements.add(e);
    }

    public void update(Evenement e) {
        for (int i = 0; i < evenements.size(); i++) {
            if (evenements.get(i).getIdEvenement().equals(e.getIdEvenement())) {
                evenements.set(i, e);
                return;
            }
        }
    }

    public void delete(String id) {
        evenements.removeIf(ev -> ev.getIdEvenement().equals(id));
    }
}
