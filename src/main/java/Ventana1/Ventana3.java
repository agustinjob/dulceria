package Ventana1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MisClases.Producto;
import MisClases.Usuario;
import MisClases.Utilidades;
import dao.ProductoDAO;
import dao.TicketDAO;
import dao.UsuarioDAO;
import java.awt.AWTException;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

public class Ventana3 extends javax.swing.JFrame {

    DefaultTableModel md;
    String data[][] = {};
    String cabeza[] = {"Código de barras", "Descripcion de producto", "Precio venta", "Cant", "importe", "Existencia", "Precio Costo"};
    int filas;
    ProductoDAO obj = new ProductoDAO();
    ArrayList<Producto> p = new ArrayList();
    DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
    int tipoPrecio;
    private Usuario usu;
    double total = 0.0d;
    int numeroArticulos = 0;
    TicketDAO tick = new TicketDAO();
    Ventana3 ven3;

    public Ventana3() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        inicializarIconos();
        setLocationRelativeTo(null);
        tipoPrecio = 1;
        md = new DefaultTableModel();
        this.txtTabla.setModel(md);
        txtCodigo.requestFocus();
        md = new DefaultTableModel(data, cabeza) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 4 ? true : false;
            }
        };
setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        txtTicket.setText("Folio del ticket: " + tick.getNumero());
        centrarValoresTabla();

    }

    public Ventana3(DefaultTableModel md) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        inicializarIconos();
        setLocationRelativeTo(null);
        this.md = md;
