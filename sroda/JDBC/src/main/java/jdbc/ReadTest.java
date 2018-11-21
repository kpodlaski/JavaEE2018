package jdbc;

import dao.DAO;
import dao.DAOJdbc;
import model.Pracownik;
import model.Stanowisko;

import java.util.List;

/**
 * Created by Krzysztof Podlaski on 14.11.2018.
 */
public class ReadTest {

    public static void main(String[] args) throws Exception{


        DAO dao = new DAOJdbc("pracownicy.db");
        List<Pracownik> pracownicy = dao.getAllPracownicy();
        for (Pracownik p : pracownicy){
            System.out.println(p);
        }

        List<Stanowisko> stanowiska = dao.getAllStanowiska();
        for (Stanowisko s : stanowiska){
            System.out.println(s);
        }

    }

}
