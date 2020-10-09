package Ventana1;

import MisClases.Utilidades;
import dao.Movimientos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Entradaefectivo extends javax.swing.JFrame implements ActionListener {

    Movimientos obj = new Movimientos();
    
    public Entradaefectivo() {
        initComponents();
        setTitle("Registro de Entradas de Efectivo");
        setLocationRelativeTo(null);
        dispose();
setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        ImageIcon a = new ImageIcon("iconos/check.png");
        ImageIcon b = new ImageIcon("iconos/cancelar.png");
        ImageIcon c = new ImageIcon("iconos/entradas_pasadas.png");
        btnguardaref.setIcon(a);
        btnc.setIcon(b);
        btnv.setIcon(c);
        txtcantidade.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jPanel2 = new JPanel();
        btnguardaref = new JButton();
        btnc = new JButton();
        btnv = new JButton();
        txtcantidade = new JTextField();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new Dimension(550, 250));

        jLabel2.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad:");

        jLabel3.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Comentarios:");

        jPanel2.setBackground(new Color(0, 102, 102));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new Dimension(200, 250));

        btnguardaref.setBackground(new Color(0, 153, 153));
        btnguardaref.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnguardaref.setForeground(new Color(255, 255, 255));
        btnguardaref.setText("Guardar");
        btnguardaref.setBorder(null);
        btnguardaref.setPreferredSize(new Dimension(150, 35));
        btnguardaref.addActionListener(this);

        btnc.setBackground(new Color(0, 153, 153));
        btnc.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnc.setForeground(new Color(255, 255, 255));
        btnc.setText("Salir");
        btnc.setBorder(null);
        btnc.setPreferredSize(new Dimension(150, 35));
        btnc.addActionListener(this);

        btnv.setBackground(new Color(0, 153, 153));
        btnv.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnv.setForeground(new Color(255, 255, 255));
        btnv.setText("Ver entradas ");
        btnv.setBorder(null);
        btnv.setPreferredSize(new Dimension(150, 35));
        btnv.addActionListener(this);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnv, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardaref, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnguardaref, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnv, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        txtcantidade.addActionListener(this);

        jPanel3.setBackground(new Color(0, 102, 102));

        jLabel1.setBackground(new Color(0, 153, 153));
        jLabel1.setFont(new Font("Cambria", 1, 22)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("ENTRADAS DE EFECTIVO");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtcantidade, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantidade, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnguardaref) {
            Entradaefectivo.this.btnguardarefActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            Entradaefectivo.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btnv) {
            Entradaefectivo.this.btnvActionPerformed(evt);
        }
        else if (evt.getSource() == txtcantidade) {
            Entradaefectivo.this.txtcantidadeActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btnvActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnvActionPerformed
        verentradasdeefectivo obj = new verentradasdeefectivo();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvActionPerformed

    private void btncActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        Ventana3 objeto = new Ventana3();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncActionPerformed

    private void btnguardarefActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnguardarefActionPerformed
 
     String a[] =  new String[2];
     a[0]= jTextField1.getText();
     a[1]= txtcantidade.getText();
     
       if(Utilidades.hayVacios(a)){
        JOptionPane.showMessageDialog(rootPane, "Por favor ingresa todos los datos");
           
       }else{
          
     try {
            double tem = Double.parseDouble(a[1]);
            obj.registrarEfectivoInicial(txtcantidade.getText(),"entrada_efectivo",jTextField1.getText());
             JOptionPane.showMessageDialog(rootPane, "Se ha realizado el registro de efectivo correctamente");
             jTextField1.setText("");
             txtcantidade.setText("");
             this.dispose();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana2_2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana2_2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Por favor, revisa los datos ingresados");
        }
     
            }
    }//GEN-LAST:event_btnguardarefActionPerformed

    private void txtcantidadeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtcantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadeActionPerformed

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
            java.util.logging.Logger.getLogger(Entradaefectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Entradaefectivo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnc;
    private JButton btnguardaref;
    private JButton btnv;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextField jTextField1;
    private JTextField txtcantidade;
    // End of variables declaration//GEN-END:variables
}
