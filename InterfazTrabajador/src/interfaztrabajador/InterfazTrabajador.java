/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaztrabajador;

public class InterfazTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Trabajador desarrollador = new Desarrollador();
       Trabajador diseñador = new Diseñador();
       
       desarrollador.trabajar();
       diseñador.trabajar();
    }
    
}
