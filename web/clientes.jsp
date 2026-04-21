<%@page import="java.util.List"%>
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
                    <% List<Cliente> listaClientes = (List<Cliente>) application.getAttribute("listaDeClientes");
                        for (int i = 0; i < listaClientes.size(); i++) {%>
                    <div class="tarjetaCliente">
                        <nav>
                            <h3>Datos del cliente: </h3>
                            <p><strong>Nombre:</strong><%= listaClientes.get(i).getNombre().toUpperCase()%></p>
                            <p><strong>Número de contacto:</strong> <%= listaClientes.get(i).getNumContacto()%></p>
                            <p><strong>Membresía:</strong> <%= listaClientes.get(i).getMembresia()%></p>
                        </nav>
                        <nav>
                            <a href="MainServlet?mostrarDatos=gestionaralquileres&id=<%=listaClientes.get(i).getID()%>"><button>Gestionar alquileres</button></a>
                            <form action="EliminarCliente" method="post">
                                <input type="hidden" name="id" value="<%=listaClientes.get(i).getID()%>">
                                <button onclick="return confirm('Está seguro de eliminar a este usuario? Esta acción no se puede deshacer.')">Eliminar cliente</button>
                            </form>
                        </nav>
                    </div>
                    <% }%>
                </main>
            </div>
        </div>
    </body>
</html>