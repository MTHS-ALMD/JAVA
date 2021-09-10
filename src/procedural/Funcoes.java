package procedural;
import java.util.Scanner;

public class Funçoes {
    static void sum(){
        int num1;
        int num2;
        int resul;

        Scanner read=new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        num1= read.nextInt();
        System.out.println("Digite o segundo valor:");
        num2= read.nextInt();
        resul = num1+num2;
        System.out.printf("%d+%d é igual à %d.",num1,num2,resul);
    }
    public static void main(String[] args) {
        sum();
    }
}
