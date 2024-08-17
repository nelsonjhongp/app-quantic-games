
package model;

public class Producto {
    private static int contar = 1; 
    private int id; 
    private String tipo;
    private String info;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String tipo, String info, double precio, int cantidad) {
        this.id = contar++;
        this.tipo = tipo;
        this.info = info;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContar() {
        return contar;
    }

    public static void setContar(int aContar) {
        contar = aContar;
    }
}
