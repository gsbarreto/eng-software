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
public class PlacaMaeTest {
    
    public PlacaMaeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test0() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-Plus","Asus", "4", "DDR3", "65", "LGA1150", "64"));
        }
        catch(Controllers.AlertaException e)
        {
            fail();
        }
    }
    
    @Test
    public void test1() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("","Asus", "4", "DDR3", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo modelo não pode estar vázio.");
        }
    }
    
    @Test
    public void test2() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("modelomaiioorque255aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"                    
                    ,"Asus", "4", "DDR3", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo modelo não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test3() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","", "4", "DDR3", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo marca não pode estar vázio.");
        }
    }
    
    @Test
    public void test4() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"                    
                    +"Asus", "4", "DDR3", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo marca não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test5() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "", "DDR3", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo numero de slots não pode estar vázio.");
        }
    }
    
    @Test
    public void test6() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "A", "DDR3", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo numero de slots não pode conter letras.");
        }
    }
    
    @Test
    public void test7() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "", "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo tipo de memoria não pode estar vázio.");
        }
    }
    
    @Test
    public void test8() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"                    
                    , "65", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo tipo de memoria não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test9() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3", "", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo consumo não pode estar vázio.");
        }
    }
    
    @Test
    public void test10() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3", "A", "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo consumo não pode conter letras.");
        }
    }
    
    @Test
    public void test11() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3", "65", "", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo socket não pode estar vázio.");
        }
    }
    
    @Test
    public void test12() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3", "65" ,"aaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
                    + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"                    
                    + "LGA1150", "64"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo socket não pode exceder 255 caracteres.");
        }
    }
    
    @Test
    public void test13() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3", "65", "LGA1150", "A"));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo limite de memoria suportada não pode conter letras.");
        }
    }
    
    @Test
    public void test14() throws Controllers.AlertaException {
        Controllers.PlacaMaeController mae = new Controllers.PlacaMaeController();
        try{
            assertTrue(mae.inserir("H87-PLUS","Asus", "4", "DDR3", "65", "LGA1150", ""));
            fail();
        }
        catch(Controllers.AlertaException e)
        {
            assertEquals(e.getMessage(),"O campo limite de memoria suportada não pode estar vázio.");
        }
    }
}
