package com.eusebio.tsilaosana.modele;

import java.time.LocalDate;

public class Evenement {
	private String idEvenement;
	private String titre;
	private String status;
	private LocalDate date_heure_debut;
	private LocalDate date_heure_fin;
	
	public Evenement(String idEvenement, String titre, String status, LocalDate dateDebut, LocalDate dateFin) {
		this.idEvenement = idEvenement;
		this.titre = titre;
		this.status = status;
		this.date_heure_debut = dateDebut;
		this.date_heure_fin = dateFin;
	}

	public String getIdEvenement() {
		return idEvenement;
	}

	public void setIdEvenement(String idEvenement) {
		this.idEvenement = idEvenement;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDate_heure_debut() {
		return date_heure_debut;
	}

	public void setDate_heure_debut(LocalDate date_heure_debut) {
		this.date_heure_debut = date_heure_debut;
	}

	public LocalDate getDate_heure_fin() {
		return date_heure_fin;
	}

	public void setDate_heure_fin(LocalDate date_heure_fin) {
		this.date_heure_fin = date_heure_fin;
	}
	
}
