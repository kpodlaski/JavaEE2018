package jdbc;

import model.Pracownik;
import model.Stanowisko;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 16.11.2018.
 */
public interface DAOI {
    List<Pracownik> getAllPracownicy() throws SQLException;

    List<Stanowisko> getAllStanowiska() throws SQLException;
}
