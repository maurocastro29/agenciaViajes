/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class FuncionesClientes {
    
    public FuncionesClientes(){
        
    }
    
    public void guardarDatosArchivo(Cliente cliente){
        try{
            FileWriter fw = new FileWriter("clientes.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(cliente.getCedula());
            pw.print("|"+cliente.getNombre());
            pw.print("|"+cliente.getSexo());
            pw.print("|"+cliente.getEdad());
            pw.print("|"+cliente.getCorreo()+"\n");
            pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public DefaultTableModel llenarTablaClientes(){
        Vector cabecera = new Vector();
        cabecera.addElement("Cedula");
        cabecera.addElement("Nombre");
        cabecera.addElement("Sexo");
        cabecera.addElement("Edad");
        cabecera.addElement("Correo");
        DefaultTableModel tableClientes = new DefaultTableModel(cabecera, 0);
        try{
            FileReader fr = new FileReader("clientes.txt");
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
    
    public void eliminar(){
        ArrayList<Cliente> lista = listaClientes();
        for(int i=0;i<lista.size();i++){
            JOptionPane.showMessageDialog(null, lista.get(i).getCedula());
        }
    }
    
    
    public ArrayList<Cliente> listaClientes(){
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try{
            FileReader fr = new FileReader("clientes.txt");
            BufferedReader br = new BufferedReader(fr);
            String d = null;
            int i=0;
            Cliente c = new Cliente();
            while((d = br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
        //        Vector x = new Vector();
        //        i=0;
                
                c.setCedula(dato.nextToken());
                c.setNombre(dato.nextToken());
                c.setSexo(dato.nextToken());
                c.setEdad(dato.nextToken());
                c.setCorreo(dato.nextToken());
                /*
                while(dato.hasMoreTokens()){
                    switch(i){
                        case 0:{
                            
                            c.setCedula(dato.nextToken());
                            break;
                        }
                        case 1:{
                            c.setNombre(dato.nextToken());
                            break;
                        }
                        case 2:{
                            c.setSexo(dato.nextToken());
                            break;
                        }
                        case 3:{
                            c.setEdad(dato.nextToken());
                            break;
                        }
                        case 4:{
                            c.setCorreo(dato.nextToken());
                            break;
                        }
                    }
        //            x.addElement(dato.nextToken());
                }*/
                lista.add(i, c);
                i++;
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FuncionesClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
