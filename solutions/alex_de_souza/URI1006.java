import java.io.IOException;
import java.util.Scanner; 

public class Main {
 

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double A, B, C, MEDIA;
        
        // FINAL DA NOTA 10
        // PROVA A QUE VALE 2
        // PROVA B QUE VALE 3
        // PROVA C QUE VALE 5
        
        // VALOR ANTERIOR A + B + C = 10
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();  
        
        MEDIA = ((A*2) + (B*3) + (C*5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n" , MEDIA);
             
        
   
        
 
    }
 
}
