package org.iut.montreuil.templates;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.iut.montreuil.entities.Collaborateur;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

@Repository("collaborateurDaoImpl")
@Transactional
public class CollaborateurDaoImpl implements CollaborateurDaoTemplate{

    @PersistenceContext
    private EntityManager em;

    private SessionFactory sessionFactory;

    // Le setter pour sessionFactory
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Collaborateur save(Collaborateur collaborateur) {
        if(collaborateur.getId() == 0){
            em.persist(collaborateur);
        } else {
            em.merge(collaborateur);
        }
        return collaborateur;
    }

    @Override
    public Collaborateur findById(int id) {
        return em.find(Collaborateur.class, id);
    }

    @Override
    public void delete(int id) {
        Collaborateur collaborateur = findById(id);

        if(collaborateur != null){
            em.remove(collaborateur);
        }
    }
}
