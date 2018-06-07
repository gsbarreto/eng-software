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
public class PlacaExpansaoTest {
    
    public PlacaExpansaoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Ignore //BD Desconectado
    @Test
    public void test0() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+", "Sapphire", "0", "1322", "8", "175"));
        }
        catch(Controllers.AlertaException e)
        {
            fail();
        }
    }
    
    @Test
    public void test1() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("", "Sapphire", "0", "1322", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo nome não pode estar vázio.");
        }
    }
    
    @Test
    public void test2() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+", "", "0", "1322", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo marca não pode estar vázio.");
        }
    }
    
    @Test
    public void test3() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+", "Sapphire", "", "1322", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo nucleo cuda não pode estar vázio.");
        }
    }
    
    @Test
    public void test4() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+", "Sapphire", "0", "", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo frequencia não pode estar vázio.");
        }
    }
    
    @Test
    public void test5() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+", "Sapphire", "0", "1322", "", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo memoria não pode estar vázio.");
        }
    }
    
    @Test
    public void test6() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+", "Sapphire", "0", "1322", "8", ""));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo consumo não pode estar vázio.");
        }
    }
    
    @Test
    public void test7() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    , "Sapphire", "0", "1322", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo nome não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test8() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+" , "Sapphireaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    , "0", "1322", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo marca não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test9() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+" , "Sapphire", "A", "1322", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo nucleo cuda não pode conter letras.");
        }
    }
    
    @Test
    public void test10() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+" , "Sapphire", "0", "A", "8", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo frequencia não pode conter letras.");
        }
    }
    
    @Test
    public void test11() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+" , "Sapphire", "0", "1322", "A", "175"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo memoria não pode conter letras.");
        }
    }
    
    @Test
    public void test12() throws Controllers.AlertaException{
        Controllers.PlacaExpansaoController gpu = new Controllers.PlacaExpansaoController();
        try{
            assertTrue(gpu.inserir("RX 480 Nitro+" , "Sapphire", "0", "1322", "8", "A"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(), "O campo consumo não pode conter letras.");
        }
    }

}
