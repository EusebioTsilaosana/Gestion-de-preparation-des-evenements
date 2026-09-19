package com.eusebio.tsilaosana.modele;

public class Espace {
	private String idEspace;
	private String nomEspace;
	private String adresse;
	private int capaciteMax;
	private double tarifLocation;
	private boolean parkingDispo;
	
	public Espace(String idEspace, String nomEspace, String adresse, int capaciteMax, double tarifLocation,
			boolean parkingDispo) {
		super();
		this.idEspace = idEspace;
		this.nomEspace = nomEspace;
		this.adresse = adresse;
		this.capaciteMax = capaciteMax;
		this.tarifLocation = tarifLocation;
		this.parkingDispo = parkingDispo;
	}

	public String getIdEspace() {
		return idEspace;
	}

	public void setIdEspace(String idEspace) {
		this.idEspace = idEspace;
	}

	public String getNomEspace() {
		return nomEspace;
	}

	public void setNomEspace(String nomEspace) {
		this.nomEspace = nomEspace;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public double getTarifLocation() {
		return tarifLocation;
	}

	public void setTarifLocation(double tarifLocation) {
		this.tarifLocation = tarifLocation;
	}

	public boolean isParkingDispo() {
		return parkingDispo;
	}

	public void setParkingDispo(boolean parkingDispo) {
		this.parkingDispo = parkingDispo;
	}
	
}
