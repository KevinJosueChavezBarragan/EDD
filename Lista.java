package eva2_1_lista_simple;

public class Lista {
    private Nodo inicio;

    //POR DEFAULT LA LISTA ESTA VACIA
    public Lista(Nodo inicio) {
        this.inicio = null;//NO HAY NODOS EN LA LISTA
    }
    
    public void imprimir(){
        Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            while(temp.getSiguiente() != null){
                System.out.println(temp.getValor() + "-");
                temp = temp.getSiguiente();
            }
    }
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LISTA
        if(inicio == null){ //no hay nodos en la lista
            inicio = nuevoNodo;
        }else{//Hay nodos en la lista
            //HAY QUE MOVERNOS POR LA LISTA
            //USANDO UN NODO TEMPORAL
            //HASTA EL ULTIMO NODO DE LA LISTA
            Nodo temp = inicio;
            //¿COMO MUEVO A TEMP?
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }
    
    
    
}
