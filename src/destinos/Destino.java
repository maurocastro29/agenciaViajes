/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destinos;

/**
 *
 * @author
 */
public class Destino {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String valorDia;

    public Destino(String nombre, String ciudad, String direccion, String valorDia) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.valorDia = valorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getValorDia() {
        return valorDia;
    }

    public void setValorDia(String valorDia) {
        this.valorDia = valorDia;
    }
}
