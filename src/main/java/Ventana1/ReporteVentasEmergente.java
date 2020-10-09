/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana1;

import MisClases.Utilidades;
import dao.VentasDAO;
import java.awt.AWTException;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author job
 */
public class ReporteVentasEmergente extends javax.swing.JFrame {
DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
VentasDAO ven = new VentasDAO();
NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();


    public ReporteVentasEmergente() {
        initComponents();
        setLocationRelativeTo(null);
        tablaVentas.getTableHeader().setPreferredSize(new Dimension(0,0));
        llenaTabla();
        centrarTabla();
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
         
    }
    
     public void centrarTabla(){
       dt.setHorizontalAlignment(SwingConstants.CENTER);
       // tablaDinero.getColumnModel().getColumn(0).setCellRenderer(dt);
        tablaVentas.getColumnModel().getColumn(1).setCellRenderer(dt);
        tablaVentas.setRowHeight(30);
       // tablaEntradas.getColumnModel().getColumn(1).setMaxWidth(60);
       // tablaEntradas.setRowHeight(30);
        //  tablaSalidas.getColumnModel().getColumn(1).setMaxWidth(60);
       // tablaSalidas.setRowHeight(30);
         ImageIcon iconoCap = new ImageIcon("iconos/ico_cap.png");
         btnCaptura.setIcon(iconoCap);
        
      
    }
     
     public void llenaTabla(){
     
     String vec[] = new String[2];
     ResultSet res = ven.getDatosReporteVentas();
     Double tem = 0.0D;
     Double tem2 = 0.0D;
     Double totalCosto = 0.0D;
     Double totalVentas = 0.0D;
     Double totalNumeroVentas = 0.0D;
     DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
    try {
        res.last();
        if(res.getRow()==0){
    
        }else{
        res.beforeFirst();
            System.out.println("Entro al false que llena");
        while(res.next()){
        
        tem = Double.parseDouble(res.getString("ventas"));
        tem2 = Double.parseDouble(res.getString("costo"));
         totalNumeroVentas = totalNumeroVentas + Double.parseDouble(res.getString("numeroVentas"));
        totalCosto =totalCosto + tem2;
        totalVentas = totalVentas + tem;
        vec[0]=res.getString("DIA_SEMANA");
        vec[1] =formatoImporte.format(tem);
        modelo.addRow(vec);
        }
        
        txtVentasTotales.setText(formatoImporte.format(totalVentas));
        Double ganancia = totalVentas - totalCosto;
        txtGanancia.setText(formatoImporte.format(ganancia));
        txtNumeroVentas.setText(totalNumeroVentas+"");
        }
    } catch (SQLException ex) {
        Logger.getLogger(ReporteVentasEmergente.class.getName()).log(Level.SEVERE, null, ex);
    }
             
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVentasTotales = new javax.swing.JLabel();
        txtGanancia = new javax.swing.JLabel();
        txtNumeroVentas = new javax.swing.JLabel();
        btnCaptura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(244, 225, 231));

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 24)); // NOI18N
        jLabel1.setText("Reporte de ventas");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Ventas por día");

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        jLabel3.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Ganancia");

        jLabel4.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Ventas totales");

        jLabel5.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Número de ventas");

        txtVentasTotales.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        txtVentasTotales.setText("$0");

        txtGanancia.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        txtGanancia.setText("$0");

        txtNumeroVentas.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        txtNumeroVentas.setText("$0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGanancia)
                            .addComponent(txtVentasTotales)
                            .addComponent(txtNumeroVentas))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVentasTotales))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtGanancia))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNumeroVentas)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        btnCaptura.setBackground(new java.awt.Color(0, 0, 102));
        btnCaptura.setText("Capturar");
        btnCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btnCaptura)
                .addGap(153, 153, 153))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCaptura))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
        try {
            Utilidades.capturaPantalla("ReporteSemanalVentas");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaptura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JLabel txtGanancia;
    private javax.swing.JLabel txtNumeroVentas;
    private javax.swing.JLabel txtVentasTotales;
    // End of variables declaration//GEN-END:variables
}
