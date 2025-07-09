import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua altura para saber seu peso ideal : ");
    
        float altura = input.nextFloat();

        double valor_fixo1 = 72.7; 
        int valor_fixo2 = 58 ; 

        double peso_ideal = (valor_fixo1 * altura) - valor_fixo2;
        
        System.out.println("O seu peso ideal é "+ peso_ideal);

        input.close();
    
    }
}
