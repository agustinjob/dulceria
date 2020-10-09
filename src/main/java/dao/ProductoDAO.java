/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import MisClases.Producto;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author job
 */
public class ProductoDAO {

    Conexion SQL = new Conexion();
    
 BitacoraDAO bita = new BitacoraDAO();
 Movimientos mov = new Movimientos();
    

    public void almacena(String[] a) throws ClassNotFoundException, SQLException {

        Connection conn = SQL.conectarMySQL();
        Statement s = conn.createStatement();
        Statement s2 = conn.createStatement();

        ResultSet res = s2.executeQuery("Select * from producto where descripcion='" + a[1] + "' || codigo = '" + a[0] + "' && eliminado = false");
        res.last();
        if (res.getRow() == 0) {

            int rs = s.executeUpdate("INSERT INTO `Producto`(`codigo`, `descripcion`, `precioCosto`, `precioVenta`, `precioMayoreo`, `cantidad`, `inventarioMinimo`, `eliminado`)"
                    + "VALUES ('" + a[0] + "','" + a[1] + "'," + a[2] + "," + a[3] + "," + a[4] + "," + a[5] + "," + a[6] + ", false)");
            JOptionPane.showMessageDialog(null, "Producto agregado", "Información", HEIGHT);
              String mensajeBita ="Registró el producto "+ a[1];
            bita.registrarBitacora(mensajeBita);
            mov.registrarEfectivoInicial(a[5], "registro_producto", a[0]);
            
        } else {

            JOptionPane.showMessageDialog(null, "Ese producto ya esta registrado en la base de datos");

        }

        //       System.out.println("INSERT INTO `Producto`(`codigo`, `descripcion`, `precioCosto`, `precioVenta`, `precioMayoreo`, `cantidad`, `inventarioMinimo` )"
        //             + "VALUES ('" + a[0] + "','" + a[1] + "'," + a[2] + "," + a[3] + "," + a[4] + "," + a[5] + "," + a[6] + ")");
    }

    public ArrayList<Producto> obtenerProductosSiHuboModificacion(ArrayList<Producto> l, boolean bandera) throws ClassNotFoundException, SQLException {

        ArrayList<Producto> listado = l;
        if (bandera == true) {
            listado = new ArrayList<>();
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            ResultSet res = s.executeQuery("Select * from producto where eliminado = false order by descripcion");

            while (res.next()) {

                Producto pro = new Producto();
                pro.setIdProducto(res.getInt(1));
                pro.setCodigo(res.getString(2));
                pro.setNombre(res.getString(3));
                pro.setpCosto(res.getDouble(4));
                pro.setpVenta(res.getDouble(5));
                pro.setpMayoreo(res.getDouble(6));
                pro.setInvMinimo(res.getInt(8));
                pro.setCantidad(res.getDouble(7));
            //    System.out.println("Codigo: " + pro.getCodigo() + " Nombre: " +pro.getNombre());

                listado.add(pro);

            }
        }

        return listado;
    }

    public String getProductoPorTipoPrecio(String nombre, ArrayList<Producto> lista, int tipo) {

        Producto p = new Producto();
        String produ = "";
        int i = 0;
        //tipo = 1 por precioVenta
        //tipo = 2 por precioMayoreo

        while (lista.size() > i) {

            if (lista.get(i).getCodigo().equalsIgnoreCase(nombre)) {
                p = lista.get(i);
                if (tipo == 1) {

                    produ = p.getpVenta() + "";
                } else {

                    produ = p.getpMayoreo() + "";
                }
                break;
            }
            i++;
        }

        return produ;
    }

    public Producto getDatosProducto(String nombre, ArrayList<Producto> lista) {
        int i = 0;
        Producto p = new Producto();
        p.setNombre("");
        //  System.out.println("Tamano lista =" + lista.size());
        while (lista.size() > i) {

            if (lista.get(i).getNombre().equalsIgnoreCase(nombre) || lista.get(i).getCodigo().equalsIgnoreCase(nombre)) {

                p = lista.get(i);
                System.out.println("Cantidad del buscado "+ p.getCantidad());
            }
            i++;
        }

        return p;
    }

    public String[] getProductoPorNombre(String nombre, ArrayList<Producto> lista, int tipo, int tipoPrecio) {
        Producto p = new Producto();
        String produ[] = new String[7];
        int i = 0;
        //tipo = 1 por nombre
        //tipo = 2 por codigo
        if (tipo == 1) {
            while (lista.size() > i) {
                    //System.out.println(lista.get(i).getNombre());
                if (lista.get(i).getNombre().trim().equalsIgnoreCase(nombre) || lista.get(i).getCodigo().trim().equalsIgnoreCase(nombre)) {
                    p = lista.get(i);
                    produ[0] = p.getCodigo();
                    produ[1] = p.getNombre();
                    produ[3] = "1";
                    produ[5] = "" + p.getCantidad();
                    produ[6] = "" + p.getpCosto();
                    if (tipoPrecio == 1) {
                        produ[2] = "" + p.getpVenta();
                        produ[4] = "" + p.getpVenta();
                    } else {
                        produ[2] = "" + p.getpMayoreo();
                        produ[4] = "" + p.getpMayoreo();

                    }

                    break;
                }
                i++;
            }

        } else {
            while (lista.size() > i) {

                if (lista.get(i).getCodigo().equalsIgnoreCase(nombre)) {
                    p = lista.get(i);
                    System.out.println(p.getNombre());
                    produ[0] = p.getCodigo();
                    produ[1] = p.getNombre();
                    produ[3] = "1";
                    produ[5] = "" + p.getCantidad();
                    produ[6] = "" + p.getpCosto();
                    if (tipoPrecio == 1) {
                        produ[2] = "" + p.getpVenta();
                        produ[4] = "" + p.getpVenta();
                    } else {
                        produ[2] = "" + p.getpMayoreo();
                        produ[4] = "" + p.getpMayoreo();

                    }

                    break;
                }
                i++;
            }
        }

        return produ;
    }

