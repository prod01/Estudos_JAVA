import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor em metro para saber quantos centimetros contem");
    
        Float metros = input.nextFloat();

        Float centimetros = metros * 100;
        
        System.out.println("O número informado foi "+ centimetros);

        input.close();
    
    }
}
