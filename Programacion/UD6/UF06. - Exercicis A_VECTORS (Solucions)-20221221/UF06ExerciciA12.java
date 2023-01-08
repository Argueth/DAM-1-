/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 12: Programa que crea un array de 10 enters i després mostra el menú:
 *          a. Mostrar valors.
 *          b. Introduir valor.
 *          c. Eixir.
 * L'opció ‘a’ mostrarà tots els valors per pantalla. L'opció ‘b’ demanarà un valor V i una
 * posició P, després escriurà V a la posició P de l'array. El menú és repetirà indefinidament
 * fins que l'usuari trii l'opció 'c' que acabarà el programa.
 */
public class UF06ExerciciA12 {

    public static void main(String[] args) {

        // Declaració de variables
        int vector[] = new int[10];
        int i, valor, posicio;
        boolean continuar = true;
        String opcio;
        Scanner entrada = new Scanner(System.in);

        // Presentar menú i processar opcions
        while (continuar) {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valors");
            System.out.println("b. Introduir valor");
            System.out.println("c. Eixir");
            System.out.print("Tria una opció i polsa intro: ");
            opcio = entrada.nextLine();
            
            switch (opcio) {
                
                case "a":
                    for (i = 0; i < vector.length; i++)
                        System.out.print(vector[i] + " ");
                    System.out.println();
                    break;
                    
                case "b":
                    System.out.print("Introdueix el valor: ");
                    valor = entrada.nextInt();
                    System.out.print("Introdueix la posició: ");
                    posicio = entrada.nextInt();
                    if (posicio < 0 || posicio >= vector.length)
                        System.out.println("Posició fora de límits.");
                    else
                        vector[posicio] = valor;
                    entrada.nextLine();
                    break;
                    
                case "c":
                    System.out.println("Fi del programa");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        }
        entrada.close();
    }
}
