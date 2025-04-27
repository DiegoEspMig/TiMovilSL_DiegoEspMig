/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica61;

/**
 * Enunciado: Clase principal para pruebas del software y realizacion de pruebas unitarias
 *
 * @version 2.1.1
 * @author DiegoEspMig
 * @see 
 * <a href="https://view.genially.com/61db2aae8502620dee9f665c">Documentación Teórica</a>
 */
public class Practica61 {

    public static void main(String[] args) {
        /*
        Modelos de ejemplo: iphone verde, android azul
         */
        Pijiphone iphone = new Pijiphone("Verde");
        Android android = new Android("Azul");
        Linterna linterna = new Linterna();

        System.out.println("\nDatos de los teléfonos\n");
        System.out.println(iphone);
        System.out.println(android);

        System.out.println("\nLlamada del iphone\n");
        iphone.llamar();
        System.out.println("\nLlamada del android\n");
        android.llamar();

        System.out.println("\nTotal de Llamadas: " + Telefono.getLlamadasTotales() + "\n");

        System.out.println("\nDatos de los teléfonos\n");
        System.out.println(iphone);
        System.out.println(android);

        android.setLinterna(linterna);
        System.out.println("\nEsta es la linterna conectada al android\n");
        android.getLinterna().encender();
        android.getLinterna().apagar();
        //quitamos la linetrna del android
        android.setLinterna(null);
        System.out.println("\nLinterna desconectada!");
        iphone.setLinterna(linterna);
        System.out.println("\nEsta es la linterna conectada al iphone\n");
        iphone.getLinterna().encender();
        iphone.getLinterna().apagar();
        //quitamos la linetrna del iphone
        iphone.setLinterna(null);

        System.out.println("\nBusqueda del iphone\n");
        iphone.getGps().actualizarUbicacion();

        System.out.println("\nPintando en android\n");
        android.pintar();

        System.out.println("\nDatos de los teléfonos\n");
        System.out.println(iphone);
        System.out.println(android);

        System.out.println("\nPrueba de carga del iphone\n");
        iphone.cargar();
        iphone.cargar();
        System.out.println("\nPrueba de carga del android\n");
        android.cargar();
        android.cargar();

        System.out.println("\nDatos de los teléfonos\n");
        System.out.println(iphone);
        System.out.println(android);

    }

}
