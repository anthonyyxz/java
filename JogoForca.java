import java.util.Scanner;

public class JogoForca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Player 1, digite a palavra escolhida: ");
        String palavra = ler.nextLine().toUpperCase();
        StringBuilder palavraOculta = new StringBuilder("_".repeat(palavra.length()));
        
        System.out.println("Player 2, digite seu nome: ");
        String nomePlayer2 = ler.nextLine();
        
        int tentativas = 5;
        boolean ganhou = false;
        
        while (tentativas > 0 && !palavraOculta.toString().equals(palavra)) {
            System.out.println("Palavra: " + palavraOculta);
            System.out.println("Tentativas restantes: " + tentativas); 
            System.out.println("Digite uma letra: ");
            char letra = ler.nextLine().toUpperCase().charAt(0);
            
            if (palavra.indexOf(letra) >= 0) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        palavraOculta.setCharAt(i, letra);
                    }
                }
                System.out.println("Você acertou a letra: " + letra);
            } else {
                tentativas--;
                System.out.println("Letra errada: " + letra);
                mostrarDesenho(tentativas);
            }
        }
        if (palavraOculta.toString().equals(palavra)) {
            ganhou = true;
        }
        
        if (ganhou) {
            System.out.println("Parabéns, " + nomePlayer2 + "! Você ganhou!");
        } else {
            System.out.println("Que pena, " + nomePlayer2 + ". Você perdeu! A palavra era: " + palavra);
            mostrarDesenho(0);
        }
        
        ler.close();
    }
    
    private static void mostrarDesenho(int tentativas) {
        switch (tentativas) {
            case 4:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |   O");
                System.out.println("                |   ");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 3:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |   O");
                System.out.println("                |   |");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 2:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |   O");
                System.out.println("                |  /|");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 1:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |   O");
                System.out.println("                |  /|\\");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                break;
            case 0:
                System.out.println("                _____");
                System.out.println("                |   |");
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|-");
                System.out.println("                |  /'\\");
                System.out.println("                |   ");
                System.out.println("             __|__ ");
                System.out.println("!!!! GAME OVER !!!");
                break;
            default:
                break;
        }
    }
}