# Quantic-Games

![image alt]([https://github.com/tu_usuario/quantic-games-app/blob/main/quanticgamesbanner.png](https://github.com/nelsonjhongp/app-quantic-games/blob/9f37e63af7bacab19c7897e41b12d6b87e2d6cb5/qgamesbanner.png))

**Quantic-Games** es una tienda virtual para la venta de productos de videojuegos, como consolas, mandos y juegos. Este proyecto, desarrollado en el marco del curso de **Algoritmos y Estructuras de Datos**, simula una empresa ficticia gestionando ventas, inventarios y empleados, aplicando algoritmos y estructuras de datos para ordenar y buscar información eficientemente.

## Tecnologías utilizadas

- **Lenguaje:** Java  
- **Interfaz gráfica:** Java Swing  
- **Base de datos (opcional):** MySQL  
- **Conexión a base de datos:** JDBC  

## Funcionalidades principales

- Gestión de un catálogo de productos de videojuegos.
- Implementación de operaciones CRUD (Crear, Leer, Actualizar y Eliminar).
- Exploración de estructuras de datos como:
  - Árboles binarios.
  - Listas enlazadas.
  - Pilas y colas.
- Algoritmos de ordenamiento y búsqueda.

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes componentes:

1. **JDK** (Java Development Kit).  
2. **NetBeans IDE** (o cualquier otro IDE compatible con Java).  
3. **MySQL** (opcional, si deseas probar la integración con base de datos).  

## Instrucciones de instalación

Sigue estos pasos para configurar y ejecutar el proyecto localmente:

### 1. Clonar el repositorio

```bash
git clone https://github.com/tu_usuario/quantic-games.git
```

### 2. Configurar el entorno
Si deseas utilizar la base de datos:

1. Crea una base de datos llamada quanticgames en MySQL.
2. Importa el archivo quanticgames.sql incluido en el proyecto.

Asegúrate de que el archivo MySQLConexion.java esté configurado correctamente para conectarse a tu base de datos. Por ejemplo:

```bash
package util;

import java.sql.*;

public class MySQLConexion {
    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/quanticgames";
            String usr = "root";
            String psw = "";
            con = DriverManager.getConnection(url, usr, psw);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: No se encontró el driver.");
        } catch (SQLException ex) {
            System.out.println("Error: Problema con la conexión a la base de datos.");
        }
        return con;
    }
}
```
Si decides no usar base de datos, omite esta configuración.

3. Ejecutar el proyecto
Abre el proyecto en NetBeans (o tu IDE preferido).
Compila y ejecuta el archivo principal.
Explora las funcionalidades de la tienda y prueba los algoritmos implementados.
