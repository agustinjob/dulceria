package Ventana1;

import MisClases.Utilidades;
import dao.UsuarioDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.SQLException;
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
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Usuario_1 extends javax.swing.JFrame implements ActionListener {

    public Usuario_1() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        dispose();

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

        ImageIcon a1 = new ImageIcon("iconos/cliente_nuevo.png");
        ImageIcon a2 = new ImageIcon("iconos/modificar_cliente.png");
        ImageIcon a3 = new ImageIcon("iconos/eliminar_cliente.png");
        ImageIcon a4 = new ImageIcon("iconos/check.png");
        ImageIcon a5 = new ImageIcon("iconos/cancelar.png");
        btn1.setIcon(a1);
        btn2.setIcon(a2);
        btn3.setIcon(a3);
        btn4.setIcon(a4);
        btn5.setIcon(a5);
        setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();
        jPanel6 = new JPanel();
        jLabel7 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        nombre = new JTextField();
        direccion = new JTextField();
        email = new JTextField();
        telefono = new JTextField();
        password = new JTextField();
        tipoUsuario = new JComboBox<>();
        btn4 = new JButton();
        btn5 = new JButton();
        jPanel9 = new JPanel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        jPanel5 = new JPanel();
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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new Color(51, 51, 0));
        jPanel4.setPreferredSize(new Dimension(1365, 35));

        jLabel1.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("USUARIO");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1277, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setPreferredSize(new Dimension(1365, 472));

        jLabel2.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("Nuevo Usuario");

        jLabel6.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("Llena la siguiente información acerca del Nuevo Usuario:");

        jPanel6.setBackground(new Color(255, 255, 255));
        jPanel6.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        jLabel7.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Nombre Completo:");

        jLabel9.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Dirección:");

        jLabel10.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("Correo Electronico:");

        jLabel11.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("Tipo de Usuario:");

        jLabel12.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("Telefono(S):");

        jLabel13.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("Contraseña:");

        tipoUsuario.setModel(new DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoUsuario, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(email, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(password, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btn4.setBackground(new Color(153, 153, 0));
        btn4.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn4.setText("Guardar");
        btn4.setBorder(null);
        btn4.addActionListener(this);

        btn5.setBackground(new Color(153, 153, 0));
        btn5.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn5.setText("Cancelar");
        btn5.setBorder(null);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(734, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new Color(255, 255, 255));
        jPanel9.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel9.setPreferredSize(new Dimension(1365, 40));

        btn1.setBackground(new Color(153, 153, 0));
        btn1.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn1.setText("Nuevo Usuario");
        btn1.setBorder(null);
        btn1.setPreferredSize(new Dimension(180, 35));
        btn1.addActionListener(this);

        btn2.setBackground(new Color(153, 153, 0));
        btn2.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn2.setText("Modificar Usuario");
        btn2.setBorder(null);
        btn2.setPreferredSize(new Dimension(180, 35));
        btn2.addActionListener(this);

        btn3.setBackground(new Color(153, 153, 0));
        btn3.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn3.setText("Eliminar Usuario");
        btn3.setBorder(null);
        btn3.setPreferredSize(new Dimension(180, 35));
        btn3.addActionListener(this);

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(777, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(51, 51, 51));
        jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel5.setToolTipText("");
        jPanel5.setPreferredSize(new Dimension(1365, 100));

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

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 994, Short.MAX_VALUE)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(caja, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel2.setPreferredSize(new Dimension(1365, 40));

        btnb.setBackground(new Color(153, 153, 0));
        btnb.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnb.setText("F2 Clientes");
        btnb.setBorder(null);
        btnb.setMargin(new Insets(3, 14, 2, 14));
        btnb.setPreferredSize(new Dimension(135, 35));
        btnb.addActionListener(this);

        btnd.setBackground(new Color(153, 153, 0));
        btnd.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnd.setText("F5 Inventario");
        btnd.setBorder(null);
        btnd.setPreferredSize(new Dimension(135, 35));
        btnd.addActionListener(this);

        btne.setBackground(new Color(153, 153, 0));
        btne.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btne.setText("Bitácora");
        btne.setBorder(null);
        btne.setPreferredSize(new Dimension(135, 35));
        btne.addActionListener(this);

        btnf.setBackground(new Color(153, 153, 0));
        btnf.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnf.setText("Usuario");
        btnf.setBorder(null);
        btnf.setPreferredSize(new Dimension(135, 35));
        btnf.addActionListener(this);

        btni.setBackground(new Color(153, 153, 0));
        btni.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btni.setText("Reportes");
        btni.setBorder(null);
        btni.setPreferredSize(new Dimension(135, 35));
        btni.addActionListener(this);

        btnh.setBackground(new Color(153, 153, 0));
        btnh.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnh.setText("Corte");
        btnh.setBorder(null);
        btnh.setPreferredSize(new Dimension(135, 35));
        btnh.addActionListener(this);

        btna.setBackground(new Color(153, 153, 0));
        btna.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btna.setText("F1 Ventas");
        btna.setAlignmentX(0.5F);
        btna.setBorder(null);
        btna.setMargin(new Insets(3, 14, 2, 14));
        btna.setPreferredSize(new Dimension(135, 35));
        btna.addActionListener(this);

        btnc.setBackground(new Color(153, 153, 0));
        btnc.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnc.setText("F3 Productos");
        btnc.setBorder(null);
        btnc.setPreferredSize(new Dimension(135, 35));
        btnc.addActionListener(this);

        btnj.setBackground(new Color(153, 153, 0));
        btnj.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btnj.setText("F4 Transferir");
        btnj.setBorder(null);
        btnj.setPreferredSize(new Dimension(135, 35));

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
                        .addComponent(btne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, 462, 462, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btn4) {
            Usuario_1.this.btn4ActionPerformed(evt);
        }
        else if (evt.getSource() == btn1) {
            Usuario_1.this.btn1ActionPerformed(evt);
        }
        else if (evt.getSource() == btn2) {
            Usuario_1.this.btn2ActionPerformed(evt);
        }
        else if (evt.getSource() == btn3) {
            Usuario_1.this.btn3ActionPerformed(evt);
        }
        else if (evt.getSource() == btnb) {
            Usuario_1.this.btnbActionPerformed(evt);
        }
        else if (evt.getSource() == btnd) {
            Usuario_1.this.btndActionPerformed(evt);
        }
        else if (evt.getSource() == btne) {
            Usuario_1.this.btneActionPerformed(evt);
        }
        else if (evt.getSource() == btnf) {
            Usuario_1.this.btnfActionPerformed(evt);
        }
        else if (evt.getSource() == btni) {
            Usuario_1.this.btniActionPerformed(evt);
        }
        else if (evt.getSource() == btnh) {
            Usuario_1.this.btnhActionPerformed(evt);
        }
        else if (evt.getSource() == btna) {
            Usuario_1.this.btnaActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            Usuario_1.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btnCaptura) {
            Usuario_1.this.btnCapturaActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Usuario_1 obj = new Usuario_1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Usuario_modificar obj = new Usuario_modificar();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Usuario_eliminar obj = new Usuario_eliminar();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn3ActionPerformed

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

    private void btn4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String a[] = new String[6];
        UsuarioDAO obj = new UsuarioDAO();
// `nombre`, `direccion`, `username`, `password`, `tipoUsuario`, `telefono`
        a[0] = nombre.getText();
        a[1] = direccion.getText();
        a[2] = email.getText();
        a[3] = password.getText();
        a[4] = (String) tipoUsuario.getSelectedItem();
        a[5] = telefono.getText();

        boolean bandera = Utilidades.hayVacios(a);
        if (bandera == true) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingresa todos los datos solicitados", "Alerta", HEIGHT);
        } else {
            try {
                obj.almacena(a);
                JOptionPane.showMessageDialog(rootPane, "Usuario agregado", "Información", HEIGHT);
                nombre.setText("");
                direccion.setText("");
                email.setText("");
                password.setText("");
                telefono.setText("");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Usuario_1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Usuario_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapturaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
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
    private JTextField direccion;
    private JTextField email;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel9;
    private JTextField nombre;
    private JTextField password;
    private JTextField telefono;
    private JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
