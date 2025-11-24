/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entidades;

/**
 *Es el contenedor utilizado para construir la Lista Enlazada Simple de Usuarios Registrados.
 * @author estra
 */
public class NodoUsuario {
    public Usuario usuario;
    public NodoUsuario siguiente;
    
    public NodoUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }
    
}