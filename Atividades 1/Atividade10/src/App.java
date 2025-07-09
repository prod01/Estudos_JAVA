import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura em celsius:");
    
        double temperatura_C = input.nextDouble();

        double temperatura_F = temperatura_C *1.8 +32;

    
        System.out.println("A temperatura en Fahrenheit " + temperatura_F);

        input.close();
    
    }
}
