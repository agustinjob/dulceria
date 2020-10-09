package Ventana1;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class BusquedaP extends javax.swing.JFrame implements ActionListener, MouseListener, KeyListener {

    DefaultTableModel busqueda;
    String data[][] = {};
    String cabeza[] = {"Descripción del producto", "precio de venta", "Inventario"};
    int filas;

    public BusquedaP() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Busqueda de Productos");
        dispose();

        busqueda = new DefaultTableModel();

        busqueda = new DefaultTableModel(data, cabeza);
        tabla1b.setModel(busqueda);
        
        
        ImageIcon a = new ImageIcon("iconos/buscador.png");
        ImageIcon c = new ImageIcon("iconos/check.png");
        ImageIcon d = new ImageIcon("iconos/bote_basura.png");
        ImageIcon g = new ImageIcon("iconos/ESC.png");
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        bus.setIcon(a);
        
        btneliminarb.setIcon(d);

        btnentrar.setIcon(c);
        btnsalir.setIcon(g);
        
        
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new JPanel();
        btnsalir = new JButton();
        btnentrar = new JButton();
        btneliminarb = new JButton();
        jScrollPane1 = new JScrollPane();
        tabla1b = new JTable();
        jLabel2 = new JLabel();
        jPanel4 = new JPanel();
        txtbusquedap = new JTextField();
        bus = new JLabel();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setPreferredSize(new Dimension(560, 560));

        btnsalir.setBackground(new Color(0, 153, 153));
        btnsalir.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnsalir.setText("ESC-Salir");
        btnsalir.setBorder(null);
        btnsalir.setPreferredSize(new Dimension(160, 35));
        btnsalir.addActionListener(this);

        btnentrar.setBackground(new Color(0, 153, 153));
        btnentrar.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnentrar.setText("ENTER-Aceptar");
        btnentrar.setBorder(null);
        btnentrar.setPreferredSize(new Dimension(160, 35));

        btneliminarb.setBackground(new Color(0, 153, 153));
        btneliminarb.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btneliminarb.setText("Eliminar producto");
        btneliminarb.setBorder(null);
        btneliminarb.setPreferredSize(new Dimension(180, 35));
        btneliminarb.addActionListener(this);

        tabla1b.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion del producto", "Precio de venta", "Inventario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1b.addMouseListener(this);
        jScrollPane1.setViewportView(tabla1b);
        if (tabla1b.getColumnModel().getColumnCount() > 0) {
            tabla1b.getColumnModel().getColumn(0).setResizable(false);
            tabla1b.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        jLabel2.setText("Teclea las primeras letras del producto:");

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createEtchedBorder());

        txtbusquedap.setBorder(null);
        txtbusquedap.addActionListener(this);
        txtbusquedap.addKeyListener(this);

        bus.setBackground(new Color(255, 255, 255));
        bus.setForeground(new Color(255, 255, 255));
        bus.setLabelFor(txtbusquedap);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(bus, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbusquedap)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(txtbusquedap, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(bus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnentrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(btnsalir, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btneliminarb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btneliminarb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnentrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new AbsoluteConstraints(0, 40, -1, 530));

        jPanel1.setBackground(new Color(0, 153, 153));
        jPanel1.setToolTipText("");
        jPanel1.setName("BUSQUEDA DE "); // NOI18N

        jLabel1.setFont(new Font("Cambria", 1, 22)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("BÚSQUEDA DE PRODUCTOS ");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 560, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnsalir) {
            BusquedaP.this.btnsalirActionPerformed(evt);
        }
        else if (evt.getSource() == btneliminarb) {
            BusquedaP.this.btneliminarbActionPerformed(evt);
        }
        else if (evt.getSource() == txtbusquedap) {
            BusquedaP.this.txtbusquedapActionPerformed(evt);
        }
    }

    public void keyPressed(KeyEvent evt) {
    }

    public void keyReleased(KeyEvent evt) {
        if (evt.getSource() == txtbusquedap) {
            BusquedaP.this.txtbusquedapKeyReleased(evt);
        }
    }

    public void keyTyped(KeyEvent evt) {
    }

    public void mouseClicked(MouseEvent evt) {
        if (evt.getSource() == tabla1b) {
            BusquedaP.this.tabla1bMouseClicked(evt);
        }
    }

    public void mouseEntered(MouseEvent evt) {
    }

    public void mouseExited(MouseEvent evt) {
    }

    public void mousePressed(MouseEvent evt) {
    }

    public void mouseReleased(MouseEvent evt) {
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarbActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btneliminarbActionPerformed
        if (tabla1b.getSelectedRow() >= 0) {
            if (tabla1b.getValueAt(tabla1b.getSelectedRow(), 0) == null) {
                JOptionPane.showMessageDialog(this, "LA FILA QUE SELECCIONO ,NO CUENTA CON NINGUN PRODUCTO", "SISTEMA", JOptionPane.WARNING_MESSAGE);
            } else {
                DefaultTableModel tm = (DefaultTableModel) tabla1b.getModel();
                int rpta = JOptionPane.showConfirmDialog(this, "¿DESEA ELIMINAR ESTE PRODUCTO?", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
                if (rpta == JOptionPane.YES_OPTION) {
                    tm.removeRow(tabla1b.getSelectedRow());

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR UNA FILA ,", "SISTEMA", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btneliminarbActionPerformed

    private void btnsalirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Ventana3 objeto = new Ventana3();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void tabla1bMouseClicked(MouseEvent evt) {//GEN-FIRST:event_tabla1bMouseClicked
      
    }//GEN-LAST:event_tabla1bMouseClicked

    private void txtbusquedapKeyReleased(KeyEvent evt) {//GEN-FIRST:event_txtbusquedapKeyReleased
        String[] info = new String[4];
        info[0] = "producto";
        info[1] = "20";
        info[2] = "3";
        info[3] = "50";

        busqueda.addRow(info);
        txtbusquedap.setText("");
    }//GEN-LAST:event_txtbusquedapKeyReleased

    private void txtbusquedapActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtbusquedapActionPerformed

    }//GEN-LAST:event_txtbusquedapActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BusquedaP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btneliminarb;
    private JButton btnentrar;
    private JButton btnsalir;
    private JLabel bus;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JTable tabla1b;
    private JTextField txtbusquedap;
    // End of variables declaration//GEN-END:variables

}
