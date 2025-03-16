/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazgeometrica;

/**
 *
 * @author Tamal
 */
public class InterfazGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5); //El radio (no el de las emisiones) es igual a 5
        FiguraGeometrica rectangulon = new Rectangulon(4,6); //No haría falta que lo ponga
        
        System.out.println("Circulo");
         System.out.println("Area" + circulo.area());
          System.out.println("Perimetro " + circulo.perimetro());
          
          
           System.out.println("\nRectangulo:");
            System.out.println("Area " + rectangulon.area());
             System.out.println("Perimetro " + rectangulon.perimetro());
    }
    
}
