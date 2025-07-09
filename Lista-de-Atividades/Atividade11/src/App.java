import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int num_1 = input.nextInt();

        System.out.println("Informe outro numero inteiro");
        int num_2 = input.nextInt();

        System.out.println("Informe outro numero real");
        float num_3 = input.nextFloat();
        

        double resultado_a = (num_1 * 2) + (num_2 / 2) ;

        double resultado_b = (num_1 * 3) + num_3;

        double resultado_c = Math.pow(num_3,3);

        System.out.println("o produto do dobro do primeiro com metade do segundo é "+ resultado_a);

        System.out.println("a soma do triplo do primeiro com o terceiro é "+ resultado_b);

        System.out.println("o terceiro elevado ao cubo é "+ resultado_c);


        input.close();
    }
}
