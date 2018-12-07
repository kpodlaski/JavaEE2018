package dao;

import jpamodel.Jednostka;
import jpamodel.Pracownik;

/**
 * Created by Krzysztof Podlaski on 07.12.2018.
 */
public interface DAO extends DAOPracownik, DAOJednostka, DAOStanowisko{

    boolean addPracownikToJednostka(Pracownik p, Jednostka j);
}
