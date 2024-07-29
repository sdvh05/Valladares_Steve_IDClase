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
public class Valladares_Steve_OperadorTernario {
    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        
        /*
        El operador ternario es una forma concisa de escribir una declaración if-else en una sola línea. Se compone de tres partes:

            La condición a evaluar (condición booleana)
            El valor si la condición es verdadera (valor verdadero)
            El valor si la condición es falsa (valor falso)
        
        
        La sintaxis básica del operador ternario en Java es la siguiente:

           (Tipo de Dato) condición ? expresión_si_verdadero : expresión_si_falso;
        
        Ejemplos:
        */
        
        //Operador Ternario como Valor Constante
        System.out.println("VALOR CONSTANTE");
        int Edad =18;
        String RangoEdad = (Edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(RangoEdad);
        
        
        //Operador Ternario como Variable
        System.out.println("");
        System.out.println("VARIABLE");
        double Promedio;
        System.out.println("Ingresa el Promedio que sacaste en X clase");
        Promedio=lea.nextDouble();
        String Aprobado_Reprobado = (Promedio >= 59.6) ? "Aprobaste la Clase" : "Reprobaste la Clase";
        System.out.println(Aprobado_Reprobado);
        
        
        
        //Operador Ternario como Formula
        System.out.println("");
        System.out.println("FORMULA");
        int NumeroA,NumeroB;
        System.out.println("Ingresa un Numero A y luego Un numero B");
        System.out.println("Al Numero Mayor se le restara el Numero Menor...");
        NumeroA =lea.nextInt();
        NumeroB =lea.nextInt();
        int Resultado = (NumeroA>=NumeroB) ? (NumeroA-NumeroB) : (NumeroB-NumeroA);
        System.out.println(Resultado);
    }
 
}
