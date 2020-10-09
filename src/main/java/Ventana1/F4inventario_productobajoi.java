package Ventana1;

import MisClases.Utilidades;
import dao.ProductoDAO;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.ResultSet;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class F4inventario_productobajoi extends javax.swing.JFrame implements ActionListener {

    ProductoDAO obj = new ProductoDAO();
    
    public F4inventario_productobajoi() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);      
      configuraIconos();
      generaTabla();
      setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
    }

    
    public void generaTabla(){
    String cabeza[] = {"Código", "Descripcion de producto", "Cantidad", "Precio de venta"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código de Barras");
        modelo.addColumn("Descripción del producto");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Existencia");
        modelo.addColumn("Inventario minimo");
       
        ResultSet res = obj.productosBajoInventario();
        
        int i = 0;
        String x[] = new String[5];
        try {
             res.last();
            if (res.getRow() == 0) {
                JOptionPane.showMessageDialog(null, "No hay datos de ventas en esa fecha especifica");
            } else {
                res.beforeFirst();
                
                while (res.next()) {
                    x[0]=res.getString(2);
                    x[1]=res.getString(3);
                    x[2]=res.getString(5);
                    x[3]=res.getString(7);
                    x[4]=res.getString(8);
                    modelo.addRow(x);
                    
                    i++;
                }
                
                tablaInventario.setModel(modelo);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(F4inventario_productobajoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void configuraIconos(){
      //primera barra
        ImageIcon registradora = new ImageIcon("iconos/comprar.png");
        ImageIcon cc = new ImageIcon("iconos/cancelar.png");
        ImageIcon bc = new ImageIcon("iconos/boton_cerrar.png");
        ImageIcon c = new ImageIcon("iconos/productos.png");
        ImageIcon b = new ImageIcon("iconos/clientes.png");
        ImageIcon d = new ImageIcon("iconos/inventario.png");
        ImageIcon e = new ImageIcon("iconos/ticket.png");
        ImageIcon h = new ImageIcon("iconos/corte.png");
        ImageIcon i = new ImageIcon("iconos/reportes.png");
        ImageIcon j = new ImageIcon("iconos/intercambiar.png");
        ImageIcon gg = new ImageIcon("iconos/carro_cobrar.png");
        ImageIcon f = new ImageIcon("iconos/usuario.png");
        ImageIcon iconoCap = new ImageIcon("iconos/ico_cap.png");
btnCaptura.setIcon(iconoCap);
        btna.setIcon(gg);
        btnb.setIcon(b);
        btnc.setIcon(c);
        btnd.setIcon(d);
        btne.setIcon(e);
        btnf.setIcon(f);
        btnh.setIcon(h);
        btni.setIcon(i);
        btnj.setIcon(j);
        caja.setIcon(registradora);

        //segunda barra
        ImageIcon a1 = new ImageIcon("iconos/agregar.png");
        ImageIcon a3 = new ImageIcon("iconos/productos_bajos.png");
        btn1.setIcon(a1);
        btn3.setIcon(a3);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jPanel5 = new JPanel();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();
        jScrollPane1 = new JScrollPane();
        tablaInventario = new JTable();
        jPanel9 = new JPanel();
        jLabel8 = new JLabel();
        caja = new JLabel();
        jPanel7 = new JPanel();
        btnCaptura = new JButton();
        jPanel8 = new JPanel();
        btnb = new JButton();
        btnd = new JButton();
        btne = new JButton();
        btnf = new JButton();
        btni = new JButton();
        btnh = new JButton();
        btna = new JButton();
        btnc = new JButton();
        btnj = new JButton();
        jPanel4 = new JPanel();
        btn3 = new JButton();
        btn1 = new JButton();
        btn4 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(0, 51, 102));
        jPanel3.setPreferredSize(new Dimension(1365, 35));
        jPanel3.setLayout(new AbsoluteLayout());

        jLabel1.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("INVENTARIO");
        jPanel3.add(jLabel1, new AbsoluteConstraints(10, 0, -1, -1));

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setPreferredSize(new Dimension(1365, 327));

        jLabel2.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(51, 0, 102));
        jLabel2.setText("PRODUCTOS BAJOS EN INVENTARIO");

        jLabel6.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("A continuación se muestra un listado con los productos con inventario bajo de su mínimo:");

        tablaInventario.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción del Producto", "Precio de Venta", "Existencia", "Inv.Minimo", "Inv.Maximo"
            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(54, 741, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new Color(51, 51, 51));
        jPanel9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel9.setToolTipText("");
        jPanel9.setPreferredSize(new Dimension(1365, 100));

        jLabel8.setFont(new Font("Cambria", 2, 48)); // NOI18N
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Alexito");

        jPanel7.setBackground(new Color(0, 0, 0));

        btnCaptura.setBackground(new Color(0, 0, 102));
        btnCaptura.setText("Capturar");
        btnCaptura.addActionListener(this);

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnCaptura)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnCaptura)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 954, Short.MAX_VALUE)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(caja, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new Color(255, 255, 255));
        jPanel8.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel8.setPreferredSize(new Dimension(1365, 40));

        btnb.setBackground(new Color(168, 168, 255));
        btnb.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnb.setText("F2 Clientes");
        btnb.setBorder(null);
        btnb.setMargin(new Insets(3, 14, 2, 14));
        btnb.setPreferredSize(new Dimension(135, 35));
        btnb.addActionListener(this);

        btnd.setBackground(new Color(168, 168, 255));
        btnd.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnd.setText("F5 Inventario");
        btnd.setBorder(null);
        btnd.setPreferredSize(new Dimension(135, 35));
        btnd.addActionListener(this);

        btne.setBackground(new Color(168, 168, 255));
        btne.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btne.setText("Bitácora");
        btne.setBorder(null);
        btne.setPreferredSize(new Dimension(135, 35));
        btne.addActionListener(this);

        btnf.setBackground(new Color(168, 168, 255));
        btnf.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnf.setText("Usuario");
        btnf.setBorder(null);
        btnf.setPreferredSize(new Dimension(135, 35));
        btnf.addActionListener(this);

        btni.setBackground(new Color(168, 168, 255));
        btni.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btni.setText("Reportes");
        btni.setBorder(null);
        btni.setPreferredSize(new Dimension(135, 35));
        btni.addActionListener(this);

        btnh.setBackground(new Color(168, 168, 255));
        btnh.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnh.setText("Corte");
        btnh.setBorder(null);
        btnh.setPreferredSize(new Dimension(135, 35));
        btnh.addActionListener(this);

        btna.setBackground(new Color(168, 168, 255));
        btna.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btna.setText("F1 Ventas");
        btna.setAlignmentX(0.5F);
        btna.setBorder(null);
        btna.setMargin(new Insets(3, 14, 2, 14));
        btna.setPreferredSize(new Dimension(135, 35));
        btna.addActionListener(this);

        btnc.setBackground(new Color(168, 168, 255));
        btnc.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnc.setText("F3 Productos");
        btnc.setBorder(null);
        btnc.setPreferredSize(new Dimension(135, 35));
        btnc.addActionListener(this);

        btnj.setBackground(new Color(168, 168, 255));
        btnj.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnj.setText("F4 Transferir");
        btnj.setBorder(null);
        btnj.setPreferredSize(new Dimension(135, 35));
        btnj.addActionListener(this);

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btni, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btni, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel4.setPreferredSize(new Dimension(1365, 40));

        btn3.setBackground(new Color(153, 153, 255));
        btn3.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn3.setText("Productos bajos en inventario");
        btn3.setBorder(null);
        btn3.setPreferredSize(new Dimension(250, 35));
        btn3.addActionListener(this);

        btn1.setBackground(new Color(153, 153, 255));
        btn1.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn1.setText("Agregar");
        btn1.setBorder(null);
        btn1.addActionListener(this);

        btn4.setBackground(new Color(153, 153, 255));
        btn4.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn4.setText("Datos inventario");
        btn4.setPreferredSize(new Dimension(250, 35));
        btn4.addActionListener(this);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 687, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel8, 1366, 1366, GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnb) {
            F4inventario_productobajoi.this.btnbActionPerformed(evt);
        }
        else if (evt.getSource() == btnd) {
            F4inventario_productobajoi.this.btndActionPerformed(evt);
        }
        else if (evt.getSource() == btne) {
            F4inventario_productobajoi.this.btneActionPerformed(evt);
        }
        else if (evt.getSource() == btnf) {
            F4inventario_productobajoi.this.btnfActionPerformed(evt);
        }
        else if (evt.getSource() == btni) {
            F4inventario_productobajoi.this.btniActionPerformed(evt);
        }
        else if (evt.getSource() == btnh) {
            F4inventario_productobajoi.this.btnhActionPerformed(evt);
        }
        else if (evt.getSource() == btna) {
            F4inventario_productobajoi.this.btnaActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            F4inventario_productobajoi.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btnj) {
            F4inventario_productobajoi.this.btnjActionPerformed(evt);
        }
        else if (evt.getSource() == btn3) {
            F4inventario_productobajoi.this.btn3ActionPerformed(evt);
        }
        else if (evt.getSource() == btn1) {
            F4inventario_productobajoi.this.btn1ActionPerformed(evt);
        }
        else if (evt.getSource() == btn4) {
            F4inventario_productobajoi.this.btn4ActionPerformed(evt);
        }
        else if (evt.getSource() == btnCaptura) {
            F4inventario_productobajoi.this.btnCapturaActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btnbActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnbActionPerformed
        Ventana4 objeto = new Ventana4();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbActionPerformed

    private void btndActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        F4inventario objeto = new F4inventario();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btndActionPerformed

    private void btneActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btneActionPerformed
        Bitacora objeto = new Bitacora();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btneActionPerformed

    private void btnfActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnfActionPerformed
        Usuario_1 objeto = new Usuario_1();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnfActionPerformed

    private void btniActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btniActionPerformed
        Reportes objeto = new Reportes();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btniActionPerformed

    private void btnhActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnhActionPerformed
        Corte objeto = new Corte();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnhActionPerformed

    private void btnaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed
        Ventana3 objeto = new Ventana3();
        objeto.setVisible(true);
        objeto.setObjetoDeLaVentana(objeto);
        dispose();
    }//GEN-LAST:event_btnaActionPerformed

    private void btncActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        F3productos objeto = new F3productos();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncActionPerformed

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        F4inventario_productobajoi obj = new F4inventario_productobajoi();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        F4inventario obj = new F4inventario();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjActionPerformed
        Transferir objeto = new Transferir();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnjActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Inventario_ganancias inv = new Inventario_ganancias();
        inv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
 try {
            Utilidades.capturaPantalla("InventarioProductos");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapturaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn1;
    private JButton btn3;
    private JButton btn4;
    private JButton btnCaptura;
    private JButton btna;
    private JButton btnb;
    private JButton btnc;
    private JButton btnd;
    private JButton btne;
    private JButton btnf;
    private JButton btnh;
    private JButton btni;
    private JButton btnj;
    private JLabel caja;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane1;
    private JTable tablaInventario;
    // End of variables declaration//GEN-END:variables
}
