# NexusHub

## Descripción breve:
Sistema de gestión integral desarrollado en Java bajo el patrón MVC (Modelo-Vista-Controlador) y principios de diseño SOLID para fácil escalabilidad, diseñado para administración eficiente de recursos y clientes.

## Especificaciones del entorno:
- Servidor: Apache Tomcat 11.0.18
- Puerto: 8080
- [!IMPORTANT]
  Si ya tiene ocupado el puerto 8080, puede configurar el servidor para que el programa se ejecute en el puerto 8084.
- IDE recomendado: NetBeans IDE 25
- [!TIP]
  Para la correcta ejecución del programa y no presentar conflictos, es preferible priorizar la versión del Tomcat con su IDE.
## Estructura del Proyecto

El proyecto sigue el patrón arquitectónico **MVC**, organizando la lógica y la interfaz de la siguiente manera:

```text
NexusHub/
├── 🌐 Web Pages/                   # Capa de Vista (Frontend)
│   ├── 📁 css/                      # Estilos visuales
│   ├── 📁 img/                      # Recursos gráficos
│   ├── 📁 js/                       # Scripts de cliente
│   ├── 📄 clientes.jsp              # Gestión de clientes
│   ├── 📄 gestionarAlquileres.jsp   # Lógica de alquileres
│   ├── 📄 index.html                # Punto de entrada
│   ├── 📄 productos.jsp             # Catálogo de productos
│   ├── 📄 registroClientes.html     # Formulario de registro
│   └── 📄 registroProductos.html    # Alta de productos
├── 📦 Source Packages/              # Capa de Control y Modelo (Backend)
│   ├── 📁 controller/               # Servlets (Controladores)
│   │   ├── ☕ ClienteServlet.java
│   │   ├── ☕ MainServlet.java
│   │   └── ☕ ProductoServlet.java
│   └── 📁 model/                    # Entidades y Lógica de Negocio
│       ├── ☕ Cliente.java
│       ├── ☕ ClienteProducto.java
│       ├── ☕ IClienteProducto.java (Interface)
│       ├── ☕ Pelicula.java
│       ├── ☕ Producto.java
│       ├── ☕ Tienda.java
│       └── ☕ Videojuego.java
└── ⚙️ Configuration Files/          # Archivos de despliegue y contexto
[!NOTE]
La separación en los paquetes controller y model asegura el cumplimiento del principio de Responsabilidad Única, facilitando el mantenimiento del sistema NexusHub.

[!TIP]
Los archivos con extensión .jsp contienen la lógica dinámica que interactúa con los Servlets, mientras que los .html se utilizan para formularios estáticos de registro.
