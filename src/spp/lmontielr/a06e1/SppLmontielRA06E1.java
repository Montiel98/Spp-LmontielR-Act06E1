
package spp.lmontielr.a06e1;
import java.util.Scanner;

public class SppLmontielRA06E1 {

    public static void main(String[] args) {
        int n;
      solicitarnumero();
    }
        
     public static void solicitarnumero(){
        int numero, suma;
        suma = 0;
        do {
            System.out.println("Introduce un numero:");
            Scanner entradaDato = new Scanner(System.in);
            numero = entradaDato.nextInt();
            if (numero < 0){
                System.out.println("La suma total es: " + suma);
             System.exit(0);
            } else {
            suma = suma + numero;
            }
        } while (numero >= 0);
        System.out.println("La suma total es: " + suma);
        }
    
}  
            
        
                    
                
               
           
       
     

