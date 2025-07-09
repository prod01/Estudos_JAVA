import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe tres notas para saber se você passou");
    
        int nota_1 = input.nextInt();

        int nota_2 = input.nextInt();

        int nota_3 = input.nextInt();


        double media = (nota_1+ nota_2 + nota_3) / 2;


        if (media <= 7){

            System.out.println("Aprovado ");
        }

        else if  (media == 10){

            System.out.println("Aprovado com Distin ");
        }

        else {

            System.out.println("Reprovado" );

        }

       



        
        input.close();
    
    }
}
