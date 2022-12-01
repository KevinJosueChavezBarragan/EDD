package eva3_3_busqueda_binaria;

import java.util.Scanner;

public class EVA3_3_BUSQUEDA_BINARIA {

    public static void main(String[] args) {
        int[] arregloDatos = new int[15];
        int[] arregloSel = new int[arregloDatos.length];
        System.out.println("ARREGLO ORIGINAL:");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("SELECTION SORT:");
        copiar(arregloDatos, arregloSel);
        selectionSort(arregloSel);
        imprimir(arregloSel);
        Scanner input  = new Scanner(System.in);
        System.out.print("Introduce el valor a buscar: ");
        int buscar = input.nextInt();
        System.out.println("");
        System.out.println("El valor esta en: " + busquedaBin(arregloSel, buscar));
    }
    
    //llenar arreglo
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    //imprimir arreglo
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 10) {
                System.out.print("[0" + arreglo[i] + "]");
            } else {
                System.out.print("[" + arreglo[i] + "]");
            }
        }
        System.out.println("");
    }

    //copiar arreglo
    public static void copiar(int[] arreglo, int[] copia) {
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }
    
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //BUSCO EL ELEMENTO (POSICION) MAS PEQUEñO
            for (int j = i + 1; j < arreglo.length; j++) {
                //buscar el mas pequeño
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                }
            }
            //SWAP INTERCAMBIAR
            if (min != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }
    
    //BUSQUEDA BINARIA
    public static int busquedaBin(int[] arreglo, int valor){
        return busquedaBinRec(arreglo, 0, arreglo.length - 1, valor);
    }
    
    private static int busquedaBinRec(int[] arreglo, int ini, int fin, int valor){
        int mitad = ini + ((fin - ini) / 2);
        int resu = -1;
        
        
        if(ini < fin){//Aqui hacemos la busqueda binaria recursiva
            if(valor == arreglo[mitad])//lo encontramos
               resu = mitad;//posicion donde esta el elemento que buscamos
            else if(valor < arreglo[mitad])//Menor que la mitad, esta a la izq
                resu = busquedaBinRec(arreglo, 0, mitad - 1, valor);
            else//mayor que la mitad, esta a la der
                resu = busquedaBinRec(arreglo, mitad + 1, fin, valor);

        }
        
        return resu;
    }
}
