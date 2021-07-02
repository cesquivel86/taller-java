package arreglos;

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

//Tipos de datos definidos por el usuario

    Calculadora calculadoras[];
    FiguraGeometrica figuras[];




    public  void inicializandoArreglos(){
        intArray = new int[10]; // asignando memoria al array
        int[] intArray = new int[10]; // combinando ambas declaraciones en una
        int[] intArray3 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for (int i = 0; i < intArray3.length; i++)
            System.out.println("Elemento en el índice " + i + " : "+ intArray3[i]);

        for (int i: intArray3){
            System.out.println(i);
        }
    }



    public static void main(String args[]){
        new DeclaracionDeArreglos().inicializandoArreglos();
    }

    public void inicializandoArrayMultidimencional()
    {
        // declarar e inicializar array 2D
        int arrayM[][] = { {2,7,9},{3,6,1},{7,4,2} };

        // imprimir array 2D
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arrayM + " ");

            System.out.println();
        }
    }
}
