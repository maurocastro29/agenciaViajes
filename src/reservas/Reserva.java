/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservas;

/**
 *
 * @author 
 */
public class Reserva {
    private String idReserva;
    private String cedula;
    private String nombreCliente;
    private String tipoPaquete;
    private String valor;

    public Reserva(String idReserva, String cedula, String nombreCliente, String tipoPaquete, String valor) {
        this.idReserva = idReserva;
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.tipoPaquete = tipoPaquete;
        this.valor = valor;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
