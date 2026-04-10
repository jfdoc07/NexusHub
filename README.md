# NexusHub

## Descripción breve:
Sistema de gestión integral desarrollado en Java bajo el patrón MVC (Modelo-Vista-Controlador) y principios de diseño SOLID para fácil escalabilidad, diseñado para administración eficiente de recursos y clientes.

## Especificaciones del entorno:
- Servidor: Apache Tomcat 11.0.18
- Puerto: 8080

> [!IMPORTANT]
  Si ya tienes ocupado el puerto 8080, puedes configurar el servidor para que el programa se ejecute en el puerto 8084.
- IDE recomendado: Apache NetBeans IDE 25

> [!TIP]
  Para la correcta ejecución del programa y no presentar conflictos, es preferible priorizar la versión del Tomcat con su IDE.

## Estructura del Proyecto

El proyecto sigue el patrón arquitectónico **MVC**, organizando la lógica y la interfaz de la siguiente manera:

```text
NexusHub/
├── 🌐 Web Pages/                   # Capa de Vista (Frontend)
│   ├── 📁 css/                      # Estilos visuales
│   ├── 📁 img/                      # Recursos gráficos
│   ├── 📁 js/                       # JavaScript del registro de productos
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
```

> [!NOTE]
La separación en los paquetes controller y model asegura el cumplimiento del principio de Responsabilidad Única, facilitando el mantenimiento del sistema NexusHub.

> [!TIP]
Los archivos con extensión .jsp contienen la lógica dinámica que interactúa con los Servlets, mientras que los .html se utilizan para formularios estáticos de registro.

## Instalación y registro:

### 1. Prerrequisitos
Antes de comenzar, asegúrate de tener instalado:
* **Java Development Kit (JDK) 17** o superior (necesario para Jakarta EE 11).
* **Apache Tomcat 11.0.18**.
* **NetBeans IDE** (o tu IDE de preferencia con soporte para Java Web).

### 2. Clonar el Repositorio
Ejecuta el siguiente comando en tu terminal para descargar el código fuente:
```bash
git clone [https://github.com/jfdoc07/NexusHub.git](https://github.com/jfdoc07/NexusHub.git)
```
### 3. Ejecutar el programa
Abre tu IDE, abre el archivo que descargaste y ejecútalo.

> [!WARNING]
Para que el programa se ejecute de manera correcta es necesario configurar el Apache Tomcat de manera previa.

## Autor
* Juan Fernando Cárdenas
* GitHub: [jfdoc07](github.com/jfdoc07)
* Rol: Estudiante de Ingeniería de Sistemas, Universidad Distrital Francisco José de Caldas
