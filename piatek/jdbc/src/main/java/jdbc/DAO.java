package jdbc;

import model.Pracownik;
import model.Stanowisko;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 16.11.2018.
 */
public class DAO implements DAOI {
    {
        try {
            Class.forName("org.sqlite.JDBC").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String dburl;
    public DAO(String filename){
        dburl ="jdbc:sqlite:"+filename;
    }
    public List<Pracownik> getAllPracownicy() throws SQLException {
        List<Pracownik> pracownicy = new ArrayList<Pracownik>();
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:pracownicy.db");
        Statement st = con.createStatement();
        st.execute("SELECT p.id as pid, imie, nazwisko, " +
                "s.id as sid, nazwa  FROM Pracownik as p, " +
                "Stanowisko as s WHERE p.stanowisko=s.id");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            pracownicy.add(getPracownikFromRS(rs));
        }
        con.close();
        return pracownicy;
    }
    public List<Stanowisko> getAllStanowiska() throws SQLException {
        List<Stanowisko> stanowiska = new ArrayList<Stanowisko>();
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:pracownicy.db");
        Statement st = con.createStatement();
        st.execute("SELECT id as sid, nazwa  FROM Stanowisko");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            stanowiska.add(getStanowiskoFromRS(rs));
        }
        con.close();
        return stanowiska;
    }

    private Stanowisko getStanowiskoFromRS(ResultSet rs) throws SQLException {
        Stanowisko s = new Stanowisko();
        s.setId(rs.getInt("sid"));
        s.setNazwa(rs.getString("nazwa"));
        return s;
    }
    private Pracownik getPracownikFromRS(ResultSet rs) throws SQLException {
        Pracownik p = new Pracownik();
        p.setId(rs.getInt("pid"));
        p.setImie(rs.getString("imie"));
        p.setNazwisko(rs.getString("nazwisko"));
        p.setStanowisko(getStanowiskoFromRS(rs));
        return p;
    }
}
