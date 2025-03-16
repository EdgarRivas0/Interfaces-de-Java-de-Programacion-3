/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazpago;

public class PagoconEfectivo implements Pago {
    @Override
    public void procesarPago(double cantidad)
    {
        System.out.println("Procesando el pago en verdesitos" + cantidad);
    }
}
