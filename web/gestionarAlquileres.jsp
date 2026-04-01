<%@page import="model.Tienda" %>
    <%@page import="model.Pelicula" %>
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
                    <% Tienda tienda=(Tienda) application.getAttribute("tiendaUnica");%>
                        <div class="contenedorMaestro">
                            <nav class="barraNavegadora">
                                <a href="index.html"><img src="img/logoNexusHub.png" alt=""></a>
                                <ul>
                                    <li><a href="index.html">Página principal</a></li>
                                    <li><a href="MainServlet?mostrarDatos=cliente">Volver a la gestión de clientes</a>
                                    </li>
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
                                    <p><em>Página principal > Clientes > <%=cliente.getNombre()%> > Gestión de
                                                alquileres</em></p>
                                    <p><em><a href="mailto:jfcardenasd@udistrital.edu.co">¿Problemas?
                                                Contáctenos</a></em></p>
                                </header>
                                <main>
                                    <div>
                                        <nav>
                                            <p>
                                                <strong>Cliente:</strong>
                                                <%=cliente.getNombre()%>
                                            </p>
                                            <p>
                                                <strong>Número de contacto:</strong>
                                                <%=cliente.getNumContacto()%>
                                            </p>
                                            <p>
                                                <strong>Membresía:</strong>
                                                <%=cliente.getMembresia().toUpperCase()%>
                                            </p>
                                            <h3>Productos alquilados</h3>
                                        </nav>
                                        <nav>
                                            <table>
                                                <thead>
                                                    <tr>
                                                        <th>Tipo</th>
                                                        <th>Nombre</th>
                                                        <th>Valor</th>
                                                        <th>¿Devolver?</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <% for (int i=0; i < cliente.getProductosAlquilados().size(); i++)
                                                        {%>
                                                        <tr>
                                                            <td>
                                                                <%= cliente.getProductosAlquilados().get(i) instanceof
                                                                    Pelicula ? "Película" : "Videojuego" %>
                                                            </td>
                                                            <td>
                                                                <%=
                                                                    cliente.getProductosAlquilados().get(i).getNombre()%>
                                                            </td>
                                                            <td>
                                                                <%=
                                                                    cliente.getProductosAlquilados().get(i).calcularAlquiler(cliente.getMembresia())%>
                                                            </td>
                                                            <td><a
                                                                    href="MainServlet?mostrarDatos=devolverProducto&clienteID=<%=cliente.getID()%>&productoID=<%=cliente.getProductosAlquilados().get(i).getID()%>"><button>Devolver
                                                                        producto</button></a></td>
                                                        </tr>
                                                        <%}%>
                                                </tbody>
                                            </table>
                                            <h3 style="text-align: center;">Registrar nuevos alquileres</h3>
                                            <form action="MainServlet" method="post">
                                                <input type="hidden" name="modulo" value="agregarProducto">
                                                <input type="hidden" name="clienteID" value="<%=cliente.getID()%>">
                                                <select name="productoaAgregarID" id="" required>
                                                    <option value="" disabled selected>Seleccione un producto...
                                                    </option>
                                                    <% for (int i=0; i < tienda.getStock().size(); i++) { if
                                                        (!tienda.getStock().get(i).getIsAlquilado()) {%>
                                                        <option value="<%= tienda.getStock().get(i).getID()%>">
                                                            <%= tienda.getStock().get(i).getNombre().toUpperCase()%>
                                                                (<%=
                                                                    tienda.getStock().get(i).getClass().getSimpleName()%>
                                                                    )
                                                        </option>
                                                        <%} }%>
                                                </select>
                                                <input type="submit" value="Registrar alquiler">
                                            </form>
                                        </nav>
                                    </div>
                                </main>
                            </div>
                        </div>
            </body>

            </html>