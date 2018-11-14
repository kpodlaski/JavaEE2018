package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Krzysztof Podlaski on 14.11.2018.
 */
public class ReadTest {

    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC")
                .newInstance();
        Connection con = DriverManager
                .getConnection("jdbc:sqlite:pracownicy.db");
        Statement st = con.createStatement();
        st.execute("Select * from Pracownicy, " +
                "Stanowisko WHERE " +
                "Pracownicy.stanowisko=Stanowisko.id");
        ResultSet rs = st.getResultSet();
        while (rs.next()){
            System.out.print(rs.getInt(1));
            System.out.print(" ");
            System.out.print(rs.getString(2));
            System.out.print(" ");
            System.out.print(rs.getString(3));
            System.out.print(" ");
            System.out.println(rs.getString(6));
        }
        rs.close();
        st.close();
        con.close();
    }

}
