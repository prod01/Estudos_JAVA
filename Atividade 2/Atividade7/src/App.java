import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        
         Scanner input = new Scanner(System.in);

        System.out.println("Informe tres  numeros para saber qual e o maior");
    
        int num_1 = input.nextInt();

        int num_2 = input.nextInt();

        int num_3 = input.nextInt();




        if (num_1 > num_2 && num_1 > num_3){

            System.out.println("Esse e o maior numero " + num_1);
        }


        else if (num_2 > num_1 && num_2 > num_3){

            System.out.println("Esse e o maior numero " + num_2);
        }

        else {

            System.out.println("Esse e o maior numero " + num_3);

        }



        if (num_1 < num_2 && num_1 < num_3){

            System.out.println("Esse e o menor numero " + num_1);
        }


        else if (num_2 < num_1 && num_2 < num_3){

            System.out.println("Esse e o menor numero " + num_2);
        }

        else {

            System.out.println("Esse e o menor numero " + num_3);

        }

    
        
        input.close();

    
    }


}
