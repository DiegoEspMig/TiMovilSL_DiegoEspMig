/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica61;

/**
 *
 * @version 1.1.0
 * @author DiegoEspMig
 */
public class Gps {

    private String ubicacion;

    public void actualizarUbicacion() {
        String ubiAux = "";
        //se calcula de manera aleatoria una cordenada vertical
        //si es positva hemisferio norte, si es negativa hemisferio sur
        double latitud = Math.random() * (90 - (-90)) - 90;
        latitud = Math.round(latitud * 100.0) / 100.0;
        if (latitud < 0) {
            ubiAux = Math.abs(latitud) + "º S";
        } else {
            ubiAux = Math.abs(latitud) + "º N";
        }
        //se calcula de manera aleatoria una cordenada horizontal
        //si es positva este y si es negativa al oeste del meridiano de Greenwich
        double longitud = Math.random() * (180 - (-180)) - 180;
        longitud = Math.round(longitud * 100.0) / 100.0;
        if (longitud < 0) {
            ubiAux += ", " + Math.abs(longitud) + "º W";
        } else {
            ubiAux += ", " + Math.abs(longitud) + "º E";
        }
        setUbicacion(ubiAux);
        System.out.println("La nueva ubicacion es: " + getUbicacion());
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacionIn) {
        this.ubicacion = ubicacionIn;
    }

}
