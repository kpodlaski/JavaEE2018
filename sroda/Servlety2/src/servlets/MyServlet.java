package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 10.10.2018.
 */
@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {
        String text = "<html><head></head><body>";
        response.getOutputStream().println(text);
        response.getOutputStream().println("<b>TEEST</b>");
        String cPath = request.getRequestURI();
        response.getOutputStream().println("-"+cPath+"-");
        text = "</body></html>";
        response.getOutputStream().println(text);
    }


}
