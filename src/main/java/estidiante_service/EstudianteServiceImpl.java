/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estidiante_service;

import java.util.ArrayList;
import java.util.List;
import modelo1.Estudiante;

/**
 *
 * @author David
 */
public class EstudianteServiceImpl implements EstudianteService {

    List<Estudiante> estudianteList;

    public EstudianteServiceImpl() {
        this.estudianteList = new ArrayList<>();
    }

    @Override
    public void modificar(int codigo, Estudiante estudianteModificado) {
        var indice = 0;
        for (var estudent : this.estudianteList) {
            if (estudent.getCodigo() == codigo) {
                this.estudianteList.set(indice, estudianteModificado);
                break;
            } else {
                indice++;

            }

        }

    }

    @Override
    public void crear(Estudiante estudiantes) {
        this.estudianteList.add(estudiantes);

    }

    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }

    @Override
    public void eliminar(int codigo) {
        var indice = 0;
        for (var estudent : this.estudianteList) {
            if (estudent.getCodigo() == codigo) {
                this.estudianteList.remove(indice);
                break;
            } else {
                indice++;

            }

        }

    }
}
