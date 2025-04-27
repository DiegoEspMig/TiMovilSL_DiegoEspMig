/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 * Descripción: Subclase de la clase Telefono que representa un dispositivo
 * Pijiphone. Hereda las características generales de la clase madre, añadiendo
 * funcionalidades específicas como la capacidad de grabar las llamadas (método
 * "llamar"), la integración de un módulo GPS para determinar la ubicación del
 * dispositivo, y una implementación personalizada del método "cargar" para
 * gestionar la carga de la batería de forma acelerada.
 *
 * Además, redefine el método "toString" para proporcionar una representación
 * más detallada de la información del dispositivo Pijiphone.
 *
 * @version 1.4.1
 * @author DiegoEspMig
 */
public class Pijiphone extends Telefono {

    private Gps gps;

    public Pijiphone(String colorIn) {
        super(colorIn, 700);
        this.gps = new Gps();
    }

    @Override
    public void llamar() {
        System.out.println("ATENCION!!");
        System.out.println("Esta llamada va a ser grabada\n");
        super.llamar(); // metodo llamar de la madre
        System.out.println("\nLa llamada ha sido grabada con éxito");
    }

    @Override
    public void cargar() {
        if ((getBateria() + 70) >= 100) {
            setBateria(100);
        } else {
            setBateria(getBateria() + 70);
        }
        System.out.println("La bateria se ha cargado hasta el " + getBateria() + "%");
    }

    @Override
    public String toString() {
        return "El dispositivo ñ-jiPhone tiene un precio de: " + getPRECIO()
                + ", un PUK: " + getPUK()
                + ", color: " + getCOLOR()
                + ", la batería tiene una carga de: " + getBateria() + "%"
                + ", ha realizado: " + getLlamadas() + " llamadas"
                + ", y se encuentra en: " + (gps.getUbicacion() == null ? "Desconocido" : gps.getUbicacion() + ".");
    }

    public Gps getGps() {
        return gps;
    }

}
