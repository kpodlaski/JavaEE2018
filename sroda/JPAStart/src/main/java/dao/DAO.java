package dao;

import jpamodel.Jednostka;
import jpamodel.Pracownik;
import jpamodel.Stanowisko;

import java.util.List;

/**
 * Created by Krzysztof Podlaski on 05.12.2018.
 */
public interface DAO {
    Pracownik getPracownikById(int id);
    List<Pracownik> getPracownicyByImie(String imie);
    List<Pracownik> getPracownicyByNazwisko(String imie);
    List<Pracownik> getPracownicyByStanowisko(Stanowisko stan);
    Stanowisko getStanowiskoById(int id);
    Stanowisko getStanowiskoByNazwa(String nazwa);
    Jednostka getJednostkaById(int id);
    List<Jednostka> getJednostkaByNazwa(String nazwa);
    List<Jednostka> getJednostkaByPracownik(Pracownik p);
    List<Pracownik> getPracownikByStanowiskoInJednostka
            (Jednostka j, Stanowisko s);
    //+ insert, update, delete dla wszystkich
    //addPracownikToJednostka
}
