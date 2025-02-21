package org.iut.montreuil.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* org.iut.montreuil.templates.CollaborateurDaoImpl.*(..))")
    public void log() {
        System.out.println("Méthode exécutée dans le DAO Collaborateur");
    }
}
