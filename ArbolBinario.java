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
    public void agregar(int valor) {
        if (root == null) {
            root = new Nodo (valor);
        } else {
            agregarRecur(valor, root);
        }
    }

    //metodo recursivo agregar
    //necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual) {
        //1 QUE EL NODO RECIBIDO ES NULL
        //Arbol vacio
        //2 DECIDIR SI VA A IZ O DER
        /*
         verificar si el lado (nodo) es null
             si es null, ahi va el valor
        si no
             repetir recursion
         */
        Nodo nuevo = new Nodo(valor);
        if(valor < nodoActual.getValor()){
            if(nodoActual.getIzquierda() == null){
                nodoActual.setIzquierda(nuevo);
            }else{
                agregarRecur(valor, nodoActual.getIzquierda());
            }
        }else if(valor > nodoActual.getValor()){
            if(nodoActual.getDerecha() == null){
                nodoActual.setDerecha(nuevo);
            }else{
                agregarRecur(valor, nodoActual.getDerecha());
            }
        }else{
            System.out.println("ELEMENTO REPETIDO!!");
        }
    }
    
    //IMPRESION DE VALORES
    //IN ORDER
    //izq valor der
    //metodo publico
    
     public void inOrder(){
        inOrderRecu(root);
         System.out.println("");
    }
    //metodo privado recursivo
    private void inOrderRecu(Nodo nodo){
        if(nodo == null){
            
        }else{
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + "-");
            inOrderRecu(nodo.getDerecha());
        }
    }
   
    //PRE ORDER
    //valor izq der
    //metodo publico
    public void preOrder(){
        preOrderRecu(root);
        System.out.println("");
    }
    
    //metodo privado recursivo
    private void preOrderRecu(Nodo nodo){
        if(nodo == null){
            
        }else{
            System.out.print(nodo.getValor() + "-");
            preOrderRecu(nodo.getIzquierda());
            preOrderRecu(nodo.getDerecha());
        }
    }
    
    //POST ORDER
    //IZQ DER VALOR
    //metodo publico
    
    public void postOrder(){
        postOrderRecu(root);
        System.out.println("");
    }
    
    //metodo privado recursivo
    private void postOrderRecu(Nodo nodo){
        if(nodo == null){
            
        }else{
            postOrderRecu(nodo.getIzquierda());
            postOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + "-");
        }
    }
}