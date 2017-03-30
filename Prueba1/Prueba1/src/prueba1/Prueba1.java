package prueba1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba1
{     
    public static void main(String[] args)
    { 
        int base = 0;
        int alturaDeseada = 0;
        
        System.out.println("Introduzca la altura deseada");
        Scanner sc = new Scanner(System.in);
        
        try
        {
            alturaDeseada = sc.nextInt();
        }  catch(InputMismatchException e)
            {
                e.printStackTrace();
            }
         
        for(int i = 0; i <= alturaDeseada - 1; i++)
        {
            for(base = 0; base < alturaDeseada - i; base++) 
            { 
               System.out.print(" ");  
            }  
                
            System.out.print("#");
            for( ; base < alturaDeseada ; base++) 
                {
                    System.out.print("##");  
                } 
                    System.out.print('\n');  
        } 
    } 
}

