/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Palindromo {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in).useDelimiter("\n");
        String Palabra="",DeseaContinuar="";
     
        
        
        do{
            System.out.println("Ingrese una palabra, y se evaluara si es Palindroma o No");
            Palabra=lea.next().toLowerCase();
            boolean esPalindromo=true;
            int derecho=0;
            int revez=Palabra.length()-1;
           
             while(derecho<revez){
                if(Palabra.charAt(derecho)!= Palabra.charAt(revez)){
                    esPalindromo=false;
                    break;
                }
                derecho++;
                revez--;
             }
           
           
            String Resultado = (esPalindromo==true) ? " es Palindroma" : " NO es palindroma";
            System.out.println(Palabra+Resultado);
            
            System.out.println("Desea Evaluar otra palabra (Si/No)");
            DeseaContinuar=lea.next().toUpperCase();
        }while(!DeseaContinuar.equals("NO"));
        
   }
}
