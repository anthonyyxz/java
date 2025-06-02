import java.util.Scanner;
public class Rep7 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a base: ");
    double base = scanner.nextDouble();
    System.out.print("Digite o expoente: ");
    double exp = scanner.nextDouble();
    
    double result = 1;
    if(exp > 0){
    for(int i = 0; i < exp; i++){
    result *= base;
    } 
    }else if(exp < 0){
    for(int i = 0; i > -exp; i++){
    result *= base;
    } 
    result = 1 / result;
    } else {
    result = 1;
    }
    System.out.print("Resultado: "+result);
    }
}