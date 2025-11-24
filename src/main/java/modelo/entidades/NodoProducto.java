/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entidades;

/**
 * el contenedor reutilizado en dos contextos diferentes: el catálogo general de la tienda (Lista) y la lista de deseos personal del usuario (Pila).
 * @author estra
 */
public class NodoProducto {
    public Producto producto;/*Almacena el objeto Producto completo con toda su información*/
    public NodoProducto siguiente; /*En ListaProductos: Apunta al siguiente producto del catálogo En PilaDeseos: Apunta al producto agregado anteriormente a la lista de deseos*/
    
    public NodoProducto(Producto producto) {
        this.producto = producto;
        this.siguiente = null;
    }
}
