package Calculadora;

import javax.swing.*;
/*ESTA CLASE IMPORTA LOS PAQUETES */

public class Calculadora {
    public static void main(String[] args) {

/*VARIABLES DEL PROGRAMA */
        double numero1, numero2;
        int opcion;
        boolean condicion = true;
/*CONDICIONAL QUE DEVUELVE LA OPCION SELECCIONADA PARA SER EJECUTA EN EL SWITCH CON EL SU RESPECTIVO CASO*/
        while(condicion){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    CALCULADORA INGRESA LA OPCION A  REALIZAR :
                     1- SUMAR\s
                     2- RESTAR\s
                     3- MULTIPLICAR\s
                     4- DIVIDIR\s
                     5- MODULO\s
                     6- SALIR"""));
/*CONDICIONAL SWITCH EJECUTANDO LA OPCION ANTERIOR ELEGIDA*/
            switch (opcion){
                case 1 ->{
                    /*VARIABLES GUARDANADO EL VALOR DIGITADO POR EL USUARIO*/
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    /*VARIABLES CON EL VALOR ALMACENADOS DE NUMERO1 / NUMERO2 */
                    double suma = numero1 + numero2;
                    /*MOSTRANDO EL VALOR DE LA VARIABLE SUMA */
                    JOptionPane.showMessageDialog(null,"LA SUMA ES : " + suma);

                }
                
                case 2 ->{
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double resta = numero1 - numero2;
                    JOptionPane.showMessageDialog(null,"LA RESTA ES : " +resta);

                }
                case 3 ->{
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double mult = numero1 * numero2;
                    JOptionPane.showMessageDialog(null,"LA MULTIPLICACION ES : " +mult);

                }
                case 4 ->{
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    if(numero2==0){
                        JOptionPane.showMessageDialog(null,"NO PUEDES DIVIDIR POR 0 INGRESA OTRO VALOR ");
                    }else{
                        double div = numero1 / numero2;
                        JOptionPane.showMessageDialog(null,"LA DIVISION ES : " +div);
                    }


                }
                case 5 ->{
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double modulo = numero1 % numero2;
                    JOptionPane.showMessageDialog(null,"EL MODULO ES : " +modulo);

                }
                case 6 ->{
                    /*EJECUTANDO EL BOOLEAN DE LA LINEA 12 EL CUAL CIERRA EL PROGRAMA CON LA OPCION 6*/
                    condicion = false;
                    JOptionPane.showMessageDialog(null,("****SALISTES DEL PROGRAMA****"));

                }/*CIERRE DEL METODO */
            }/*CIERRE DEL METODO SWITCH*/

        }/*CIERRE DEL METODO WHILE*/
    }
}/*CIERRE DEL PROGRAMA */
