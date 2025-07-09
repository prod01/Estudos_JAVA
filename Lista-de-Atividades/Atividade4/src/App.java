import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota do primeiro bimestre:");
        Float nota_1 = input.nextFloat();

        System.out.println("Informe a nota do segundo bimestre:");
        Float nota_2 = input.nextFloat();

        System.out.println("Informe a nota do terceiro bimestre:");
        Float nota_3 = input.nextFloat();

        System.out.println("Informe a nota do quarto bimestre:");
        Float nota_4 = input.nextFloat();

        Float resultado = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
        
        System.out.println("A media das notas do bimestre é "+ resultado);

        input.close();
    }
}
