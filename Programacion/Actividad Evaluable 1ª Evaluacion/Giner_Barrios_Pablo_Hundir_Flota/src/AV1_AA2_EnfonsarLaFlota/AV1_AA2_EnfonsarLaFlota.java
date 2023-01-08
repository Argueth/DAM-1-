/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AV1_AA2_EnfonsarLaFlota;

import java.util.Scanner;

/**
 *
 * @author Pablo Giner Barrios
 */
public class AV1_AA2_EnfonsarLaFlota {

    /**
     * Módulo principal que inicia el juego.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int min = 1, max = 3, seleccio = 0, files=11, columnes=11, llanxes=0, vaixells=0, cuirassats=0, portaavions=0, max_trets=0;
        /**
        * Menú de inicio.
        */      
        System.out.println("======================BENVINGUTS A AFONAR LA FLOTA======================");
        System.out.println("NiveLLS de dificultaT:");
        System.out.println("1. FÀcil: 5 llanxes, 3 vaixells, 1 cuirassats y 1 portaavions. (50 trets)");
        System.out.println("2. Medio: 2 llanxes, 1 vaixell, 1 cuirassat y 1 portaavions. (30 trets)");
        System.out.println("3. Dificil: 1 llanxa y 1 vaixell. (10 trets)");           
        System.out.println("¡¡Tria un nivell!!");
            
        seleccio = demana_dades_entre_max_y_min(min, max);    
        
        switch (seleccio) {
            case 1:
                llanxes = 5;
                vaixells = 3;
                cuirassats = 1;
                portaavions = 1;
                max_trets = 50;
                break;
            case 2:
                llanxes = 2;
                vaixells = 1;
                cuirassats = 1;
                portaavions = 1;
                max_trets = 30;
                break;
            case 3:
                llanxes = 1;
                vaixells = 1;
                cuirassats = 0;
                portaavions = 0;
                max_trets = 10;
                break;
        }
        
