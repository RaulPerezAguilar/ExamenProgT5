/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Revista extends ItemBiblioteca {
    public int numero;
    public int periodicidad;
    
    public Revista(String id,String titulo,int anioPublicacion) {
        super(id,titulo,anioPublicacion);
    }
    
    
    @Override
    public void ObtenerDescripcion() {
        System.out.println("--------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Id: " + id);
        System.out.println("Numero de revista: " + numero);
        System.out.println("Preciodicidad: " + periodicidad);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("--------------------------");
    }
}
