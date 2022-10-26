package eva2_6_arbol_binario;

public class EVA2_6_ARBOL_BINARIO {

    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        
        arbolBinario.agregar(20);
        arbolBinario.agregar(21);
        arbolBinario.agregar(15);
        arbolBinario.agregar(17);
        arbolBinario.agregar(12);
        arbolBinario.inOrder();
        arbolBinario.preOrder();
        arbolBinario.postOrder();
        
    }
    
}
