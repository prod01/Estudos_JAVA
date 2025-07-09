import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero:");
    
        int numero_1 = input.nextInt();

        System.out.println("Informe outro numero:");

        int numero_2 = input.nextInt();

        int resultado = numero_1 + numero_2;
        
        System.out.println("O resultado da soma de " + numero_1 + " é " + numero_2 + " é igual a " + resultado);

        input.close();
    }
}
