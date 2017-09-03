/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIvendedor;

import Dao.productoDao;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Michael
 */
public class productosG extends javax.swing.JDialog {

    productoDao pDao = new productoDao();
    ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();
    boolean sw;
    String codMarca;

    public productosG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
//        setUndecorated(true);
        initComponents();
        setSize(618, 599);
        setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 241, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 24));

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Marca", "modelo", "Categoria", "Preciio", "Operador", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistro.setGridColor(new java.awt.Color(153, 255, 0));
        tblRegistro.setOpaque(false);
        tblRegistro.setSelectionBackground(new java.awt.Color(255, 255, 204));
        tblRegistro.setSelectionForeground(new java.awt.Color(0, 0, 255));
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 500, 210));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Producto en Stock (Ventas)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenAP/rep.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try {
            String marca = txtBuscar.getText().toLowerCase();
            String caracteristica = txtBuscar.getText().toLowerCase();
            model = (DefaultTableModel) tblRegistro.getModel();
            rs = pDao.buscar(marca, caracteristica);
            while (tblRegistro.getRowCount() > 0) {
                model.removeRow(0);
            }
            if (txtBuscar.getText().isEmpty()) {

            } else {
                while (rs.next()) {
                    Object[] regi = {
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getDouble(5), rs.getString(6), rs.getInt(7)
                    };
                    model.addRow(regi);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked

    }//GEN-LAST:event_tblRegistroMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BoletaDeVenta.txtCodProducto.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
        BoletaDeVenta.txtMarca.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 1).toString());
        BoletaDeVenta.txtCategoria.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 3).toString());
        BoletaDeVenta.txtModelo.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 2).toString());
        BoletaDeVenta.txtPrecio.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 4).toString());
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
