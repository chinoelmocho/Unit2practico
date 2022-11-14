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
public class Dueño {
    
    private String cedula;
    private String nombre;
    private ArrayList<Telefono> telefonolist;
    

    public Dueño(String cedula, String nombre) {

        this.cedula = cedula;
        this.nombre = nombre;
         this.telefonolist = new ArrayList<Telefono>();
    }
    
    public void nuevoTelefono(String numero, int extension, String tipoTelefono, String operadora){
        var telefono1 = new Telefono(numero, extension, tipoTelefono, operadora);
        this.telefonolist.add(telefono1);
    } 
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
    public String mostarinfo() {
        var retorno= "Dueño{" + "cedula=" + cedula + ", nombre=" + nombre 
               
                + ", telefonoList="+"\n";
        for (var telefono:this.telefonolist){
        retorno+=telefono.toString()+"\n";
        }
  
        return retorno;
    }
}

  
