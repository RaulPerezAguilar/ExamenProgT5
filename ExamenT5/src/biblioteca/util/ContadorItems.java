/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.util;

/**
 *
 * @author 01_1DAW_Alum
 */
public class ContadorItems {
    int Objetos = 0;
    
    public void sumar() {
        Objetos = Objetos + 1;
    }
    
    public void getTotalItems() {
        System.out.println("El total de items es: " + Objetos);
    }
    
}
