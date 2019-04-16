package dev.sgp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.sgp.entite.Departement;

public class DepartementService {

	private List<Departement> departements;
	
	public DepartementService() {
		departements.add(new Departement(1, "Comptabilité"));
		departements.add(new Departement(2, "Ressources Humaines"));
		departements.add(new Departement(3, "Informatique"));
		departements.add(new Departement(4, "Administratif"));
	}

}