    public void modificarDatosProducto(Producto p, String codigoAnt) {
     

        try {
            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            int modificar = s.executeUpdate("UPDATE `Producto` SET `codigo`='"+p.getCodigo()+"' , `descripcion`='" + p.getNombre() + "'"
                    + ",`precioCosto`=" + p.getpCosto() + ",`precioVenta`=" + p.getpVenta() + ",`precioMayoreo`=" + p.getpMayoreo() + ",`cantidad`=" + p.getCantidad() + ",`inventarioMinimo`=" + p.getInvMinimo() + ",`eliminado`=false WHERE codigo ='" + codigoAnt + "' ");
          System.out.println("UPDATE `Producto` SET `codigo`='"+p.getCodigo()+"' , `descripcion`='" + p.getNombre() + "'"
                    + ",`precioCosto`=" + p.getpCosto() + ",`precioVenta`=" + p.getpVenta() + ",`precioMayoreo`=" + p.getpMayoreo() + ",`cantidad`=" + p.getCantidad() + ",`inventarioMinimo`=" + p.getInvMinimo() + ",`eliminado`=false WHERE codigo ='" + codigoAnt + "' ");
            JOptionPane.showMessageDialog(null, "Datos del producto modificados");
            String mensajeBita ="Modificó los datos del producto "+ p.getNombre();
            bita.registrarBitacora(mensajeBita);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"RES= " + ex.getLocalizedMessage());
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    public void eliminarProducto(Producto p) {
        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            boolean modificar = s.execute("UPDATE `Producto` SET `eliminado`= true WHERE codigo ='" + p.getCodigo() + "' ");
            System.out.println("Estatus eliminacion " + modificar);

            JOptionPane.showMessageDialog(null, "Datos del producto eliminados");
              String mensajeBita ="Eliminó los datos del producto "+ p.getNombre();
            bita.registrarBitacora(mensajeBita);
        } catch (Exception e) {

        }
    }

    
    public void transferir(Producto transformar, Producto agregar, double ct , double ca) throws ClassNotFoundException{
          Connection conexion = SQL.conectarMySQL();
        try {
          
             Statement s = conexion.createStatement();
            conexion.setAutoCommit(false);
            double totalDisminuir=transformar.getCantidad() - ct;
            double totalAgregar=agregar.getCantidad() + ca;
            String disminuir = "UPDATE `Producto` SET `cantidad`= "+totalDisminuir+" WHERE codigo ='" + transformar.getCodigo() + "'";
            String sumar = "UPDATE `Producto` SET `cantidad`= "+totalAgregar+" WHERE codigo ='" + agregar.getCodigo() + "'";
            
            s.executeUpdate(sumar);
            s.executeUpdate(disminuir);
            conexion.commit();
            
            JOptionPane.showMessageDialog(null,"Transacción realizada exitosamente");
              String mensajeBita ="Se realizó una transferencia del producto " + transformar.getNombre() + "en varios del producto " + agregar.getNombre();
            bita.registrarBitacora(mensajeBita);
        } catch (SQLException ex) {
            if (conexion != null) {

                try {
                    conexion.rollback();
                      JOptionPane.showMessageDialog(null,"A ocurrido un error vuelve a intentarlo");
                } catch (SQLException exs) {
                    System.out.println(exs.toString());
                }
            }
        }
        
    }
    
    
      public void agregarInventarioProducto(double cantidad, String codigo,String agregar) {
        try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            boolean modificar = s.execute("UPDATE `Producto` SET `cantidad`=" + cantidad + " WHERE codigo ='" + codigo + "' ");

            JOptionPane.showMessageDialog(null, "Inventario agregado");
            mov.registrarEfectivoInicial(agregar+"", "registro_producto", codigo);
              String mensajeBita ="Agregó inventario al producto con código " + codigo ;
            bita.registrarBitacora(mensajeBita);
        } catch (Exception e) {

        }
         }
      
        public ResultSet productosBajoInventario(){
         try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            
            ResultSet datos = s.executeQuery("SELECT * FROM `Producto` WHERE cantidad <= inventarioMinimo && eliminado = false");

             return datos;
        } catch (Exception e) {

        }
            
           return null;
        }
        
    public ResultSet productosUtilidad(){
         try {

            Connection conn = SQL.conectarMySQL();
            Statement s = conn.createStatement();
            
            ResultSet datos = s.executeQuery("SELECT codigo,descripcion,cantidad,precioCosto,precioVenta,TRUNCATE ((precioVenta-precioCosto),2) as utilidad,"
                    + " (precioCosto*cantidad) as precioCostoTotal, (precioVenta*cantidad) as precioVentaTotal,TRUNCATE(((precioVenta*cantidad) - (precioCosto*cantidad)),2) as "
                    + "utilidadTotal  FROM `Producto` where eliminado = false;");

             return datos;
        } catch (Exception e) {

        }
            
           return null;
        }
    
}
