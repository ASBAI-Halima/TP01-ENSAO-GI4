package com.ensa.gi4.controller;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;

public class GestionMaterielController {

    private GestionMaterielService gestionMaterielService;

    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }
    public void ajouterNouveauMateriel() {
        gestionMaterielService.ajouterNouveauMateriel();
    }
    public void supprimerMateriel(int id) {
        gestionMaterielService.supprimerMateriel(id);
    }
    public void modifier(int id) {
        gestionMaterielService.modifier(id);
    }

    public void afficherMenu() {
        System.out.println(" afficher la liste du matériel, taper 1");
        System.out.println("  ajouter un nouveau matériel, taper 2");
        System.out.println("  supprimer matériel, taper 3");
        System.out.println("  modifier matériel, taper 4");
        System.out.println("  sortir de l'application, taper 0");
        Scanner input = new Scanner(System.in);
        String next = input.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {
            ajouterNouveauMateriel();
        }
        else if ("3".equals(next)) {
        	System.out.println("Veuillez saisir l'id");
        	 int id= input.nextInt();
        	supprimerMateriel(id);
        }
        else if ("4".equals(next)) {
        	System.out.println("Veuillez saisir l'id");
        	 int id= input.nextInt();
        	modifier(id);
        }else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}