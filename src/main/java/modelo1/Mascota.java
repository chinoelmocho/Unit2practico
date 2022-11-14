/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

/**
 *
 * @author David
 */
public class Mascota {
    private String Nombre;
    private String tipoanimal;
    private String raza;
    private double peso;
    private Dueño owner;

    public Mascota(String Nombre, String tipoanimal, String raza, double peso, Dueño owner) {
        this.Nombre = Nombre;
        this.tipoanimal = tipoanimal;
        this.raza = raza;
        this.peso = peso;
        this.owner = owner;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoanimal() {
        return tipoanimal;
    }

    public void setTipoanimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dueño getOwner() {
        return owner;
    }

    public void setOwner(Dueño owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Mascota{" + "Nombre=" + Nombre + ", tipoanimal=" + tipoanimal + ", raza=" + raza + ", peso=" + peso + ", owner=" +"\n"+ owner.mostarinfo() + '}';
    }
    
}