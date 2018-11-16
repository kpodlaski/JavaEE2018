package jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

/**
 * Created by Krzysztof Podlaski on 16.11.2018.
 */
public class DBTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("org.sqlite.JDBC").newInstance();
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:pracownicy.db");
        Statement st = con.createStatement();
        st.execute("SELECT p.id as pid, imie, nazwisko, " +
                "s.id as sid, nazwa  FROM Pracownik as p, " +
                "Stanowisko as s WHERE p.stanowisko=s.id");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            System.out.print(rs.getInt("pid"));
            System.out.print(" ");
            System.out.print(rs.getString("imie"));
            System.out.print(" ");
            System.out.print(rs.getString("nazwisko"));
            System.out.print(" ");
            System.out.println(rs.getString("nazwa"));
        }
        rs.close();
        st.close();
        con.close();

    }
}
