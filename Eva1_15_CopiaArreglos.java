package Eva1;
public class Eva1_15_CopiaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Arreglo [] = new int[10];
        
        System.out.println("------------------ARREGLO------------------");
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = (int)(Math.random()*100);
            System.out.print("[" + Arreglo[i] +"]");
        }
        
        int ArregloCopia [] = new int [Arreglo.length];
        //Copiar los valores almacenados en el arreglo
        System.out.println("");
        System.out.println(Arreglo);
        System.out.println(ArregloCopia);
        // Como crear la copia de los valores
        System.out.println("------------------ARREGLO COPIA------------------");
        int count = Arreglo.length-1;
        for (int i = 0; i < ArregloCopia.length; i++) {
            //System.out.print(count + "");
            //System.out.println("i: " + i + "array: " + Arreglo[i]);
            ArregloCopia[count] = Arreglo[i];
            count--;
            System.out.print("[" + ArregloCopia[i] +"]");
            
        }
    }
    
}
