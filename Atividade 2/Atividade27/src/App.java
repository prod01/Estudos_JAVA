import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("informe quantos kilos de morango");

        int morango = input.nextInt();

        System.out.println("informe quantos kilos de maçã");

        int maca = input.nextInt();

        double totalkg = morango+maca;
       


        if (morango <=5  ){

            System.out.println("morango <=5 ");
           
            
            double valorMorango = 2.50;
            double valorMacaMenos5 = 1.80;
            double valorMacaMais5 = 1.50;


                    if (maca<= 5){
                        System.out.println("maca<= 5 ");

                        double valorTotalMorango =  morango * valorMorango ; 
                        double valorTotalmaca = maca * valorMacaMenos5 ; 

                        double valorTotal = valorTotalMorango + valorTotalmaca;


                             if ((totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)) {

                                 System.out.println("(totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                double valorDesconto = valorTotal * 0.10;

                                double valorTotalcomdesconto = valorTotal - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotalcomdesconto);



                            }

                            else {
                                  System.out.println("else (totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotal);


                            }
                        
                        

                    }
                
                    else {

                            System.out.println("maca > 5 ");

                        
                        double valorTotalMorango =  morango * valorMorango ; 
                        double valorTotalmaca = maca * valorMacaMais5 ; 

                        double valorTotal = valorTotalMorango + valorTotalmaca;


                             if ((totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)) {

                                double valorDesconto = valorTotal * 0.10;

                                double valorTotalcomdesconto = valorTotal - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotalcomdesconto);



                            }

                            else {

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotal);


                            }
                        

                    }

        }

        else {

           System.out.println("else morango <=5 ");
            double valorMorango = 2.20;
            double valorMacaMenos5 = 1.80;
            double valorMacaMais5 = 1.50;


                    if (maca<= 5){

                        System.out.println("maca<= 5");

                        double valorTotalMorango =  morango * valorMorango ; 
                        double valorTotalmaca = maca * valorMacaMenos5 ; 

                        double valorTotal = valorTotalMorango + valorTotalmaca;


                             if ((totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)) {

                                System.out.println("(totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                double valorDesconto = valorTotal * 0.10;

                                double valorTotalcomdesconto = valorTotal - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotalcomdesconto);



                            }

                            else {

                                System.out.println("else (totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotal);


                            }
                        
                        

                    }
                
                    else {

                        System.out.println("else maca> 5");

                        
                        double valorTotalMorango =  morango * valorMorango ; 
                        double valorTotalmaca = maca * valorMacaMais5 ; 

                        double valorTotal = valorTotalMorango + valorTotalmaca;


                             if ((totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)) {

                                System.out.println("(totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                double valorDesconto = valorTotal * 0.10;

                                double valorTotalcomdesconto = valorTotal - valorDesconto;

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotalcomdesconto);



                            }

                            else {
                                 System.out.println("else (totalkg > 8) || ( valorTotal >25) || (totalkg > 8 && valorTotal >25)");

                                System.out.println("Foram " + morango + "kg de morangos");
                                System.out.println("Foram " + maca + "kg de maçã");
                                System.out.println("R$:" + valorTotal);


                            }
                        

                    }


        }

       

        input.close();
    
    }

}