package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    
    private DecimalCollection collection;
    
    @Before
    public void before() {
        this.collection = new DecimalCollection();
        this.collection.add(1);
        this.collection.add(2);
        this.collection.add(13);
        this.collection.add(4);
        this.collection.add(9);
    }
    
    @Test
    public void testSize() {
        assertEquals(5, this.collection.size());
    }
    
    @Test
    public void testSum() {
        assertEquals(29, this.collection.sum(), 10e-1);
    }

    @Test
    public void testHigher() {
        assertEquals(13, this.collection.higher(), 10e-1);
    }

}
