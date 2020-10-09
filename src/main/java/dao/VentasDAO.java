package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentasDAO {

    Conexion SQL = new Conexion();
    DefaultTableModel tm;
    TicketDAO ticket = new TicketDAO();
    Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    int idUsuario;
    BitacoraDAO bita = new BitacoraDAO();

    public void registrarVenta(DefaultTableModel md) throws ClassNotFoundException {
        Connection conexion = SQL.conectarMySQL();
        tm = md;
        int i = 0;
        idUsuario = UsuarioDAO.getIdUsuario();
        int numTic = ticket.getNumero();
        try {

            Statement s = conexion.createStatement();
            conexion.setAutoCommit(false);
            String insert = "INSERT INTO `Ventas`(`idTicket`, `nombre`, `precioCosto`, `precioVenta`, `cantidad`, `importe`, `fecha`, `hora`, `idUsuario`, `mayoreo`, `codigo`)";

            while (i < md.getRowCount()) {
                double cantidad = Double.parseDouble(md.getValueAt(i, 3) + "");
                double precioVenta = Double.parseDouble(md.getValueAt(i, 2) + "");
                double total = cantidad * precioVenta;
                double existencia = Double.parseDouble(md.getValueAt(i, 5) + "");
                String codigo = (String) md.getValueAt(i, 0);
                double totalExistencia = existencia - cantidad;
                System.out.println("Total existencia = " + totalExistencia + ", Existencia =  " + existencia + " cantidad = " + cantidad);
                String value = " VALUES (" + numTic + ",'" + md.getValueAt(i, 1) + "'," + md.getValueAt(i, 6) + "," + precioVenta + "," + cantidad + "," + total + ",'" + formatoFecha.format(d)
                        + "','" + formatoHora.format(d) + "'," + idUsuario + ",'NO','" + codigo + "')";
                s.executeUpdate(insert + value);
                s.executeUpdate("UPDATE `Producto` SET `cantidad`=" + totalExistencia + "  WHERE codigo = '" + codigo + "'");
                System.out.println("UPDATE `Producto` SET `cantidad`=" + totalExistencia + "  WHERE codigo = '" + codigo + "'");
                System.out.println(insert + value);
                i++;
            }
            conexion.commit();

            ticket.sumarTicket();
            JOptionPane.showMessageDialog(null, "Venta registrada con exito");
            String mensajeBita = "Venta registrada";
            bita.registrarBitacora(mensajeBita);
        } catch (SQLException e) {
            if (conexion != null) {

                try {
                    conexion.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }
    
    public double getVentasPorProducto(String codigo,String mes, String ano){
    double cantidad = 0;
         try {

        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        String sql = "select sum(cantidad) cantidad from ventas where codigo = '"+codigo+"' and MONTH(fecha) ="+ mes +" and YEAR(fecha) = "+ano+" and devocompleta = false";
       ResultSet datos = s.executeQuery(sql);
       datos.next();
       if(datos.getString("cantidad").equalsIgnoreCase("null")){
       
       }else{
       cantidad = Double.parseDouble(datos.getString("cantidad"));
       }
         }catch (Exception e) {

        }
         
         return cantidad;
         }

    public ResultSet consultarVentasPorFecha(int tipoBusqueda) {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            if (tipoBusqueda == 1) {
                sql = "select codigo,nombre,cantidad,precioVenta,fecha,hora from ventas where fecha = '" + formatoFecha.format(d) + "'";
            }
            if (tipoBusqueda == 2) {
                sql = "select codigo,nombre,cantidad,precioVenta,fecha,hora from ventas where fecha = Date_format(DATE_SUB(NOW(),INTERVAL 1 DAY),'%Y-%m-%d')";
            }
            if (tipoBusqueda == 3) {
                sql = "select codigo,nombre,cantidad,precioVenta,fecha,hora from ventas where fecha >= Date_format(DATE_SUB(NOW(),INTERVAL 7 DAY),'%Y-%m-%d') && fecha <= '" + formatoFecha.format(d) + "'";
            }
            if (tipoBusqueda == 4) {
                sql = "select codigo,nombre,cantidad,precioVenta,fecha,hora from ventas where fecha >= Date_format(DATE_SUB(NOW(),INTERVAL 1 MONTH),'%Y-%m-%d') && fecha <= '" + formatoFecha.format(d) + "'";
            }
            datos = s.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;
    }

    public ResultSet consultarVentasPorFechaPorLapsosDeTiempo(Date inicio, Date fin) {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            sql = "select codigo,nombre,cantidad,precioVenta,fecha,hora from ventas where fecha >= '" + formatoFecha.format(inicio) + "' && fecha <= '" + formatoFecha.format(fin) + "'";
            datos = s.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;
    }

    public ResultSet getGananciasGraficaDeBarras() {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            sql = "SELECT sum(importe) as ventas,sum(precioCosto*cantidad) as costo, (sum(importe)-sum((precioCosto*cantidad))) as ganancia , "
                    + "fecha, (ELT(WEEKDAY(fecha) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo')) AS DIA_SEMANA\n"
                    + "FROM ventas where WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) group by fecha";
            datos = s.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;

    }

    public ResultSet getNumeroVentasGragicaDePastel() {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            sql = "SELECT SUM(cantidad) as cantidad,nombre FROM ventas WHERE WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) group by nombre";
            datos = s.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;
    }

    public ResultSet getDatosReporteVentas() {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql, sql2 = "";

            sql = "SELECT SUM(importe) as ventas,sum(precioCosto*cantidad) as costo,sum(cantidad) as numeroVentas, (ELT(WEEKDAY(fecha) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes',"
                    + " 'Sabado', 'Domingo')) AS DIA_SEMANA FROM ventas WHERE WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) and devocompleta = false group by fecha order by fecha ";
            datos = s.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;

    }

    public double getDevolucionPorSemana() {
        ResultSet datos = null;
        ResultSet datos2 = null;
        try {

            double total = 0;
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql, sql2 = "";
            sql = "SELECT SUM(monto) as devoluciones FROM Movimientos_extras WHERE WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) and tipo = 'devolución'";
            sql2 = "SELECT SUM(importe) as devoluciones FROM ventas WHERE WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) and devocompleta = true";
            datos = s.executeQuery(sql);

            datos.next();
            String d1 = datos.getString("devoluciones");
            if(d1 == null){
                d1 = "0.0";}
            datos2 = s.executeQuery(sql2);
            datos2.next();
            String d2 = datos2.getString("devoluciones");
            if(d2 == null){
                d2 = "0.0";}
            System.out.println("Esto tiene " + d1 +" "+ d2);
            return Double.parseDouble(d1) + Double.parseDouble(d2);

        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ResultSet getVentasPorTicket(String idTicket,String fecha, String hora) {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql = "";

            sql = "SELECT idVenta,codigo,nombre,cantidad,importe FROM `Ventas` WHERE idTicket = " + idTicket + " and fecha = '"+fecha+"' and hora='"+ hora +"' and devocompleta = false ";
            datos = s.executeQuery(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;

    }

    public ResultSet getDatosReporteVentasPorSemana() {
        ResultSet datos = null;

        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            String sql, sql2 = "";

            sql = "SELECT SUM(importe) as ventas,sum(precioCosto*cantidad) as costo,sum(cantidad) as numeroVentas, (ELT(WEEKDAY(fecha) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes',"
                    + " 'Sabado', 'Domingo')) AS DIA_SEMANA FROM ventas WHERE WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) group by fecha order by fecha ";
            datos = s.executeQuery(sql);
            //   sql2="SELECT SUM(monto) as devoluciones, (ELT(WEEKDAY(fecha) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes','Sabado', 'Domingo')) AS DIA_SEMANA FROM Movimientos_extras WHERE WEEKOFYEAR(fecha)=WEEKOFYEAR(NOW()) and tipo = 'devolución' group by fecha order by fecha";
            System.out.println(sql);
        } catch (Exception e) {

        }

        return datos;

    }

}
