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
public class Paciente {
    public static List<Paciente> listPaciente = new ArrayList<>();
    
    private String dni;
    private String nombre;
    private String direccion;
    private int peso;
    private int temperatura;
    private Medico medico;

    public Paciente() {
    }

    public Paciente(String dni, String nombre, String direccion, int peso, int temperatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.peso = peso;
        this.temperatura = temperatura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void agregarPaciente(Paciente paciente){
        listPaciente.add(paciente);
    }
    
    public void eliminarPaciente(int indice){
        listPaciente.remove(indice);
    }

    public void actualizarPaciente(Paciente paciente){
        for(Paciente pac : listPaciente){
            if (pac.getDni().equals(paciente.getDni())){
                pac.setNombre(paciente.getNombre());
                pac.setDireccion(paciente.getDireccion());
                pac.setPeso(paciente.getPeso());
                pac.setTemperatura(paciente.getTemperatura());
            }
        }
    }
    
    public int obtenerPesoRepetitivo(){
        return 1;
    }
    
    public int obtenerCantidadPacientePesoRepetitivo(){
        return 1;
    }
    
    public int obtenerPesoMayor(){
        int peso = 0;
        int contador = 0;
        for(Paciente paciente : listPaciente){
            if (contador == 0){
                peso = paciente.getPeso(); 
            }
            else{
                if (peso < paciente.getPeso()){
                    peso = paciente.getPeso();
                }
            }
            contador++;
        }
        return peso;
    }
    
    public int obtenerPesoMenor(){
        int peso = 0;
        int contador = 0;
        for(Paciente paciente : listPaciente){
            if (contador == 0){
                peso = paciente.getPeso(); 
            }
            else{
                if (peso > paciente.getPeso()){
                    peso = paciente.getPeso();
                }
            }
            contador++;
        }
        return peso;
    }
    
    public Medico obtenerMedicoPorPaciente(Paciente paciente){
        for(Paciente pac : listPaciente){
            if (pac.getMedico().equals(paciente.getMedico())){
                return pac.getMedico();
            }
        }
        return null;
    }
    
    public List<Paciente> obtenerPacientesOrdenadoNombre(){
        return listPaciente;
    }

}
