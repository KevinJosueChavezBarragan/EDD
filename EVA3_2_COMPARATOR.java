package eva3_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;

public class EVA3_2_COMPARATOR {

    public static void main(String[] args) {
       //LISTA
        LinkedList<Integer> miLista = new LinkedList();
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        miLista.add((int)(Math.random()*100));
        System.out.println(miLista);
        //ORDENAR --> COMPARATOR
        //COMPARATOR ES UNA INTERFAZ
        Comparator ordenar = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer)o1;
                Integer val2 = (Integer)o2;
                
                return val1 - val2;
            }
        }; 
        miLista.sort(ordenar);
        System.out.println(miLista);
        LinkedList<Persona> listaPersona = new LinkedList();
        listaPersona.add(new Persona("David", "Tovar", "Escobar", 23, 500.0)); 
        listaPersona.add(new Persona("Jesus", "Jaquez", "Fabela", 19, 100.0));
        listaPersona.add(new Persona("Ivan", "Ramirez", "Romero", 18, 800.0)); 
        listaPersona.add(new Persona("Yahir", "Quezada", "Romero", 19, 150.0)); 
        listaPersona.add(new Persona("America", "Chavarria", "Monge", 19, 300.0)); 
        listaPersona.add(new Persona("Paulina", "Villegas", "Treviño", 19, 200.0)); 
        listaPersona.add(new Persona("Hector", "Rodriguez", "Barron", 19, 50.0)); 
        //COMPARATOR: APELLIDO PATERNO
        
        //COMPARATOR: SALARIO
    }
    
}

class Persona{
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private double salario;

    public Persona(String nombre, String paterno, String materno, int edad, double salario) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.salario = salario;
    }
}