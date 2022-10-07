package eva2_1_lista_simple;

public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    //POR DEFAULT LA LISTA ESTA VACIA
    public Lista() {
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

    //AGREGAR UN NODO AL FINAL DE LA LISTA
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
            //Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            //while(temp.getSiguiente() != null){
            //  temp = temp.getSiguiente();
            //}
            //temp.setSiguiente(nuevoNodo);
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }

    public int tamaLista() {
        //int contador = 0;
        //Nodo temp = inicio;
        //¿COMO MUEVO A TEMP?
        //while (temp != null) {
        //    contador++;
        //  temp = temp.getSiguiente();
        //}
        return this.cont;
    }

    public void agregarEn(int valor, int pos) throws Exception {
        //QUE DEBEMOS VALIDAR

        int cantNodos = tamaLista();
        if (pos < 0) {//posiciones negativas
            throw new Exception("No puede insertar un nodo en una posición negativa");
        } else if (pos >= cantNodos) {//INSERTAR EN POSICIONES NO VALIDAS
            throw new Exception(pos + " no es una poscion válida");
        } else {
            Nodo nuevoNodo = new Nodo(valor);
            if (pos == 0) {//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio = nuevoNodo;
            } else {
                Nodo temp = inicio;
                int cont = 0;
                //¿COMO MUEVO A TEMP?
                while (cont <= (pos - 1)) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevoNodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevoNodo);

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
                    while (cont <= (pos - 1)) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    Nodo objSig = temp.getSiguiente();
                    temp.setSiguiente(objSig.getSiguiente());

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