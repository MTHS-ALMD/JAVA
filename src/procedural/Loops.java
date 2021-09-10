package procedural;
import java.util.Scanner;

public class Loops {
    static void calculation(){

        int num1;
        int num2;
        String op;
        int result;
        String conti="s";

        Scanner read = new Scanner(System.in);

        while(conti.equals("s")){
            System.out.println("Qual é o números primeiro valor da operação:");
            num1 = read.nextInt();
            System.out.println("Qual operação deseja fazer?");
            op = read.next();
            System.out.println("Qual é o segundo valor da operação:");
            num2 = read.nextInt();

            if(op.equals("+")){
                result=num1+num2;
                System.out.printf("O resultado da soma é %d.", (result));
            }
            else if(op.equals("-")){
                result=num1-num2;
                System.out.printf("O resultado dessa subtração é %d.", result);
            }
            else if(op.equals("x")) {
                result = num1 * num2;
                System.out.printf("O resultado dessa multiplicação é %d.", result);
            }
            else if(op.equals(":")) {
                if (num2==0){
                    System.out.println("Não é possível dividir um valor por 0.");
                }
                result = num1 / num2;
                System.out.printf("O resultado dessa divisão é %d.", (result));
            }
            System.out.println("\nDeseja continuar calculando? s/n");
            conti= read.next();
        }
    }
    public static void main(String[] args) {
        calculation();
    }
}
