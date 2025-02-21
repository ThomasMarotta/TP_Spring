package org.iut.montreuil;

import org.iut.montreuil.entities.Collaborateur;
import org.iut.montreuil.templates.CollaborateurDaoImpl;
import org.iut.montreuil.templates.CollaborateurDaoTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CollaborateurDaoTemplate collaborateurDao = context.getBean("collaboDAO", CollaborateurDaoTemplate.class);

        Collaborateur collaborateur = new Collaborateur();
        collaborateur.setNom("BONNOT");
        collaborateur.setPrenom("Philippe");

        collaborateurDao.save(collaborateur);

        System.out.println("Collaborateur ajouté : " + collaborateur);

        context.close();
    }
}
