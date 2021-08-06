/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destinos;

import clientes.Cliente;
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

/**
 *
 * @author 
 */
public class FuncionesDestino {
    public void guardarDatosArchivo(Destino destino){
        try{
            FileWriter fw = new FileWriter("destinos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(destino.getNombre());
            pw.print("|"+destino.getCiudad());
            pw.print("|"+destino.getDireccion());
            pw.print("|"+destino.getValorDia()+"\n");
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel llenarTablaDestinos(){
        Vector cabecera = new Vector();
        cabecera.addElement("Ciudad");
        cabecera.addElement("Nombre");
        cabecera.addElement("Direccion");
        cabecera.addElement("Valor");
        DefaultTableModel tableClientes = new DefaultTableModel(cabecera, 0);
        try{
            FileReader fr = new FileReader("destinos.txt");
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
