package penaatletica;

import java.util.Scanner;

public class PenaAtletica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeropruebas = sc.nextInt();
        int cantidadnum;
        int numeronumeros;
        int cont;
        
        for (int i = 0; i < numeropruebas; i++){
            cont = 0;
            cantidadnum = sc.nextInt();
            for(int a = 0; a<cantidadnum; a++){
                numeronumeros = sc.nextInt();
                if(numeronumeros%2 == 0){
                    cont ++;
                    
                    
                }
               
            }
             System.out.println(cont);  
        }
         
    }  
    
}
