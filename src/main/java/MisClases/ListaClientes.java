
package MisClases;

import java.util.Vector;


public class ListaClientes {
     private static Vector datos = new Vector();
    
    public static void agregar(Object obj){
        datos.addElement(obj);
    }
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
    }
    
    public static Vector consultar(){
        return datos;
    }     
}
