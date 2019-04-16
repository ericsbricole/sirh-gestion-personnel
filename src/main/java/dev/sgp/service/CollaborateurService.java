package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.web.Collaborateur;

public class CollaborateurService {
	
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collaborateur) {
		listeCollaborateurs.add(collaborateur);
	}

}