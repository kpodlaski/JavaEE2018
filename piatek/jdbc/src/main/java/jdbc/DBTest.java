package jdbc;

import model.Pracownik;

import java.sql.*;

/**
 * Created by Krzysztof Podlaski on 16.11.2018.
 */
public class DBTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        DAOI DAOI = new DAO("pracownicy.db");
        for (Pracownik p : DAOI.getAllPracownicy()){
            System.out.print(p.getId());
            System.out.print(" ");
            System.out.print(p.getImie());
            System.out.print(" ");
            System.out.print(p.getNazwisko());
            System.out.print(" ");
            System.out.println(p.getStanowisko().getNazwa());
        }

    }
}
