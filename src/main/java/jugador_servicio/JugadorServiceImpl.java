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
    
   public class JugadorServiceImpl implements JugadorService {
 private List<Jugador> jugadorList;
    
    public JugadorServiceImpl(){
    this.jugadorList=new ArrayList<>();
    }
 @Override
    public void crear(Jugador jugadors){
    this.jugadorList.add(jugadors);
    
    }
 @Override
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
  
 @Override
  public List<Jugador> listar(){
    return this.jugadorList;
    
}  

  
 @Override
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

