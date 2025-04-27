/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 * Descripción: Subclase de la clase Telefono que representa un dispositivo
 * Android. Hereda las características generales de la clase madre, añadiendo
 * funcionalidades específicas como la capacidad de abrir la aplicación
 * Paint.exe (método "pintar") y una implementación personalizada del método
 * "cargar" para gestionar la carga de la batería de forma única.
 *
 * Además, redefine el método "toString" para proporcionar una representación
 * más detallada de la información del dispositivo Android.
 * 
 * @version 1.3.1
 * @author DiegoEspMig
 */
public class Android extends Telefono {

    public Android(String colorIn) {
        super(colorIn, 200);
    }

    public void pintar() {
        try {
            ProcessBuilder proceso = new ProcessBuilder("mspaint.exe");
            proceso.start();
        } catch (Exception e) {
            System.out.println("No encuentro el paint");
        }
        super.esperar(3);
    }

    @Override
    public void cargar() {
        if ((getBateria() + (getBateria() / 3) + 20) >= 100) {
            setBateria(100);
        } else {
            setBateria(getBateria() + (getBateria() / 3) + 20);
        }
        System.out.println("La bateria se ha cargado hasta el " + getBateria() + "%");
    }

    @Override
    public String toString() {
        return "El dispositivo &-roid tiene un precio de: " + getPRECIO()
                + ", un PUK: " + getPUK()
                + ", color: " + getCOLOR()
                + ", la batería tiene una carga de: " + getBateria() + "%"
                + ", y ha realizado: " + getLlamadas() + " llamadas.";
    }

}
