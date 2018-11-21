package dao;

import model.Pracownik;
import model.Stanowisko;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 14.11.2018.
 */
public interface DAO {
    List<Pracownik> getAllPracownicy() throws SQLException;

    List<Stanowisko> getAllStanowiska() throws SQLException;
}
