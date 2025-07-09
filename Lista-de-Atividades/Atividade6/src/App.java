import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o raio de um círculo:");
    
        double raio = input.nextDouble();

        double pi = 3.14;

        double area = 2 *(raio *pi);

        
        System.out.println("O número informado foi "+ area);

        input.close();
    
    }
}
