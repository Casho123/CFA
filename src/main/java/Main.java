import entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("Pottah").createEntityManager();

        entityManager.getTransaction().begin();

        Product product = new Product();

        entityManager.getTransaction().commit();



    }
}
