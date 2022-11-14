/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estidiante_service;

import java.util.List;
import modelo1.Estudiante;
import modelo1.Jugador;

/**
 *
 * @author LAB-2
 */
public interface EstudianteService {
    public abstract void crear(Estudiante estudiante);
    public abstract void modificar(int codigo, Estudiante  estudiante);
    public abstract void eliminar(int codigo);
    public abstract List<Estudiante> listar();
}
