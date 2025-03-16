/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazvehiculo;

public class Carcacha implements Vehiculo {
    
    @Override
    public void arrancar()
    {
        System.out.println("La nave empieza a crujir");
    }
    
    @Override
    public void detener()
    {
        System.out.println("La nave se estaciono brutalmente.");
    }
}
