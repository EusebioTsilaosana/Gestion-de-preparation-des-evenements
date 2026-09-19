package com.eusebio.tsilaosana.modele;

public class Invite {
	private String idInvite;
	private String nomInvite;
	private String prenomInvite;
	
	public Invite(String idInvite, String nomInvite, String prenomInvite) {
		super();
		this.idInvite = idInvite;
		this.nomInvite = nomInvite;
		this.prenomInvite = prenomInvite;
	}

	public String getIdInvite() {
		return idInvite;
	}

	public void setIdInvite(String idInvite) {
		this.idInvite = idInvite;
	}

	public String getNomInvite() {
		return nomInvite;
	}

	public void setNomInvite(String nomInvite) {
		this.nomInvite = nomInvite;
	}

	public String getPrenomInvite() {
		return prenomInvite;
	}

	public void setPrenomInvite(String prenomInvite) {
		this.prenomInvite = prenomInvite;
	}
	
}
