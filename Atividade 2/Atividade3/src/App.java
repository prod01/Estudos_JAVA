import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe'f' para p sexo feminino  e 'm' para masculino ");
    
        String  sexo = input.next();


        if (sexo.equals("m")  || sexo.equals("M") ){

            System.out.println("Masculino ");
        }

        else if (sexo.equals("f")  || sexo.equals("F")) {

            System.out.println("Feminino");

        }

        else  {

            System.out.println("VALOR INVALIDO ");

        }
        
        input.close();
    
    }
}
