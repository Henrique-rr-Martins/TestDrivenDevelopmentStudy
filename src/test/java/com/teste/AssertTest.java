package com.teste;

import org.junit.jupiter.api.Test;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;

//MÉTODOS ESTÁTICOS IMPORTADOS
public class AssertTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes(StandardCharsets.UTF_8);
        byte[] atual = "teste".getBytes(StandardCharsets.UTF_8);
        assertArrayEquals(esperado, atual);
    }
    @Test
    public void testAssertEquals(){ assertEquals("text", "text"); }
    @Test
    public void testAssertFalse(){ assertFalse(false); }
    @Test
    public void testAssertNotNull(){ assertNotNull(Calculator.getInstance()); }
    @Test
    public void testAssertNotSame(){ assertNotSame(Calculator.getInstance(), Calculator.getInstance()); }
    @Test
    public void testAssertNull(){ assertNull(null); }
    @Test
    public void testAssertSame(){
        Integer aNumber = 768;
        assertSame(aNumber, aNumber);
    }
}
