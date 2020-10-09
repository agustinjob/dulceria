
package Ventana1;

import MisClases.Usuario;
import MisClases.Utilidades;
import dao.UsuarioDAO;
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


public class Usuario_modificar extends javax.swing.JFrame implements ActionListener {

   UsuarioDAO obj = new UsuarioDAO();
    Usuario usu = new Usuario();
   ArrayList<Usuario> lista = new ArrayList<Usuario>();
    public Usuario_modificar() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        dispose();
        modificarUsuario.setVisible(false);
        configurarIconos();
       try {
           llenarCombo();
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Usuario_modificar.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Usuario_modificar.class.getName()).log(Level.SEVERE, null, ex);
       }
             AutoCompleteDecorator.decorate(comboUsuario, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
   setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
       
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
        btn1.setIcon(a1);
        btn2.setIcon(a2);
        btn3.setIcon(a3);
        btn4.setIcon(a4);
    }
        public void llenarCombo() throws ClassNotFoundException, SQLException {
            
        lista = obj.getDatosUsuarios();
        int i = 0;
        while (i < lista.size()) {
            comboUsuario.addItem(lista.get(i).getNombre());
            i++;
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel11 = new JPanel();
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
        jPanel10 = new JPanel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        jPanel3 = new JPanel();
        jPanel12 = new JPanel();
        jLabel4 = new JLabel();
        jLabel11 = new JLabel();
        btn4 = new JButton();
        comboUsuario = new JComboBox<>();
        modificarUsuario = new JPanel();
        jLabel7 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        nombre = new JTextField();
        direccion = new JTextField();
        email = new JTextField();
        telefono = new JTextField();
        password = new JTextField();
        tipoUsuario = new JComboBox<>();
        jLabel6 = new JLabel();
        btn5 = new JButton();
        btn6 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(51, 51, 0));
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

        jPanel11.setBackground(new Color(51, 51, 51));
        jPanel11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel11.setToolTipText("");
        jPanel11.setPreferredSize(new Dimension(1365, 100));

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

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 994, Short.MAX_VALUE)
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                        .addComponent(btnf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );

        jPanel10.setBackground(new Color(255, 255, 255));
        jPanel10.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel10.setPreferredSize(new Dimension(1365, 40));

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

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(777, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setPreferredSize(new Dimension(1365, 400));

        jPanel12.setBackground(new Color(255, 255, 255));
        jPanel12.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jPanel12.setPreferredSize(new Dimension(500, 350));

        jLabel4.setFont(new Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Modificar Usuario");

        jLabel11.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel11.setText("Teclee el nombre del usuario:");

        btn4.setBackground(new Color(153, 153, 0));
        btn4.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn4.setText("Aceptar");
        btn4.setBorder(null);
        btn4.addActionListener(this);

        comboUsuario.setModel(new DefaultComboBoxModel<>(new String[] { " " }));

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel11))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(comboUsuario, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(32, 32, 32)
                .addComponent(comboUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modificarUsuario.setBackground(new Color(255, 255, 255));
        modificarUsuario.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        jLabel7.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Nombre Completo:");

        jLabel9.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setText("Dirección:");

        jLabel10.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("Correo Electronico:");

        jLabel12.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setText("Tipo de Usuario:");

        jLabel13.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("Telefono(S):");

        jLabel14.setFont(new Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setText("Contraseña:");

        jLabel6.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("Modifica la información que quieras cambiar del usuario:");

        btn5.setBackground(new Color(153, 153, 0));
        btn5.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn5.setText("Guardar");
        btn5.setBorder(null);
        btn5.addActionListener(this);

        btn6.setBackground(new Color(153, 153, 0));
        btn6.setFont(new Font("Cambria", 1, 14)); // NOI18N
        btn6.setText("Cancelar");
        btn6.setBorder(null);
        btn6.addActionListener(this);

        GroupLayout modificarUsuarioLayout = new GroupLayout(modificarUsuario);
        modificarUsuario.setLayout(modificarUsuarioLayout);
        modificarUsuarioLayout.setHorizontalGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, modificarUsuarioLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(94, 94, 94))
            .addGroup(modificarUsuarioLayout.createSequentialGroup()
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(modificarUsuarioLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoUsuario, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(modificarUsuarioLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        modificarUsuarioLayout.setVerticalGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, modificarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(direccion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(email, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(tipoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(telefono, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(password, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(modificarUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnb) {
            Usuario_modificar.this.btnbActionPerformed(evt);
        }
        else if (evt.getSource() == btnd) {
            Usuario_modificar.this.btndActionPerformed(evt);
        }
        else if (evt.getSource() == btne) {
            Usuario_modificar.this.btneActionPerformed(evt);
        }
        else if (evt.getSource() == btnf) {
            Usuario_modificar.this.btnfActionPerformed(evt);
        }
        else if (evt.getSource() == btni) {
            Usuario_modificar.this.btniActionPerformed(evt);
        }
        else if (evt.getSource() == btnh) {
            Usuario_modificar.this.btnhActionPerformed(evt);
        }
        else if (evt.getSource() == btna) {
            Usuario_modificar.this.btnaActionPerformed(evt);
        }
        else if (evt.getSource() == btnc) {
            Usuario_modificar.this.btncActionPerformed(evt);
        }
        else if (evt.getSource() == btn1) {
            Usuario_modificar.this.btn1ActionPerformed(evt);
        }
        else if (evt.getSource() == btn2) {
            Usuario_modificar.this.btn2ActionPerformed(evt);
        }
        else if (evt.getSource() == btn3) {
            Usuario_modificar.this.btn3ActionPerformed(evt);
        }
        else if (evt.getSource() == btn4) {
            Usuario_modificar.this.btn4ActionPerformed(evt);
        }
        else if (evt.getSource() == btn5) {
            Usuario_modificar.this.btn5ActionPerformed(evt);
        }
        else if (evt.getSource() == btn6) {
            Usuario_modificar.this.btn6ActionPerformed(evt);
        }
        else if (evt.getSource() == btnCaptura) {
            Usuario_modificar.this.btnCapturaActionPerformed(evt);
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

    private void btn1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Usuario_1 obj=new Usuario_1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Usuario_modificar obj=new Usuario_modificar();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Usuario_eliminar obj=new Usuario_eliminar();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
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
            
            usu.setNombre(a[0]);
            usu.setDireccion(a[1]);
            usu.setUsername(a[2]);
            usu.setPassword(a[3]);
            usu.setTipo(a[4]);
            usu.setTelefono(a[5]);
            obj.modificarDatosUsuario(usu);
            Usuario_modificar umo= new Usuario_modificar();
            umo.setVisible(true);
            this.dispose();
            nombre.setText("");
            direccion.setText("");
            email.setText("");
            password.setText("");
            telefono.setText("");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
          String nombreU = (String) comboUsuario.getSelectedItem();
        int i = 0;
     if(nombreU.equalsIgnoreCase("")){
     JOptionPane.showConfirmDialog(null, "Por favor ingresa un usuario");
     }else{
        while(i<lista.size()){
            if(lista.get(i).getNombre().equalsIgnoreCase(nombreU)){
             usu = lista.get(i);
          
             break;
            }
        i++;
        }
        modificarUsuario.setVisible(true);
        nombre.setText(usu.getNombre());
        direccion.setText(usu.getDireccion());
        email.setText(usu.getUsername());
        password.setText(usu.getPassword());
        tipoUsuario.addItem(usu.getTipo());
        if(usu.getTipo().equalsIgnoreCase("administrador")){
        tipoUsuario.addItem("Empleado");
        }else{
        tipoUsuario.addItem("Administrador");
        }
       telefono.setText(usu.getTelefono());
        
    /*    if(usu.getNombre() == null){
        JOptionPane.showMessageDialog(null, "Datos del usuario no encontrados");
        }else{
        modificarUsuario.setVisible(true);
       String a[] = new String[6];
       a[0] = nombre.getText();
        a[1] = direccion.getText();
        a[2] = email.getText();
        a[3] = password.getText();
        a[4] = (String) tipoUsuario.getSelectedItem();
        a[5] = telefono.getText();
        boolean ban = Utilidades.hayVacios(a);
        
        if(ban == true){
        JOptionPane.showMessageDialog(null, "Por favor ingresa todos los datos");
        }else{
            usu.setNombre(a[0]);
            usu.setDireccion(a[1]);
            usu.setUsername(a[2]);
            usu.setPassword(a[3]);
            usu.setTipo(a[4]);
            usu.setTelefono(a[5]);
           obj.modificarDatosUsuario(usu);
           Usuario_modificar umo= new Usuario_modificar();
           umo.setVisible(true);
           this.dispose();
        }
        }*/
     }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
 try {
            Utilidades.capturaPantalla("Usuario");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapturaActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Usuario_modificar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
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
    private JComboBox<String> comboUsuario;
    private JTextField direccion;
    private JTextField email;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel12;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel7;
    private JPanel modificarUsuario;
    private JTextField nombre;
    private JTextField password;
    private JTextField telefono;
    private JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
