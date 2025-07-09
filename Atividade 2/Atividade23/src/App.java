import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = input.nextDouble();
        

        if (numero % 1 == 0) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        input.close();
    }

  
}
