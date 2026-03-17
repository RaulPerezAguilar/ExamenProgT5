/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *
 * @author 01_1DAW_Alum
 */
public class Libro extends ItemBiblioteca {
    public String autor;
    public int numeroPaginas;
    
    public Libro(String id,String titulo,int anioPublicacion) {
        super(id,titulo,anioPublicacion);
    }
    
    
    @Override
    public void ObtenerDescripcion() {
        System.out.println("--------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Id: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("--------------------------");
    }
}
