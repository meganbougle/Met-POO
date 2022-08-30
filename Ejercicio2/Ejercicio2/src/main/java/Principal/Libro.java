/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author danie
 */
public class Libro {
    private int id;
    private double precio;
    private String nombre,autor;
    private String descripcion;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Libro(int id, double precio, String nombre, String autor, String descripcion) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", autor=" + autor + ", descripcion=" + descripcion + '}';
    }
    
   
    
}
