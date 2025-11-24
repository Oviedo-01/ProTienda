/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entidades;

/**
 *
 * @author estra
 * Se crea un nuevo nodo con la ruta de la imagen, inicializando siguiente y anterior en null.
* ListaImagenesCircular Se encarga de los enlaces
 */
public class NodoImagen {
    public String rutaImagen;
    public NodoImagen siguiente;
    public NodoImagen anterior;
    
    // Constructor
    public NodoImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
        this.siguiente = null;
        this.anterior = null;
    }
}
