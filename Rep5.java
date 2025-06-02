import java.util.Scanner;
public class Rep5 {
    public static void main (String[] args) {
    int numPar = 0;
    int i = 1;
    
    
    while (i <= 100){
    if (i % 2 == 0){
    numPar += i;
    }
    i++;
    }
    System.out.print("A soma dos numeros são: "+numPar);
    
        
    }
}