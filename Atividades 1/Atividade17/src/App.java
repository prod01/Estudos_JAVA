import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantos metros quadrados serão pintado ");
    
        double area_pintada = input.nextDouble();

        int latas = calcularLatas(area_pintada);

        int valorLata = 80;

        double precoLatas = calculaPreco(latas,valorLata);

        int galoes = calcularGaloes(area_pintada);

        int valorGalao = 25;

       double precogalao = calculaPreco(galoes,valorGalao);


        int latasMistura = calcularLatasMistura(area_pintada);
    
        double valorlatasMistura = calculaPreco(latasMistura,valorLata);

        int galoesMistura = calcularGaloesMistura(area_pintada);

        double valorgaloesMistura = calculaPreco(galoesMistura,valorGalao);

        double precoMistura = valorlatasMistura + valorgaloesMistura;


        System.out.println("Opção 1: Comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Preço total: R$" + precoLatas);
        
        System.out.println("Opção 2: Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões: " + galoes);
        System.out.println("Preço total: R$" + precogalao);
        
        System.out.println("Opção 3: Misturar latas e galões");
        System.out.println("Quantidade de latas: " + latasMistura);
        System.out.println("Quantidade de galões: " + galoesMistura);
        System.out.println("Preço total: R$" + precoMistura);

        input.close();
    }


    
    

    public static double calculaPreco(int Quantidade, double valor) {

        double valortotal =  Quantidade + valor;
        
        return valortotal;
    }

    public static int calcularLatas(double area_pintada){

        double litrosTinta = area_pintada / 6 ;
        return (int)  Math.ceil(litrosTinta/18);


    }

     public static int calcularGaloes(double area_pintada){

        double litrosTinta = area_pintada / 6 ;
        return (int)  Math.ceil(litrosTinta/3.6);


    }

    public static int calcularLatasMistura(double area_pintada){

        double litrosTinta = area_pintada / 6 ;
        int latas = (int) litrosTinta/18;
        double litrosRestantes = litrosTinta - latas/18;
        return latas + (int)  Math.ceil(litrosRestantes/3.6);


    }

    public static int calcularGaloesMistura(double area_pintada){

        double litrosTinta = area_pintada / 6 ;
        int latas = (int) litrosTinta/18;
        double litrosRestantes = litrosTinta - latas/18;
        return (int)  Math.ceil(litrosRestantes/3.6);


    }

     


    


}
