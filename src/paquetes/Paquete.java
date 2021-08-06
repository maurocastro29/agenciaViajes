/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes;

import destinos.Destino;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Paquete {
    private Destino destinos;

    public Paquete(Destino destinos) {
        this.destinos = destinos;
    }

    public Destino getDestinos() {
        return destinos;
    }

    public void setDestinos(Destino destinos) {
        this.destinos = destinos;
    }

    
    
}
