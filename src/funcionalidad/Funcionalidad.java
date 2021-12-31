
package funcionalidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Funcionalidad {
    public static void main(String[] args) {   
        int option;
        option = 0;
        Scanner leer = new Scanner(System.in);
        
        do {
           System.out.println("Digita una opcion \n0. Salir \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n"
                + "5. Seno \n6. Coseno \n7. Tangente \n8. Cotangente \n9. Secante \n10. Cosecante");
            option = leer.nextInt();
            
            switch (option){
                case 0:
                    break;
                case 1:
                    System.out.println("Suma");
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    break;
                case 4:
                    System.out.println("Division");
                    break;
                case 5:
                    //Math.sin();
                    System.out.println("Seno");
                    break;
                case 6:
                    //Math.cos();
                    System.out.println("Coseno");
                    break;
                case 7:
                    //Math.tan()
                    System.out.println("Tangente");
                    break;
                case 8:
                    //1 / Math.tan()
                    System.out.println("Cotangente");
                    break;
                case 9:
                    // 1 / Math.cos();
                    System.out.println("Secante");
                    break;
                case 10:
                    // 1 / Math.sin();
                    System.out.println("Cosecante");
                    break;
            }          
            
        } while (option != 0);
        
    }
}
