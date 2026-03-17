/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca.app;
import biblioteca.model.Libro;
import biblioteca.model.Revista;
/**
 *
 * @author 01_1DAW_Alum
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro L = new Libro("12","Libro1",15);
        L.autor = "Manuel Carrasco";
        L.numeroPaginas = 192;
        L.ObtenerDescripcion();
        
        Libro L2 = new Libro("12","Libro2",5);
        L2.autor = "Miguel Carrasco";
        L2.numeroPaginas = 1092;
        L2.ObtenerDescripcion();
        
        Revista R1 = new Revista("12","Revista1",150);
        R1.numero = 12;
        R1.periodicidad = 1902;
        R1.ObtenerDescripcion();
    }
    
}
