/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioCoches
{
    public static ArrayList<Coche> listaCoches = new ArrayList();
    
    /** Método que muestra un menu con cinco opciones y guarda la opcion elegida
     * @return elegirOpcion  */
    public static int menu() throws InputMismatchException
    {
        int elegirOpcion = 0;
        boolean opcionCorrecta = false;
		
            System.out.print (" Crear nuevo coche - pulse 1.\n");
            System.out.print (" Listar coches     - pulse 2.\n");
            System.out.print (" Actualizar coche  - pulse 3.\n");
            System.out.print (" Borrar coche      - pulse 4.\n");
            System.out.print (" Salir             - pulse 0.\n");

        do
        {	
            try
            {
                Scanner introducido = new Scanner(System.in);
                elegirOpcion = introducido.nextInt();
					
                opcionCorrecta = 
                (
                    (elegirOpcion == 1) || 
                    (elegirOpcion == 2) || 
                    (elegirOpcion == 3) || 
                    (elegirOpcion == 4) || 
                    (elegirOpcion == 0)
                );
                
                if(elegirOpcion > 4)
                {
                    System.out.println (" Introduzca un numero entre 0 y 4.");
                }
	
            }	catch (InputMismatchException e)
                {
                    System.out.println (" Introduzca un numero entre 0 y 4.");
                }
				
        }   while (!opcionCorrecta);
    
            return elegirOpcion;
    } 
                    
    public static void main(String[] args)
    {
       int opcionElegida = -1;
     
        while (opcionElegida != 0)
        {
            opcionElegida = menu();
            switch (opcionElegida)
            {
            case 1:             
                Coche coche1 = new Coche();
                
                coche1.setMarca(JOptionPane.showInputDialog("Escriba la marca: "));
                coche1.setModelo(JOptionPane.showInputDialog("Escriba el modelo: "));                
                coche1.setPrecio(pedirInt("Escriba el precio: "));
                coche1.setKms(pedirInt("Escriba los kms: "));
                coche1.setNuevoViejo(JOptionPane.showInputDialog("¿Es nuevo? (SI/NO)"));
              
                listaCoches.add(coche1);
                break;
                
            case 2:
                System.out.println ("Listado de coches: \n");
                
                for (Coche c : listaCoches)
                {
                    System.out.println("Marca:"+ c.getMarca() + " -  " +
                                    "Modelo:"+ c.getModelo() + " -  " +
                                   "Precio:" + c.getPrecio() + " -  " +
                                   "Kms:" + c.getKms() + " -  " +
                                   "Nuevo:" + c.getNuevoViejo()+ "\n" );
                }

                break;
                
            case 3:
                System.out.println ("Lista actual de coches: \n");
                
                for(Coche c : listaCoches)
                {
                    System.out.println(c.getId() + " - "  + c.getMarca());
                }
                Coche c = listaCoches.get(pedirInt("¿Qué ID quieres modificar?"));
                
                c.setMarca(JOptionPane.showInputDialog("Escriba la marca: ", c.getMarca()));
                c.setModelo(JOptionPane.showInputDialog("Escriba el modelo: ", c.getModelo()));                
                c.setPrecio(pedirInt("Escriba el precio: "));
                c.setKms(pedirInt("Escriba los kms: "));
                c.setNuevoViejo(JOptionPane.showInputDialog("¿Es nuevo? (SI/NO)", c.getNuevoViejo()));
                
                break;
                
            case 4:
                System.out.println ("Elija el coche que desea borrar: \n");
                
                for(int i=0;i<listaCoches.size();i++)
                {
                    System.out.println(i + " - " + listaCoches.get(i).getMarca() 
                                        + " " + listaCoches.get(i).getModelo());
                }
                 listaCoches.remove(pedirInt("¿Qué ID quieres eliminar?"));       
                break;
                
            case 0:
                System.out.println (" Cerrando sistema... Hasta pronto.");   
            }
        }
    }
    
    public static int pedirInt(String message)
    {
        try{
            
        return Integer.valueOf(JOptionPane.showInputDialog(message));
        
        }   catch(NumberFormatException e)
            {
                System.out.println("Debes escribir un número entero");
            return pedirInt(message);
            }
    }
}
