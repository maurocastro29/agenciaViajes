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
public class Premium extends Paquete{
    private int valor;

    public Premium(int valor, Destino destinos) {
        super(destinos);
        this.valor = valor;
    }
    
    /*
    public Premium(ArrayList<Destino> listaDestinos) {
        super(listaDestinos);
        valor = calcularValor();
    }
*/
    public int getValor() {
        return valor;
    }/*
    public int calcularValor(){
        int precioNoche = 0;
        int precioTotal = 0;
        ArrayList<Destino> lista = super.getListaDestinos();
        for(int i=0;i<lista.size();i++){
            precioNoche = Integer.parseInt(lista.get(i).getValorDia());
            precioTotal += precioNoche;
        }
        return precioTotal;
    }*/
}
