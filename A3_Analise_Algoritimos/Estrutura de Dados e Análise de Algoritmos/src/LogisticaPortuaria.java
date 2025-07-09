import java.util.*;

public class LogisticaPortuaria {

   
    private static final int CAPACIDADE_ARMAZEM = 100;
    private static final int CAPACIDADE_CAMINHAO = 150;

    public static void main(String[] args) {
      
        Integer[] containers = {40, 50, 60, 20, 30, 80, 70};
        List<Integer> volumesContainers = Arrays.asList(containers);

      
        List<Integer> armazens = alocarContainersEmArmazens(volumesContainers);
        List<Integer> caminhoes = alocarCargasEmCaminhoes(armazens);

       
        System.out.println("--- Resultados ---");
        System.out.println("Armazéns necessários: " + armazens.size());
        System.out.println("Cargas dos Armazéns: " + armazens);
        System.out.println("Caminhões necessários: " + caminhoes.size());
        System.out.println("Cargas dos Caminhões: " + caminhoes);
    }

 
    public static List<Integer> alocarContainersEmArmazens(List<Integer> volumesContainers) {
       
        List<Integer> containersOrdenados = new ArrayList<>(volumesContainers); 
        containersOrdenados.sort(Collections.reverseOrder());

       
        List<Integer> armazens = new ArrayList<>();

       
        for (int volume : containersOrdenados) {
            boolean alocado = false;
            for (int i = 0; i < armazens.size(); i++) {
                if (armazens.get(i) + volume <= CAPACIDADE_ARMAZEM) {
                    armazens.set(i, armazens.get(i) + volume);
                    alocado = true;
                    break;
                }
            }
            if (!alocado) {
                armazens.add(volume);
            }
        }
        return armazens;
    }

    
    public static List<Integer> alocarCargasEmCaminhoes(List<Integer> cargasArmazens) {
        List<Integer> caminhoes = new ArrayList<>();
        for (int carga : cargasArmazens) {
            boolean alocado = false;
            for (int i = 0; i < caminhoes.size(); i++) {
                if (caminhoes.get(i) + carga <= CAPACIDADE_CAMINHAO) {
                    caminhoes.set(i, caminhoes.get(i) + carga);
                    alocado = true;
                    break;
                }
            }
            if (!alocado) {
                caminhoes.add(carga);
            }
        }
        return caminhoes;
    }
}
