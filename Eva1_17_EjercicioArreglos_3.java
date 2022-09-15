package Eva1;
public class Eva1_17_EjercicioArreglos_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        int Matriz[][] = new int [5][5];
       
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = (int)((Math.random()*100))+1;                              
            }          
        }
        Imprimir(Matriz);
        
        int MatrizInv[][] = new int [5][5];
        int D1 = (Matriz.length)-1;
        int D2 = (Matriz.length)-1;
        
        for (int i = 0; i < MatrizInv.length; i++) {
            for (int j = 0; j < MatrizInv[i].length; j++) {
                System.out.println("D1:" + D1 + " D2: " + D2);
               
                //MatrizInv[D1][D2] = Matriz[i][j];
                
                D2--;
            }
            D1--;
        }
        
        
    }
    
    public static void Imprimir (int Matriz[][]){
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("[" + Matriz[i][j] + "]");                               
            }
            System.out.println("");            
        }
    }
    
}
