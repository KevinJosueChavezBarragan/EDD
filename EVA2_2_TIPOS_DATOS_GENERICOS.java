package eva2_2_tipos_datos_genericos;

import java.util.LinkedList;

public class EVA2_2_TIPOS_DATOS_GENERICOS {

    public static void main(String[] args) {
        LinkedList<String> miLista = new LinkedList<String>();
        //miLista.
        TiposDatosGenericos<Integer> miObj = new TiposDatosGenericos();
        miObj.setValor(100);
        System.out.println(miObj.getValor());
    }
    
}

class TiposDatosGenericos<T>{
    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}