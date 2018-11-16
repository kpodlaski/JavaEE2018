package jdbc;

import model.Pracownik;
import model.Stanowisko;

import java.sql.ResultSet;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 16.11.2018.
 */
public class DAO {
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
    public List<Pracownik> getAllPracownicy(){
        return null;
    }
    public List<Stanowisko> getAllStanowiska(){
        return null;
    }

    private Stanowisko getStanowiskoFromRS(ResultSet rs){
        return null;
    }
    private Pracownik getPracownikFromRS(ResultSet rs){
        return null;
    }
}
