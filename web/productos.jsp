<%@page import="model.Videojuego" %>
    <%@page import="model.Pelicula" %>
        <%@page import="model.Tienda" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link rel="stylesheet" href="css/styleproductos.css">
                <%@ page contentType="text/html" pageEncoding="UTF-8" %>
                    <title>Document</title>
            </head>

            <body>
                <div class="contenedorMaestro">
                    <nav class="barraNavegadora">
                        <a href="index.html"><img src="img/logoNexusHub.png" alt=""></a>
                        <ul>
                            <li><a href="index.html">Página principal</a></li>
                            <li><a href="registroProductos.html">Registrar nuevos productos</a></li>
                            <li><a href="MainServlet?mostrarDatos=cliente">Clientes</a></li>
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
                            <p><em>Página principal > Productos</em></p>
                            <p><em><a href="mailto:jfcardenasd@udistrital.edu.co">¿Problemas? Contáctenos</a></em></p>
                        </header>
                        <main>
                            <div>
                                <table>
                                    <thead>
                                        <tr>
                                            <th>Tipo:</th>
                                            <th>Nombre:</th>
                                            <th>Valor de alquiler semanal:</th>
                                            <th>Consola/formato:</th>
                                            <th>Alquilado</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% Tienda tienda=(Tienda) application.getAttribute("tiendaUnica"); for (int i=0;
                                            i < tienda.getStock().size(); i++) {%>
                                            <tr>
                                                <td>
                                                    <% if (tienda.getStock().get(i) instanceof Pelicula) { %>
                                                        Película
                                                        <% } else if (tienda.getStock().get(i) instanceof Videojuego){
                                                            %>
                                                            Videojuego
                                                            <% }%>
                                                </td>
                                                <td>
                                                    <%= tienda.getStock().get(i).getNombre().toUpperCase()%>
                                                </td>
                                                <td>
                                                    <%= tienda.getStock().get(i).getValorAlquiler()%>
                                                </td>
                                                <td>
                                                    <%= tienda.getStock().get(i).getFormato()%>
                                                </td>
                                                <td>
                                                    <%= tienda.getStock().get(i).getIsAlquilado() ? "Sí" : "No" %>
                                                </td>
                                            </tr>
                                            <% }%>
                                    </tbody>
                                </table>
                            </div>
                        </main>
                    </div>
                </div>
            </body>

            </html>