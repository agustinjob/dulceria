package Ventana1;

import MisClases.Cliente;
import MisClases.Utilidades;
import dao.ClienteDAO;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
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
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Modificarcliente extends javax.swing.JFrame implements ActionListener {

    int filas;
    ClienteDAO obj = new ClienteDAO();
  ArrayList<Cliente> c;
  Cliente cliente = new Cliente();
  
    public Modificarcliente() {

        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        dispose();
        
        panelModificar.setVisible(false);
        configurarIconos();
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        try {
            llenarCombo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Modificarcliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Modificarcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       AutoCompleteDecorator.decorate(jComboBox1, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
 

    }

      public void llenarCombo() throws ClassNotFoundException, SQLException {
          
          c = new ArrayList<Cliente>();
          c = obj.getClientes();
        int i = 0;
        while (i < c.size()) {
            jComboBox1.addItem(c.get(i).getNombres());
            i++;
        }

    }
    public void configurarIconos(){
    
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
        ImageIcon iconoCap = new ImageIcon("iconos/ico_cap.png");
btnCaptura.setIcon(iconoCap);

        ImageIcon a1 = new ImageIcon("iconos/cliente_nuevo.png");
        ImageIcon a2 = new ImageIcon("iconos/modificar_cliente.png");
        ImageIcon a3 = new ImageIcon("iconos/eliminar_cliente.png");
        ImageIcon a4 = new ImageIcon("iconos/check.png");
        btnn.setIcon(a1);
        btnm.setIcon(a2);
        btnee.setIcon(a3);
        btnaa.setIcon(a4);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jLabel3 = new JLabel();
        caja = new JLabel();
        jPanel7 = new JPanel();
        btnCaptura = new JButton();
        jPanel2 = new JPanel();
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
        btnm = new JButton();
        btnee = new JButton();
        btnn = new JButton();
        jPanel5 = new JPanel();
        jPanel12 = new JPanel();
        jLabel4 = new JLabel();
        jLabel11 = new JLabel();
        btnaa = new JButton();
        jComboBox1 = new JComboBox<>();
        panelModificar = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        txtnombrec = new JTextField();
        txtdireccion = new JTextField();
        txttelefono = new JTextField();
        txtcredito = new JTextField();
        btn4 = new JButton();
        btn5 = new JButton();
        jLabel14 = new JLabel();
        jLabel13 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(0, 51, 51));
        jPanel1.setPreferredSize(new Dimension(1365, 35));

        jLabel1.setBackground(new Color(0, 153, 153));
        jLabel1.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("CREDITO A CLIENTES");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel3.setBackground(new Color(51, 51, 51));
        jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new Dimension(1365, 100));

        jLabel3.setFont(new Font("Cambria", 2, 48)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Alexito");

        jPanel7.setBackground(new Color(0, 0, 0));

        btnCaptura.setBackground(new Color(0, 0, 102));
        btnCaptura.setText("Capturar");
        btnCaptura.addActionListener(this);

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
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

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 994, Short.MAX_VALUE)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(caja, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel2.setPreferredSize(new Dimension(1365, 40));

        btnb.setBackground(new Color(0, 153, 153));
        btnb.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnb.setText("F2 Clientes");
        btnb.setBorder(null);
        btnb.setMargin(new Insets(3, 14, 2, 14));
        btnb.setPreferredSize(new Dimension(135, 35));
        btnb.addActionListener(this);

        btnd.setBackground(new Color(0, 153, 153));
        btnd.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnd.setText("F5 Inventario");
        btnd.setBorder(null);
        btnd.setPreferredSize(new Dimension(135, 35));
        btnd.addActionListener(this);

        btne.setBackground(new Color(0, 153, 153));
        btne.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btne.setText("Bitácora");
        btne.setBorder(null);
        btne.setPreferredSize(new Dimension(135, 35));
        btne.addActionListener(this);

        btnf.setBackground(new Color(0, 153, 153));
        btnf.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnf.setText("Usuario");
        btnf.setBorder(null);
        btnf.setPreferredSize(new Dimension(135, 35));
        btnf.addActionListener(this);

        btni.setBackground(new Color(0, 153, 153));
        btni.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btni.setText("Reportes");
        btni.setBorder(null);
        btni.setPreferredSize(new Dimension(135, 35));
        btni.addActionListener(this);

        btnh.setBackground(new Color(0, 153, 153));
        btnh.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnh.setText("Corte");
        btnh.setBorder(null);
        btnh.setPreferredSize(new Dimension(135, 35));
        btnh.addActionListener(this);

        btna.setBackground(new Color(0, 153, 153));
        btna.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btna.setText("F1 Ventas");
        btna.setAlignmentX(0.5F);
        btna.setBorder(null);
        btna.setMargin(new Insets(3, 14, 2, 14));
        btna.setPreferredSize(new Dimension(135, 35));
        btna.addActionListener(this);

        btnc.setBackground(new Color(0, 153, 153));
        btnc.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnc.setText("F3 Productos");
        btnc.setBorder(null);
        btnc.setPreferredSize(new Dimension(135, 35));
        btnc.addActionListener(this);

        btnj.setBackground(new Color(0, 153, 153));
        btnj.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnj.setText("F4 Transferir");
        btnj.setBorder(null);
        btnj.setPreferredSize(new Dimension(135, 35));
        btnj.addActionListener(this);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel4.setPreferredSize(new Dimension(1365, 40));

        btnm.setBackground(new Color(0, 153, 153));
        btnm.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnm.setText("Modificar Cliente");
        btnm.setBorder(null);
        btnm.setPreferredSize(new Dimension(180, 35));
        btnm.addActionListener(this);

        btnee.setBackground(new Color(0, 153, 153));
        btnee.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnee.setText("Eliminar Cliente");
        btnee.setBorder(null);
        btnee.setPreferredSize(new Dimension(180, 35));
        btnee.addActionListener(this);

        btnn.setBackground(new Color(0, 153, 153));
        btnn.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnn.setText("Nuevo Cliente");
        btnn.setBorder(null);
        btnn.setPreferredSize(new Dimension(180, 35));
        btnn.addActionListener(this);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(777, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setPreferredSize(new Dimension(1365, 496));

        jPanel12.setBackground(new Color(255, 255, 255));
        jPanel12.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel12.setPreferredSize(new Dimension(500, 380));

        jLabel4.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Modificar Cliente");

        jLabel11.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel11.setText("Teclee el nombre del cliente:");

        btnaa.setBackground(new Color(0, 153, 153));
        btnaa.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnaa.setText("Buscar");
        btnaa.setBorder(null);
        btnaa.addActionListener(this);

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { " " }));

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(btnaa, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jLabel4))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jLabel11))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnaa, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        panelModificar.setBackground(new Color(255, 255, 255));
        panelModificar.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        panelModificar.setPreferredSize(new Dimension(500, 380));

        jLabel6.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Nombre Completo");

        jLabel7.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Telefono(s):");

        jLabel9.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Limite de Credito:");

        txtnombrec.setPreferredSize(new Dimension(250, 30));

        txtdireccion.setPreferredSize(new Dimension(250, 30));

        txttelefono.setPreferredSize(new Dimension(250, 30));

        txtcredito.setPreferredSize(new Dimension(250, 30));

        btn4.setBackground(new Color(0, 153, 153));
        btn4.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn4.setText("Modificar datos");
        btn4.setBorder(null);
        btn4.setPreferredSize(new Dimension(180, 35));
        btn4.addActionListener(this);

        btn5.setBackground(new Color(0, 153, 153));
        btn5.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn5.setText("Cancelar");
        btn5.setBorder(null);
        btn5.setPreferredSize(new Dimension(180, 35));

        jLabel14.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel14.setText("Ingresa los datos del cliente que quieras modificar");

        jLabel13.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setText("Modificar Cliente");

        GroupLayout panelModificarLayout = new GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(92, 92, 92)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, panelModificarLayout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, GroupLayout.Alignment.TRAILING))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtcredito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelModificarLayout.setVerticalGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(37, 37, 37)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombrec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcredito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(panelModificarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(panelModificar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelModificar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnb) {
            Modificarcliente.this.btnbActionPerformed(evt);
        }
        else if (evt.getSource() == btnd) {
            Modificarcliente.this.btndActionPerformed(evt);
        }
        else if (evt.getSource() == btne) {
            Modificarcliente.this.btneActionPerformed(evt);
        }
        else if (evt.getSource() == btnf) {
            Modificarcliente.this.btnfActionPerformed(evt);
        }
        else if (evt.getSource() == btni) {
            Modificarcliente.this.btniActionPerformed(evt);
        }
        else if (evt.getSource() == btnh) {
            Modificarcliente.this.btnhActionPerformed(evt);
        }
        else if (evt.getSource() == btna) {
            Modificarcliente.this.btnaActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            Modificarcliente.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btnj) {
            Modificarcliente.this.btnjActionPerformed(evt);
        }
        else if (evt.getSource() == btnm) {
            Modificarcliente.this.btnmActionPerformed(evt);
        }
        else if (evt.getSource() == btnee) {
            Modificarcliente.this.btneeActionPerformed(evt);
        }
        else if (evt.getSource() == btnn) {
            Modificarcliente.this.btnnActionPerformed(evt);
        }
        else if (evt.getSource() == btnaa) {
            Modificarcliente.this.btnaaActionPerformed(evt);
        }
        else if (evt.getSource() == btn4) {
            Modificarcliente.this.btn4ActionPerformed(evt);
        }
        else if (evt.getSource() == btnCaptura) {
            Modificarcliente.this.btnCapturaActionPerformed(evt);
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

    private void btnmActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnmActionPerformed
        Modificarcliente obj = new Modificarcliente();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmActionPerformed

    private void btneeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btneeActionPerformed
        Eliminar_cliente obj = new Eliminar_cliente();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btneeActionPerformed

    private void btnnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnnActionPerformed
        Ventana4 objeto = new Ventana4();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnnActionPerformed

    private void btnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjActionPerformed
        Transferir objeto = new Transferir();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnjActionPerformed

    private void btn4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       
        String [] a = new String[4];
        a[0]= txtnombrec.getText();
        a[1]=txtdireccion.getText();
        a[2]=txttelefono.getText();
        a[3]=txtcredito.getText();
        boolean bandera = Utilidades.hayVacios(a);

        if(bandera == true){
            JOptionPane.showMessageDialog(null, "Por favor ingresa todos los datos", "Alerta", HEIGHT);
        }else{
            cliente.setNombres(a[0]);
            cliente.setTelefono(a[2]);
            cliente.setDireccion(a[1]);
            cliente.setLimiteCredito(a[3]);
            obj.modificarDatosCliente(cliente);
           
            Modificarcliente mod = new Modificarcliente();
            mod.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnaaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnaaActionPerformed
        String nombre = (String) jComboBox1.getSelectedItem();
        int i = 0;
        Cliente cli = new Cliente();
        while(i<c.size()){
            if(c.get(i).getNombres().equalsIgnoreCase(nombre)){
             cli = c.get(i);
             cliente = cli;
             break;
            }
        i++;
        }
        
        if(cli.getNombres() == null){
        JOptionPane.showMessageDialog(null, "Datos del cliente no encontrados");
        }else{
        panelModificar.setVisible(true);
        txtnombrec.setText(cli.getNombres());
        txtdireccion.setText(cli.getDireccion());
        txttelefono.setText(cli.getTelefono());
        txtcredito.setText(cli.getLimiteCredito());
        }
        
    }//GEN-LAST:event_btnaaActionPerformed

    private void btnCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
       try {
            Utilidades.capturaPantalla("Cliente");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapturaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn4;
    private JButton btn5;
    private JButton btnCaptura;
    private JButton btna;
    private JButton btnaa;
    private JButton btnb;
    private JButton btnc;
    private JButton btnd;
    private JButton btne;
    private JButton btnee;
    private JButton btnf;
    private JButton btnh;
    private JButton btni;
    private JButton btnj;
    private JButton btnm;
    private JButton btnn;
    private JLabel caja;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel12;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel7;
    private JPanel panelModificar;
    private JTextField txtcredito;
    private JTextField txtdireccion;
    private JTextField txtnombrec;
    private JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
