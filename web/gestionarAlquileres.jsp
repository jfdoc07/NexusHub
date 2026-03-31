<%@page import="model.Cliente" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/stylegestionaralquileres.css">
        <%@ page contentType="text/html" pageEncoding="UTF-8" %>
            <title>Document</title>
    </head>

    <body>
        <% Cliente cliente=(Cliente) getServletContext().getAttribute("clienteAGestionar");%>
        <div class="contenedorMaestro">
            <nav class="barraNavegadora">
                <a href="index.html"><img src="img/logoNexusHub.png" alt=""></a>
                <ul>
                    <li><a href="index.html">Página principal</a></li>
                    <li><a href="MainServlet?mostrarDatos=cliente">Volver a la gestión de clientes</a></li>
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
                    <p><em>Página principal > Clientes > <%=cliente.getNombre()%> > Gestión de alquileres</em></p>
                    <p><em><a href="mailto:jfcardenasd@udistrital.edu.co">¿Problemas? Contáctenos</a></em></p>
                </header>
                <main>
                        <h3>
                            <%=cliente.getNombre()%>
                        </h3>
                </main>
            </div>
        </div>
    </body>

    </html>