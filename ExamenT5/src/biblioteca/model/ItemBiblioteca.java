/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *
 * @author 01_1DAW_Alum
 */
public abstract class ItemBiblioteca {
    protected String id;
    protected String titulo;
    protected int anioPublicacion;
    
    public ItemBiblioteca(String id, String titulo, int anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    
    public abstract void ObtenerDescripcion();
            
}
