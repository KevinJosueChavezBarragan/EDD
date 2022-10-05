package eva2_1_lista_simple;

public class EVA2_1_LISTA_SIMPLE {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        miLista.agregar(40);
        miLista.agregar(50);
        miLista.agregar(60);
        miLista.imprimir();
        try{
        miLista.agregarEn(70, 3);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //for (int i = 0; i < 1000000; i++) {
            // miLista.agregar(1000);
        //}
        //System.out.println("Conteo de nodos: " + miLista.tamaLista());
        miLista.vaciarLista();
        miLista.imprimir();
        
    }
}