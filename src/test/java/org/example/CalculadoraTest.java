package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    //Colocar nomes descritivos nos testes. BOA PRÁTICA.
    @Test
    public void validaSedoisMaisDoisEQuatro () {
        // Definir as variáveis com os dados necessários:
        double num1 = 2;
        double num2 = 2;
        double resultadoEsperado = 4;

        // Executando o teste chamando o método a ser testado:
        double resultadoObtido = calculadora.add(num1, num2);

        // Usamos o assertEquals do junit para conferir se os resultados são iguais:
        assertEquals(resultadoEsperado, resultadoObtido, 0.001);
    }

    @Test
    public void validaSeDoisMenosDoisEZero () {
        double num1 = 2;
        double num2 = 2;
        double resultadoEsperado = 0;
        double resultadopObtido = calculadora.subtract(num1, num2);
        assertEquals(resultadoEsperado, resultadopObtido, 0.001);
    }

    @Test
    public void validaSeDoisVezesDoisEQuatro () {
        double num1 = 2;
        double num2 = 2;
        double resultadoEsperado = 4;
        double delta = 0.001;
        double resultadoObtido = calculadora.multiply(num1, num2);
        assertEquals(resultadoEsperado, resultadoObtido, delta);
    }

    @Test
    public void validaSeQualquerNumeroVezesZeroEZero() {
        double num1 = 0;
        double num2 = 3412356;
        double valorEsperado = 0;
        double delta = 0.001;
        double valorObtido = calculadora.multiply(num1, num2);
        assertEquals(valorEsperado, valorObtido, delta);
    }
    @Test
    public void validarDivisaoPorZero() {
        double num1 = 1;
        double num2 = 0;
        double resultadoEsperado = 0;
        double delta = 0.001;
        double resultadoObtido = calculadora.divide(num1, num2);
        assertEquals(resultadoEsperado, resultadoObtido, delta);
    }
}