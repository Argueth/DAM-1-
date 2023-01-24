/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacionMatricesFunciones;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class matricesFunciones {
    
    public static void creacionMatrices() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("De acuerdo, ahora crearemos las matrices a multiplicar.");
        int opcion = 0;
        
        do {
            
            System.out.println("Dime la cantidad de filas para la primera matriz");
            int filas = entrada.nextInt();

            System.out.println("Ahora dime la cantidad de columnas que deseas la primera matriz");
            int columnas = entrada.nextInt();

            int matrizA[][] = new int[filas][columnas];
            int matrizB[][] = new int[columnas][filas];
            int matrizC[][] = new int[filas][filas];

            System.out.println("De acuero.");
            System.out.println("La segunda matriz se generará con tantas columnas como filas tenía la primera y con tantas filas como columnas tenía la primera. De otro modo, no podrían multiplicarse.");

            modoRellenoMatrices(matrizA, matrizB);
            multiplicarMatrices(matrizA, matrizB, matrizC);
            imprimirMatrices(matrizA, matrizB, matrizC);
            
            boolean valido = false;
                    
            do {
                System.out.println("");
                System.out.println("=========================================================================================");
                System.out.println("");
                System.out.println("¿Qué quieres hacer ahora?");
                System.out.println("1. Seguir");
                System.out.println("2. Salir");
                if (entrada.hasNextInt()) {
                    opcion = entrada.nextInt();
                }
                if (opcion!=1 && opcion!=2) {
                    System.out.println("Opción no válida.");
                }else {
                    valido = true;
                }
            
            } while (valido = false);
   
                
            
        } while (opcion == 1);
            
    }
    
    public static void modoRellenoMatrices(int matrizA[][], int matrizB[][]) {
        
        Scanner entrada = new Scanner(System.in);
        int opcionLlenado = 0;
        //declaracion de las matrices
        
        
        System.out.println("¿Cómo quieres llenar las matrices?");
        
        do {
            
            System.out.println("1. Manualmente.");
            System.out.println("2. Al azar.");
        
            if (entrada.hasNextInt()) {
                opcionLlenado = entrada.nextInt();
            }
            if (opcionLlenado == 1) {
                llenadoManual(matrizA, matrizB);
            }else if (opcionLlenado == 2) {
                llenadoAzar(matrizA, matrizB);
            }else {
                System.out.println("Valor inválido. Introduzca de nuevo su opción.");
                entrada.nextLine();
            }
        
        } while (opcionLlenado != 1 && opcionLlenado != 2); 
    }
    
    public static void llenadoManual (int matrizA[][], int matrizB[][]){
        
        Scanner entrada = new Scanner(System.in);
        
        //Llenado manual de la MatrizA
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("intorduce el valor de la celda %d %d %n", i, j);
                if (entrada.hasNextInt()) {
                    matrizA[i][j] = entrada.nextInt();
                }
            }
        }
        //llevano manual de la matrizB
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("intorduce el valor de la celda %d %d %n", i, j);
                if (entrada.hasNextInt()) {
                    matrizA[i][j] = entrada.nextInt();       
                }
            }
        }
    }
    
    public static void llenadoAzar(int matrizA[][], int matrizB[][]) {
        
        //llenado aleatrorio de la matrizA
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) (Math.random()*10);
            }
        }
        
        //Llenado aleatorio de la matrizB
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = (int)(Math.random()*10);
            }
        }
    }
    
    public static void multiplicarMatrices(int matrizA[][], int matrizB[][], int matrizC[][]) {
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                for (int k = 0; k < matrizA[i].length; k++) {
                    matrizC[i][j] += (matrizA[i][k] * matrizB[k][j]);
                }
            }
        }
    }
    
    public static void imprimirMatrices(int matrizA[][], int matrizB[][], int matrizC[][]) {
        
        //imprimir la matrizA
        System.out.println("MATRIZ A");
        System.out.println("");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "    ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        //imprimir la matrizB
        System.out.println("MATRIZ B");
        System.out.println("");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        
        //imrpimir la matrizC
        System.out.println("RESULTADO DE LA MULTUPLICACIÓN");
        System.out.println("");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j]+ "      ");
            }
            System.out.println("");
        }
    }
    
}
