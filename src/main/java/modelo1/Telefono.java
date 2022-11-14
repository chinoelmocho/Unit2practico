/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

/**
 *
 * @author David
 */
public class Telefono {
    
    private String numero;
    private int extension;
    private String tipoTelefono;
    private String operadora;

    public Telefono(String numero, int extension, String tipoTelefono, String operadora) {
        this.numero = numero;
        this.extension = extension;
        this.tipoTelefono = tipoTelefono;
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", extension=" 
                + extension + ", tipoTelefono=" + tipoTelefono 
                + ", operadora=" + operadora + '}';
    }
 
    
    
}