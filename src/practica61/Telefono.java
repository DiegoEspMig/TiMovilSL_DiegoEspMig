/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @version 1.8.1
 * @author DiegoEspMig
 */
public abstract class Telefono {

    /**
     * código de seguridad de 8 dígitos
     */
    private final String PUK;
    /**
     * coste de dispositivo según la marca
     */
    private final double PRECIO;
    /**
     * color del dipositivo elegido por el usuario
     */
    private final String COLOR;
    /**
     * capacidad de carga de 0 a 100
     */
    private int bateria;
    /**
     * número de llamadas realizadas
     */
    private int llamadas;
    /**
     * recuento global de llamadas de todos los teléfonos
     */
    private static int llamadasTotales;
    /**
     * accesorio externo que se podrá conectar
     */
    private Linterna linterna;

    /**
     * Constructor -> Telefono
     *
     * @param colorIn color del dispositivo elegido por el usuario
     * @param precioIn coste de dispositivo según la marca
     */
    public Telefono(String colorIn, double precioIn) {
        this.COLOR = colorIn;
        this.PUK = "" + (int) Math.floor(Math.random() * 100000000);
        this.PRECIO = precioIn;
        this.llamadas = 0;
        this.bateria = 0;
    }

    /**
     * Este método es la forma génerica de llamar
     */
    public void llamar() {
        System.out.println("Piiii, piiiii...");
        this.esperar(3);
        System.out.println("---**CONVERSACIÓN PRIVADA**---");
        this.esperar(2);
        System.out.println("pi pi pi, pi pi pi, ...");
        this.setLlamadas(this.getLlamadas() + 1);
        Telefono.setLlamadasTotales(Telefono.getLlamadasTotales() + 1); //
        // this.llamadas = this.llamadas + 1;
    }

    /**
     * Este método sirve para esperar
     *
     * @param segundosIn num segundosIn de espera
     */
    public void esperar(int segundosIn) {
        try {
            Thread.sleep(segundosIn * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Este método será la forma de cargar en las subclases
     */
    public abstract void cargar();

    /**
     * Getter -> Telefono
     *
     * @return número de seguridad
     */
    public String getPUK() {
        return PUK;
    }

    /**
     * Getter -> Telefono
     *
     * @return coste del dispositivo
     */
    public double getPRECIO() {
        return PRECIO;
    }

    /**
     * Getter -> Telefono
     *
     * @return color del dispositivo
     */
    public String getCOLOR() {
        return COLOR;
    }

    /**
     * Getter -> Telefono
     *
     * @return nivel actual de bateria
     */
    public int getBateria() {
        return bateria;
    }

    /**
     * Getter -> Telefono
     *
     * @return número de llamadas hasta el momento
     */
    public int getLlamadas() {
        return llamadas;
    }

    /**
     * Getter -> Telefono
     *
     * @return número de llamadas de todos los teléfonos
     */
    public static int getLlamadasTotales() {
        return llamadasTotales;
    }

    /**
     * Getter -> Telefono
     *
     * @return obtiene la dirección de memoria del objeto linterna para
     * interactuar con el
     */
    public Linterna getLinterna() {
        return linterna;
    }

    /**
     * Setter -> Telefono
     *
     * @param bateriaIn nuevo nivel de batería
     */
    public void setBateria(int bateriaIn) {
        this.bateria = bateriaIn;
    }

    /**
     * Setter -> Telefono
     *
     * @param llamadasIn nueva cantidad de llamadas
     */
    public void setLlamadas(int llamadasIn) {
        this.llamadas = llamadasIn;
    }

    /**
     * Setter -> Telefono
     *
     * @param llamadasTotalesIn nueva total de llamadas
     */
    public static void setLlamadasTotales(int llamadasTotalesIn) {
        Telefono.llamadasTotales = llamadasTotalesIn;
    }

    /**
     * Setter -> Telefono
     *
     * @param linternaIn objeto Linterna, sistema de conexión
     */
    public void setLinterna(Linterna linternaIn) {
        this.linterna = linternaIn;
    }
}
