package Ventana1;


import MisClases.ImprimirTicket;
import dao.TicketDAO;
import dao.VentasDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class F12Cobrar extends javax.swing.JFrame implements ActionListener, KeyListener {
DefaultTableModel md;
VentasDAO ventas = new VentasDAO();
Ventana3 ven3;
    public F12Cobrar(DefaultTableModel md, Ventana3 ven3) {
        initComponents();
        setLocationRelativeTo(null);
        dispose();
        setTitle("Venta de productos: Cobrar");
        this.md = md;
        this.ven3 = ven3;
        System.out.println("Numero de columnas en ventas = " + md.getColumnCount());
        ImageIcon a = new ImageIcon("iconos/dinero33.png");
        ImageIcon d = new ImageIcon("iconos/impresora.png");
        ImageIcon e = new ImageIcon("iconos/facturar_ticket.png");
        ImageIcon f = new ImageIcon("iconos/cancelar.png");
        ImageIcon g = new ImageIcon("iconos/hoja.png");
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        btnefectivo.setIcon(a);
        
        btn1.setIcon(d);
        btn2.setIcon(e);
        btn3.setIcon(f);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel5 = new JPanel();
        txtn2 = new JTextField();
        jPanel4 = new JPanel();
        btnefectivo = new JButton();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        txtn1 = new JTextField();
        txtresultado = new JTextField();
        jPanel2 = new JPanel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        jLabel4 = new JLabel();
        numArticulos = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(0, 0, 153));
        jPanel1.setPreferredSize(new Dimension(420, 40));

        jLabel1.setFont(new Font("Cambria", 1, 22)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("COBRAR");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setPreferredSize(new Dimension(420, 470));

        txtn2.setEditable(false);
        txtn2.setFont(new Font("Cambria", 0, 48)); // NOI18N
        txtn2.setHorizontalAlignment(JTextField.CENTER);
        txtn2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtn2.addActionListener(this);

        jPanel4.setBackground(new Color(255, 255, 255));

        btnefectivo.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnefectivo.setBorderPainted(false);
        btnefectivo.setContentAreaFilled(false);
        btnefectivo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnefectivo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnefectivo.setIconTextGap(-3);
        btnefectivo.setLabel("Efectivo");
        btnefectivo.setPreferredSize(new Dimension(120, 100));
        btnefectivo.setVerticalAlignment(SwingConstants.BOTTOM);
        btnefectivo.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnefectivo.addActionListener(this);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnefectivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnefectivo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(255, 255, 255));

        jLabel2.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("Pagó Con:");

        jLabel3.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("Su Cambio:");

        txtn1.addKeyListener(this);

        txtresultado.setEditable(false);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtresultado, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtn1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtn1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, GroupLayout.Alignment.TRAILING))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtresultado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(73, 73, 73))
        );

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(txtn2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtn2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        jPanel2.setBackground(new Color(153, 204, 255));
        jPanel2.setPreferredSize(new Dimension(280, 520));

        btn1.setBackground(new Color(204, 204, 255));
        btn1.setFont(new Font("Cambria", 0, 14)); // NOI18N
        btn1.setText("F1-Cobrar e imprimir ticket");
        btn1.setBorder(null);
        btn1.setPreferredSize(new Dimension(255, 40));
        btn1.addActionListener(this);

        btn2.setBackground(new Color(204, 204, 255));
        btn2.setFont(new Font("Cambria", 0, 13)); // NOI18N
        btn2.setText("F2-Cobrar solo registrando la venta ");
        btn2.setBorder(null);
        btn2.setPreferredSize(new Dimension(255, 40));
        btn2.addActionListener(this);

        btn3.setBackground(new Color(204, 204, 255));
        btn3.setFont(new Font("Cambria", 0, 14)); // NOI18N
        btn3.setText("ESC-Cancelar");
        btn3.setBorder(null);
        btn3.setPreferredSize(new Dimension(255, 40));
        btn3.addActionListener(this);

        jLabel4.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Total de Artículos");

        numArticulos.setFont(new Font("Lucida Grande", 0, 48)); // NOI18N
        numArticulos.setHorizontalAlignment(SwingConstants.CENTER);
        numArticulos.setText("1");
        numArticulos.setEnabled(false);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(numArticulos, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(numArticulos, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == txtn2) {
            F12Cobrar.this.txtn2ActionPerformed(evt);
        }
        else if (evt.getSource() == btnefectivo) {
            F12Cobrar.this.btnefectivoActionPerformed(evt);
        }
        else if (evt.getSource() == btn1) {
            F12Cobrar.this.btn1ActionPerformed(evt);
        }
        else if (evt.getSource() == btn2) {
            F12Cobrar.this.btn2ActionPerformed(evt);
        }
        else if (evt.getSource() == btn3) {
            F12Cobrar.this.btn3ActionPerformed(evt);
        }
    }

    public void keyPressed(KeyEvent evt) {
    }

    public void keyReleased(KeyEvent evt) {
        if (evt.getSource() == txtn1) {
            F12Cobrar.this.txtn1KeyReleased(evt);
        }
    }

    public void keyTyped(KeyEvent evt) {
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       this.dispose();
       
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnefectivoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnefectivoActionPerformed
       double n1, n2, result = 0;
       n1 = Double.parseDouble(txtn1.getText());
       n2 = Double.parseDouble(txtn2.getText());
       btnefectivo.isSelected();
           result = n1 - n2;
       txtresultado.setText("" + result);
       
       
    }//GEN-LAST:event_btnefectivoActionPerformed

    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    try {
      ventas.registrarVenta(md);
    /*    Ventana3 objeto = new Ventana3();
        objeto.setVisible(true);
        objeto.setObjetoDeLaVentana(objeto);*/
    System.out.println("Entro antres de eliminar celda");
    System.out.println(ven3);
    
       ven3.eliminaCelda(2);
       ven3.numeroArticulos = 0;
       ven3.total = 0;
      
       TicketDAO tick = new TicketDAO();
        try {
            ven3.llenarCombo();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
       ven3.actualizaTicket(tick.getNumero()+"");
        this.dispose();
      
    } catch (ClassNotFoundException ex) {
       System.out.println(ex.getLocalizedMessage());
    }
    }//GEN-LAST:event_btn2ActionPerformed

    private void txtn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtn2ActionPerformed

    private void txtn1KeyReleased(KeyEvent evt) {//GEN-FIRST:event_txtn1KeyReleased
          double n1, n2, result = 0;
       n1 = Double.parseDouble(txtn1.getText());
       n2 = Double.parseDouble(txtn2.getText());
      if(n2<=n1){
           result = n1 - n2;
       txtresultado.setText("" + result);
      }
    }//GEN-LAST:event_txtn1KeyReleased

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
     ImprimirTicket obj = new ImprimirTicket();
            try {
        ventas.registrarVenta(md);
         String res= obj.convertirModeloAString(md, txtn2.getText());
    obj.imprimirTicket(res);
        Ventana3 objeto = new Ventana3();
        objeto.setVisible(true);
        objeto.setObjetoDeLaVentana(objeto);
        ven3.dispose();
        this.dispose();
      
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(F12Cobrar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_btn1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnefectivo;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    public JLabel numArticulos;
    public static JTextField txtn1;
    public static JTextField txtn2;
    private JTextField txtresultado;
    // End of variables declaration//GEN-END:variables

    private void agregar() {
    }

    
}
