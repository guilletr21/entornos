import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;



public class CalculadoraTest {

@Test
public void testSumar() {
Calculadora calc = new Calculadora();
int resultado = calc.sumar(2, 3);
assertEquals(5, resultado);
//assertTrue(resultado == 5);
}

@Test
public void testRestar() {
Calculadora calc = new Calculadora();
assertEquals(1, calc.restar(3, 2));
}

@Test
public void testDividir() {
Calculadora calc = new Calculadora();
assertEquals(2, calc.dividir(4, 2));
}

@Test
public void testDividirPorCero() {
Calculadora calc = new Calculadora();
assertThrows(IllegalArgumentException.class, () -> {
calc.dividir(4, 0);
});

}

}