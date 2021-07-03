package arreglos;

import ejemplosProgramacionOrientadaAObjetos.Persona;
import operacionesMatematicas.Calculadora;
import operacionesMatematicas.FiguraGeometrica;

import java.util.ArrayList;
import java.util.Random;

public class DeclaracionDeArreglos {
    // ambas son declaraciones válidas
    int intArray[];
    int[] intArray2;

    // Arreglos con tipos de datos primitivos

    byte byteArray[];
    short shortArray[];
    boolean booleanArray[];
    long longArray[];
    float floatArray[];
    double doubleArray[];
    char charArray[];

    Object objectArray[];

//Tipos de datos definidos por el usuario

    Calculadora calculadoras[];
    FiguraGeometrica figuras[];


//
    ArrayList<Persona> personas = new ArrayList<Persona>();

    public  void inicializandoArreglos(){
        intArray = new int[10]; // asignando memoria al array
        int[] intArray = new int[10]; // combinando ambas declaraciones en una
        int[] intArray3 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        String[] palabras = {"hola","a","todos"};

        for (int i = 0; i < intArray3.length; i++)
            System.out.println("Elemento en el índice " + i + " : "+ intArray3[i]);

        for (int i: intArray3){
            System.out.println(i);
        }

        for(String palabra: palabras) {
            System.out.println(palabra +" tiene "+ palabra.length()+ " letras");
        }
/*
        Persona persona1 =  new Persona("Sergio", "Pat");
        Persona persona2 =  new Persona("Fulgencio", "Figueroa");
        personas.add(persona2);
        Persona persona3 =  new Persona("Rigoberto", "Martinez");

        System.out.println("EL ArrayList de Personas tiene " + personas.size()+ " personas");
        personas.add(persona1);
        personas.add(persona3);
        System.out.println("EL ArrayList de Personas tiene " + personas.size()+ " personas");
        personas.remove(persona2);
        System.out.println("EL ArrayList de Personas tiene " + personas.size()+ " personas");
        System.out.println("La persona "+persona1.getNombre()+" se encuentra en la posición "+personas.indexOf(persona1));
        ((Persona)personas.get(0)).getNombre();
        personas.get(0).getNombre();

        for(Persona p: personas){
            System.out.println();
        }

        for(Persona p: personas){
            System.out.println(p);
        }
        try{
            System.out.println(personas.get(0));
        }catch (IndexOutOfBoundsException e){
            System.out.println("te estás pasando de lanza esa casilla no existe");
        }

*/

    }



    public static void main(String args[]){
        new DeclaracionDeArreglos().inicializandoArreglos();
    }

    public void inicializandoArrayMultidimencional(int casillas)
    {
        // declarar e inicializar array 2D
        int arrayM[][] = { {2,7,9},{3,6,1},{7,4,2} };
        intArray2= new int[5];
        intArray2=new int [casillas];

        // imprimir array 2D
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arrayM + " ");

            System.out.println();
        }




    }
}
