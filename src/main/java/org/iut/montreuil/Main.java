package org.iut.montreuil;

import org.iut.montreuil.entities.DemandeConge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DemandeConge demandeConge = (DemandeConge) context.getBean("demandeConge");

        demandeConge.getCollaborateur().setNom("Ricordeau");
        demandeConge.getCollaborateur().setPrenom("Anne");
        demandeConge.getPeriode().setDateDebut("11/01/2001");
        demandeConge.getPeriode().setNbJours(2);

        System.out.println(demandeConge.getCollaborateur().toString());
        System.out.println(demandeConge.getPeriode().toString());
    }
}