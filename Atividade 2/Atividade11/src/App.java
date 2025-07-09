
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu salario para saber em quanto sera seu reajuste");
    
        float salario = input.nextFloat();

      


        if (salario < 280){

                System.out.println("o salario antes do reajuste " + salario);

                System.out.println("o percentual de aumento aplicado e de 15% " );

                Double valor_reajuste = salario * 0.15;

                System.out.println("o valor do seu aumento e de " + valor_reajuste );
                
                Double novo_salario_bruto = salario + valor_reajuste;

                System.out.println("oo novo salario apos o aumento. " + novo_salario_bruto );


        }


        else if (salario > 280 && salario < 700){

                System.out.println("o salario antes do reajuste " + salario);

                System.out.println("o percentual de aumento aplicado e de 10% " );

                Double valor_reajuste = salario * 0.10;

                System.out.println("o valor do seu aumento e de " + valor_reajuste );
                
                Double novo_salario_bruto = salario + valor_reajuste;

                System.out.println("oo novo salario apos o aumento. " + novo_salario_bruto );
        }

         else if (salario > 700 && salario < 1500){

                System.out.println("o salario antes do reajuste " + salario);

                System.out.println("o percentual de aumento aplicado e de 5% " );

                Double valor_reajuste = salario * 0.05;

                System.out.println("o valor do seu aumento e de " + valor_reajuste );
                
                Double novo_salario_bruto = salario + valor_reajuste;

                System.out.println("oo novo salario apos o aumento. " + novo_salario_bruto );
        }

        else {

                System.out.println("o salario antes do reajuste " + salario);

                System.out.println("o percentual de aumento aplicado e de 20% " );

                Double valor_reajuste = salario * 0.20;

                System.out.println("o valor do seu aumento e de " + valor_reajuste );
        
                Double novo_salario_bruto = salario + valor_reajuste;

                System.out.println("oo novo salario apos o aumento. " + novo_salario_bruto );

        }

        input.close();
    
    }
}
