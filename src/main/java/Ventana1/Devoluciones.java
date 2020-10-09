
package Ventana1;

import dao.TicketDAO;
import dao.VentasDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Devoluciones extends javax.swing.JFrame {
 Date d = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    TicketDAO t = new TicketDAO();
    VentasDAO v = new VentasDAO();
    String idTicket = "";
    Ventana3 ven;
 
    public Devoluciones(Ventana3 ven) {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon a = new ImageIcon("iconos/search.png");
        btnbuscar.setIcon(a);
        panelVentas.setVisible(false);
        seleccionaFecha.setDate(d);
        txtOcultar.setVisible(false);
        this.ven = ven;
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        seleccionaFecha = new com.toedter.calendar.JDateChooser();
        btnbuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTickets = new javax.swing.JTable();
        panelVentas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        txtOcultar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Devoluciones");

        seleccionaFecha.setBackground(new java.awt.Color(0, 0, 102));
        seleccionaFecha.setForeground(new java.awt.Color(255, 255, 255));
        seleccionaFecha.setDateFormatString("yyyy-MM-dd");
        seleccionaFecha.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        seleccionaFecha.setPreferredSize(new java.awt.Dimension(170, 35));

        btnbuscar.setBackground(new java.awt.Color(0, 0, 102));
        btnbuscar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(null);
        btnbuscar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Devolver todo");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaTickets.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaTickets.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tablaTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket", "Fecha", "Hora"
            }
        ));
        tablaTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventoClickTablaTickets(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTickets);

        tablaVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaVentas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Monto"
            }
        ));
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolverCantidadDeArticulos(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentas);

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        txtOcultar.setText("Selecciona el articulo que quieres devolver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(seleccionaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOcultar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOcultar))
                    .addComponent(seleccionaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(375, 375, 375))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     int row= tablaTickets.getSelectedRow();
     if(row<0){
     JOptionPane.showMessageDialog(null, "Selecciona un ticket");
     }else{
        String id =(String) tablaTickets.getValueAt(row, 0);
     
      TicketDevolverTodo obj=new TicketDevolverTodo(id,this,ven);
      obj.setVisible(true);
     
     }
      
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        
       actualizarTabla();
       txtOcultar.setVisible(true);
      
    }//GEN-LAST:event_btnbuscarActionPerformed
public void actualizarTabla(){


 DefaultTableModel m = (DefaultTableModel) tablaTickets.getModel();
        limpiarTabla(tablaTickets);
        String x [] = new String[3];
        
        try {
         //llenar la tabla de tickets
         Date fecha = seleccionaFecha.getDate();
         ResultSet res = t.getTickets(fecha);
         res.last();
         if(res.getRow()==0){
         JOptionPane.showMessageDialog(null, "No hay datos en esa fecha");
         }else{
        res.beforeFirst();
        while(res.next()){
        
          x[0]=  res.getString("idTicket");
          x[1]=  res.getString("fecha");
           x[2]= res.getString("hora");
           m.addRow(x);
        }
             
         }
     } catch (SQLException ex) {
         Logger.getLogger(Devoluciones.class.getName()).log(Level.SEVERE, null, ex);
     }}


    private void eventoClickTablaTickets(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoClickTablaTickets
     panelVentas.setVisible(true);
     int row = tablaTickets.getSelectedRow();
     DefaultTableModel m = (DefaultTableModel) tablaTickets.getModel();   
    idTicket = (String) m.getValueAt(row, 0);
    String fecha = (String) m.getValueAt(row, 1);
    String hora = (String) m.getValueAt(row, 2);
    
    DefaultTableModel m2 = (DefaultTableModel) tablaVentas.getModel();
        limpiarTabla(tablaVentas);
        String x [] = new String[5];
        
        try {
         //llenar la tabla de tickets
         
         ResultSet res = v.getVentasPorTicket(idTicket,fecha,hora);
         res.last();
         if(res.getRow()==0){
         
         }else{
        res.beforeFirst();
        while(res.next()){
        
          x[0]=  res.getString("codigo");
          x[1]=  res.getString("nombre");
           x[2]= res.getString("cantidad");
           x[3]= res.getString("importe");
           m2.addRow(x);
        }
             
         }
     } catch (SQLException ex) {
         Logger.getLogger(Devoluciones.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }//GEN-LAST:event_eventoClickTablaTickets

    private void devolverCantidadDeArticulos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolverCantidadDeArticulos
       int row = tablaVentas.getSelectedRow();
     
       String codigo = (String) tablaVentas.getValueAt(row, 0);
       String nombre = (String) tablaVentas.getValueAt(row, 1);
       String cantidad = (String) tablaVentas.getValueAt(row, 2);
       String monto = (String) tablaVentas.getValueAt(row, 3);
      
       
        Ticket obj = new Ticket(idTicket,codigo,nombre,cantidad,monto,this, ven);
        obj.setVisible(true);
      
        
    }//GEN-LAST:event_devolverCantidadDeArticulos
public void llenarTabla(){

}
   public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelVentas;
    private com.toedter.calendar.JDateChooser seleccionaFecha;
    private javax.swing.JTable tablaTickets;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JLabel txtOcultar;
    // End of variables declaration//GEN-END:variables
}
