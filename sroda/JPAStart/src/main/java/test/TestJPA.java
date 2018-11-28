package test;

import jpamodel.Pracownik;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

    }
}
