/******************************************************************************
Jogo-da-velha é um jogo popular, originado na Inglaterra. O nome “velha” surgiu do fato de esse jogo ser praticado,
à época em que foi criado, por senhoras idosas que tinham dificuldades de visão e não conseguiam mais bordar.
 
Esse jogo consiste na disputa de dois adversários que, em um tabuleiro 3×3, devem conseguir alinhar verticalmente, horizontalmente ou na diagonal, 3 peças de formato idêntico.
 
Cada jogador, após escolher o formato da peça (O, X) com a qual irá jogar, coloca uma peça por vez, em qualquer casa do tabuleiro, e passa a vez para o adversário.
 
Vence o primeiro que alinhar 3 peças.

Desenvolver o jogo da velha seguindo as etapas:
a) Inserir o nome dos dois jogadores sendo: 
      X para o jogador 1;
      O para o jogador2 ;

b) Pedir para o jogador 1 começar o jogo, assim ele deverá inserir as posições dentro da matriz. Ex.
     Digite a posição(linha);
     Digite a posição(coluna);

c) Mostrar se já existe uma posição preenchida e retornar a jogada

d) Verificar e exibir o nome do vencedor
*******************************************************************************/
import java.util.Scanner;
public class JogoDaVelha
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String [][] tabuleiro = new String[3][3];
		boolean vencedor;
		int linhaJogador, colunaJogador;
		
		
		for(int i = 0; i < tabuleiro.length; i++){
		    for(int j = 0; j < tabuleiro[i].length; j++){
		        tabuleiro[i][j] = "( )";

		    }
		    System.out.println(" ");
		}
		
		while(true){
            for(int linha = 0; linha < 3; linha++){
                for (int coluna = 0; coluna < 3; coluna++ ){
                    System.out.print((tabuleiro[linha][coluna]));
                }
                System.out.println();
            }
        while(true){
            System.out.println("Qual deseja preencher? Jogador 1");
            linhaJogador = ler.nextInt() - 1;
            colunaJogador = ler.nextInt() - 1;
                if (tabuleiro[linhaJogador][colunaJogador] == "( )") {
                    tabuleiro[linhaJogador][colunaJogador] = "(X)";
                    break;
                }
                System.out.println("Preenchimento incorreto, verificar e tentar novamente");
            }
            
            if(tabuleiro[0][0] == "(X)" && tabuleiro[1][0] == "(X)" && tabuleiro[2][0] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[0][1] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[2][1] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[0][2] == "(X)" && tabuleiro[1][2] == "(X)" && tabuleiro[2][1] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[0][0] == "(X)" && tabuleiro[0][1] == "(X)" && tabuleiro[0][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }else if(tabuleiro[1][0] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[1][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        else if(tabuleiro[2][0] == "(X)" && tabuleiro[2][1] == "(X)" && tabuleiro[2][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        else if(tabuleiro[0][0] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[2][2] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        else if(tabuleiro[0][2] == "(X)" && tabuleiro[1][1] == "(X)" && tabuleiro[2][0] == "(X)"){
            System.out.println("Parabéns, Você Ganhou Jogador 1!");
            break;
        }
        
        for(int linha = 0; linha < 3; linha++){
                for (int coluna = 0; coluna < 3; coluna++ ){
                    System.out.print((tabuleiro[linha][coluna]));
                }
                System.out.println();
            }
            
        while(true){
            System.out.println("Qual deseja preencher? Jogador 2");
            linhaJogador = ler.nextInt() - 1;
            colunaJogador = ler.nextInt() - 1;
                if (tabuleiro[linhaJogador][colunaJogador] == "( )") {
                    tabuleiro[linhaJogador][colunaJogador] = "(O)";
                    break;
                }
                System.out.println("Preenchimento incorreto, verificar e tentar novamente");
            }
            if(tabuleiro[0][0] == "(O)" && tabuleiro[1][0] == "(O)" && tabuleiro[2][0] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }else if(tabuleiro[0][1] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[2][1] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }else if(tabuleiro[0][2] == "(O)" && tabuleiro[1][2] == "(O)" && tabuleiro[2][1] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[0][0] == "(O)" && tabuleiro[0][1] == "(O)" && tabuleiro[0][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }else if(tabuleiro[1][0] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[1][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[2][0] == "(O)" && tabuleiro[2][1] == "(O)" && tabuleiro[2][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[0][0] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[2][2] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
        else if(tabuleiro[0][2] == "(O)" && tabuleiro[1][1] == "(O)" && tabuleiro[2][0] == "(O)"){
            System.out.println("Parabéns, Você Ganhou Jogador 2!");
            break;
        }
    }
}
    }


