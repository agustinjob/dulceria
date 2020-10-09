package Ventana1;

import MisClases.Producto;
import MisClases.Utilidades;
import dao.Movimientos;
import dao.ProductoDAO;
import dao.VentasDAO;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public abstract class ReporteProductos extends javax.swing.JFrame implements ActionListener {

    ProductoDAO obj = new ProductoDAO();
    ArrayList<Producto> lista = new ArrayList();
    String codigoTemp = "";
    Movimientos mov = new Movimientos();
    VentasDAO ven = new VentasDAO();
    public ReporteProductos() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
       
        jPanel4.setVisible(false);
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        try{
        llenarCombo();
        
        }catch(Exception e){
        }
        AutoCompleteDecorator.decorate(comboProductos, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
        configurarIconos();
        comboProductos.requestFocus();
    }

    public void llenarCombo() throws ClassNotFoundException, SQLException {
        lista = new ArrayList<Producto>();
        System.out.println("entro a llenar combo");
        lista = obj.obtenerProductosSiHuboModificacion(lista, true);
        int i = 0;
        while (i < lista.size()) {
            comboProductos.addItem(lista.get(i).getNombre());
            i++;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        jPanel6 = new JPanel();
        jLabel7 = new JLabel();
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
        jPanel1 = new JPanel();
        jPanel4 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tablaProductos = new JTable();
        totalP = new JLabel();
        totalV = new JLabel();
        jLabel6 = new JLabel();
        jLabel11 = new JLabel();
        comboProductos = new JComboBox<>();
        btn5 = new JButton();
        mes = new JTextField();
        ano = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        totalP1 = new JLabel();

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

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setPreferredSize(new Dimension(1365, 40));

        btn1.setBackground(new Color(0, 153, 153));
        btn1.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn1.setText("Reporte de Ventas");
        btn1.setBorder(null);
        btn1.setPreferredSize(new Dimension(200, 35));
        btn1.addActionListener(this);

        btn2.setBackground(new Color(0, 153, 153));
        btn2.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn2.setText("Reporte por producto");
        btn2.setPreferredSize(new Dimension(200, 35));
        btn2.addActionListener(this);

        btn3.setBackground(new Color(0, 153, 153));
        btn3.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn3.setText("Graficas");
        btn3.setActionCommand("");
        btn3.setPreferredSize(new Dimension(200, 35));
        btn3.addActionListener(this);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new Color(51, 51, 51));
        jPanel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel6.setToolTipText("");
        jPanel6.setPreferredSize(new Dimension(1365, 100));

        jLabel7.setFont(new Font("Cambria", 2, 48)); // NOI18N
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("Alexito");

        jPanel7.setBackground(new Color(0, 0, 0));

        btnCaptura.setBackground(new Color(0, 0, 102));
        btnCaptura.setText("Capturar");
        btnCaptura.addActionListener(this);

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btnCaptura)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCaptura)
                .addGap(27, 27, 27))
        );

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 993, Short.MAX_VALUE)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(caja, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        btna.setPreferredSize(new Dimension(130, 35));
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

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new Dimension(1365, 430));

        jPanel4.setBackground(new Color(255, 255, 255));

        tablaProductos.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Día", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        totalP.setText("Total productos:");

        totalV.setText("Total de vendidos:");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(totalV)
                    .addComponent(totalP, GroupLayout.Alignment.TRAILING))
                .addGap(0, 131, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalP)
                .addGap(18, 18, 18)
                .addComponent(totalV)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setText("Buscar producto");

        jLabel11.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel11.setText("Teclee el número o nombre del producto:");

        comboProductos.setEditable(true);
        comboProductos.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        comboProductos.setModel(new DefaultComboBoxModel<>(new String[] { " " }));
        comboProductos.setMaximumSize(new Dimension(25, 25));
        comboProductos.setMinimumSize(new Dimension(10, 10));
        comboProductos.setPreferredSize(new Dimension(15, 25));
        comboProductos.addActionListener(this);

        btn5.setBackground(new Color(255, 102, 0));
        btn5.setFont(new Font("Cambria", 0, 14)); // NOI18N
        btn5.setText("Aceptar");
        btn5.setBorder(null);
        btn5.addActionListener(this);

        jLabel2.setText("MM");

        jLabel3.setText("YYYY");

        totalP1.setFont(new Font("Lucida Grande", 3, 18)); // NOI18N
        totalP1.setText("Registro de inventario");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(comboProductos, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mes, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel3))
                                    .addComponent(ano, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel6)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(totalP1)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(301, 301, 301))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalP1))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(comboProductos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(mes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, 1366, 1366, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnCaptura) {
            ReporteProductos.this.btnCapturaActionPerformed(evt);
        }
        else if (evt.getSource() == btnb) {
            ReporteProductos.this.btnbActionPerformed(evt);
        }
        else if (evt.getSource() == btnd) {
            ReporteProductos.this.btndActionPerformed(evt);
        }
        else if (evt.getSource() == btne) {
            ReporteProductos.this.btneActionPerformed(evt);
        }
        else if (evt.getSource() == btnf) {
            ReporteProductos.this.btnfActionPerformed(evt);
        }
        else if (evt.getSource() == btni) {
            ReporteProductos.this.btniActionPerformed(evt);
        }
        else if (evt.getSource() == btnh) {
            ReporteProductos.this.btnhActionPerformed(evt);
        }
        else if (evt.getSource() == btna) {
            ReporteProductos.this.btnaActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            ReporteProductos.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btnj) {
            ReporteProductos.this.btnjActionPerformed(evt);
        }
        else if (evt.getSource() == comboProductos) {
            ReporteProductos.this.comboProductosActionPerformed(evt);
        }
        else if (evt.getSource() == btn5) {
            ReporteProductos.this.btn5ActionPerformed(evt);
        }
        else if (evt.getSource() == btn1) {
            ReporteProductos.this.btn1ActionPerformed(evt);
        }
        else if (evt.getSource() == btn2) {
            ReporteProductos.this.btn2ActionPerformed(evt);
        }
        else if (evt.getSource() == btn3) {
            ReporteProductos.this.btn3ActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents
public void configurarIconos() {
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
        ImageIcon a5 = new ImageIcon("iconos/check.png");
        btn1.setIcon(a1);
        btn2.setIcon(a2);
        btn5.setIcon(a5);
    }

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

    private void btnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjActionPerformed
        Transferir objeto = new Transferir();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnjActionPerformed

    private void btn5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String nombre = (String) comboProductos.getSelectedItem();

        Producto info = new Producto();
        info = obj.getDatosProducto(nombre, lista);
        String a [] = new String[2];
        if(info.getNombre().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }else{
            String codigo = info.getCodigo();
         
           a[0]= mes.getText();
           a[1]= ano.getText();
          boolean bander = Utilidades.hayVacios(a);
          if(bander==true){
          JOptionPane.showMessageDialog(null, "Por favor ingresa todos los datos");
          }  else{
              try{
              int x = Integer.parseInt(a[0]);
              int y = Integer.parseInt(a[1]);
            ResultSet r=  mov.getEntradasProducto("registro_producto", codigo, a[0], a[1]);
               DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
               String mo[] = new String[2];
               double total = 0.0;
               if(r==null){
                   JOptionPane.showMessageDialog(null, "No hay datos encontrados");
               }else{
               while(r.next()){
                  mo[0]= r.getString("dia");
                  mo[1]= r.getString("cantidad");
                  double cantidad = Double.parseDouble(mo[1]);
                  total = total + cantidad;
               model.addRow(mo);
               }
               
              jPanel4.setVisible(true);
             double totalvV = ven.getVentasPorProducto(codigo, a[0], a[1]);
               totalP.setText("Total productos: "+ total);
               totalV.setText("Total numero de ventas " + totalvV);
               }
            
              }catch(NumberFormatException e){
              JOptionPane.showMessageDialog(null, "Has ingresado datos incorrectos, por favor verifica lo que ingresaste");
              
              } catch (SQLException ex) {
                    Logger.getLogger(ReporteProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
        
          }
            // aqui va el llenado de la tabla
        }

        comboProductos.setSelectedIndex(0);
        mes.setText("");
        ano.setText("");
    }//GEN-LAST:event_btn5ActionPerformed

    private void comboProductosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProductosActionPerformed

    private void btnCapturaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
        try {
            Utilidades.capturaPantalla("Productos");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapturaActionPerformed

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        ReporteVentasEmergente objeto = new ReporteVentasEmergente();
        objeto.setVisible(true);

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
    Reportes re = new Reportes();
    re.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btn3ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField ano;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
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
    private JComboBox<String> comboProductos;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JTextField mes;
    private JTable tablaProductos;
    private JLabel totalP;
    private JLabel totalP1;
    private JLabel totalV;
    // End of variables declaration//GEN-END:variables
}
