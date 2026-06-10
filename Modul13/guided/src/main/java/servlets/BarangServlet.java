package servlets;

import java.io.IOException;
import java.sql.ResultSet;

import classes.JDBC;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/BarangServlet")
public class BarangServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("form_login.jsp");
            return;
        }

        JDBC db = new JDBC();
        String menu = request.getParameter("menu");

        if (menu == null || request.getParameterMap().isEmpty()) {
            ResultSet rs = db.getData("select * from barang");
            request.setAttribute("list", rs);
            request.getRequestDispatcher("daftarbarang.jsp").forward(request, response);
        } 
        else if ("add".equals(menu)) {
            request.getRequestDispatcher("tambahbarang.jsp").forward(request, response);
        } 
        else if ("insert".equals(menu)) {
            String nama = request.getParameter("nama");
            db.runQuery("insert into barang (nama) values ('" + nama + "')");
            response.sendRedirect("BarangServlet");
        } 
        else if ("edit".equals(menu)) {
            String id = request.getParameter("id");
            ResultSet rs = db.getData("select * from barang where id = '" + id + "'");
            request.setAttribute("list", rs);
            request.getRequestDispatcher("editbarang.jsp").forward(request, response);
        } 
        else if ("update".equals(menu)) {
            String id = request.getParameter("id");
            String nama = request.getParameter("nama");
            db.runQuery("update barang set nama = '" + nama + "' where id = '" + id + "'");
            response.sendRedirect("BarangServlet");
        } 
        else if ("del".equals(menu)) {
            String id = request.getParameter("id");
            db.runQuery("delete from barang where id = '" + id + "'");
            response.sendRedirect("BarangServlet");
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