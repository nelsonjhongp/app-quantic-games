/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DAVID
 */
public class Venta {
    private static int contar = 1; 
    private int id;
    private String cliente;
    private String vendedor;
    private double total;

    public Venta() {
    }

    public Venta(String cliente, String vendedor, double total) {
        this.id = contar++;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public static int getContar() {
        return contar;
    }
    public static void setContar(int aContar) {
        contar = aContar;
    }
}
