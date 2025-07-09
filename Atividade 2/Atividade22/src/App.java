import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero para saber se e par ou impar.");
    
        int numero = input.nextInt();

        if(numero % 2 == 0){

        System.out.println("Par");
    

        }

        else{

            System.out.println("impar");
        }

        input.close();
    }
}
