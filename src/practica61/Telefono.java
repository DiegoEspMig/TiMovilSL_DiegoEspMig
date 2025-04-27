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
     * c�digo de seguridad de 8 d�gitos
     */
    private final String PUK;
    /**
     * coste de dispositivo seg�n la marca
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
     * n�mero de llamadas realizadas
     */
    private int llamadas;
    /**
     * recuento global de llamadas de todos los tel�fonos
     */
    private static int llamadasTotales;
    /**
     * accesorio externo que se podr� conectar
     */
    private Linterna linterna;

    /**
     * Constructor -> Telefono
     *
     * @param colorIn color del dispositivo elegido por el usuario
     * @param precioIn coste de dispositivo seg�n la marca
     */
    public Telefono(String colorIn, double precioIn) {
        this.COLOR = colorIn;
        this.PUK = "" + (int) Math.floor(Math.random() * 100000000);
        this.PRECIO = precioIn;
        this.llamadas = 0;
        this.bateria = 0;
    }

    /**
     * Este m�todo es la forma g�nerica de llamar
     */
    public void llamar() {
        System.out.println("Piiii, piiiii...");
        this.esperar(3);
        System.out.println("---**CONVERSACI�N PRIVADA**---");
        this.esperar(2);
        System.out.println("pi pi pi, pi pi pi, ...");
        this.setLlamadas(this.getLlamadas() + 1);
        Telefono.setLlamadasTotales(Telefono.getLlamadasTotales() + 1); //
        // this.llamadas = this.llamadas + 1;
    }

    /**
     * Este m�todo sirve para esperar
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
     * Este m�todo ser� la forma de cargar en las subclases
     */
    public abstract void cargar();

    /**
     * Getter -> Telefono
     *
     * @return n�mero de seguridad
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
     * @return n�mero de llamadas hasta el momento
     */
    public int getLlamadas() {
        return llamadas;
    }

    /**
     * Getter -> Telefono
     *
     * @return n�mero de llamadas de todos los tel�fonos
     */
    public static int getLlamadasTotales() {
        return llamadasTotales;
    }

    /**
     * Getter -> Telefono
     *
     * @return obtiene la direcci�n de memoria del objeto linterna para
     * interactuar con el
     */
    public Linterna getLinterna() {
        return linterna;
    }

    /**
     * Setter -> Telefono
     *
     * @param bateriaIn nuevo nivel de bater�a
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
     * @param linternaIn objeto Linterna, sistema de conexi�n
     */
    public void setLinterna(Linterna linternaIn) {
        this.linterna = linternaIn;
    }
}
