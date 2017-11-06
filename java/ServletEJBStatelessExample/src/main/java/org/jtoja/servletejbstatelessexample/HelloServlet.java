package org.jtoja.servletejbstatelessexample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author karels
 */
@WebServlet(value = "/hello")
public class HelloServlet extends HttpServlet {

    @EJB
    StatelessEJBHolder ejb;
    
    @EJB
    StatefulLocalEJBCounter ejbFul;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ejbFul.addToCounter();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setBufferSize(8192);
        PrintWriter out = resp.getWriter();

        // then write the data of the response
        out.println("<html lang=\"en\">"
                + "<head><title>Servlet Hello</title></head>"
                + "<body><h1>"+ejb.getMsg()+"</h1><h2>Contador = "+ejbFul.getCounter()+"</h2></body>"
                + "</html>");

        out.close();
    }

}
