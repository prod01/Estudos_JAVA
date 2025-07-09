import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = input.nextInt();

        if (valorSaque > 10 || valorSaque < 600) {
            int notas100 = valorSaque / 100;
            valorSaque %= 100;

            int notas50 = valorSaque / 50;
            valorSaque %= 50;

            int notas10 = valorSaque / 10;
            valorSaque %= 10;

            int notas5 = valorSaque / 5;
            valorSaque %= 5;

            int notas1 = valorSaque;

            System.out.println("Quantidade de notas:");
            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 1: " + notas1);
        } else {

            System.out.println("Valor de saque inválido");
           
        }

        input.close();
    }
}
