package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

/**
 * Created by Krzysztof Podlaski on 12.10.2018.
 */
@WebServlet("/Photo")
public class Photo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String par = request.getParameter("phid");
        String fileName = "/images/cat1.jpg";
        switch (par){
            case "1" : fileName = "/images/cat1.jpg"; break;
            case "2" : fileName = "/images/cat2.jpg"; break;
        }
        String par2 = request.getParameter("value");
        System.out.println(par2);
        System.out.println(URLDecoder.decode(par2,"UTF-8"));
        response.setContentType("image/jpeg");
        InputStream is = getClass().getClassLoader()
                .getResourceAsStream(fileName);
        int c;
        while ( (c=is.read()) >-1){
            response.getOutputStream().write(c);
        }
    }
}
