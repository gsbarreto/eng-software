/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author mattr
 */
public class MemoriaTest {
    
    public MemoriaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Ignore  // DB desconectado
    @Test
    public void test0() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury", "Kingston", "DD3", "2400", "8"));
        }
        catch(Controllers.AlertaException e)
        {
            fail();
        }
    }
    
    @Test
    public void test1() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("", "Kingston", "DD3", "2400", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo modelo não pode estar vázio.");
        }
    }
    
    @Test
    public void test2() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury", "", "DD3", "2400", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo marca não pode estar vázio.");
        }
    }
    
    @Test
    public void test3() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury", "Kingston", "", "2400", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo tipo não pode estar vázio.");
        }
    }
    
    @Test
    public void test4() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury", "Kingston", "DD3", "", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo frequencia não pode estar vázio.");
        }
    }
    
    @Test
    public void test5() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury", "Kingston", "DD3", "2400", ""));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo tamanho não pode estar vázio.");
        }
    }
    
    @Test
    public void test6() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Furyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    , "Kingston", "DD3", "2400", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo modelo não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test7() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury" , "Kingstonaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    , "DD3", "2400", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo marca não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test8() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury" , "Kingston" , "DD3aaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    , "2400", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo tipo não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test9() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury" , "Kingston" , "DD3","A", "8"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo frequencia não pode conter letras.");
        }
    }
    
    @Test
    public void test10() throws Controllers.AlertaException{
        Controllers.MemoriaController mem = new Controllers.MemoriaController();
        try{
            assertTrue(mem.inserir("HyperX Fury" , "Kingston" , "DD3","2400", "A"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo tamanho não pode conter letras.");
        }
    }
    
}
