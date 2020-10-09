/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author job
 */
public class CorteDAO {

    Conexion SQL = new Conexion();
    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    int idUsuario = UsuarioDAO.getIdUsuario();

    public String[] getDatosPorDia() {
        String info[] = new String[6];
        try {
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();

            ResultSet datos = s.executeQuery("SELECT sum(monto) as dineroCaja FROM `Movimientos_extras`"
                    + " WHERE tipo = 'efectivo_inicial' and revisado = false and idUsuario=" + idUsuario + " and fecha = '" + formatoFecha.format(d) + "'");
            //ventas select sum(importe) as Ventas from ventas where idUsuario = 1 and revisada = false and fecha = "2020-07-28"
            datos.next();
            info[0] = datos.getString("dineroCaja");

            ResultSet ventasYcosto = s.executeQuery("select sum(importe) as ventas, sum(precioCosto*cantidad) as costo from ventas where idUsuario = " + idUsuario
                    + " and revisada = false and devocompleta = false and fecha = '" + formatoFecha.format(d) + "'");

            ventasYcosto.last();

            info[1] = ventasYcosto.getString("ventas");
            info[2] = ventasYcosto.getString("costo");

            ResultSet entradas = s.executeQuery("SELECT sum(monto) as entradas FROM `Movimientos_extras` WHERE tipo = 'entrada_efectivo' and revisado = false and idUsuario= " + idUsuario
                    + " and fecha = '" + formatoFecha.format(d) + "'");

            entradas.next();
            info[3] = entradas.getString("entradas");

            ResultSet salidas = s.executeQuery("SELECT sum(monto) as salidas FROM `Movimientos_extras` WHERE tipo = 'salida_efectivo' and revisado = false and idUsuario= " + idUsuario
                    + " and fecha = '" + formatoFecha.format(d) + "'");

         
            salidas.next();
            info[4] = salidas.getString("salidas");

            ResultSet devolucion = s.executeQuery("SELECT sum(importe) as devolucion FROM `Ventas` where  revisada = false and devolucion = true and devocompleta = true and fecha = '"
                    + formatoFecha.format(d) + "'");
            devolucion.next();
            String dt1 = devolucion.getString("devolucion");
            if (dt1 == null) {
                dt1 = "0";
            }
            double d1 = Double.parseDouble(dt1);

            ResultSet devolucion2 = s.executeQuery("SELECT sum(monto) as devolucion FROM `Movimientos_extras` WHERE tipo = 'devolución' and revisado = false and  fecha = '" + formatoFecha.format(d) + "'");
            devolucion2.next();
            String dt2 = devolucion2.getString("devolucion");
            if (dt2 == null) {
                dt2 = "0.0";
            }
            d1 = d1 + Double.parseDouble(dt2);
            info[5] = d1 + "";

            for (int i = 0; i < info.length; i++) {
                System.out.println(info[i]);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

        return info;

    }

}
