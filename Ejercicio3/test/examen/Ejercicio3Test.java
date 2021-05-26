package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

    @CsvSource({
        "SOKAINA, LambdaTest", 
        "CRISTIAN DAVID, Circle CI",
        "MARTA, Appium", 
        "MARIA, LambdaTest",
        "ANGEL, Circle CI",
        "DAVID, Azure Pipelines",
        "GUILLERMO, Azure Pipelines",
        "JORGE, Appium",
        "HUNOR, Gitlab CI",
        "JUAN DIEGO, GitHub Actions",
        "RUBEN, GitHub Actions",
        "JESUS, Gitlab CI",
        "ALEJANDRO, Travis CI",
        "DEYAN, LambdaTest",
        "JOAQUIN, Error. Autor no encontrado"
    })

    @ParameterizedTest(name = "{index} => Con entrada ({0}) sale {1}")
    void testTitulo(String input, String expected) {
        Ejercicio3 c = new Ejercicio3();
        assertEquals(expected, c.tituloTrabajo(input));
    }

}
