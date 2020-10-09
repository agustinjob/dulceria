/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import dao.ProductoDAO;
import dao.VentasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author agus_
 */
public class Pruebas {
    public static void main(String [] Job) throws ClassNotFoundException, SQLException{
  //  ProductoDAO obj = new ProductoDAO();
 //   ArrayList<Producto> p = new ArrayList();
//ArrayList<Producto> r = obj.obtenerProductosSiHuboModificacion(p, true);

//System.out.println("Nombre" + r.get(0).getNombre());
VentasDAO ven = new VentasDAO();
double p =ven.getVentasPorProducto("123", "08", "2020");
System.out.println(p);
    }
    
}
