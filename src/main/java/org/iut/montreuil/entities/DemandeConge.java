package org.iut.montreuil.entities;

public class DemandeConge {
    private Collaborateur collaborateur;
    private Periode periode;

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }
    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }
    public Periode getPeriode() {
        return periode;
    }
    public void setPeriode(Periode periode) {
        this.periode = periode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
