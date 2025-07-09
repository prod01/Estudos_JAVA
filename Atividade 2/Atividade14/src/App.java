import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe suas notas para saber a media ");
    
        int nota_1 = input.nextInt();

        int nota_2 = input.nextInt();

        double media = (nota_1+ nota_2) / 2;


        if (media <= 4 && media > 0 ){


            System.out.println("sua nota E valor  " + media);

            System.out.println("Reprovado ");
        }

        else if  (media <= 6 && media > 4 ){

            System.out.println("sua nota D valor  " + media);

            System.out.println("Reprovado ");
        }

        else if  (media <= 7.5 && media > 6 ){

             System.out.println("sua nota C valor  " + media);

             System.out.println("Aprovado ");
        }


        else if  (media <= 7.5 && media > 9){

             System.out.println("sua nota B valor  " + media);

            System.out.println("Aprovado ");
        }


        else if  (media <= 9 && media > 10){

             System.out.println("sua nota A valor  " + media);

             System.out.println("Aprovado ");
        }

        input.close();
    
    }
}
