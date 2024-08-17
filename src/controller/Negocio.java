package controller;

import model.Detalle;
import model.Vendedor;
import model.Usuario;
import model.Producto;
import model.Venta;
import model.Clientes;
import java.util.*;
import estructuradatos.*;
import estructuradatos.arbolBinario.SimuladorArbolBinario;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Negocio {
    
    private static Negocio instance;
    List<Producto> dataProductos= new ArrayList();
    List<Clientes> dataClientes = new ArrayList();
    List<Venta> dataVentas      = new ArrayList();
    List<Detalle> dataDetalles = new ArrayList();
    List<Vendedor> dataVendedores = new ArrayList();
    
    TablaHash tablaLogin = new TablaHash();
    
    private String cargoUsuarioLogin = "Nada";
    //Pila Venta -----------------------------------
    ListaPíla ndVent = new ListaPíla();
    NodoPilaVenta dataPila;
    SimuladorArbolBinario simArb = new SimuladorArbolBinario();
    
    
    public Negocio() {
        Producto.setContar(1);
        Clientes.setContar(1);
        Venta.setContar(1);
        Detalle.setContar(1);
        
        datosProducto();
        datosClientes();
        datosVentas();
        datosDetalles();
        datosVendedores();
        datosUsuarios();
        datosArbo();
    }
    
    public static Negocio getInstance() {
        if (instance == null) {
            instance = new Negocio();
        }
        return instance;
    }
    
    public SimuladorArbolBinario envioArbol(){
        return simArb;
    }
    public void datosArbo(){
        simArb.insertar(23, "Jose");
        simArb.insertar(3, "Nelson");
    }
    public TablaHash.EntradaHash[] entradaLogin(){
        return tablaLogin.getTabla();
    }
    /*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓ <== DATOS DE PRODUCTOS ==> ↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosProducto(){
        dataProductos.add(new Producto("Juego","GTAV",46,5));
        dataProductos.add(new Producto("Juego","DOTA2",10,4));
        dataProductos.add(new Producto("Juego","Minecraft",75,8));
        dataProductos.add(new Producto("Juego","Left4Dead2",22,7));
        dataProductos.add(new Producto("Juego","CupHead",49.9,3));
        dataProductos.add(new Producto("Juego","Garrys Mod",27.9,8));
        dataProductos.add(new Producto("Juego","Terraria",27.9,4));
        dataProductos.add(new Producto("Juego","Uncharted",169,2));
        dataProductos.add(new Producto("Juego","Geometry Dash",9.5,1));
        dataProductos.add(new Producto("Juego","CSGO",5,6));
        dataProductos.add(new Producto("Juego","Fallout 4 VR",189.9,6));
        dataProductos.add(new Producto("Juego","Forza Horizon 4",33.6,3));
        dataProductos.add(new Producto("Juego","Forza Horizon 5",139.3,7));
        dataProductos.add(new Producto("Juego","Stray",44,2));
        dataProductos.add(new Producto("Juego","Phasmophobia",29.5,1));
        dataProductos.add(new Producto("Juego","Forza Horizon 4",33.6,8));
        dataProductos.add(new Producto("Juego","Call od Duty Black Ops III",249.9,8));
        dataProductos.add(new Producto("Juego","Apex Legends",7,2));
        dataProductos.add(new Producto("Juego","FIFA 23", 259,7));
        dataProductos.add(new Producto("Juego","Dying Light", 94.9,3));

        dataProductos.add(new Producto("Consola","Play Station 3", 680,7));
        dataProductos.add(new Producto("Consola","Play Station 4", 1299,16));
        dataProductos.add(new Producto("Consola","Play Station 5", 3099,13));
        dataProductos.add(new Producto("Consola","Xbox Series X", 2799,20));
        dataProductos.add(new Producto("Consola","Nintendo Switch mini",1300,3));
        dataProductos.add(new Producto("Consola","Nintendo Switch",1600,8));
        dataProductos.add(new Producto("Consola","Nintendo Switch OLED",1900,5));
        dataProductos.add(new Producto("Consola","Nintendo Wii", 449,5));

        dataProductos.add(new Producto("Mouse", "Logitech G502", 180.9,7));
        dataProductos.add(new Producto("Mouse", "Logitech Lightspeed G305", 164.9,6));
        dataProductos.add(new Producto("Mouse", "Logitech Lightspeed G703", 278.9,3));
        dataProductos.add(new Producto("Mouse", "Razer DeahtAdder V2", 149.9,6));
        dataProductos.add(new Producto("Mouse", "Razer Hyperspeed Viper V2", 579,2));
        dataProductos.add(new Producto("Mouse", "Micronics Therodactil", 46.5,8));
        dataProductos.add(new Producto("Mouse", "Razer Viper Cyberpunk 2077 Wireless", 729.9,14));
        dataProductos.add(new Producto("Mouse", "SteelSeries Rival 650 Wireless", 749.9,9));
        dataProductos.add(new Producto("Mouse", "Razer Viper V2 Pro", 564.9,12));
        dataProductos.add(new Producto("Mouse", "SteelSeries Rival 710", 464.9,8));
        dataProductos.add(new Producto("Mouse", "Razer Basilisk V3", 364.9,9));
        dataProductos.add(new Producto("Mouse", "Razer Basilisk Ultimate", 389.9,5));
        dataProductos.add(new Producto("Mouse", "Logitech Pro X Superligh", 609.9,6));
        dataProductos.add(new Producto("Mouse", "Micronics Spartano", 50,6));
        dataProductos.add(new Producto("Mouse", "Mouse Oficina Inalambrico", 19,2));

        dataProductos.add(new Producto("Teclado","RedDragon Fizz Pro", 250,6));
        dataProductos.add(new Producto("Teclado","SteelSeries Apex Pro", 1279.9,8));
        dataProductos.add(new Producto("Teclado","Logitech G G915 Lightspeed", 1139.9,3));
        dataProductos.add(new Producto("Teclado","Logitech G G815 Lightsync", 899.9,2));
        dataProductos.add(new Producto("Teclado","Razer Blackwidow V3 Halo Infinite Mech", 649.9,1));
        dataProductos.add(new Producto("Teclado","SteelSeries Apex 5 ", 649.9,6));
        dataProductos.add(new Producto("Teclado","Logitech G713 TKL Aurora", 869.9,6));
        dataProductos.add(new Producto("Teclado","Hyperx Alloy MKW100", 439.9,4));
        dataProductos.add(new Producto("Teclado","RedDragon HORUS K618", 366.9,10));
        dataProductos.add(new Producto("Teclado","Razer Cynosa V2", 249.9,12));
        dataProductos.add(new Producto("Teclado","Razer Ornata V2", 325,16));
        dataProductos.add(new Producto("Teclado","Razer Huntsman V2", 654,4));
        dataProductos.add(new Producto("Teclado","HyperX Alloy Origins", 381.9,10));
        dataProductos.add(new Producto("Teclado","HyperX Alloy Origins Core", 260,7));
        dataProductos.add(new Producto("Teclado","Teclado Oficina Inalambrico", 50,16));

        dataProductos.add(new Producto("Audifono", "Logitech G Series G733", 600,5));
        dataProductos.add(new Producto("Audifono", "Logitech Lightspeed G435", 317,3));
        dataProductos.add(new Producto("Audifono", "Hyperx Cloud Orbit S", 1169.9,2));
        dataProductos.add(new Producto("Audifono", "Razer Blackshark V2 X", 214.9,13));
        dataProductos.add(new Producto("Audifono", "Logitech G735 Aurora", 769.9,8));
        dataProductos.add(new Producto("Audifono", "Razer Nari Ultimate THX", 589.9,3));
        dataProductos.add(new Producto("Audifono", "SteelSeries Arctis 1 Wireless", 649.9,14));
        dataProductos.add(new Producto("Audifono", "Hyperx Cloud Alpha S Gaming Blackout", 539.9,11));
        dataProductos.add(new Producto("Audifono", "Hyperx Cloud Alpha S Blue", 539.9,9));
        dataProductos.add(new Producto("Audifono", "SteelSeries Arctis 7 Black", 349.9,8));
        dataProductos.add(new Producto("Audifono", "Razer Barracuda Pro Wireless", 969.9,10));
        dataProductos.add(new Producto("Audifono", "Auriculares Oficina c/ Microfono", 48,17));

        dataProductos.add(new Producto("Mando", "Mando Dualsense PS5", 269,5));
        dataProductos.add(new Producto("Mando", "Mando Dualsense PS5 God of War", 370,8));
        dataProductos.add(new Producto("Mando", "Mando Pro Controller", 360,8));
        dataProductos.add(new Producto("Mando", "Mando Pro Controller MonsterHunter Edition", 439,5));
        dataProductos.add(new Producto("Mando", "Razer Wolverine V2 Black", 369.9,4));
        dataProductos.add(new Producto("Mando", "Razer Wolverine V2 White", 289.9,7));
        dataProductos.add(new Producto("Mando", "Mando Dualsense PS4", 176.5,3));
        dataProductos.add(new Producto("Mando", "Mando Dualsense Xbos Series", 278.5,8));

        dataProductos.add(new Producto("Microfono", "Razer Seiren Mini", 299.9,15));
        dataProductos.add(new Producto("Microfono", "HyperX QuadCast Standalone S", 560,12));
        dataProductos.add(new Producto("Microfono", "Blue Yeti X Professional", 749.9,8));
        dataProductos.add(new Producto("Microfono", "Razer Seiren Emote", 469.9,7));
        dataProductos.add(new Producto("Microfono", "Blue Yeti Snowball", 244.9,7));
        dataProductos.add(new Producto("Microfono", "Razer Seiren V2 Pro", 684.9,6));
        dataProductos.add(new Producto("Microfono", "Razer Seiren X Quartz", 449.9,15));
        dataProductos.add(new Producto("Microfono", "Razer Seiren X Cardioid", 449.9,18));
        dataProductos.add(new Producto("Microfono", "Blue Yeti Nano Vivid", 519,11));
        dataProductos.add(new Producto("Microfono", "Blue Yeti Nano Shadow Grey", 519,9));

        dataProductos.add(new Producto("Silla Gamer", "Corsair T1 Race", 1249.9,8));
        dataProductos.add(new Producto("Silla Gamer", "Corsair T2 Road Warrior", 1269.9,4));
        dataProductos.add(new Producto("Silla Gamer", "Razer Iskur X", 2044.9,7));
        dataProductos.add(new Producto("Silla Gamer", "Corsair T3 Gris", 1299.9,13));
        dataProductos.add(new Producto("Silla Gamer", "Corsair T3 Blanco", 1399.9,7));
        dataProductos.add(new Producto("Silla Gamer", "Corsair T3 Rush Charcoal", 1119.9,6));
        dataProductos.add(new Producto("Silla Gamer", "Razer Iskur Enki", 1799.9,9));
        dataProductos.add(new Producto("Silla Gamer", "Razer Iskur Tela", 1599.9,5));
        dataProductos.add(new Producto("Silla Gamer", "Razer Iskur Negro", 1899.9,7));
    }//</editor-fold>
    /*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓ <== DATOS CLIENTES  ==> ↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosClientes(){
        dataClientes.add(new Clientes("Fabio de Arrieta", 76677890, 25, 1));
        dataClientes.add(new Clientes("Ciro Hernando Puga Patiño", 75370032, 37, 1));
        dataClientes.add(new Clientes("Efraín Anguita Torres", 73271896, 48, 1));
        dataClientes.add(new Clientes("Claudia Clemente Bertrán", 75900531, 30, 0));
        dataClientes.add(new Clientes("Brunilda Paredes-Fajardo", 73079804, 47, 0));
        dataClientes.add(new Clientes("Nicolás Moles Colomer", 77198945, 51, 1));
        dataClientes.add(new Clientes("Fátima Alemany Puerta", 76732466, 36, 1));
        dataClientes.add(new Clientes("Gabriela González Robles", 73215120, 33, 1));
        dataClientes.add(new Clientes("Norberto Cerdá-Fernández", 73632106, 29, 1));
        dataClientes.add(new Clientes("Mónica Colom Larrea", 74075819, 23, 0));
        dataClientes.add(new Clientes("Eusebio González Figuerola", 73104157, 22, 1));
        dataClientes.add(new Clientes("Isaac del Amaya", 74283522, 53, 1));
        dataClientes.add(new Clientes("Víctor Gisbert", 77919631, 44, 0));
        dataClientes.add(new Clientes("Paca Castell Viana", 73488808, 47, 1));
        dataClientes.add(new Clientes("Belen Zoraida Baró Lozano", 76811637, 48, 1));
        dataClientes.add(new Clientes("Pastor Fuente Arenas", 72438692, 51, 1));
        dataClientes.add(new Clientes("Amaro Quero Paredes", 76625408, 30, 0));
        dataClientes.add(new Clientes("Margarita del Coronado", 73137598, 31, 0));
        dataClientes.add(new Clientes("Calixto España Jove", 75458093, 60, 1));
        dataClientes.add(new Clientes("Sofía Mulet Benet", 71224666, 56, 1));
        dataClientes.add(new Clientes("Melania Ariadna Barceló Garcés", 77272892, 47, 1));
        dataClientes.add(new Clientes("Albina Dulce Nieto Ferrándiz", 78887518, 52, 0));
        dataClientes.add(new Clientes("Pepita Roig", 78423655, 43, 1));
        dataClientes.add(new Clientes("Marcela Leal Montes", 77584417, 33, 1));
        dataClientes.add(new Clientes("Paloma Salvà Carvajal", 74538232, 47, 1));
        dataClientes.add(new Clientes("Adelia Martí Bello", 77254427, 29, 1));
        dataClientes.add(new Clientes("Atilio Batalla Rios", 72472795, 37, 1));
        dataClientes.add(new Clientes("Felicia Novoa Cózar", 71958869, 55, 1));
        dataClientes.add(new Clientes("Petrona Guardia Céspedes", 75694516, 58, 1));
        dataClientes.add(new Clientes("Tito Oliveras-Mármol", 75057171, 24, 1));
        dataClientes.add(new Clientes("Urbano Plana Cornejo", 79269353, 22, 1));
        dataClientes.add(new Clientes("Anselma Rodriguez Bernad", 73774444, 48, 1));
        dataClientes.add(new Clientes("Adrián Fabra Viña", 78421495, 30, 1));
        dataClientes.add(new Clientes("Nicolasa Becerra Sánchez", 72300005, 46, 1));
        dataClientes.add(new Clientes("Ágata Carbajo Calvo", 72783799, 21, 1));
        dataClientes.add(new Clientes("Pepita Laura Lladó Franch", 79884196, 47, 1));
        dataClientes.add(new Clientes("Noemí Carpio Seco", 72471025, 53, 1));
        dataClientes.add(new Clientes("Edelmira Mosquera Recio", 77824466, 57, 1));
        dataClientes.add(new Clientes("Petrona Fonseca Martínez", 78528283, 43, 1));
        dataClientes.add(new Clientes("Fernando Peralta Arévalo", 77141514, 23, 0));
        dataClientes.add(new Clientes("Ariel Florencio Dávila Aramburu", 71275380, 60, 0));
        dataClientes.add(new Clientes("Magdalena Almansa Bayona", 73275402, 46, 1));
        dataClientes.add(new Clientes("Amancio Chuy Cañas Garcia", 75510966, 29, 1));
        dataClientes.add(new Clientes("Xiomara Albero Palomares", 78909642, 34, 1));
        dataClientes.add(new Clientes("Moreno del Armas", 73002010, 36, 1));
        dataClientes.add(new Clientes("Mayte Arjona Mir", 73539744, 45, 1));
        dataClientes.add(new Clientes("Elena Conde Alonso", 71732082, 29, 1));
        dataClientes.add(new Clientes("Celia Peinado Riquelme", 72284488, 35, 1));
        dataClientes.add(new Clientes("José Mas Diaz", 71941240, 48, 1));
        dataClientes.add(new Clientes("Marco del Almansa", 77424623, 46, 1));
        dataClientes.add(new Clientes("Ariel Martorell Quero", 73353055, 28, 1));
        dataClientes.add(new Clientes("Claudia Ibañez Macías", 79407912, 57, 1));
        dataClientes.add(new Clientes("Morena Llanos Dalmau", 72536197, 48, 1));
        dataClientes.add(new Clientes("Tecla Gertrudis Fortuny Santana", 78034603, 26, 1));
        dataClientes.add(new Clientes("Jose Francisco Martí Crespo", 78861190, 32, 1));
        dataClientes.add(new Clientes("Teresita Donaire Prieto", 73858248, 56, 1));
        dataClientes.add(new Clientes("Sofía Campillo Meléndez", 74718740, 39, 1));
        dataClientes.add(new Clientes("Paola Anastasia Peral Gracia", 73008824, 36, 0));
        dataClientes.add(new Clientes("Fabián Ojeda Duran", 77704791, 23, 1));
        dataClientes.add(new Clientes("Pascuala Conde-Amat", 72146754, 29, 0));
        dataClientes.add(new Clientes("Vicente de Manzano", 73298990, 24, 1));
        dataClientes.add(new Clientes("Serafina de Suárez", 71831600, 27, 1));
        dataClientes.add(new Clientes("Benita Susanita Segarra Comas", 79557445, 21, 1));
        dataClientes.add(new Clientes("Casemiro Aliaga Arce", 77964394, 48, 1));
        dataClientes.add(new Clientes("Renato Machado Pla", 79493679, 30, 1));
        dataClientes.add(new Clientes("Desiderio Mendoza Escobar", 73176180, 45, 1));
        dataClientes.add(new Clientes("Gerardo Bernat Barros", 71803830, 44, 1));
    }//</editor-fold>
    /*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓ <== DATOS VENTAS  ==> ↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosVentas(){
        //dataClientes.add(new Clientes("Fabio de Arrieta", 76677890, 25, 1));
        dataVentas.add(new Venta("Petrona Fonseca Martínez", "VENDEDOR1", 7013.9));
        dataVentas.add(new Venta("Nicolasa Becerra Sánchez", "VENDEDOR1", 3207.8));
        dataVentas.add(new Venta("Noemí Carpio Seco", "VENDEDOR1", 1649.0));
        dataVentas.add(new Venta("Moreno del Armas", "VENDEDOR1", 2616.7));
    }//</editor-fold>
    /*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓ <== DATOS DETALLES  ==> ↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosDetalles(){
        dataDetalles.add(new Detalle(4,3,22.0,1));
        dataDetalles.add(new Detalle(23,2,3099.0,1));
        dataDetalles.add(new Detalle(36,1,749.9,1));
        
        dataDetalles.add(new Detalle(35,2,729.9,2));
        dataDetalles.add(new Detalle(51,1,439.9,2));
        dataDetalles.add(new Detalle(62,2,214.9,2));
        dataDetalles.add(new Detalle(78,1,278.5,2));
        dataDetalles.add(new Detalle(79,2,299.9,2));
        
        dataDetalles.add(new Detalle(65,1,649.9,3));
        dataDetalles.add(new Detalle(3,2,75.0,3));
        dataDetalles.add(new Detalle(6,2,27.9,3));
        dataDetalles.add(new Detalle(13,1,139.3,3));
        dataDetalles.add(new Detalle(55,1,654.0,3));
        
        dataDetalles.add(new Detalle(37,2,564.9,4));
        dataDetalles.add(new Detalle(52,1,366.9,4));
        dataDetalles.add(new Detalle(80,2,560.0,4));
    }//</editor-fold>
    /*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓ <== DATOS VENDEDORES  ==> ↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosVendedores(){
        /*
        dataVendedores.add(new Vendedor(75593758, "Giancarlo Jose", "Ramirez Perez", "1"));
        dataVendedores.add(new Vendedor(75123233, "Pedro Pablo", "Martinez Cornejo", "1"));
        dataVendedores.add(new Vendedor(75123123, "Saul Enrique", "Chavez Acevedo", "0"));
        dataVendedores.add(new Vendedor(78768754, "Lizbeth Johana", "Acosta Fernandez", "1"));
        */
    }//</editor-fold>
    /*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓ <== DATOS USUARIOS ==> ↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*↓↓*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void datosUsuarios(){
        tablaLogin.insertarTabHash("admin", new Usuario("admin", "Administrador", "2021-01-01", "2021-01-02"));
        tablaLogin.insertarTabHash("MariaGomez", new Usuario("ufufu", "Empleado", "2021-01-03", "2021-01-04"));
        tablaLogin.insertarTabHash("LuisRamirez", new Usuario("123456", "Vendedor", "2021-01-05", "2021-01-06"));
        tablaLogin.insertarTabHash("CarlosTorres", new Usuario("abcd123", "Cajero", "2021-01-07", "2021-01-08"));
        tablaLogin.insertarTabHash("AnaLopez", new Usuario("pass1234", "Cliente", "2021-01-09", "2021-01-10"));
        tablaLogin.insertarTabHash("PedroGarcia", new Usuario("qwerty", "Vendedor", "2021-01-11", "2021-01-12"));
        tablaLogin.insertarTabHash("JuliaRojas", new Usuario("password", "Cliente", "2021-01-13", "2021-01-14"));
        tablaLogin.insertarTabHash("DiegoVargas", new Usuario("hello123", "Cajero", "2021-01-15", "2021-01-16"));
        tablaLogin.insertarTabHash("RosaFlores", new Usuario("abc123", "Cliente", "2021-01-17", "2021-01-18"));
        tablaLogin.insertarTabHash("Nelson", new Usuario("letmein", "Administrador", "2021-01-19", "2021-01-20"));
    }//</editor-fold>
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    /*----*----*----*----*----*---<< Usuarios >>---*----*----*----*----*----*/
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    
    public String obtenerFechaActual() {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Formatear la fecha en el formato deseado
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = formatoFecha.format(fechaActual);

        return fechaFormateada;
    }
    /*----- Fin Usuarios -----*/
    
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    /*----*----*----*----*----*----<< VENTA >>----*----*----*----*----*----**/
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    
    /*=========================================*/
    /*<<--- PilasVenta Nelson (AVANCE 2) ---->>*/
    /*=========================================*/
    
    /*-----Pilas-----*/
    public void mostrarPilaVenta (){
        dataPila = ndVent.getInicio();
        System.out.println("-----------------");
        while (dataPila!=null) {
            System.out.println("Dato: "+dataPila.getIdProdVenta());
            dataPila = dataPila.getSiguiente();
        }
    }
    
    public DefaultTableModel tablaPila(DefaultTableModel modelo){
        List<Producto> listaBase = mostrarProductos();
        dataPila = ndVent.getInicio();
        
        ArrayList lista = new ArrayList();
        Object[] Ob = new Object[5];
        
        while (dataPila!=null) {
            for (Producto producto : listaBase) {
                if (producto.getId()==dataPila.getIdProdVenta()) {
                    Ob[0] = dataPila.getIdProdVenta();
                    Ob[1] = producto.getInfo();
                    Ob[2] = dataPila.getCantidadComprada();
                    Ob[3] = producto.getPrecio();
                    Ob[4] = producto.getCantidad()*producto.getPrecio();
                    modelo.addRow(Ob);
                }
            }
            dataPila = dataPila.getSiguiente();
        }
        return modelo;
    }
    
    public void eliminarTodoPila(){
        ndVent.borrarPila();
    }
    public boolean vacioPila(){
        boolean vacio = false;
        if (ndVent.getInicio()==null) {
            vacio = true;
        }
        return vacio;
    }
    public void eliminarPila(){
        ndVent.eliminardelaPila();
    }
    
    public void PilaVenta(int codPro, int cantVent){
        ndVent.insertarlaPila(codPro,cantVent);
        dataPila = ndVent.getInicio();
        
        dataPila.getIdProdVenta();
        mostrarPilaVenta();
    }
    /*----- Fin Pilas -----*/
    
    ///VENTA SQL
    //PARA VENDER
    public Producto BuscarPro(int cod){
        Producto buscpro = new Producto();
        for (Producto producto : dataProductos) {
            if (producto.getId()== cod) {
                // Actualizar los valores del producto
                buscpro.setTipo(producto.getTipo());
                buscpro.setInfo(producto.getInfo());
                buscpro.setPrecio(producto.getPrecio());
                buscpro.setCantidad(producto.getCantidad());
            }
        }
        return buscpro;
    }
   
    //PARA EL FINAL
    public void RegistrarVenta(String cliente, String vendedor, double total){
        System.out.println("contarventas : "+Venta.getContar());
        dataVentas.add(new Venta(cliente, vendedor, total));
    }
   
   //PARA EL PANEL 1
    public void RegistrarDetalle(int cod_pro, int cantidad, double precio, int id_venta){
        dataDetalles.add(new Detalle(cod_pro, cantidad, precio, id_venta));
    }
    public boolean actualizarStock(int cant, String cod){
        for (Producto producto : dataProductos) {
            if (producto.getId()== Integer.parseInt(cod)) {
                // Actualizar cantidad del producto
                producto.setCantidad(cant);
            }
        }
        return false;
    }
    public DefaultTableModel tablaDetalles(DefaultTableModel tblDetalles){
        DefaultTableModel dt = tblDetalles;
        for (Detalle detall : dataDetalles) {
            Object v[]={detall.getId(),detall.getCod_pro(),detall.getCantidad(),
                        detall.getPrecio(),detall.getId_venta()};
            dt.addRow(v);
        }
        return dt;
    }
    
    public DefaultTableModel tablaVentas(DefaultTableModel tblVentas){
        DefaultTableModel dt = tblVentas;
        for (Venta venta : dataVentas) {
            Object v[]={venta.getId(),venta.getCliente(),venta.getVendedor(),
                        venta.getTotal()};
            dt.addRow(v);
        }
        return dt;
    }
    
    public void soutDetalles(){
        System.out.println("Mostrando Detalles!!");
        System.out.println("ID\tCod_Pro\tCantidad\tPrecio\tId_Venta");
        for (Detalle detall : dataDetalles) {
            System.out.print(detall.getId());
            System.out.print("\t"+detall.getCod_pro());
            System.out.print("\t"+detall.getCantidad());
            System.out.print("\t"+detall.getPrecio());
            System.out.print("\t"+detall.getId_venta()+"\n");
        }
    }
    
    public void soutVentas(){
        System.out.println("Mostrando Ventas!!");
        System.out.println("ID\tCliente\t\tVendedor\tTotal");
         for (Venta ven : dataVentas) {
            System.out.print(ven.getId());
            System.out.print("\t"+ven.getCliente());
            System.out.print("\t\t"+ven.getVendedor());
            System.out.print("\t"+ven.getTotal()+"\n");
        }
    }
    
    /*=====================================================================*/
    /*----*----*----*----*----*---- FIN VENTA ----*----*----*----*----*----*/
    /*=====================================================================*/ 
    
    
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    /*----*----*----*----*----*----< PRODUCTOS >----*----*----*----*----*----*/
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    //Listar Productos  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public List<Producto> mostrarProductos(){
        return dataProductos;
    }
    //Filtrar Producto  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public List<Producto> listarProductoFiltro(String tipo){
        List<Producto> listaBase= mostrarProductos();
        List<Producto> listaFiltro = new ArrayList<>();
        for (Producto producto : listaBase) {
            if (producto.getTipo().equalsIgnoreCase(tipo)) {
                listaFiltro.add(producto);
            }
        }
        return listaFiltro;
    }
    //Añadir Productos  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void anadirProducto(String tipo, String info, double precio, int cantidad){
        dataProductos.add(new Producto(tipo, info, precio,cantidad));
    }
    //Eliminar Producto -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void eliminarProducto(int id){
        // Eliminar los productos con nombre "DOTA2" de la lista
        dataProductos.removeIf(producto -> producto.getId()==id);
    }
    //Mddificar Producto-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void actualizarProducto(Producto pr){
        for (Producto producto : dataProductos) {
            if (producto.getId()==pr.getId()) {
                // Actualizar los valores del producto
                producto.setTipo(pr.getTipo());
                producto.setInfo(pr.getInfo());
                producto.setPrecio(pr.getPrecio());
                producto.setCantidad(pr.getCantidad());
            }
        }
    }
    /*=====================================================================*/
    /*----*----*----*----*----*-- FIN PRODUCTOS --*----*----*----*----*----*/
    /*=====================================================================*/ 
   
    
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    /*----*----*----*----*----*--<< VENDEDORES >>--*----*----*----*----*----*/
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    
    //Listar vendedor
    /*public List<Vendedor> LisVende(){
        return dataVendedores;
    }
   
    public void adiVen(int dni, String nombre, String apellido, String cargo){
        dataVendedores.add(new Vendedor(dni, nombre, apellido, cargo));
    }
    
    public void eliminaVen(int DNI){
        dataVendedores.removeIf(vendedor -> vendedor.getDni()==DNI);
    }*/ 
    
    /*=====================================================================*/
    /*----*----*----*----*----*- FIN  VENDEDORES -*----*----*----*----*----*/
    /*=====================================================================*/ 
    
    
    
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/
    /*----*----*----*----*----*----< CLIENTES >----*----*----*----*----*----*/
    /*==█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█=█==*/ 
    //Listar Cliente   -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public List<Clientes> mostrarClientes(){
        return dataClientes;
    }
    //Añadir Cliente    -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void nuevoCliente(String nombres, int dni, int edad, int activo){
        dataClientes.add(new Clientes(nombres, dni, edad, activo));
    }
    //Eliminar Cliente  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void eliminarCliente(int id){
        dataClientes.removeIf(cliente -> cliente.getId()==id);
    }
    //Mddificar Cliente -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    public void modificarCliente(Clientes cl){
        for (Clientes cliente : dataClientes) {
            if (cliente.getId()== cl.getId()) {
                // Actualizar los valores del producto
                cliente.setNombre(cl.getNombre());
                cliente.setDni(cl.getDni());
                cliente.setEdad(cl.getEdad());
            }
        }
    }
    /*====================================================================*/
    /*----*----*----*----*----*-- FIN CLIENTES --*----*----*----*----*----*/
    /*====================================================================*/   

    public TablaHash getTablaLogin() {
        return tablaLogin;
    }

    public void setTablaLogin(TablaHash tablaLogin) {
        this.tablaLogin = tablaLogin;
    }

    public String getCargoUsuarioLogin() {
        return cargoUsuarioLogin;
    }

    public void setCargoUsuarioLogin(String cargoUsuarioLogin) {
        this.cargoUsuarioLogin = cargoUsuarioLogin;
    }
}