setIconImage(new ImageIcon("iconos/punto-de-venta.png").getImage());
        centrarValoresTabla();
      //  actualizarImporteTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtagregar = new javax.swing.JButton();
        comboProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        recibo = new javax.swing.JPanel();
        recibo1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btnReiniciarFolio = new javax.swing.JButton();
        btndevoluciones = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        caja = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnCaptura = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnd = new javax.swing.JButton();
        btne = new javax.swing.JButton();
        btnf = new javax.swing.JButton();
        btni = new javax.swing.JButton();
        btnh = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btnb = new javax.swing.JButton();
        btnj = new javax.swing.JButton();
        txtTicket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 40));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre  producto:");

        txtagregar.setBackground(new java.awt.Color(0, 51, 153));
        txtagregar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtagregar.setForeground(new java.awt.Color(255, 255, 255));
        txtagregar.setText("ENTER- Agregar Producto");
        txtagregar.setBorder(null);
        txtagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtagregarActionPerformed(evt);
            }
        });

        comboProductos.setEditable(true);
        comboProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Código:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1365, 40));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("VENTA - Ticket 1 (1)");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1221, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 1365, 35));

        recibo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1512, 197, -1, -1));

        recibo1.setBackground(new java.awt.Color(255, 255, 255));
        recibo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBorder(null);

        txtTabla.setBackground(new java.awt.Color(153, 153, 255));
        txtTabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTabla.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        txtTabla.setForeground(new java.awt.Color(255, 255, 255));
        txtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de barras ", "Descripción del Producto", "Precio Venta", "Cant", "Importe", "Existencia"
            }
        ));
        txtTabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        txtTabla.setAutoscrolls(false);
        txtTabla.setColumnSelectionAllowed(true);
        txtTabla.setDropMode(javax.swing.DropMode.ON);
        txtTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        txtTabla.setShowHorizontalLines(false);
        txtTabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTablaFocusLost(evt);
            }
        });
        txtTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtTabla);
        txtTabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (txtTabla.getColumnModel().getColumnCount() > 0) {
            txtTabla.getColumnModel().getColumn(0).setPreferredWidth(100);
            txtTabla.getColumnModel().getColumn(1).setResizable(false);
            txtTabla.getColumnModel().getColumn(1).setPreferredWidth(538);
            txtTabla.getColumnModel().getColumn(2).setPreferredWidth(150);
            txtTabla.getColumnModel().getColumn(3).setPreferredWidth(70);
            txtTabla.getColumnModel().getColumn(4).setPreferredWidth(70);
            txtTabla.getColumnModel().getColumn(5).setResizable(false);
            txtTabla.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        javax.swing.GroupLayout recibo1Layout = new javax.swing.GroupLayout(recibo1);
        recibo1.setLayout(recibo1Layout);
        recibo1Layout.setHorizontalGroup(
            recibo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recibo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
                .addContainerGap())
        );
        recibo1Layout.setVerticalGroup(
            recibo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recibo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );

        getContentPane().add(recibo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1365, 300));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn1.setBackground(new java.awt.Color(0, 51, 153));
        btn1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("INS Varios");
        btn1.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 51, 153));
        btn3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("F11 Mayoreo");
        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 51, 153));
        btn4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("F7 Entradas");
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 51, 153));
        btn5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("F8 Salidas");
        btn5.setBorder(null);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 51, 153));
        btn6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("DEL Borrar Art");
        btn6.setBorder(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(655, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1365, 40));

        jPanel6.setPreferredSize(new java.awt.Dimension(600, 40));

        btn7.setBackground(new java.awt.Color(0, 51, 153));
        btn7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("Eliminar Todo");
        btn7.setBorder(null);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnReiniciarFolio.setBackground(new java.awt.Color(0, 51, 153));
        btnReiniciarFolio.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnReiniciarFolio.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciarFolio.setText("Reiniciar folio");
        btnReiniciarFolio.setBorder(null);
        btnReiniciarFolio.setPreferredSize(new java.awt.Dimension(150, 35));
        btnReiniciarFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarFolioActionPerformed(evt);
            }
        });

        btndevoluciones.setBackground(new java.awt.Color(0, 51, 153));
        btndevoluciones.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btndevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btndevoluciones.setText("Devoluciones");
        btndevoluciones.setBorder(null);
        btndevoluciones.setPreferredSize(new java.awt.Dimension(150, 35));
        btndevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolucionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciarFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, 40));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn8.setBackground(new java.awt.Color(0, 51, 153));
        btn8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("F12 Cobrar");
        btn8.setBorder(null);
        btn8.setPreferredSize(new java.awt.Dimension(130, 38));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("$");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtTotal))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, 60));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Cambria", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alexito");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        btnCaptura.setBackground(new java.awt.Color(0, 0, 102));
        btnCaptura.setText("Capturar");
        btnCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btnCaptura)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCaptura)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 993, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnd.setBackground(new java.awt.Color(0, 51, 102));
        btnd.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnd.setForeground(new java.awt.Color(255, 255, 255));
        btnd.setText("F5 Inventario");
        btnd.setBorder(null);
        btnd.setPreferredSize(new java.awt.Dimension(135, 35));
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        btne.setBackground(new java.awt.Color(0, 51, 102));
        btne.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btne.setForeground(new java.awt.Color(255, 255, 255));
        btne.setText("Bitácora");
        btne.setBorder(null);
        btne.setPreferredSize(new java.awt.Dimension(135, 35));
        btne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneActionPerformed(evt);
            }
        });

        btnf.setBackground(new java.awt.Color(0, 51, 102));
        btnf.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnf.setForeground(new java.awt.Color(255, 255, 255));
        btnf.setText("Usuario");
        btnf.setBorder(null);
        btnf.setPreferredSize(new java.awt.Dimension(135, 35));
        btnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfActionPerformed(evt);
            }
        });

        btni.setBackground(new java.awt.Color(0, 51, 102));
        btni.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btni.setForeground(new java.awt.Color(255, 255, 255));
        btni.setText("Reportes");
        btni.setBorder(null);
        btni.setPreferredSize(new java.awt.Dimension(135, 35));
        btni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniActionPerformed(evt);
            }
        });

        btnh.setBackground(new java.awt.Color(0, 51, 102));
        btnh.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnh.setForeground(new java.awt.Color(255, 255, 255));
        btnh.setText("Corte");
        btnh.setBorder(null);
        btnh.setPreferredSize(new java.awt.Dimension(135, 35));
        btnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhActionPerformed(evt);
            }
        });

        btna.setBackground(new java.awt.Color(0, 51, 102));
        btna.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btna.setForeground(new java.awt.Color(255, 255, 255));
        btna.setText("F1 Ventas");
        btna.setAlignmentX(0.5F);
        btna.setBorder(null);
        btna.setMargin(new java.awt.Insets(3, 14, 2, 14));
        btna.setPreferredSize(new java.awt.Dimension(135, 35));
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
            }
        });

        btnc.setBackground(new java.awt.Color(0, 51, 102));
        btnc.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnc.setForeground(new java.awt.Color(255, 255, 255));
        btnc.setText("F3 Productos");
        btnc.setBorder(null);
        btnc.setPreferredSize(new java.awt.Dimension(135, 35));
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnb.setBackground(new java.awt.Color(0, 51, 102));
        btnb.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnb.setForeground(new java.awt.Color(255, 255, 255));
        btnb.setText("F2 Clientes");
        btnb.setBorder(null);
        btnb.setPreferredSize(new java.awt.Dimension(135, 35));
        btnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbActionPerformed(evt);
            }
        });

        btnj.setBackground(new java.awt.Color(0, 51, 102));
        btnj.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnj.setForeground(new java.awt.Color(255, 255, 255));
        btnj.setText("F4 Transferir");
        btnj.setBorder(null);
        btnj.setPreferredSize(new java.awt.Dimension(135, 35));
        btnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 1365, 40));

        txtTicket.setText("Folio ticket:");
        getContentPane().add(txtTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void centrarValoresTabla() {
        JTableHeader tablaCabe = txtTabla.getTableHeader();
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) txtTabla.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);
        tablaCabe.setDefaultRenderer(render);
        txtTabla.setModel(md);
        dt.setHorizontalAlignment(SwingConstants.CENTER);
        txtTabla.getColumnModel().getColumn(0).setCellRenderer(dt);

        txtTabla.getColumnModel().getColumn(1).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(2).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(3).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(4).setCellRenderer(dt);
        txtTabla.getColumnModel().getColumn(5).setCellRenderer(dt);
        
        txtTabla.getColumnModel().getColumn(6).setWidth(0);
        txtTabla.getColumnModel().getColumn(6).setMinWidth(0);
        txtTabla.getColumnModel().getColumn(6).setMaxWidth(0);
        txtTabla.setRowHeight(30);
    }
