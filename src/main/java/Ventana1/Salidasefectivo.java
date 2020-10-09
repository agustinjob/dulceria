package Ventana1;

import MisClases.Utilidades;
import dao.Movimientos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class Salidasefectivo extends javax.swing.JFrame implements ActionListener {

    Movimientos obj = new Movimientos();
    
    public Salidasefectivo() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("REGISTRO DE SALIDAS DE DINERO");
        dispose();
                
        
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        ImageIcon a = new ImageIcon("iconos/check.png");
        ImageIcon b = new ImageIcon("iconos/cancelar.png");
        ImageIcon c = new ImageIcon("iconos/entradas_pasadas.png");
        btnguardar.setIcon(a);
        btncancelar.setIcon(b);
        btnversalidas.setIcon(c);
        jTextField1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        jPanel5 = new JPanel();
        btnguardar = new JButton();
        btncancelar = new JButton();
        btnversalidas = new JButton();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jTextField2 = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(500, 250));

        jPanel4.setBackground(new Color(102, 0, 0));
        jPanel4.setPreferredSize(new Dimension(300, 40));

        jLabel1.setFont(new Font("Cambria", 1, 22)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("SALIDAS DE EFECTIVO");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(102, 0, 0));
        jPanel5.setPreferredSize(new Dimension(200, 250));

        btnguardar.setBackground(new Color(153, 0, 0));
        btnguardar.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnguardar.setForeground(new Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.setBorder(null);
        btnguardar.setPreferredSize(new Dimension(150, 35));
        btnguardar.addActionListener(this);

        btncancelar.setBackground(new Color(153, 0, 0));
        btncancelar.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btncancelar.setForeground(new Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(null);
        btncancelar.setPreferredSize(new Dimension(150, 35));
        btncancelar.addActionListener(this);

        btnversalidas.setBackground(new Color(153, 0, 0));
        btnversalidas.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnversalidas.setForeground(new Color(255, 255, 255));
        btnversalidas.setText("Ver salidas");
        btnversalidas.setBorder(null);
        btnversalidas.setPreferredSize(new Dimension(150, 35));
        btnversalidas.addActionListener(this);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(btnversalidas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnguardar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncancelar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnversalidas, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.setBackground(new Color(255, 255, 255));

        jLabel2.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad:");

        jTextField1.setPreferredSize(new Dimension(200, 35));

        jLabel3.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Razón o Proveedor");

        jTextField2.setPreferredSize(new Dimension(200, 35));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnguardar) {
            Salidasefectivo.this.btnguardarActionPerformed(evt);
        }
        else if (evt.getSource() == btncancelar) {
            Salidasefectivo.this.btncancelarActionPerformed(evt);
        }
        else if (evt.getSource() == btnversalidas) {
            Salidasefectivo.this.btnversalidasActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
     String a[] =  new String[2];
     a[0]= jTextField1.getText();
     a[1]= jTextField2.getText();
     
       if(Utilidades.hayVacios(a)){
        JOptionPane.showMessageDialog(rootPane, "Por favor ingresa todos los datos");
           
       }else{
          
     try {
         double tem = Double.parseDouble(a[0]);
            obj.registrarEfectivoInicial(jTextField1.getText(),"salida_efectivo",jTextField2.getText());
             JOptionPane.showMessageDialog(rootPane, "Se ha realizado el registro de salida de efectivo correctamente");
             jTextField1.setText("");//Cantidad
             jTextField2.setText("");//Proveedor
             this.dispose();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana2_2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana2_2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null,"Por favor, revisa los datos ingresados");
        }
     
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnversalidasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnversalidasActionPerformed
        ver_salidas_de_efectivo obj = new ver_salidas_de_efectivo();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnversalidasActionPerformed

    private void btncancelarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        Ventana3 obj = new Ventana3();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salidasefectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Salidasefectivo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btncancelar;
    private JButton btnguardar;
    private JButton btnversalidas;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JTextField jTextField1;
    private JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
