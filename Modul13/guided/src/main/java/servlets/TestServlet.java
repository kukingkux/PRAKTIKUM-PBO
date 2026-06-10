package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import classes.JDBC;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        JDBC db = new JDBC();
        db.runQuery("insert into barang (nama) values ('PC')");
        
        response.setContentType("text/html; charset=UTF-8"); 
        try (PrintWriter out = response.getWriter()) { 
            out.println("<!DOCTYPE html>"); 
            out.println("<html>"); 
            out.println("<head>"); 
            out.println("<title>Servlet Test</title>"); 
            out.println("</head>"); 
            out.println("<body>"); 
            out.println(db.getMessage() + "<br />"); 
            out.println("</body>"); 
            out.println("</html>"); 
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}