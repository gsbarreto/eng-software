
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class AlertaException extends Exception {

    /**
     * Creates a new instance of <code>CadastroException</code> without detail
     * message.
     */
    public AlertaException() {
    }

    /**
     * Constructs an instance of <code>CadastroException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AlertaException(String msg) {
        JOptionPane caixa = new JOptionPane(msg);
        JOptionPane.showMessageDialog(caixa, msg);
    }
}
