/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco
 */
public class Medico {
    private List<Medico> listMedico = new ArrayList<Medico>();
    
    private int numeroColegiatura;
    private String nombre;
    private String especialidad;

    public Medico() {
    }

    public Medico(int numeroColegiatura, String nombre, String especialidad) {
        this.numeroColegiatura = numeroColegiatura;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(int numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public List<Medico> obtenerMedicoPorEspecialidad(String especialidad){
        List<Medico> listMedicoTemp = new ArrayList<>();
        for(Medico medico : listMedico){
            if (medico.getEspecialidad().equals(especialidad)){
                listMedicoTemp.add(medico);
            }
        }
        return listMedicoTemp;
    }
}
