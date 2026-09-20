package com.eusebio.tsilaosana.service;

import java.util.List;

import com.eusebio.tsilaosana.modele.Evenement;
import com.eusebio.tsilaosana.repository.EvenementRepository;

public class EvenementService {

    private EvenementRepository repository = new EvenementRepository();

    public List<Evenement> lister() {
        return repository.findAll();
    }

    public Evenement trouverParId(String id) {
        return repository.findById(id);
    }

    public void creer(Evenement e) {
        if (e.getTitre() == null || e.getTitre().trim().isEmpty()) {
            return;
        }
        repository.save(e);
    }

    public void modifier(Evenement e) {
        if (e.getTitre() == null || e.getTitre().trim().isEmpty()) {
            return;
        }
        repository.update(e);
    }

    public void supprimer(String id) {
        repository.delete(id);
    }
}
