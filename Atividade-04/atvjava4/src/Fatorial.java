
public class Fatorial {

    // Método que calcula o fatorial de um número inteiro não negativo
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser inteiro não negativo.");
        }

        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FatorialTest {

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, Fatorial.calcularFatorial(0));
    }

    @Test
    public void testFatorialDeUm() {
        assertEquals(1, Fatorial.calcularFatorial(1));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, Fatorial.calcularFatorial(5));
    }

    @Test
    public void testFatorialDeDez() {
        assertEquals(3628800, Fatorial.calcularFatorial(10));
    }

    @Test
    public void testFatorialComNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fatorial.calcularFatorial(-3);
        });

        assertEquals("Número deve ser inteiro não negativo.", exception.getMessage());
    }
}