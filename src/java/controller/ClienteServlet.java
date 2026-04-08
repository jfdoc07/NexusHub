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
import model.Cliente;
import model.Tienda;

/**
 * Nombre del proyecto: NexusHub
 * Servlet encargado de la creación de usuarios a partir de datos enviados
 * desde formularios previos.
 ** Descripción del entorno:
 * Servidor: Apache Tomcat 11.0.18
 * Puerto: 8080
 * @author Juan Fernando Cárdenas Duque.
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

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
        String realizarAcciones = request.getParameter("realizarAcciones");
        if ("alquilar".equals(realizarAcciones)){
            
        }
        
        
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
        Tienda tienda = (Tienda) getServletContext().getAttribute("tiendaUnica");
        /*Recupero el objeto global de tienda*/
        String nombreCliente = almacenarDato(request, "nombreCliente");
        String numContactoCliente = almacenarDato(request, "numContactoCliente");
        String membresia = almacenarDato(request, "membresia");
        Cliente cliente = new Cliente(nombreCliente, numContactoCliente, membresia);
        tienda.agregarCliente(cliente);
        /*Respetando el SOLID, el cliente es agregado por tienda y no desde el
        servlet.*/
        request.getRequestDispatcher("registroClientes.html").forward(request, 
                                                                      response);
    }

    protected String almacenarDato(HttpServletRequest request, String nameForm) {
        /*Principio DRY*/
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
