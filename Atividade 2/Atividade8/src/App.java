import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe tres produtos para saber qual sera o de menor valor");
    
        int produto1 = input.nextInt();

        int produto2 = input.nextInt();

        int produto3 = input.nextInt();


        if (produto1 < produto2 && produto1 < produto3){

            System.out.println("o produro 1 e o de  menor valor " + produto1);
        }


        if (produto2 < produto1 && produto2 < produto3){

            System.out.println("o produro 2 e o de  menor valor " + produto2);
        }

        else {

            System.out.println("o produro 3 e o de  menor valor " + produto3);

        }

        input.close();
    
    }
}
