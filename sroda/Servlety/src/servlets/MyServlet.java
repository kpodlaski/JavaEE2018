package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 10.10.2018.
 */
@WebServlet
public class MyServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.getOutputStream().println("Heyo!");
    }
}
