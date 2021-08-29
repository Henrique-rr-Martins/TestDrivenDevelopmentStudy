package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {
//    PASSAR A EXCEPCTION ATRAVÉS DO PARÂMETRO EXPECTED DA ANOTATION @TEST
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(0);
//        List.of(1).get(0);
    }

//    TESTE VALIDANDO EXCEPTION ESPERADA + MENSAGEM DA EXCEPTION
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
        List<Object> list = new ArrayList<>();

        this.thrown.expect(IndexOutOfBoundsException.class);
        this.thrown.expectMessage("Index 0 out of bounds for length 0");
        list.get(0);
    }

    @Test
    public void testExceptionMessage(){
        try{
            new ArrayList<Object>().get(0);
//            List.of(1).get(0);
            fail("Esperando que IndexOutOfBoundsException seja lançada.");
        }catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
