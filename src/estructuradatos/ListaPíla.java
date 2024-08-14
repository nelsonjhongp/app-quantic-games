package estructuradatos;
/*@author Nelson*/
public class ListaPíla {
    /*<<--- PilasVenta Nelson (AVANCE 2) ---->>*/
    
    private NodoPilaVenta inicio;
    private int nElementos;

    public ListaPíla() {
        this.inicio = null;
        this.nElementos = 0;
    }
    

    public void insertarlaPila(int idProductoEnVenta, int cantidadComprada){
        NodoPilaVenta nuevo = new NodoPilaVenta(idProductoEnVenta, cantidadComprada);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
        nElementos++;
    }
    
    public void borrarPila() {
        inicio = null;
        nElementos = 0;
        System.out.println("Pila Vacia");
    }
    
    public void eliminardelaPila(){
        int elemento=0;
        if (inicio != null) {
            elemento=inicio.getIdProdVenta();
            System.out.println("Elemento eliminado -> "+elemento);
            inicio = inicio.getSiguiente();
            nElementos--;
        }
        else{
            System.out.println("Pila Vacia");
        }
    }
    
    
    public int getnElementos() {
        return nElementos;
    }

    public void setnElementos(int nElementos) {
        this.nElementos = nElementos;
    }

    public NodoPilaVenta getInicio() {
        return inicio;
    }

    public void setInicio(NodoPilaVenta inicio) {
        this.inicio = inicio;
    }
}
