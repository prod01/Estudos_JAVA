import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit:");
    
        double temperatura_F = input.nextDouble();

        double temperatura_C = 5 * ((temperatura_F-32)/9);

    
        System.out.println("A temperatura en Celsius " + temperatura_C);

        input.close();
    
    }
}
