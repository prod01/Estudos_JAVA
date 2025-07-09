import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantos metros quadrados serão pintado ");
    
        float metros = input.nextFloat();

        float referencia_para_compra = metros / 3;

        double latas_de_tinta    =  referencia_para_compra / 18;

        double preco    =  latas_de_tinta * 80;

        System.out.println("Você deve compra "  + latas_de_tinta + " latas, para pintar " + metros + "metros");

        System.out.println("A um valo de r$"  + preco );

        input.close();
    
    }
}
