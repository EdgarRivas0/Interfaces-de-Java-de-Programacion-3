/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaznotificacion;

public class SMS implements Notificable {
    
    @Override
    public void enviarNoti()
    {
        System.out.println("Enviando notificacion de que se ha acabado el saldo por el SMS");
    }
}
