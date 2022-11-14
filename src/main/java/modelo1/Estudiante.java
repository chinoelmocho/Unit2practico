/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

/**
 *
 * @author David
 */
public class Estudiante {
    private String nombre;
    private String cedula;
    private int Codigo;
            
    
    public Estudiante(String nombre, String cedula, int Codigo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Codigo= Codigo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
    
}