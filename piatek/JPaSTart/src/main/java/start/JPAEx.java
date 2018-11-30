package start;

import jpamodel.Jednostka;
import jpamodel.Pracownik;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 30.11.2018.
 */
public class JPAEx {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
        .createEntityManagerFactory("PracownicyDB");
        EntityManager em = emf.createEntityManager();
        Pracownik p = em.find(Pracownik.class,3);
        System.out.println(p.getImie());
        System.out.println(p.getNazwisko());
        for ( Jednostka j : p.getJednostki()){
            System.out.println(j.getNazwa());
        }
        System.out.println("==============");
        Query q = em.createNamedQuery("Pracownik.byImie");
        q.setParameter("imie","Juliusz");
        List<Pracownik> w =q.getResultList();
        for (Pracownik wp : w){
            System.out.println(wp.getImie());
            System.out.println(wp.getNazwisko());
            for ( Jednostka j : wp.getJednostki()){
                System.out.println(j.getNazwa());
            }
            System.out.println("---");
        }
    }
}
