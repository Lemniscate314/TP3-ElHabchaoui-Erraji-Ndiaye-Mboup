package com.example.serv;

public class Etudiant {
   protected String nom;
    protected String prenom;
    protected String formation;
    double note;

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
