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
public class ProcessadorTest {
    
    public ProcessadorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test0() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "3.8", "6", "LGA1150"));
        }
        catch(Controllers.AlertaException e)
        {
            
        }
    }
    
    @Test
    public void test1() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("", "i5 4670K", "4", "4", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo marca não pode estar vázio.");
        }
    }
    
    @Test
    public void test2() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "", "4", "4", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo modelo não pode estar vázio.");
        }
    }
    
    @Test
    public void test3() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "", "4", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo numero de nucleos não pode estar vázio.");
        }
    }
    
    @Test
    public void test4() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo numero de threads não pode estar vázio.");
        }
    }
    
    @Test
    public void test5() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo frequencia não pode estar vázio.");
        }
    }
    
    @Test
    public void test6() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "3.8", "", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo cache não pode estar vázio.");
        }
    }
    
    @Test
    public void test7() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "3.8", "6", ""));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo socket não pode estar vázio.");
        }
    }
    
    @Test
    public void test8() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intelaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
                    , "i5 4670K", "4", "4", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo marca não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test9() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
                    , "4", "4", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo modelo não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test10() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "A", "4", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo numero de nucleos não pode conter letras.");
        }
    }
    
    @Test
    public void test11() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "A", "3.8", "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo numero de threads não pode conter letras.");
        }
    }
    
    @Test
    public void test12() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "3.8"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
                    , "6", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo frequencia não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test13() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "3.8", "A", "LGA1150"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo cache não pode conter letras.");
        }
    }
    
    @Test
    public void test14() throws Controllers.AlertaException{
        Controllers.ProcessadorController cpu = new Controllers.ProcessadorController();
        try{
            assertTrue(cpu.inserir("Intel", "i5 4670K", "4", "4", "3.8", "6", "LGA1150"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" 
                    ));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo socket não pode exceder 255 caracteres.");
        }
    }
}
