/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Asignatura {
    private String nombre;
    private String ciclos;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre, String ciclos) {
        this.nombre = nombre;
        this.ciclos = ciclos;
        this.estudiantes = new ArrayList<>();
    }
    public void listestudiante(Estudiante estudiantess){
    this.estudiantes.add(estudiantess);
    
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclos() {
        return ciclos;
    }

    public void setCiclos(String ciclos) {
        this.ciclos = ciclos;
    }

    @Override
    public String toString() {
        var retorno= "Aignatura{" + "nombre=" + nombre + ", ciclos=" + ciclos+"\n" ;
        for (var estud:this.estudiantes){
        retorno+=estud.toString()+"\n";
        }
        return retorno;
    }


}
