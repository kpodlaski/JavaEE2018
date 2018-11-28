package test;

import jpamodel.Pracownik;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 28.11.2018.
 */
public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory(
                        "PracownicySQLiteDB");
        EntityManager em = emf.createEntityManager();

        //Znajdź osobe o kluczu 2
        Pracownik o =
                (Pracownik) em.find(Pracownik.class, 2);
        System.out.println(o.getImie()+ " "+ o.getNazwisko());
        System.out.println(o.getStanowisko().getNazwa());
        System.out.println(o.getJednostki());

        Query q = em.createNamedQuery("Pracownik.findAll");
        for(Pracownik os : (List<Pracownik>) q.getResultList()){
            System.out.println(os.getImie()+ " "+ os.getNazwisko());
        }
        em.close();
    }
}
