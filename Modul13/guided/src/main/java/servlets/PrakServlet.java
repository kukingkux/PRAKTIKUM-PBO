// package servlets;

// import java.io.IOException;

// import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// @WebServlet(name = "PrakServlet", urlPatterns = {"/PrakServlet"})
// public class PrakServlet extends HttpServlet {

//     protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
//             throws ServletException, IOException {
//         String nim = request.getParameter("nim"); 
//         String nama = request.getParameter("nama");
//         nim = "NIM Anda adalah: "+nim; 
//         nama = "Nama Anda adalah: "+nama; 
//         request.setAttribute("nim", nim); 
//         request.setAttribute("nama", nama); 
//         request.getRequestDispatcher("index.jsp").forward( request, response);

//     }

//     @Override
//     protected void doGet(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         processRequest(request, response);
//     }

//     @Override
//     protected void doPost(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         processRequest(request, response);
//     }
// }