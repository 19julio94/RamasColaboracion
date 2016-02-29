package ramascolaboracion;

import javax.swing.JOptionPane;



/**
 *
 * @author agomezcastro
 */
public class Ejercicio {
    private int num1, num2, res;
    

    public int multiplicacion(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 1er numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 2º numero"));
        res =  num1 * num2;
        System.out.println("Resultado= "+ res);
        return res;
    }
    
    public int division(){    
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 1er numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el 2º numero"));
        res =  num1 / num2;
        System.out.println("Resultado= "+ res);
        return res;
    }
}
