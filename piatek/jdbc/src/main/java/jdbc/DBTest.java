package jdbc;

import model.Pracownik;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * Created by Krzysztof Podlaski on 16.11.2018.
 */
public class DBTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        /*Connection con = DriverManager.getConnection(
                "jdbc:sqlite:pracownicy.db");
        Statement st = con.createStatement();
        st.execute("SELECT p.id as pid, imie, nazwisko, " +
                "s.id as sid, nazwa  FROM Pracownik as p, " +
                "Stanowisko as s WHERE p.stanowisko=s.id");
        ResultSet rs = st.getResultSet();
        */
        DAO dao = new DAO("pracownicy.db");
        for (Pracownik p : dao.getAllPracownicy()){
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