public void actualizaTicket(String tik){
     txtTicket.setText("Folio del ticket: " + tik);
     txtTotal.setText("");
}
    public void llenarCombo() throws ClassNotFoundException, SQLException {

        p = obj.obtenerProductosSiHuboModificacion(p, true);
        int i = 0;
        while (i < p.size()) {
            comboProductos.addItem(p.get(i).getNombre());
            i++;
        }

    }
    private void txtagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtagregarActionPerformed
        String nombre = (String) comboProductos.getSelectedItem();
        nombre = nombre.trim();
        if (nombre.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del producto");
        } else {
            boolean bandera = revisarRepetidos(nombre);
            if (bandera == false) {
                String[] info = new String[7];
                info = obj.getProductoPorNombre(nombre, p, 1, tipoPrecio);

                if (info[0] == null) {

                    JOptionPane.showMessageDialog(null, "Producto no encontrado");
                } else {
                    double can = Double.parseDouble(info[5]);
                    if (can > 0) {
                        md.addRow(info);

                        total = total + (Double.parseDouble(info[2]) * Double.parseDouble(info[3]));

                        txtTotal.setText(total + "");
                        numeroArticulos = numeroArticulos + 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto esta registrado pero su invenario esta en 0, por favor agregar más producto en la sección correspondiente");
                    }

                }
            }
            comboProductos.setSelectedIndex(0);
            //  txtblanco.setText("");
        }


    }//GEN-LAST:event_txtagregarActionPerformed

