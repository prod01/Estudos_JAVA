import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = input.nextInt();

        int maior, meio, menor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
            if (numero2 >= numero3) {
                meio = numero2;
                menor = numero3;
            } else {
                meio = numero3;

                menor = numero2;
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
            if (numero1 >= numero3) {
                meio = numero1;
                menor = numero3;
            } else {
                meio = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 >= numero2) {
                meio = numero1;
                menor = numero2;
            } else {
                meio = numero2;
                menor = numero1;
            }
        }

     
        System.out.println("Os números em ordem decrescente são: " + maior + ", " + meio + ", " + menor);

    }
}
