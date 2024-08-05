package Class;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Ejercicios_1Ago {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        String Espacio="";
        int Menu=0;
        
        
        do{
            System.out.println("");
            System.out.println("|         ***Menu**            |");
            System.out.println("| 1) Palabra en Diagonal       |");
            System.out.println("| 2) Piramide de Numero        |");
            System.out.println("| 3) Palindromo o No Palindromo|");
            System.out.println("| 4) Salir                     |");
            System.out.println("");
            System.out.println("Ingrese Un numero acorde al Menu:");
            Menu=lea.nextInt();
            
        if(Menu==1){
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese una Palabra");
        String Palabra=lea.next().toUpperCase();
        

        
         
        for (int index = 0; index < Palabra.length(); index++) {
            for (int index2 = 0; index2 < index; index2++) {
                System.out.print(" ");
            }
            System.out.println(Palabra.charAt(index));
        }

        for (int index = Palabra.length() - 1; index >= 0; index--) {
            for (int index2 = 0; index2 < index; index2++) {
                System.out.print(" ");
            }
            System.out.println(Palabra.charAt(index));
        }
      }
        
        if(Menu==2){
        System.out.println("");
        System.out.println("Ejercicio 2");
        System.out.println("Ingrese la Cantidad de Filas por hacer");
        int Filas=lea.nextInt();
                for (int index = 1; index <= Filas; index++) {
            
            for (int espacio = 1; espacio < index; espacio++) {
                System.out.print(" ");
            }

            for (int espacio = index; espacio <= Filas; espacio++) {
                System.out.print(espacio);
            }

            for (int espacio = Filas - 1; espacio >= index; espacio--) {
                System.out.print(espacio);
            }
            
            System.out.println(" "); 
    }

        }
        
        
        if(Menu==3){
            String Palindromos="",NoPalindromos="";
            int contador=0, cantidad=0;
            System.out.println("");
            System.out.println("Ejercicio 3:");
            System.out.println("Ingrese la Cantidad de Palabras que desea Evaluar:");
            cantidad= lea.nextInt();
            
            while(contador<cantidad){
            String palabra="";
              contador++;    
            System.out.println("Ingrese la palabra: #"+contador);
            palabra=lea.next().toLowerCase();
            boolean esPalindromo=true;
            int derecho=0;
            int revez=palabra.length()-1;
           
             while(derecho<revez){
                if(palabra.charAt(derecho)!= palabra.charAt(revez)){
                    esPalindromo=false;
                    break;
                }
                derecho++;
                revez--;
             }
           
           
            if(esPalindromo==true){
               Palindromos+=palabra; 
               Palindromos+="\n";
            }
            if(esPalindromo==false){
                NoPalindromos+=palabra;
                NoPalindromos+="\n";
            }
            }
            System.out.println("");
            System.out.println("Palindromos:");
            System.out.println(Palindromos);
            System.out.println("No Palindromos:");
            System.out.println(NoPalindromos);
            
            
            
        }
        
            
            
            
        
        if(Menu==4){
            System.out.println("Gracias por Revisar la 'HW #2: Tarea' de Steve Valladares!");
        }        

        }while(Menu!=4);
   }
}