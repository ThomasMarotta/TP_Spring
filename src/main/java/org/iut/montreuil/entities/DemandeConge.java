package org.iut.montreuil.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DemandeConge {
    @Autowired
    private Collaborateur collaborateur;
    @Autowired
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
