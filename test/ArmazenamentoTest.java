
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controllers.AlertaException;
import Controllers.ArmazenamentoController;
import model.bean.Armazenamento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class ArmazenamentoTest {
    
    public ArmazenamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //--------------------------
    
    //Teste certo
    @Test
    public void test1(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            assertTrue(arm.inserir("HQ2500",
                        "Western Digital",
                        "1000",
                        "6",
                        "10000"));
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo modelo não pode exceder 255 caracteres.");
        }
    }
    //Teste modelo branco
    @Test
    public void test2(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("",
                        "Western Digital",
                        "1000",
                        "6",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo modelo não pode estar vázio.");
        }
    }
    //Teste modelo branco
    @Test
    public void test3(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "",
                        "1000",
                        "6",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo marca não pode estar vázio.");
        }
    }
    //Teste capacidade branco
    @Test
    public void test4(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Western Digital",
                        "",
                        "6",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo capacidade não pode estar vázio.");
        }
    }
    //Teste cache branco
    @Test
    public void test5(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Western Digital",
                        "1000",
                        "",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo cache não pode estar vázio.");
        }
    }
    //Teste taxa branco
    @Test
    public void test6(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Western Digital",
                        "1000",
                        "6",
                        "");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo taxa de transferencia não pode estar vázio.");
        }
    }
    // ESTOURAR CARACTERES
    //Teste modelo
    @Test
    public void test7(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("Lorem ipsum aliquet mattis fringilla sed pellentesque, nibh nisl luctus porta integer, auctor viverra consectetur aenean commodo. justo mattis tincidunt sagittis ultricies, nec sagittis tempor sagittis tempor sagittis tempor sagittis tempor sagittis tempor. ",
                        "Western Digital",
                        "1000",
                        "6",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo modelo não pode exceder 255 caracteres.");
        }
    }
    //Teste marca
    @Test
    public void test8(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Lorem ipsum aliquet mattis fringilla sed pellentesque, nibh nisl luctus porta integer, auctor viverra consectetur aenean commodo. justo mattis tincidunt sagittis ultricies, nec sagittis tempor sagittis tempor sagittis tempor sagittis tempor sagittis tempor. ",
                        "1000",
                        "6",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo marca não pode exceder 255 caracteres.");
        }
    }
    //CONTER LETRAS
    //Teste capacidade
    @Test
    public void test9(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Western Digital",
                        "asdasdasd10",
                        "6",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo capacidade não pode conter letras.");
        }
    }
    //Teste cache
    @Test
    public void test10(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Western Digital",
                        "12456",
                        "asdasdasd10",
                        "10000");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo cache não pode conter letras.");
        }
    }
    //Teste taxa
    @Test
    public void test11(){
        try{
            ArmazenamentoController arm = new ArmazenamentoController();
            //modelo,marca,capacidade,cache,taxa
            arm.inserir("HQ2500",
                        "Western Digital",
                        "12456",
                        "3",
                        "asdasdasd10");
            fail();
        }catch(AlertaException e){
            assertEquals(e.getMessage(),"O campo taxa de transferencia não pode conter letras.");
        }
    }
    
}
