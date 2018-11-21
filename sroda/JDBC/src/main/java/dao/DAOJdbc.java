package dao;

import model.Pracownik;
import model.Stanowisko;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 14.11.2018.
 */
public class DAOJdbc implements DAO {

    {
        try {
            Class.forName("org.sqlite.JDBC")
                    .newInstance();
        } catch (Exception e) { e.printStackTrace();}
    }
    private  String dburl;
    public DAOJdbc(String filename){
        dburl = "jdbc:sqlite:"+filename;
    }

    public List<Pracownik> getAllPracownicy() throws SQLException {
        Connection con = DriverManager
                .getConnection(dburl);
        Statement st = con.createStatement();
        st.execute("Select p.id as pid, imie, nazwisko, s.id as sid, name  from pracownicy as p, stanowisko as s WHERE p.stanowisko=s.id");
        ResultSet rs = st.getResultSet();
        List<Pracownik> pracownicy = new ArrayList<Pracownik>();
        while (rs.next()){
            Pracownik p = getPracownikFromRS(rs);
            pracownicy.add(p);
        }
        rs.close();
        st.close();
        con.close();
        return pracownicy;
    }

    public List<Stanowisko> getAllStanowiska() throws SQLException {
        Connection con = DriverManager
                .getConnection(dburl);
        Statement st = con.createStatement();
        st.execute("Select id as sid, name From Stanowisko");
        ResultSet rs = st.getResultSet();
        List<Stanowisko> stanowiska = new ArrayList<Stanowisko>();
        while (rs.next()){
            Stanowisko s = getStanowiskoFromRS(rs);
            stanowiska.add(s);
        }
        rs.close();
        st.close();
        con.close();
        return stanowiska;
    }

    private Stanowisko getStanowiskoFromRS(ResultSet rs) throws SQLException {
        Stanowisko st = new Stanowisko();
        st.setId(rs.getInt("sid"));
        st.setNazwa(rs.getString("name"));
        return st;
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
