package eva3_1_ordenamientos;

/**
 *
 * @author moviles
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloDatos = new int[100];
        int[] arregloSel = new int[arregloDatos.length];
        System.out.println("ARREGLO ORIGINAL:");
        llenar(arregloDatos);
        //imprimir(arregloDatos);
        System.out.println("SELECTION SORT:");
        copiar(arregloDatos, arregloSel);
        //imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        //imprimir(arregloSel);
        System.out.println("Selection sort = " + (fin - ini));
    }
    
    //llenar arreglo
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }
    //imprimir arreglo
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < 10)
               System.out.print("[0" + arreglo[i] + "]");
            else
               System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    //copiar arreglo
    public static void copiar(int[] arreglo, int[] copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i]; 
        }
    }
    //SELECTION SORT
    //COMPARACIONES
    //INTERCAMBIOS (SWAP)
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //BUSCO EL ELEMENTO (POSICION) MAS PEQUEñO
            for (int j = i + 1; j < arreglo.length; j++) {
                //buscar el mas pequeño
                if(arreglo[min] > arreglo[j])
                    min = j;
            }
            //SWAP INTERCAMBIAR
            if(min != i){
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }
}
