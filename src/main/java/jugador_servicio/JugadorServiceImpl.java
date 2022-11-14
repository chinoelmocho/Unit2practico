/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugador_servicio;
import java.util.ArrayList;
import java.util.List;
import modelo1.Jugador;

/**
 *
 * @author David
 */
    
   public class JugadorServiceImpl {
 private List<Jugador> jugadorList;
    
    public JugadorServiceImpl(){
    this.jugadorList=new ArrayList<>();
    }
    public void crear(Jugador jugadors){
    this.jugadorList.add(jugadors);
    
    }
    public void modificar(int codigo,Jugador JugadorModificado){
        var indice=0;
        for (var jugador:this.jugadorList){
            if(jugador.getCodigo()==codigo){
                this.jugadorList.set(indice,JugadorModificado);
                break;
            }else{
                indice++;
                        
                        }
            
        }
        
        
    
    
    }
  
  public List<Jugador> listar(){
    return this.jugadorList;
    
}  

  
  public void eliminar(int codigo){
  var indice=0;
        for (var jugador:this.jugadorList){
            if(jugador.getCodigo()==codigo){
                this.jugadorList.remove(indice);
                break;
            }else{
                indice++;
                        
                        }
            
        }
  }
} 