public boolean masCantidadQueInventario(){

    DefaultTableModel model = (DefaultTableModel) txtTabla.getModel();
    int i = 0;
    while(i<model.getRowCount()){
   String cantidad =(String) model.getValueAt(i, 3);
   String inventario = (String) model.getValueAt(i, 5);
   System.out.println("Cantidad " + cantidad + " Inventario "+ inventario);
   double can = Double.parseDouble(cantidad);
   double inv = Double.parseDouble(inventario);
   if(can>inv){
       JOptionPane.showMessageDialog(null, "Revisa los datos, ingresaste más cantidad de un producto de lo que tienes en inventario");
   return true;
   }
   i++;
    }
    
    return false;
    
}
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Insvarios objeto;
        try {
            objeto = new Insvarios(md, tipoPrecio);
            objeto.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Entradaefectivo objeto = new Entradaefectivo();
        objeto.setVisible(true);

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Salidasefectivo objeto = new Salidasefectivo();
        objeto.setVisible(true);

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        eliminaCelda(1);

        if (numeroArticulos > 0)
            numeroArticulos = numeroArticulos - 1;
    }//GEN-LAST:event_btn6ActionPerformed

    public void eliminaCelda(int tipoEliminacion) {
        System.out.println("antes del model");
        DefaultTableModel tm = (DefaultTableModel) txtTabla.getModel();
         System.out.println("despues del modelo en tipo eliminacion");
        if (tipoEliminacion == 1) {
            if (txtTabla.getSelectedRow() >= 0) {
                if (txtTabla.getValueAt(txtTabla.getSelectedRow(), 0) == null) {
                    JOptionPane.showMessageDialog(this, "La fila que selecciono ,no cuenta con ningún producto", "Alexito", JOptionPane.WARNING_MESSAGE);
                } else {

                    //  int rpta = JOptionPane.showConfirmDialog(this, "¿DESEA ELIMINAR EL PRODUCTO?", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
                    // if (rpta == JOptionPane.YES_OPTION) {
                    double resta = Double.parseDouble((String) tm.getValueAt(txtTabla.getSelectedRow(), 4));
                    total = total - resta;
                    tm.removeRow(txtTabla.getSelectedRow());
                    txtTotal.setText(total + "");
                    /*llamamos a la funcion obj.eliminar , para que se borre de nuestra lista*/
                    // da error porque modifique la clase  obj.eliminar();
                    //}
                }
            } else {
                JOptionPane.showMessageDialog(this, "No haz seleccionado ninguna fila", "Alexito", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            System.out.println("Hay error aca");
            int r = 0;
            while (tm.getRowCount() > r) {
                tm.removeRow(r);
            }
            System.out.println("Hay error aca 2");
        }
    }
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        DefaultTableModel tm = (DefaultTableModel) txtTabla.getModel();
        
        if (tm.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa productos para realizar el cobro");
        } else {
            
           if(!masCantidadQueInventario()){
            F12Cobrar obj = new F12Cobrar(tm, ven3);
            obj.setVisible(true);
            String info = txtTotal.getText();
            F12Cobrar.txtn2.setText(info);
            F12Cobrar.txtn1.requestFocus();
            obj.numArticulos.setText(numeroArticulos + "");
        }
        }

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (tipoPrecio == 1) {
            JOptionPane.showMessageDialog(this, "Se ha activado el precio de mayoreo", "SISTEMA", JOptionPane.WARNING_MESSAGE);
            tipoPrecio = 2;
        } else {
            JOptionPane.showMessageDialog(this, "Se ha desactivado el precio de mayoreo", "SISTEMA", JOptionPane.WARNING_MESSAGE);
            tipoPrecio = 1;
        }

    }//GEN-LAST:event_btn3ActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        F4inventario objeto = new F4inventario();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btndActionPerformed

    private void btneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneActionPerformed
        Bitacora objeto = new Bitacora();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btneActionPerformed

    private void btnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfActionPerformed
        Usuario_1 objeto = new Usuario_1();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnfActionPerformed

    private void btniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniActionPerformed
        Reportes objeto = new Reportes();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btniActionPerformed

    private void btnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhActionPerformed
        Corte objeto = new Corte();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnhActionPerformed

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed

    }//GEN-LAST:event_btnaActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        F3productos objeto = new F3productos();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncActionPerformed

    private void btnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbActionPerformed
        Ventana4 objeto = new Ventana4();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbActionPerformed

    private void btnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjActionPerformed
        Transferir objeto = new Transferir();
        objeto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnjActionPerformed
    public void actualizarImporteTabla() {
        DefaultTableModel tm = (DefaultTableModel) txtTabla.getModel();
        //  int rpta = JOptionPane.showConfirmDialog(this, "¿DESEA ELIMINAR EL PRODUCTO?", "SISTEMA", JOptionPane.INFORMATION_MESSAGE);
        // if (rpta == JOptionPane.YES_OPTION) {
        numeroArticulos = 0;
        total = 0;
        for (int i = 0; i < tm.getRowCount(); i++) {
            double precio = Double.parseDouble((String) tm.getValueAt(i, 2));
            double cantidad = Double.parseDouble((String) tm.getValueAt(i, 3));
            double inventario = Double.parseDouble((String) tm.getValueAt(i, 5));
            numeroArticulos = (int) (numeroArticulos + cantidad);
            if (cantidad > inventario) {
                JOptionPane.showMessageDialog(null, "La cantidad de productos a vender es mayor que el número de productos en inventario");
                tm.removeRow(i);
            } else {
                double suma = precio * cantidad;
                tm.setValueAt(suma + "", i, 4);
                total = total + suma;
            }

        }

        txtTotal.setText(total + "");
    }
    
   
    
    private void txtTablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTablaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          int row = txtTabla.getSelectedRow();
          int column= txtTabla.getSelectedColumn();
          double preci = Double.parseDouble(txtTabla.getValueAt(row, 2)+"");
          if(column == 3){// por cantidad
          String can =(String)txtTabla.getValueAt(row, column);
          double canti = Double.parseDouble(can);
          double totalImporte = canti * preci;
          txtTabla.setValueAt(totalImporte+"", row, 4);
          }
          
          if(column == 4){// por importe
          String imp =(String)txtTabla.getValueAt(row, column);
          double impor = Double.parseDouble(imp);
          double totalCanti = impor/preci;
          txtTabla.setValueAt(totalCanti+"", row, 3);
          
          }
         actualizarImporteTabla();
           
        }

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            JOptionPane.showMessageDialog(this, "Ahora seguro dio DELETE", "SISTEMA", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTablaKeyPressed

    private void txtTablaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTablaFocusLost

    }//GEN-LAST:event_txtTablaFocusLost

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        eliminaCelda(2);
        numeroArticulos = 0;
        total = 0;
        txtTotal.setText("");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnReiniciarFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarFolioActionPerformed
        try {
            tick.modificarEstatus();
            txtTicket.setText("Folio ticket: " + tick.getNumero());// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReiniciarFolioActionPerformed

    private void btndevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolucionesActionPerformed
        Devoluciones obj = new Devoluciones(this);
        obj.setVisible(true);

    }//GEN-LAST:event_btndevolucionesActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

        String nombre = txtCodigo.getText();
        if (nombre.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un código");
        } else {
            boolean bandera = revisarRepetidos(nombre);
            if (bandera == false) {
                String[] info = new String[7];
                info = obj.getProductoPorNombre(nombre, p, 1, tipoPrecio);
                if (info[0] == null) {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado");
                } else {
                    double can = Double.parseDouble(info[5]);
                    if (can > 0) {
                        md.addRow(info);

                        total = total + (Double.parseDouble(info[2]) * Double.parseDouble(info[3]));

                        txtTotal.setText(total + "");
                        numeroArticulos = numeroArticulos + 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto esta registrado pero su invenario esta en 0, por favor agregar más producto en la sección correspondiente");
                    }
                }

            }
            txtCodigo.setText("");
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturaActionPerformed
        try {
            Utilidades.capturaPantalla("Ventas");
        } catch (AWTException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapturaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    public boolean revisarRepetidos(String codigo) {
        DefaultTableModel modelo = (DefaultTableModel) txtTabla.getModel();
        int i = 0;

        while (i < modelo.getRowCount()) {
            if (modelo.getValueAt(i, 0).equals(codigo) || modelo.getValueAt(i, 1).equals(codigo)) {
                String cantidad = (String) modelo.getValueAt(i, 3);
                double numero = Double.parseDouble(cantidad);
                String pre = (String) modelo.getValueAt(i, 2);
                double precio = Double.parseDouble(pre);
                numero = numero + 1;
                double to = precio * numero;
                modelo.setValueAt(numero + "", i, 3);
                modelo.setValueAt(to + "", i, 4);
                total = total + precio;
                txtTotal.setText(total + "");
                numeroArticulos = numeroArticulos + 1;
                return true;
            }
            i++;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnCaptura;
    private javax.swing.JButton btnReiniciarFolio;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnb;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btndevoluciones;
    private javax.swing.JButton btne;
    private javax.swing.JButton btnf;
    private javax.swing.JButton btnh;
    private javax.swing.JButton btni;
    private javax.swing.JButton btnj;
    private javax.swing.JLabel caja;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel recibo;
    private javax.swing.JPanel recibo1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTable txtTabla;
    private javax.swing.JLabel txtTicket;
    public static javax.swing.JTextField txtTotal;
    private javax.swing.JButton txtagregar;
    // End of variables declaration//GEN-END:variables

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public void setObjetoDeLaVentana(Ventana3 v3) {
        ven3 = v3;
    }

    public Ventana3 getObjetoDeLaVentana() {
        return ven3;
    }

    public Usuario getUsuario() {
        return usu;
    }

    public void setTabla(DefaultTableModel datos) {
        md = datos;
    }

    public DefaultTableModel getTabla() {
        return md;
    }

    public void inicializarIconos() {
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

        ImageIcon f = new ImageIcon("iconos/usuario.png");
        ImageIcon enter = new ImageIcon("iconos/check.png");
        ImageIcon aa = new ImageIcon("iconos/documentos.png");
        ImageIcon bb = new ImageIcon("iconos/lupa.png");
        ImageIcon ccc = new ImageIcon("iconos/estrella.png");
        ImageIcon dd = new ImageIcon("iconos/ganancias_dinero.png");
        ImageIcon ee = new ImageIcon("iconos/salida_dinero.png");
        ImageIcon ff = new ImageIcon("iconos/bote_basura.png");
        ImageIcon gg = new ImageIcon("iconos/carro_cobrar.png");
        ImageIcon iconoCap = new ImageIcon("iconos/ico_cap.png");

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
        btn1.setIcon(aa);
        btnReiniciarFolio.setIcon(e);
        btndevoluciones.setIcon(aa);
        btn3.setIcon(ccc);
        btn4.setIcon(dd);
        btn5.setIcon(ee);
        btn6.setIcon(ff);
        btn7.setIcon(ff);
        btn8.setIcon(gg);
        txtagregar.setIcon(enter);
        btnCaptura.setIcon(iconoCap);
        String tipo = UsuarioDAO.getTipo();
        if (tipo.equalsIgnoreCase("Empleado")) {

            btnb.setEnabled(false);
            btnc.setEnabled(false);
            btnj.setEnabled(false);
            btnd.setEnabled(false);
            btne.setEnabled(false);
            btnf.setEnabled(false);
            btnh.setEnabled(false);
            btni.setEnabled(false);

            btnb.setVisible(false);
            btnc.setVisible(false);
            btnj.setVisible(false);
            btnd.setVisible(false);
            btne.setVisible(false);
            btnf.setVisible(false);
            btnh.setVisible(false);
            btni.setVisible(false);
        }
        try {
            llenarCombo();
        } catch (Exception ClassNotFoundException) {
        }
        AutoCompleteDecorator.decorate(comboProductos, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

}
