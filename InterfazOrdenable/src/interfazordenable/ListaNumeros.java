/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazordenable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumeros implements Ordenable {
    private List<Integer> numeros;
    
    //Albañil
    public ListaNumeros(List<Integer> numeros)
    {
        this.numeros = numeros;
    }
    
    @Override
    public void ordenar()
    {
        Collections.sort(numeros); //Ordenar de menor a mayor, asi como de abajo para arriba dicen
        System.out.println("Lista ordenada: " + numeros);
    }
    
    public void mostrarLista()
    {
        System.out.println("Lista original: " + numeros);
    }
}
