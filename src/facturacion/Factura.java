/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author
 */
public class Factura {
    private String idFactura;
    private String valorFactura;
    private String valorReserva;
    private String cargosExtras;
    private String cedulaCliente;
    private String nombreCliente;
    private String fechaFactura;
    private String tipoReserva;

    public Factura(String idFactura, String valorFactura, String valorReserva, String cargosExtras, String cedulaCliente, String nombreCliente, String fechaFactura, String tipoReserva) {
        this.idFactura = idFactura;
        this.valorFactura = valorFactura;
        this.valorReserva = valorReserva;
        this.cargosExtras = cargosExtras;
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.fechaFactura = fechaFactura;
        this.tipoReserva = tipoReserva;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(String valorFactura) {
        this.valorFactura = valorFactura;
    }

    public String getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(String valorReserva) {
        this.valorReserva = valorReserva;
    }

    public String getCargosExtras() {
        return cargosExtras;
    }

    public void setCargosExtras(String cargosExtras) {
        this.cargosExtras = cargosExtras;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }
    
    
}
