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
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
        int[] arregloIns = new int[arregloDatos.length];
        System.out.println("ARREGLO ORIGINAL:");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("SELECTION SORT:");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection sort = " + (fin - ini));
        System.out.println("INSERTION SORT:");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        insertionSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("Insertion sort = " + (fin - ini));
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
    
    //INSERTION SORT
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i];
            int insP = i;
            //BUSCAMOS EN QUE PUNTO DEBE DE QUEDAR TEMP
            //ESA POSICION ES ALMACENADA EN INSP
            for (int prev = i-1; prev >= 0; prev--) {
                if(arreglo[prev] > temp){
                    //swap(intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                }else{
                    break;
                }
            }
            arreglo[insP] = temp;
        }
    }
    
    //QUICKSORT PUBLICO
    public static void quickSort(int[] arreglo){
        quickSortRec(arreglo, 0, arreglo.length - 1);
    }
    
    //QUICKSORT PRIVADO
    private static void quickSortRec(int[] arreglo, int ini, int fin){
        //pivote --> posicion
        //dos indices
        //ind_gran --> busca los mayores al pivote
        //ind_peq --> busca los menores al pivote
        //si se encuentran valores, se intercambian
        //si se cruzan, se intercambia pivote con ind_peq
        //quicksort a cada lado del pivote
    }
}
