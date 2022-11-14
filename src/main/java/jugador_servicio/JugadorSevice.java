/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jugador_servicio;
import modelo1.Jugador;
import java.util.List;
/**
 *
 * @author LAB-2
 */
public interface JugadorSevice {
    public abstract void crear(Jugador jugador);
    public abstract void modificar(int codigo, Jugador JugadorModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Jugador> listar();
    
}
