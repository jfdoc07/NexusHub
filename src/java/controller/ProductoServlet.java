/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pelicula;
import model.Producto;
import model.Tienda;
import model.Videojuego;

/**
 *
 * @author Home
 */
@WebServlet(name = "ProductoServlet", urlPatterns = {"/ProductoServlet"})
public class ProductoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Tienda tienda = (Tienda) getServletContext().getAttribute("tiendaUnica");//Recibo el objeto unico creado en el servlet principal

        String elegirProducto = almacenarDato(request, "elegirProducto");
        String nombre = "";
        String valorSemanal = "";
        String formato = almacenarDato(request, "formato");
        Producto producto = null;
        switch (elegirProducto) {
            case "pelicula": {
                nombre = request.getParameter("nombreP");
                valorSemanal = request.getParameter("valorSemanalP");
                producto = new Pelicula(nombre, Integer.parseInt(valorSemanal), formato);
                break;
            }
            case "videojuego": {
                nombre = request.getParameter("nombreJ");
                valorSemanal = request.getParameter("valorSemanalJ");
                producto = new Videojuego(nombre, Integer.parseInt(valorSemanal), formato);
                break;
            }
        }
        if (producto != null) {
            tienda.agregarProducto(producto);
        }
        request.getRequestDispatcher("registroProductos.html").forward(request, response);
    }

    protected String almacenarDato(HttpServletRequest request, String nameForm) {//Aplico el principio DRY (Don´t Repeat Yourself)
        String dato = request.getParameter(nameForm);
        return dato;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
