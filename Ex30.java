/******************************************************************************
Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).
*******************************************************************************/
import java.util.Scanner;
 public class Ex30
 {
 	public static void main(String[] args) {
 	    Scanner ler = new Scanner(System.in);
 	    int n;
 	    int i = 1;
 	    
   System.out.println("Insira a tabuada que deseja ver: ");
 	       n = ler.nextInt();
 	    
   while ( i < 10){
 	        i++;
 	        System.out.println(n + " x " + i + " = " + (n * i));
 	    }
 	}
 }