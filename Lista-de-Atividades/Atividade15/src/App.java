import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora");
    
        float hora_Homen = input.nextFloat();

        System.out.println("Informe quantas horas você trabalha por mês");

        float horas_mensais = input.nextFloat();

        double salario_bruto = hora_Homen * horas_mensais;

        System.out.println("Seu salario Bruto e : R$" + salario_bruto);

        double inss =  salario_bruto * 0.08;

        System.out.println("Valor pago de INSS R$" + inss );

        double ir= salario_bruto * 0.11 ;

        System.out.println("Valor pago de Imposto de Renda  R$" + ir);

        double sindicato = salario_bruto * 0.05 ; 

        System.out.println("Valor pago de sindicato R$" + sindicato);

        double salario_liquido = salario_bruto -  inss - ir - sindicato ; 
        
        System.out.println("Seu salario Liquido e R$" + salario_liquido);



        input.close();
    
    }
}
