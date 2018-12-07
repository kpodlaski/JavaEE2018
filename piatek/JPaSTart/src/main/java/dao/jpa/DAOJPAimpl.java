package dao.jpa;

import dao.DAO;
import jpamodel.Jednostka;
import jpamodel.Pracownik;
import jpamodel.Stanowisko;

import java.util.List;

/**
 * Created by Krzysztof Podlaski on 07.12.2018.
 */
public class DAOJPAimpl implements DAO {
    public Pracownik getPracownikById(int id) {
        return null;
    }

    public List<Pracownik> getAllPracownicy() {
        return null;
    }

    public List<Pracownik> getPracownikByImie(String imie) {
        return null;
    }

    public List<Pracownik> getPracownikByNazwisko(String nazwisko) {
        return null;
    }

    public List<Pracownik> getPracownikByStanowisko(String stanowisko) {
        return null;
    }

    public List<Pracownik> getPracownikByStanowisko(Stanowisko stanowisko) {
        return null;
    }

    public boolean addPracownik(Pracownik p) {
        return false;
    }

    public boolean updatePracownik(Pracownik p) {
        return false;
    }

    public boolean deletePracownik(Pracownik p) {
        return false;
    }

    public boolean addPracownikToJednostka(Pracownik p, Jednostka j) {
        return false;
    }
}
