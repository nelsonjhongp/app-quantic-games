package model;
/*@author Nelson*/
public class Clientes {
    private static int contar = 1; 

    public static int getContar() {
        return contar;
    }
    public static void setContar(int aContar) {
        contar = aContar;
    }
    
    private int id;
    private String nombres;
    private int dni;
    private int edad;
    private int activo;

    public Clientes() {
    }

    public Clientes(String nombres, int dni, int edad, int activo) {
        this.id = contar++;
        this.nombres = nombres;
        this.dni = dni;
        this.edad = edad;
        this.activo = activo;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
