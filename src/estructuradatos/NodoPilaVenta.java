package estructuradatos;
/*@author Nelson*/
public class NodoPilaVenta {
    /*<<--- PilasVenta Nelson (AVANCE 2) ---->>*/
    
    private int idProductoEnVenta;
    private int cantidadComprada;
    private NodoPilaVenta siguiente;

    public NodoPilaVenta(int idProductoEnVenta, int cantidadComprada) {
        this.idProductoEnVenta = idProductoEnVenta;
        this.cantidadComprada = cantidadComprada;
        this.siguiente = siguiente;
    }

    public int getIdProdVenta() {
        return idProductoEnVenta;
    }

    public void setIdProdVenta(int idProdVenta) {
        this.idProductoEnVenta = idProdVenta;
    }

    public NodoPilaVenta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPilaVenta siguiente) {
        this.siguiente = siguiente;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getIdProductoEnVenta() {
        return idProductoEnVenta;
    }

    public void setIdProductoEnVenta(int idProductoEnVenta) {
        this.idProductoEnVenta = idProductoEnVenta;
    }

    
}

