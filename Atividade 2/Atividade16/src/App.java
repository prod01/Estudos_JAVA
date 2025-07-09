import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            return;
        }

        System.out.println("Digite o valor de b: ");
        double b = input.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
    }
}
