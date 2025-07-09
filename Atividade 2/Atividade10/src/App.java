import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu turno M-matutino ou V-Vespertino ou N- Noturno ");
    
        String  sexo = input.next();


        if (sexo.equals("m")  || sexo.equals("M") ){

            System.out.println("Bom Dia! ");
        }

        else if (sexo.equals("v")  || sexo.equals("V")) {

            System.out.println("Boa Tarde!");

        }

        else if (sexo.equals("n")  || sexo.equals("N")) {

            System.out.println("Boa Noite!");

        }


        else  {

            System.out.println("VALOR INVALIDO ");

        }
        
        input.close();
    
    }
}
