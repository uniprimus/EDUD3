/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

/**
 *metodo que realiza una division entera
 *@param numerador entero
 * @param denominador entero
 * @return
 * 
 */
public class Pruebajunit {
    public static int division(int numerador, int denominador){
        return (numerador/denominador);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado de la operacion: "+division(2,3));
    }
    
}
