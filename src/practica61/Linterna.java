/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @version 1.0.0
 * @author DiegoEspMig
 */
public class Linterna {

    private boolean encendido;

    public void encender() {
        System.out.println("Mucha luz!");
        this.setEncendido(true);
    }

    public void apagar() {
        System.out.println("Se va la luz");
        this.setEncendido(false);
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendidoIn) {
        this.encendido = encendidoIn;
    }

}
