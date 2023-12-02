package Zoologico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joe
 */
public class Cocodrilo extends AnimalCarnivoro {

    private float tamano;
    private String habitad;
    
    public Cocodrilo(int codigo, String nombre, float peso, int edad, float tamano, String habitad) {
        super(codigo, nombre, peso, edad);
        this.tamano = tamano;              
        this.habitad = habitad;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }
    
    
    
    @Override
    public String mostrarDatos() {
        return "Cocodrilo{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", peso=" + getPeso() + ", edad=" + getEdad()+ ", tamano=" + getTamano()+
                ", habitad=" + getHabitad() + '}';
    }
}
