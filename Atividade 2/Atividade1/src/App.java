import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe ddois numeros para saber qual e o maior");
    
        int num_1 = input.nextInt();

        int num_2 = input.nextInt();


        if (num_1 >num_2){

            System.out.println("Esse e o maior numero " + num_1);
        }

        else {

            System.out.println("Esse e o maior numero " + num_2);

        }
        
        input.close();
    
    }
}
