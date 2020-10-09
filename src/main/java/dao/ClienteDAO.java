/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import MisClases.Cliente;
import MisClases.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author job
 */
public class ClienteDAO {
    Conexion SQL = new Conexion();
     BitacoraDAO bita = new BitacoraDAO();
      public void almacena( String [] a) throws ClassNotFoundException, SQLException {
        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        int rs = s.executeUpdate("INSERT INTO `Cliente`(`nombre`, `direccion`, `telefono`, `limiteCredito`, `eliminado`) "
                + "VALUES ('" + a[0] + "','" + a[1]+ "','" + a[2] + "','" + a[3] + "', false)");
        
      String mensajeBita ="Registro al cliente " + a[0];
            bita.registrarBitacora(mensajeBita);
        System.out.println("imprime");
    }
      
         public ArrayList<Cliente> getClientes() throws ClassNotFoundException, SQLException {

        ArrayList<Cliente> listado = new ArrayList<Cliente>();
        
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("Select * from cliente where eliminado = false");

            while (res.next()) {

                Cliente cli = new Cliente();
                cli.setId(res.getString(1));
                cli.setNombres(res.getString(2));
                cli.setDireccion(res.getString(3));
                cli.setTelefono(res.getString(4));
                cli.setLimiteCredito(res.getString(5));

                listado.add(cli);

            
        }

        return listado;
    }
         
         public void modificarDatosCliente(Cliente c){
          try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String update ="UPDATE `Cliente` SET `nombre`='"+c.getNombres()+"',`direccion`='"+c.getDireccion()+"',`telefono`='"+c.getTelefono()+"',`limiteCredito`="+c.getLimiteCredito()+" WHERE idCliente = "+ c.getId();
            
            boolean modificar = s.execute(update);

            JOptionPane.showMessageDialog(null, "Datos del cliente modificados");
              String mensajeBita ="Modificó los datos del cliente " + c.getNombres();
            bita.registrarBitacora(mensajeBita);
        } catch (Exception e) {

        }
         }
         
         public void eliminarDatosCliente(Cliente c){
          try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String update ="UPDATE `Cliente` SET `eliminado`= true WHERE idCliente = "+ c.getId();
            boolean modificar = s.execute(update);
            JOptionPane.showMessageDialog(null, "Datos del cliente eliminados");
              String mensajeBita ="Elimino los datos del cliente " + c.getNombres();
            bita.registrarBitacora(mensajeBita);
        } catch (Exception e) {

        }
         }
}
