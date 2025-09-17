package calculador.primos;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {


    @Test
    void test(){
        CalculadorPrimos computador = new CalculadorPrimos(new JoakouConcreteStrategy());

        List<Integer> resultado = computador.generarPrimos(8);

        assertEquals(List.of(2,3,5,7,11,13,17,19), resultado);
    }

    // Método que proporciona los datos de prueba para el test parametrizado.
    // Cada 'Arguments' contiene la instancia de la estrategia, la cantidad de primos
    // y la lista esperada.
    static Stream<Arguments> providePrimeTestCases() {
        return Stream.of(
            Arguments.of(new JoakouConcreteStrategy(), 8, List.of(2, 3, 5, 7, 11, 13, 17, 19)),
            Arguments.of(new JoakouConcreteStrategy(), 1, List.of(2)),
            Arguments.of(new CribaErastotenesConcreteStrategy(), 8, List.of(2, 3, 5, 7, 11, 13, 17, 19)),
            Arguments.of(new CribaErastotenesConcreteStrategy(), 1, List.of(2)),
            Arguments.of(new GeminiConcreteStrategy(), 8, List.of(2, 3, 5, 7, 11, 13, 17, 19)),
            Arguments.of(new GeminiConcreteStrategy(), 1, List.of(2))
        );
    }
    
    // Este es el test parametrizado
    @ParameterizedTest(name = "Test con {0} para {1} primos")
    @MethodSource("providePrimeTestCases")
    void testGenerarPrimosConVariasEstrategias(CalculadorPrimosStrategy estrategia, int cantidad, List<Integer> esperado) {
        // Arrange: Se instancia el objeto principal con la estrategia proporcionada por el test
        CalculadorPrimos calculador = new CalculadorPrimos(estrategia);

        // Act: Se ejecuta el método a probar
        List<Integer> resultado = calculador.generarPrimos(cantidad);

        // Assert: Se verifica que el resultado sea el esperado
        assertEquals(esperado, resultado, "lista incorrecta!!!");
    }
}