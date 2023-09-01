package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Criar um EntityManagerFactory com base na unidade de persistência definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        // Criar um EntityManager a partir do EntityManagerFactory
        EntityManager em = emf.createEntityManager();

        // Iniciar uma transação
        EntityTransaction transaction = em.getTransaction();

        try {
            List<UsuarioDAO> resultList = new ArrayList<>();
            transaction.begin();

         // Usando JPQL para buscar todos os usuários
            TypedQuery<UsuarioDAO> query = em.createQuery("from usuarios", UsuarioDAO.class);
            resultList = query.getResultList();

            UsuarioDAO usuarioDAO = resultList.stream().findFirst().get();
            System.out.println(usuarioDAO);

            em.remove(usuarioDAO);

            TypedQuery<UsuarioDAO> query2 = em.createQuery("from usuarios", UsuarioDAO.class);
            System.out.println(query.getResultList());
        } catch (Exception e) {
            // Em caso de erro, fazer rollback da transação
            transaction.rollback();
            e.printStackTrace();
        } finally {
            // Fechar a transação
        }
    }
}
