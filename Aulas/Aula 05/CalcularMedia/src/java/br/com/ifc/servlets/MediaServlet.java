package br.com.ifc.servlets;

import br.com.ifc.util.Media;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calcularMedia")
public class MediaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2"));
        double n3 = Double.parseDouble(request.getParameter("n3"));
        double n4 = Double.parseDouble(request.getParameter("n4"));

        double[] notas = new double[]{n1, n2, n3, n4};
        
        Media minhaClasseDeMedia = new Media(notas);

        request.setAttribute("media", minhaClasseDeMedia.calcularMedia());
        request.getRequestDispatcher("resultado.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
