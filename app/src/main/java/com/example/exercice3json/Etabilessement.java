package com.example.exercice3json;

import android.widget.ArrayAdapter;

import java.io.Serializable;
import java.util.ArrayList;

public class Etabilessement implements Serializable {
     private String nom;
     private String Adresse;

    public Etabilessement(String nom, String adresse, String specialite, ArrayList<Filiere> filieres) {
        this.nom = nom;
        Adresse = adresse;
        this.specialite = specialite;
        this.filieres = filieres;
    }

    public Etabilessement() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(ArrayList<Filiere> filieres) {
        this.filieres = filieres;
    }

    private String specialite;
     private ArrayList<Filiere> filieres=new ArrayList<>();
}
