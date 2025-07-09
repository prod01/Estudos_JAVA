import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero:");
    
        int numero = input.nextInt();
        
        System.out.println("O número informado foi "+ numero);

        input.close();
    
    }
}
