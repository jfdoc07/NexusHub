<%@page import="model.Tienda"%>
<%@page import="model.Cliente"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/styleclientes.css">
        <%@ page contentType="text/html" pageEncoding="UTF-8" %>
        <title>Document</title>
    </head>
    <body>
        <div class="contenedorMaestro">
            <nav class="barraNavegadora">
                <a href="index.html"><img src="img/logoNexusHub.png" alt=""></a>
                <ul>
                    <li><a href="index.html">Página principal</a></li>
                    <li><a href="registroClientes.html">Registrar nuevos clientes</a></li>
                    <li><a href="MainServlet?mostrarDatos=producto">Productos</a></li>
                </ul>
                <div class="barraNavegadoraUsuario">
                    <a href="#">
                        <span class="user-icon">👤</span>
                        Administrador
                    </a>
                </div>
            </nav>
            <div class="contenedorPrincipal">
                <header>
                    <p><em>Página principal > Clientes</em></p>
                    <p><em><a href="mailto:jfcardenasd@udistrital.edu.co">¿Problemas? Contáctenos</a></em></p>
                </header>
                <main>
                    <div>
                        <% Tienda tienda = (Tienda) application.getAttribute("tiendaUnica");
                        for (int i = 0; i < tienda.getClientela().size(); i++) {%>
                        <h3><%= tienda.getClientela().get(i).getNombre() %></h3>
                        <h3><%= tienda.getClientela().get(i).getNumContacto() %></h3>
                        <h3><%= tienda.getClientela().get(i).getMembresia() %></h3>
                        <% }%>
                    </div>
                </main>
            </div>
        </div>
    </body>
</html>