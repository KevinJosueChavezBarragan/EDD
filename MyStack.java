package eva2_5_stack;

public class MyStack {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    
    public MyStack() {
        this.inicio = null;//NO HAY NODOS EN LA LISTA
        this.fin = null;
        cont = 0;
    }
    
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }
    
    public int tamaLista() {
        return this.cont;
    }
    
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        //VERIFICAR SI HAY NODOS EN LA LISTA
        if (inicio == null) { //no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {//Hay nodos en la lista
            //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL
            //HASTA EL ULTIMO NODO DE LA LISTA
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public void agregarEn(int valor, int pos) throws Exception {
        //QUE DEBEMOS VALIDAR

        int cantNodos = tamaLista();
        if (pos < 0) {//posiciones negativas
            throw new Exception("No puede insertar un nodo en una posición negativa");
        } else if (pos >= cantNodos) {//INSERTAR EN POSICIONES NO VALIDAS
            throw new Exception(pos + " no es una posicion válida");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) {//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                //¿COMO MUEVO A TEMP?
                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);

            }
            this.cont++;
        }
    }
    
    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public void borrarEn(int pos) throws Exception {

        int cantNodos = tamaLista();
        if (pos < 0) {//posiciones negativas
            throw new Exception("No puede borrar un nodo en una posición negativa");
        } else if (pos >= cantNodos) {//INSERTAR EN POSICIONES NO VALIDAS
            throw new Exception(pos + " no es una poscion válida");
        } else {
            if (cantNodos == 1) {//borrar el primer nodo
                vaciarLista();
            } else {
                //borrar primer nodo (Listo)
                //borrar el intermedio
                //borrar el final
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    Nodo temp = inicio;
                    int cont = 0;
                    //¿COMO MUEVO A TEMP?
                    while (cont < pos) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    Nodo objSig = temp.getSiguiente();
                    Nodo objPrev = temp.getPrevio();
                    temp.setSiguiente(objSig.getSiguiente());
                    temp.setPrevio(objPrev.getPrevio());

                    if (pos == (cantNodos - 1)) {//reconectar fin
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }
    
    public int obtenerValorEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        int valor = 0;
        if (pos < 0) {//posiciones negativas
            throw new Exception("No puede borrar un nodo en una posición negativa");
        } else if (pos >= cantNodos) {//INSERTAR EN POSICIONES NO VALIDAS
            throw new Exception(pos + " no es una poscion válida");
        } else {
            Nodo temp = inicio;
            int cont = 0;
            //¿COMO MUEVO A TEMP?
            while (cont < pos) {
                temp = temp.getSiguiente();
                cont++;
            }
            valor = temp.getValor();
        }
        return valor;
    }
}
