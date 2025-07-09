
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero para saber o correspondente da semana ");
    
        float dia = input.nextFloat();

        if (dia == 1){

                System.out.println("Domingo" );

        }


        else if (dia == 1){

              
                System.out.println("Segunda" );
        }

        else if (dia == 1){



                System.out.println("terça" );
        }
        else if (dia == 1){

              
                System.out.println("Quarta" );
        }

        else if (dia == 1){



                System.out.println("Quinta" );
        }
        else if (dia == 1){

              
                System.out.println("Sabado");
        }

        else {


                System.out.println("Valor invalido" );

        }

        input.close();
    
    }
}