        System.out.println("");
        jugar_partida (files, columnes, llanxes, vaixells, cuirassats, portaavions, max_trets);
        
    }
    
    
    /**
     * Módulo que inicia la partida y sirve de nexo al resto de módulos. 
     * @param files nombre de files
     * @param columnes nombre de columnes
     * @param llanxes nombre de llanxes
     * @param vaixells nombre de vaixells
     * @param cuirassats nombre de cuirassats
     * @param portaavions nombre de portaavions
     * @param max_trets nombre màxim de trets
     */
    public static void jugar_partida(int files, int columnes, int llanxes, int vaixells, int cuirassats, int portaavions, int max_trets){
        
        System.out.println("Benvingut a AFONAR LA FLOTA!!!");
        System.out.println("");
        char tauler[][];
        int coordenades_tret[] = new int[2];
        boolean veureTot = false;
        
        tauler = crear_tauler(files, columnes);

        inserir_barcos(tauler, llanxes, vaixells, cuirassats, portaavions);
        
        while (max_trets > 0 && queden_barcos(tauler) == true) {
            
            mostra_tauler(tauler, veureTot);
            
            System.out.println("Et queden " + max_trets + " trets.");
            System.out.println("");
            
            coordenades_tret = demana_coordenades_tret(tauler);
            
            processa_tret(tauler, coordenades_tret[0], coordenades_tret[1]);
            
            max_trets--;
        }
        
        System.out.println("=====================");
        System.out.println("====FI DE PARTIDA====");
        System.out.println("=====================");
        
        veureTot = true;
        
        mostra_tauler(tauler, veureTot);
        
        if (queden_barcos(tauler) == true) {
            System.out.println("ETS UN LOOSER.");
        }else {
            System.out.println("HAS GUANYAT!!!");
        }              
    }
    
    /**
     * MÒdul que crea el tauler del joc.
     * @param files nombre de files
     * @param columnes nombre de columnes
     * @return retorna el tauler vuit
     */
    public static char[][] crear_tauler(int files, int columnes) {
        
        char tauler[][] = new char[files][columnes];
        
        int lletra_inicial = 65;
        char lletra = (char)lletra_inicial;
        
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (i==0 && j==0) {
                    tauler[i][j] = ' ';
                }else if (i==0 && j!=0) {
                    tauler[i][j] = String.valueOf(j-1).charAt(0);
                }else if (i!=0 && j==0) {
                    tauler[i][j] = lletra;
                    lletra++;
                }else if (i!=0 && j!=0) {
                    tauler[i][j]= '-';
                }               
            }
        }
        return tauler;
    }
    
    /**
     * Módul que mostra el tauler segons el moment de la partida. 
     * @param tauler el tauler creat
     * @param veureTot boolean que canvia el mode de veure el tauler
     */
    public static void mostra_tauler(char[][] tauler, boolean veureTot) {
        
        if (veureTot == false) {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i]. length; j++) {
                    if (i==0 || j==0) {
                    System.out.print(tauler[i][j] + " ");
                    }else {                                       
                        switch (tauler[i][j]) {
                            case '-', 'P', 'Z', 'B', 'L':
                                System.out.print('-' + " ");
                                break;
                            case 'X':
                                System.out.print('X' + " ");
                                break;
                            case 'A':
                                System.out.print('A' + " ");
                                break;
                        }
                    }
                }
                System.out.println("");
            }
        }else if (veureTot == true) {
            for (int i = 0; i < tauler.length; i++) {
                for (int j = 0; j < tauler[i].length; j++) {
                    System.out.print(tauler[i][j] + " ");
                }
                System.out.println("");
            }
        }
        
        
    }
    
    /**
     * Mòdul que possa el vaixells en el tauler.
     * @param tauler tauler creat
     * @param llanxes nombre de llanxes
     * @param vaixells nombre de vaixells
     * @param cuirassats nombre de cuirassats
     * @param portaavions  nombre de portaavions
     */
    public static void inserir_barcos (char[][] tauler, int llanxes, int vaixells, int cuirassats, int portaavions) {
        
        int coordenada[] = new int[2], mida;
        
        for (int i = 0; i < portaavions; i++) {
             mida = 5;
             coordenada = coordenada_aleatoria(tauler, mida);
             if (coordenada[0] !=0 && coordenada[1] !=0) {
                for (int j = 0; j < mida; j++) {
                    tauler[coordenada[0]][coordenada[1]]= 'P';
                    coordenada[1]++;
                }
            }else {
                 System.out.println("EEROR. NO se ha podido colocar el barco.");
             }
             
        }
        
        for (int i = 0; i < cuirassats; i++) {
            mida = 4;
            coordenada = coordenada_aleatoria(tauler, mida);
            if (coordenada[0] !=0 && coordenada[1] !=0) {
                for (int j = 0; j < mida; j++) {
                    tauler[coordenada[0]][coordenada[1]] = 'Z';
                    coordenada[1]++;
                }
            }else {
                 System.out.println("EEROR. NO se ha podido colocar el barco.");
            }
        }
        
        for (int i = 0; i < vaixells; i++) {
            mida = 3;
            coordenada = coordenada_aleatoria(tauler, mida);
            if (coordenada[0] !=0 && coordenada[1] !=0) {
                for (int j = 0; j < mida; j++) {
                    tauler[coordenada[0]][coordenada[1]] = 'B';
                    coordenada[1]++;
                }
            }else {
                 System.out.println("EEROR. NO se ha podido colocar el barco.");
            }
        }
        
        for (int i = 0; i < llanxes; i++) {
            mida = 1;
            coordenada = coordenada_aleatoria(tauler, mida);
            if (coordenada[0] !=0 && coordenada[1] !=0) {
                for (int j = 0; j < mida; j++) {
                    tauler[coordenada[0]][coordenada[1]] = 'L';
                    coordenada[1]++;
                }
            }else {
                 System.out.println("EEROR. NO se ha podido colocar el barco.");
            }
        }
    }
    
    /**
     * Mòdul per a demanar les coordenades de tret a l'usuari
     * @param tauler tauler creat
     * @return retorna coordenades de tret.
     */
    public static int[] demana_coordenades_tret(char[][] tauler) {
        
        Scanner entrada = new Scanner(System.in);
        
        int tret[] = new int[2];
        int f, c = -1;
        int fila = 0;
        
        do {
            System.out.println("Introdueix una fila entre la A y la J: ");
            f = String.valueOf(entrada.nextLine()).toUpperCase().charAt(0);
            fila = f - 64;  
            if (fila < 1 || fila > 10) {
                System.out.println("VALOR INCORRECTE!!");
            }
        } while (fila < 1 || fila > 10);
        tret[0] = fila;
        
        do {
            System.out.println("Introdueix una columna entre 0 y 9: ");
            if (entrada.hasNextInt()) {
                c = entrada.nextInt() + 1;
            }
            if (c >= 0 && c <= 9) {
                break;
            }
       
            System.out.println("VALOR INCORRECTE!!");
            entrada.nextLine();
                            
        } while (c < 0 || c > 10);       
        tret[1] = c;
        System.out.println("");
        
        return tret;
    }
    
    /**
     * Mòdul que processa el tret y camvia el tauler y el seu contingut
     * @param tauler tauler creat
     * @param f nombre de fila
     * @param c nombre de columna
     */
    public static void processa_tret(char[][] tauler, int f, int c) {
        
        switch (tauler[f][c]) {
            case '-':
                tauler[f][c] = 'A';
                System.out.println("AIGUA!!");
                System.out.println("");
                break;
            case 'P', 'Z', 'B', 'L':
                tauler[f][c] = 'X';
                System.out.println("TOCAT!!");
                System.out.println("");
                break;
            case 'X', 'A':
                System.out.println("ERROR!! Ja hi havies fet un tret así.");
                System.out.println("");
                break;
        }
    }
    
    /**
     * Mòdul que crea una coordenada aleatoria per a colocar el barcos en el mòdul inserir_barcos
     * @param tauler tauler creat
     * @param mida nombre de caselles que ocupa un barco
     * @return retorna una coordenada aleatroria vàlida per a un barco amb una mida concreta. 
     */
    public static int[] coordenada_aleatoria(char[][] tauler, int mida) {
    
        int coordenada[] = new int[2];
        int fila, columna, max, no_solap;
        
        for (int i = 0; i <= 99; i++) {
            max = 11 - mida;
            no_solap = 0;
            fila = (int )(1+ Math.random()*10);
            columna = (int)(1+ Math.random()*(max));
            for (int j = 0; j < mida; j++) {
                if (tauler[fila][columna + j] == '-') {
                    no_solap++;
                }
            }
        
            if (no_solap == mida) {
                coordenada[0] = fila;
                coordenada[1] = columna;
                break;
            }
        }
       
    
        return coordenada;
    }
    
    /**
     * Mòdul que calcula que queden barcos en el tauler o no.
     * @param tauler tauler creat
     * @return retorna un boolean que indica si queden barcos en el tauler o no per a saber si el jugador ha guanyat. 
     */
    public static boolean queden_barcos(char[][] tauler) {
        
        boolean queden_barcos = false;
        
        for (int i = 1; i < tauler.length; i++) {
            for (int j = 1; j < tauler[i].length; j++) {
                if (tauler[i][j] == 'P' || tauler[i][j] == 'Z' || tauler[i][j] == 'B' || tauler[i][j] == 'L') {
                    queden_barcos = true;   
                }
            }
        }
        return queden_barcos;
    }
    
    /**
     * Mòdul que demana les dades sobre la dificultat y evalua si sòn o no correctes- 
     * @param min mínim valor vàlid
     * @param max màxim valor vàlid
     * @return retorna la elecció en un valor enter. 
     */
    public static int demana_dades_entre_max_y_min (int min, int max){
        
        Scanner entrada = new Scanner(System.in);
        
        int seleccio = 0;
        boolean valid = false;
        
        while (valid == false) {           
            if (entrada.hasNextInt()) {
                seleccio = entrada.nextInt();
                
            }
            if (seleccio >= min && seleccio <= max) {
                valid = true;
                break;
            }
            
            System.out.println("ERROR!!");
            System.out.println("Possa una opciò vàlida. 1, 2 o 3.");
            System.out.println("");
            entrada.nextLine();
        }
            
        return seleccio;
    }
       
}
    
    
