package com.eusebio.tsilaosana.repository;

import java.util.ArrayList;
import java.util.List;

import com.eusebio.tsilaosana.modele.Evenement;


public class EvenementRepository implements InterfaceRepoEvenement {
	private List<Evenement> listeEvenement = new ArrayList<>();
	@Override
	public void ajoutEvenement(Evenement evm) {
		// TODO Auto-generated method stub
		listeEvenement.add(evm);
	}

}
