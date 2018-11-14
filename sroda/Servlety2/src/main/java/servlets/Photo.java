package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Krzysztof Podlaski on 10.10.2018.
 */
@WebServlet(name = "Photo")
public class Photo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        //response.setHeader("Content-Type","image/jpeg");
        String cType = "image/jpeg";
        String res = "images/sokol.jpg";
        if (type.equalsIgnoreCase("png")){
            cType = "image/png";
            res = "images/sokol.png";
        }

        response.setContentType(cType);
        InputStream is = getClass().getClassLoader()
                .getResourceAsStream(res);
        OutputStream os = response.getOutputStream();
        int c;
        while ( (c=is.read())>-1) {
            os.write(c);
        }
    }
}
