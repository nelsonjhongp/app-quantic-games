package estructuradatos.arbolBinario;

public class Nodo {
    public int itDato, itNombre;
    String nombreEmpleado;
    public Nodo ndIzq,itDer;

    public Nodo(int itDato, String nombreEmpleado, Nodo ndIzq, Nodo itDer) {
        this.itDato = itDato;
        this.itNombre=0;
        this.nombreEmpleado = nombreEmpleado;
        this.ndIzq = ndIzq;
        this.itDer = itDer;
    }
    
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
        
    public int getDato() {
        return itDato;
    }

    public void setDato(int dato) {
        this.itDato = dato;
    }

    public Nodo getIzq() {
        return ndIzq;
    }

    public void setIzq(Nodo izq) {
        this.ndIzq = izq;
    }

    public Nodo getDer() {
        return itDer;
    }

    public void setDer(Nodo der) {
        this.itDer = der;
    }
 
}
