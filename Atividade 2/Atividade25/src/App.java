import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Responda as perguntas sorbe o crime com 1 para sim e 0 para não");


        System.out.println("Telefonou para a vítima?");

        int resposta_1 = input.nextInt();

        System.out.println("Esteve no local do crime?");

        int resposta_2 = input.nextInt();

        System.out.println("Mora perto da vítima?");

        int resposta_3 = input.nextInt();

        System.out.println("Devia para a vítima?");

        int resposta_4 = input.nextInt();

        System.out.println("Já trabalhou com a vítima?");

        int resposta_5 = input.nextInt();



        int total = resposta_1 + resposta_2 + resposta_3 + resposta_4 + resposta_5;

        if ((resposta_1 != 1 && resposta_1 != 0) && (resposta_2 != 1 && resposta_2 != 0) && (resposta_3 != 1  && resposta_3 != 0) && (resposta_4 != 1  && resposta_4 != 0 ) && (resposta_5 != 1 && resposta_5 != 0)){

            System.out.println("Resposta invalida");

        }
        
        else if (total == 1){

            System.out.println("Não existe vinculo");

        }

        else if  (total == 2){

            System.out.println("Suspeita");
           
        }

        else if  (total == 3){

        
            System.out.println("Cumplice");


        }

        else if  (total == 4){

            System.out.println("Cumplice");

        }

        else if  (total == 5){

        System.out.println("Assassino");
            
        }


        input.close();
    
    }

}