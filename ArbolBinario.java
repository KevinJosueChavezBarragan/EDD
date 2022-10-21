package eva2_6_arbol_binario;

/**
 *
 * @author moviles
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    //metodo publico para el usuario
    public void agregar(int valor){
        agregarRecur(valor, root);
    }
    
    //metodo recursivo agregar
    //necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual){
        
    }
}
