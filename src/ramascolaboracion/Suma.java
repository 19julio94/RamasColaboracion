
package ramascolaboracion;

import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class Suma {
private int num1,num2; 


public int suma(){

    int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero: "));
    int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero: "));

    int res=(num1+num2);
    
    System.out.println("El resultado es: "+res);
   return res; 
}


public int resta(){

    int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero: "));
    int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero: "));

    int res=(num1-num2);
    
    System.out.println("El resultado es: "+res);
   return res; 
}
}
