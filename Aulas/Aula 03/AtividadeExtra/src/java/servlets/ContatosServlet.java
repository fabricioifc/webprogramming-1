/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "ContatosServlet", urlPatterns = {"/ContatosServlet"})
public class ContatosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ContatosServlet</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h3>Informações recebidas com sucesso!</h3>");
            out.println("<p><strong>Nome: </strong>"
                    + request.getParameter("nome") + "</p>");
            out.println("<p><strong>E-mail: </strong>"
                    + request.getParameter("email") + "</p>");
            out.println("<p><strong>Mensagem: </strong></p>");
            out.println("<p>" + request.getParameter("texto") + "</p>");

            out.println("<a href='index.html'>Voltar</a>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
