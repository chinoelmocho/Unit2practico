/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladorg.jugadorControl;
import jugador_servicio.JugadorServiceImpl;
import modelo1.Jugador;
import java.time.LocalDate;
import java.time.Month;
import jugador_servicio.JugadorServiceImpl;
/**
 *
 * @author LAB-2
 */
public class JugadorControl {
    private JugadorServiceImpl jugadorServiceImpl;

    public JugadorControl() {
        this.jugadorServiceImpl = new JugadorServiceImpl();
    }
    
    public String crear(String[] data){
        var retorno="Nose pudo crear el jugador";
        var codigo=Integer.valueOf(data[0]).intValue();
        var peso=Double.valueOf(data[1]).doubleValue();
        var estatura=Integer.valueOf(data[2]).intValue();
        var nombre=data[3];
        var año=Integer.valueOf(data[4]).intValue();
        var mes=Integer.valueOf(data[5]).intValue();
        var dia=Integer.valueOf(data[6]).intValue();
        if (peso<0){
            retorno+= "Peso no valido";
           
        }else{
            if(estatura<0){
            retorno+="Estatura no es correcto";
            }
        }
        var jugador =new Jugador(codigo,nombre,peso,estatura,LocalDate.of(año,mes,dia));
        this.jugadorServiceImpl.crear(jugador);
        retorno ="Jugador"+jugador.getNombre()+" creado correctamente";
        return retorno;
    }
}
