package com.example.serv;

public class Etudiant {
   protected String nom;
    protected String prenom;
    protected String formation;
    protected double note;
    public Etudiant ()
    {
        nom = "";
        prenom="";
    }

    public Etudiant(String nom, String prenom, String formation) {
        this.nom = nom;
        this.prenom = prenom;
        this.formation = formation;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFormation() {
        return formation;
    }

    public double getNote() {
        return note;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", formation='" + formation + '\'' +
                ", note=" + note +
                '}';
    }
}
