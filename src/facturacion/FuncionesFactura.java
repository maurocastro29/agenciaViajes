/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clientes.FuncionesClientes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import reservas.Reserva;

/**
 *
 * @author 
 */
public class FuncionesFactura {
    public void guardarDatosArchivo(Reserva reserva){
        try{
            FileWriter fw = new FileWriter("facturas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(reserva.getIdReserva());
            pw.print("|"+reserva.getCedula());
            pw.print("|"+reserva.getNombreCliente());
            pw.print("|"+reserva.getTipoPaquete());
            pw.print("|"+reserva.getValor()+"\n");
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel llenarTablaFacturas(){
        Vector cabecera = new Vector();
        cabecera.addElement("ID reserva");
        cabecera.addElement("Cedula");
        cabecera.addElement("Nombre");
        cabecera.addElement("Tipo paquete");
        cabecera.addElement("Valor");
        DefaultTableModel tableClientes = new DefaultTableModel(cabecera, 0);
        try{
            FileReader fr = new FileReader("facturas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d = null;
            while((d = br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                tableClientes.addRow(x);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FuncionesClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tableClientes;
    }
}
