package org.iut.montreuil.templates;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.iut.montreuil.entities.Collaborateur;

import java.util.List;

public interface CollaborateurDaoTemplate {

    Collaborateur save(Collaborateur collaborateur);

    Collaborateur findById(int id);

    void delete(int id);
}
