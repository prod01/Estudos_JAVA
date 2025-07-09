import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("informe quantos litros de combustivel você vai abastecer");

        int litros = input.nextInt();

        System.out.println("informe o combustivel A - Alcool G - gasolina");

        String combustivel = input.nextLine();

       


        if ( combustivel.equals("g")  || combustivel.equals("G")){
           
            
            double valor_gasolina = 2.90;
            double descontoAte20 = 0.04;
            double descontomais20 = 0.06;


                    if (litros <= 20){

                        double valortotal = litros * valor_gasolina;
                        double desconto = valortotal * descontoAte20;
                        double valorLiquido = valortotal - desconto;
                        
                        System.out.println("o valor a ser pago e de " + valorLiquido);

                    }
                
                    else {

                        double valortotal = litros * valor_gasolina;
                        double desconto = valortotal * descontomais20;
                        double valorLiquido = valortotal - desconto;
                        
                        System.out.println("o valor a ser pago e de " + valorLiquido);

                    }

        }
        
        else if (combustivel.equals("a")  || combustivel.equals("A")){

            double valorAcool = 1.90;
            double descontoAte20 = 0.03;
            double descontomais20 = 0.04;

                    if (litros <= 20){

                        double valortotal = litros * valorAcool;
                        double desconto = valortotal * descontoAte20;
                        double valorLiquido = valortotal - desconto;
                        
                        System.out.println("o valor a ser pago e de " + valorLiquido);

                    }
                
                    else {

                        double valortotal = litros * valorAcool;
                        double desconto = valortotal * descontomais20;
                        double valorLiquido = valortotal - desconto;
                        
                        System.out.println("o valor a ser pago e de " + valorLiquido);

                    }
        }

        else {

           

            System.out.println("combustivel desconhecido");

        }

       

        input.close();
    
    }

}