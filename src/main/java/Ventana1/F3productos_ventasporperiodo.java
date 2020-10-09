package Ventana1;

import MisClases.Utilidades;
import com.toedter.calendar.JDateChooser;
import dao.VentasDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.awt.*;
import java.awt.print.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class F3productos_ventasporperiodo extends javax.swing.JFrame implements ActionListener {

    VentasDAO objVen = new VentasDAO();

    public F3productos_ventasporperiodo() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        configuracionIconos();
setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        //   tabla_ventas.add(combo)
    }

    public void configuracionIconos() {
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

        ImageIcon a1 = new ImageIcon("iconos/documentos.png");
        ImageIcon a2 = new ImageIcon("iconos/modificar_datos.png");
        ImageIcon a3 = new ImageIcon("iconos/bote_basura.png");
        ImageIcon a4 = new ImageIcon("iconos/ventas_periodo.png");

        btn1.setIcon(a1);
        btn2.setIcon(a2);
        btn3.setIcon(a3);
        btn4.setIcon(a4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jPanel5 = new JPanel();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();
        combo = new JComboBox<>();
        txttotalvendido = new JTextField();
        jLabel7 = new JLabel();
        buscarBtn = new JButton();
        fechaInicio = new JDateChooser();
        fechaFin = new JDateChooser();
        jButton1 = new JButton();
        jLabel5 = new JLabel();
        jLabel9 = new JLabel();
        jScrollPane1 = new JScrollPane();
        tabla_ventas = new JTable();
        jPanel6 = new JPanel();
        jLabel8 = new JLabel();
        caja = new JLabel();
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
        jPanel3 = new JPanel();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(204, 102, 0));
        jPanel2.setPreferredSize(new Dimension(1365, 35));

        jLabel1.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1244, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setPreferredSize(new Dimension(1365, 344));

        jLabel2.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(204, 51, 0));
        jLabel2.setText("REPORTE DE PRODUCTOS VENDIDOS");

        jLabel6.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("Mostrar Ventas de:");

        combo.setModel(new DefaultComboBoxModel<>(new String[] { "Hoy", "Ayer", "Hace una semana", "Hace un mes", " " }));

        jLabel7.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Total vendido:");

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(this);

        jButton1.setText("Buscar por lapso");
        jButton1.addActionListener(this);

        jLabel5.setText("Fecha inicio");

        jLabel9.setText("Fecha fin");

        tabla_ventas.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción del Producto", "Cantidad", "Precio de Venta"
            }
        ));
        jScrollPane1.setViewportView(tabla_ventas);

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttotalvendido, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel6)
                        .addGap(245, 245, 245)
                        .addComponent(jLabel5)
                        .addGap(155, 155, 155)
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(combo, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(buscarBtn)
                        .addGap(84, 84, 84)
                        .addComponent(fechaInicio, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(fechaFin, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1291, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(combo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(buscarBtn))
                            .addComponent(fechaInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaFin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txttotalvendido, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new Color(51, 51, 51));
        jPanel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel6.setToolTipText("");
        jPanel6.setPreferredSize(new Dimension(1365, 100));

        jLabel8.setFont(new Font("Cambria", 2, 48)); // NOI18N
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Alexito");

        btnCaptura.setBackground(new Color(0, 0, 102));
        btnCaptura.setText("Capturar");
        btnCaptura.addActionListener(this);

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 1006, Short.MAX_VALUE)
                .addComponent(btnCaptura)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(btnCaptura))
                    .addComponent(caja, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new Color(255, 255, 255));
        jPanel8.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel8.setPreferredSize(new Dimension(1365, 40));

        btnb.setBackground(new Color(255, 153, 101));
        btnb.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnb.setText("F2 Clientes");
        btnb.setBorder(null);
        btnb.setMargin(new Insets(3, 14, 2, 14));
        btnb.setPreferredSize(new Dimension(135, 35));
        btnb.addActionListener(this);

        btnd.setBackground(new Color(255, 153, 101));
        btnd.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnd.setText("F5 Inventario");
        btnd.setBorder(null);
        btnd.setPreferredSize(new Dimension(135, 35));
        btnd.addActionListener(this);

        btne.setBackground(new Color(255, 153, 101));
        btne.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btne.setText("Bitácora");
        btne.setBorder(null);
        btne.setPreferredSize(new Dimension(135, 35));
        btne.addActionListener(this);

        btnf.setBackground(new Color(255, 153, 101));
        btnf.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnf.setText("Usuario");
        btnf.setBorder(null);
        btnf.setPreferredSize(new Dimension(135, 35));
        btnf.addActionListener(this);

        btni.setBackground(new Color(255, 153, 101));
        btni.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btni.setText("Reportes");
        btni.setBorder(null);
        btni.setPreferredSize(new Dimension(135, 35));
        btni.addActionListener(this);

        btnh.setBackground(new Color(255, 153, 101));
        btnh.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnh.setText("Corte");
        btnh.setBorder(null);
        btnh.setPreferredSize(new Dimension(135, 35));
        btnh.addActionListener(this);

        btna.setBackground(new Color(255, 153, 101));
        btna.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btna.setText("F1 Ventas");
        btna.setAlignmentX(0.5F);
        btna.setBorder(null);
        btna.setMargin(new Insets(3, 14, 2, 14));
        btna.setPreferredSize(new Dimension(135, 35));
        btna.addActionListener(this);

        btnc.setBackground(new Color(255, 153, 101));
        btnc.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnc.setText("F3 Productos");
        btnc.setBorder(null);
        btnc.setPreferredSize(new Dimension(135, 35));
        btnc.addActionListener(this);

        btnj.setBackground(new Color(255, 153, 101));
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
                .addComponent(btni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addComponent(btni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setPreferredSize(new Dimension(1365, 40));

        btn2.setBackground(new Color(255, 153, 102));
        btn2.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn2.setText("Modificar");
        btn2.setBorder(null);
        btn2.setPreferredSize(new Dimension(180, 35));
        btn2.addActionListener(this);

        btn3.setBackground(new Color(255, 153, 102));
        btn3.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn3.setText("Eliminar");
        btn3.setBorder(null);
        btn3.setPreferredSize(new Dimension(180, 35));
        btn3.addActionListener(this);

        btn4.setBackground(new Color(255, 153, 102));
        btn4.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn4.setText("Ventas por período");
        btn4.setBorder(null);
        btn4.setPreferredSize(new Dimension(180, 35));
        btn4.addActionListener(this);

        btn1.setBackground(new Color(255, 153, 102));
        btn1.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn1.setText("Nuevo");
        btn1.setBorder(null);
        btn1.setPreferredSize(new Dimension(180, 35));
        btn1.addActionListener(this);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == buscarBtn) {
            F3productos_ventasporperiodo.this.buscarBtnActionPerformed(evt);
        }
        else if (evt.getSource() == jButton1) {
            F3productos_ventasporperiodo.this.jButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == btnCaptura) {
            F3productos_ventasporperiodo.this.btnCapturaActionPerformed(evt);
        }
        else if (evt.getSource() == btnb) {
            F3productos_ventasporperiodo.this.btnbActionPerformed(evt);
        }
        else if (evt.getSource() == btnd) {
            F3productos_ventasporperiodo.this.btndActionPerformed(evt);
        }
        else if (evt.getSource() == btne) {
            F3productos_ventasporperiodo.this.btneActionPerformed(evt);
        }
        else if (evt.getSource() == btnf) {
            F3productos_ventasporperiodo.this.btnfActionPerformed(evt);
        }
        else if (evt.getSource() == btni) {
            F3productos_ventasporperiodo.this.btniActionPerformed(evt);
        }
        else if (evt.getSource() == btnh) {
            F3productos_ventasporperiodo.this.btnhActionPerformed(evt);
        }
        else if (evt.getSource() == btna) {
            F3productos_ventasporperiodo.this.btnaActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            F3productos_ventasporperiodo.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btnj) {
            F3productos_ventasporperiodo.this.btnjActionPerformed(evt);
        }
        else if (evt.getSource() == btn2) {
            F3productos_ventasporperiodo.this.btn2ActionPerformed(evt);
        }
        else if (evt.getSource() == btn3) {
            F3productos_ventasporperiodo.this.btn3ActionPerformed(evt);
        }
        else if (evt.getSource() == btn4) {
            F3productos_ventasporperiodo.this.btn4ActionPerformed(evt);
        }
        else if (evt.getSource() == btn1) {
            F3productos_ventasporperiodo.this.btn1ActionPerformed(evt);
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

    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        F3Productos_Modificar obj = new F3Productos_Modificar() {
        };
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        F3Productos_eliminar obj = new F3Productos_eliminar();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        F3productos_ventasporperiodo obj = new F3productos_ventasporperiodo();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        F3productos obj = new F3productos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnjActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnjActionPerformed
        Transferir objeto = new Transferir();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnjActionPerformed

    private void buscarBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        try {
            //buscar
            llenaTabla();
        } catch (SQLException ex) {
            Logger.getLogger(F3productos_ventasporperiodo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Date inicio = fechaInicio.getDate();
            Date fin = fechaFin.getDate();

            ResultSet res = objVen.consultarVentasPorFechaPorLapsosDeTiempo(inicio, fin);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código de Barras");
            modelo.addColumn("Descripción del producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio venta");
            modelo.addColumn("fecha");
            modelo.addColumn("hora");
            res.last();
            int i = 0;
            double total = 0.0d;
            String x[] = new String[6];
            if (res.getRow() == 0) {
                JOptionPane.showMessageDialog(null, "No hay datos de ventas en esa fecha especifica");
            } else {
                res.beforeFirst();

                while (res.next()) {
                    x[0] = res.getString(1);
                    x[1] = res.getString(2);
                    x[2] = res.getString(3);
                    x[3] = res.getString(4);
                    x[4] = res.getString(5);
                    x[5] = res.getString(6);
                    modelo.addRow(x);
                    total = total + res.getDouble(3);
                    i++;
                }

                tabla_ventas.setModel(modelo);
                txttotalvendido.setText(total + "");

            }
        } catch (SQLException ex) {
            Logger.getLogger(F3productos_ventasporperiodo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCapturaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
 try {
            Utilidades.capturaPantalla("ProductosVendidos");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnCapturaActionPerformed

    public void llenaTabla() throws SQLException {

        String tipo = (String) combo.getSelectedItem();
        int tipoBusqueda = 0;
        switch (tipo) {
            case "Hoy":
                tipoBusqueda = 1;
                break;
            case "Ayer":
                tipoBusqueda = 2;
                break;
            case "Hace una semana":
                tipoBusqueda = 3;
                break;
            case "Hace un mes":
                tipoBusqueda = 4;
                break;
        }
        System.out.println("TIPO BUSQUEDA: " + tipoBusqueda);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código de Barras");
        modelo.addColumn("Descripción del producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio venta");
        modelo.addColumn("fecha");
        modelo.addColumn("hora");

        ResultSet res = objVen.consultarVentasPorFecha(tipoBusqueda);
        System.out.println("RES = " + res);
        res.last();
        int i = 0;
        double total = 0.0d;
        String x[] = new String[6];
        if (res.getRow() == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos de ventas en esa fecha especifica");
        } else {
            res.beforeFirst();

            while (res.next()) {
                x[0] = res.getString(1);
                x[1] = res.getString(2);
                x[2] = res.getString(3);
                x[3] = res.getString(4);
                x[4] = res.getString(5);
                x[5] = res.getString(6);
                modelo.addRow(x);
                total = total + res.getDouble(3);
                i++;
            }

            tabla_ventas.setModel(modelo);
            txttotalvendido.setText(total + "");

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn1;
    private JButton btn2;
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
    private JButton buscarBtn;
    private JLabel caja;
    private JComboBox<String> combo;
    private JDateChooser fechaFin;
    private JDateChooser fechaInicio;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JTable tabla_ventas;
    private JTextField txttotalvendido;
    // End of variables declaration//GEN-END:variables

}
