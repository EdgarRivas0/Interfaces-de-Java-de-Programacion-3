/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazvehiculo;

public class Bicicleta implements Vehiculo {
    
    @Override
    public void arrancar()
    {
        System.out.println("La bicicleta empieza a andar");
    }
    @Override
    public void detener()
    {
        System.out.println("La bicicleta frena y se acaba la llanta barata que les ponen");
    }
}
