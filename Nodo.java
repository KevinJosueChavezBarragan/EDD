package eva2_1_lista_simple;

public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    //POR DEFAULT, UN NUEVO NODO VA AL FINAL DE LA LISTA
    //EL FINAL DE LA LISTA SE INDICA CON NULL
    //POR ESO NEXT = NULL
    public Nodo(){
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }    
    
}
