import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("informe uma letra para saber se uma vogal ou consoante");
    
        String  sexo = input.next();


        if (sexo.equals("a")  || sexo.equals("e") || sexo.equals("i")|| sexo.equals("o")|| sexo.equals("u")){

            System.out.println("e vogal ");
        }

        else if (sexo.equals("A")  || sexo.equals("E") || sexo.equals("I")|| sexo.equals("O")|| sexo.equals("U")) {

            System.out.println("e vogal");

        }

        else  {

            System.out.println("e consoante ");

        }
        
        input.close();
    
    }
}
