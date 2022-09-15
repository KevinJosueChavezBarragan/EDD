package Eva1;
public class Eva1_16_EjerciciosArreglos5 {
    public static void main(String[] args) {
        // TODO code application logic here
        int Aleat [] = new int [50];
        for (int i = 0; i < Aleat.length; i++) {
            Aleat [i] = ((int)(Math.random()*100))+1;
            System.out.print("[" + Aleat[i] + "]");
        }
        System.out.println("");
        System.out.println("Valores Aleatorios del arreglo:");
        int Size = 0;
        
        for (int i = 0; i < Aleat.length; i++) {
            if (par(Aleat[i])){
                System.out.print("[" + Aleat[i] + "]");
                Size++;
                
            }                     
        }
        System.out.println("");
        System.out.println("Valores Pares en un nuevo arreglo:");
        System.out.println("Numeros pares encontrados: " + Size);
        int Npares [] = new int [Size];
        int ponPar = 0;
        for (int i = 0; i < Aleat.length; i++) {
            if (par(Aleat[i])){
                Npares [ponPar] = Aleat[i];
                ponPar++;
            }
        }
        
        for (int i = 0; i < Npares.length; i++) {
            System.out.print("[" + Npares[i] + "]");
        }
        
        
        
    }
    
    public static boolean par (int num){
        if (num %2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
}
