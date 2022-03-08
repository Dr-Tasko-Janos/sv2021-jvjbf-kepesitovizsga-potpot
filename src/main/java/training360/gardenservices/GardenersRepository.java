package training360.gardenservices;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class GardenersRepository {


    private EntityManagerFactory factoryGardener = Persistence.createEntityManagerFactory("pu");

    public void addGardener(String name) {
        EntityManager em = factoryGardener.createEntityManager();
        em.getTransaction().begin();
        Gardener gardener = new Gardener(name);
        em.persist(gardener);
        em.close();
    }


}
