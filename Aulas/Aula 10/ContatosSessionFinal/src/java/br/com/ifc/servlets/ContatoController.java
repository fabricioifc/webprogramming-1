/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.servlets;

import br.com.ifc.dao.ContatoDao;
import br.com.ifc.dao.ContatoDaoImpl;
import br.com.ifc.entidades.Contato;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fabricio
 */
@WebServlet(name = "ContatoServlet", urlPatterns = {"/adicionarContato"})
public class ContatoController extends HttpServlet {

    private final String LISTAR_CONTATOS = "index.jsp";
    private final String INSERIR_OU_EDITAR = "contato.jsp";

    private ContatoDao contatoDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        contatoDao = new ContatoDaoImpl();
    }

    @Override
    public void destroy() {
        super.destroy();
        contatoDao = null;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("acao");
        HttpSession session = request.getSession();

        if (action.equalsIgnoreCase("excluir")) {
            String email = request.getParameter("email");
            contatoDao.excluir(session, email);
            forward = LISTAR_CONTATOS;
            session.setAttribute("contatos", contatoDao.listar(session));
        } else if (action.equalsIgnoreCase("editar")) {
            forward = INSERIR_OU_EDITAR;
            String email = request.getParameter("email");
            Contato contato = contatoDao.buscarPorEmail(session, email);
            request.setAttribute("contato", contato);
        } else if (action.equalsIgnoreCase("listar")) {
            forward = LISTAR_CONTATOS;
            contatoDao.listar(session);
        } else {
            forward = INSERIR_OU_EDITAR;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String nome = request.getParameter("nome");;
        String email = request.getParameter("email");

        Contato contato = new Contato(nome, email);
        if (contatoDao.buscarPorEmail(session, email) == null) {
            contatoDao.adicionar(session, contato);
        } else {
            contatoDao.atualizar(session, contato);
        }

        RequestDispatcher view = request.getRequestDispatcher(LISTAR_CONTATOS);
        view.forward(request, response);
    }

}
