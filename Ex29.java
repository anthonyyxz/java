/******************************************************************************
Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.
*******************************************************************************/
import java.util.Scanner;
public class Ex29
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int alunos;
		int i = 0;
		double soma = 0, media = 0, peso = 0;
    System.out.println("Quantos alunos você tem em sua academia? ");
        alunos = ler.nextInt();
    while(i < alunos){
        i ++;
        System.out.println("Quanto o aluno " + i + " pesa");
          peso = ler.nextInt();
          soma += peso;
       }
       if (alunos > 0){
         media = soma / alunos;
    System.out.println("A media de peso dos seus " + alunos + " alunos, é de " + media + " Kgs");}
	}
}
