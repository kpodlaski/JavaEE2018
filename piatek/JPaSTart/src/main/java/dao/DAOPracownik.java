package dao;

import jpamodel.Pracownik;
import jpamodel.Stanowisko;

import java.util.List;

/**
 * Created by Krzysztof Podlaski on 07.12.2018.
 */
public interface DAOPracownik {
    //GETY
    Pracownik getPracownikById(int id);
    List<Pracownik> getAllPracownicy();
    List<Pracownik> getPracownikByImie(String imie);
    List<Pracownik> getPracownikByNazwisko(String nazwisko);
    List<Pracownik> getPracownikByStanowisko(String stanowisko);
    List<Pracownik> getPracownikByStanowisko(Stanowisko stanowisko);
    //Insert
    boolean addPracownik(Pracownik p);
    //Update
    boolean updatePracownik(Pracownik p);
    //Delete
    boolean deletePracownik(Pracownik p);



}
