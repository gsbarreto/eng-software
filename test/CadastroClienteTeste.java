/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controllers.ClienteController;
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
public class CadastroClienteTeste {
    
    public CadastroClienteTeste() {
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
    //---------------------------
    // Teste para aceitar
    @Test
    public void test0()throws Controllers.AlertaException{        
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("","","","",""));
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"Campos vázios");
        }
    }
    // Teste para aceitar
    @Test
    public void test1()throws Controllers.AlertaException{        
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Junior Viçosa","vs@vs.com","vs@vs.com","123456","123456"));
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"O campo nome não pode exceder 50 caracteres.");
        }
    }
    // Teste para aceitar campo Nome com mais de 50 caracteres
    @Test
    public void test2() throws Controllers.AlertaException{
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Lorem ipsum blandit tempor ipsum libero, velit volutpat sem litora.","vs@vs.com","vs@vs.com","123456","123456"));
            fail();
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"O campo nome não pode exceder 50 caracteres.");
        }
    }
    // Testa nome email com mais de 50 caracteres
    @Test
    public void test3() throws Controllers.AlertaException{
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Claudio","asdasasdasasdasasdasasdasasdasasdasasdasasdasasdas@vs.com","asdasasdasasdasasdasasdasasdasasdasasdasasdasasdas@vs.com","123456","123456"));
            fail();
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"O campo email não pode exceder 50 caracteres.");
        }
    }
    // Testa senha com mais de 50 caracteres
    @Test
    public void test4() throws Controllers.AlertaException{
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Claudio","email@email.com","email@email.com","123451234512345123451234512345123451234512345123451","123451234512345123451234512345123451234512345123451"));
            fail();
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"O campo senha não pode exceder 50 caracteres.");
        }
    }
    // Testa se a confirmação de email esta certa
    @Test
    public void test5() throws Controllers.AlertaException{
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Claudio","email@email.com","emails@email.com","123456","123456"));
            fail();
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"Email ou Senha não são iguais");
        }
    }
    // Testa se a confirmação de email esta certa
    @Test
    public void test6() throws Controllers.AlertaException{
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Claudio","email@email.com","email@email.com","123456","1234562"));
            fail();
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"Email ou Senha não são iguais");
        }
    }
    // Testa se o formato do email esta certo
    @Test
    public void test7() throws Controllers.AlertaException{
        ClienteController cli = new ClienteController();
        try{
            assertTrue(cli.inserir("Claudio","emailemail.com","emailemail.com","123456","1234562"));
            fail();
        }catch(Controllers.AlertaException e){
            assertEquals(e.getMessage(),"Formato do campo email incorreto");
        }
    }
    
    
    
        
    
}
