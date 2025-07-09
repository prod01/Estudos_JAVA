import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do lado do quadrado:");
    
        double lado = input.nextDouble();

        double area = 2 * lado;

        double dobro_area = 2 * area;

        System.out.println("A area do qudrado é " + area + " e o dorbro da area e " + dobro_area);

        input.close();
    
    }
}
