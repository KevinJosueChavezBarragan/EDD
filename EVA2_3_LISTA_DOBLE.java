package eva2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA2_3_LISTA_DOBLE {

    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        
        listaDoble.agregar(10);
        listaDoble.agregar(20);
        listaDoble.agregar(30);
        listaDoble.agregar(40);
        listaDoble.agregar(50);
        listaDoble.agregar(60);
        listaDoble.imprimir();   
        
        try {
            listaDoble.agregarEn(70, 5);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaDoble.imprimir();
        listaDoble.imprimirInv();
        
        try {
            listaDoble.borrarEn(2);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaDoble.imprimir();
        listaDoble.imprimirInv();
    }
    
}
