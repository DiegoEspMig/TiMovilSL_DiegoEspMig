/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 * Descripci�n: Subclase de la clase Telefono que representa un dispositivo
 * Pijiphone. Hereda las caracter�sticas generales de la clase madre, a�adiendo
 * funcionalidades espec�ficas como la capacidad de grabar las llamadas (m�todo
 * "llamar"), la integraci�n de un m�dulo GPS para determinar la ubicaci�n del
 * dispositivo, y una implementaci�n personalizada del m�todo "cargar" para
 * gestionar la carga de la bater�a de forma acelerada.
 *
 * Adem�s, redefine el m�todo "toString" para proporcionar una representaci�n
 * m�s detallada de la informaci�n del dispositivo Pijiphone.
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
        System.out.println("\nLa llamada ha sido grabada con �xito");
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
        return "El dispositivo �-jiPhone tiene un precio de: " + getPRECIO()
                + ", un PUK: " + getPUK()
                + ", color: " + getCOLOR()
                + ", la bater�a tiene una carga de: " + getBateria() + "%"
                + ", ha realizado: " + getLlamadas() + " llamadas"
                + ", y se encuentra en: " + (gps.getUbicacion() == null ? "Desconocido" : gps.getUbicacion() + ".");
    }

    public Gps getGps() {
        return gps;
    }

}
