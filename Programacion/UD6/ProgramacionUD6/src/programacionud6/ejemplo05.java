/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

/**
 *
 * @author pablo
 */
public class ejemplo05 {
    
    public static void main(String[] args) {
        
        int i, j;
        
        float[] vectorNotes = {2f, 5f, 9f, 6.5f, 10f, 4.5f, 8.5f, 7f, 6f, 7.5f, 9f, 7f};
        
        int barres[] = new int[4];
        
        for(i=0; i< vectorNotes.length; i++) {
            if((vectorNotes[i] >= 0) && (vectorNotes[i] < 5)) {
                barres[0]++;
            }else if (vectorNotes[i] < 6.5f){
                barres[1]++;
               }else if (vectorNotes[i] < 9){
                   barres[2]++;
                  }else if (vectorNotes[i] <=10){
                      barres[3]++;
                  }
        }
        
        for (i = 0; i < barres.length; i++) {
            switch(i) {
                case 0:
                    System.out.println("Suspés :");
                    break;
                case 1:
                    System.out.println("Aprobar :");
                    break;
                case 2: 
                    System.out.println("Notable :");
                    break;
                case 3:
                    System.out.println("Excelent :");
                    break;
            }
            
            for (j = 0; j < barres[i]; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
