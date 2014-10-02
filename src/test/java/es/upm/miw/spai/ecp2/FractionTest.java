package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(5, 4);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(5, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(1.25, fraction.decimal(), 10e-2);
    }

    @Test
    public void testMultiplicar() {
        Fraction fr = fraction.multiply(fraction);
        assertEquals(10, fr.getNumerator());
        assertEquals(8, fr.getDenominator());
    }

    @Test
    public void testIsPropia() {
        assertEquals(false, fraction.isPropia());
    }

    @Test
    public void testEquivalent() {
        Fraction equivalente = new Fraction(15, 12);
        assertEquals(true, this.fraction.equivalent(equivalente));
    }

}
