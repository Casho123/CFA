import entity.Product;
import entity.Sale;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("Pottah").createEntityManager();

        entityManager.getTransaction().begin();

//        Sale sale = new Sale();
//        sale.setDate(Date.from(Instant.now()));
//
//        Product product = new Product();
//        product.setName("fdsdagdsasfass");
//        product.setPrice(BigDecimal.ONE);
//        product.setQuantity(10);
//        product.getSales().add(sale);
//        sale.setProduct(product);
//
//        entityManager.persist(product);


        entityManager.getTransaction().commit();



    }
}
