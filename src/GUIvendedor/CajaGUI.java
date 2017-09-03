package GUIvendedor;


import Dao.cajaDao;
import To.cajaTo;
import java.sql.ResultSet;
import java.util.Calendar;

/**
 *
 * @author Michael
 */
public class CajaGUI extends javax.swing.JDialog {

    ResultSet rs, rs1, rs2;
    cajaDao cDao = new cajaDao();
    double entrada;
    double ventas;
    double compras;
    double reparaciones;
    double totalEfec;
    double ventasTotal;

    public CajaGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        calendario();
        calendario2();
        inicio();
        IniciarCuentas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVentas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtReparaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCompras = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVentadelDia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblFecha1 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnInciar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Fecha:");

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Control de Entrada y Salida de Efectivo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setText("dd/mm/aa");

        jLabel3.setText("Entrada:");

        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        jLabel4.setText("Ventas: S/.");

        txtVentas.setEditable(false);
        txtVentas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVentas.setText("0.0");

        jLabel5.setText("Pedidos S/.");

        txtReparaciones.setEditable(false);
        txtReparaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReparaciones.setText("0.0");

        jLabel6.setText("Compras: S/.");

        txtCompras.setEditable(false);
        txtCompras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCompras.setText("0.0");

        jLabel7.setText("Total Efectivo : S/.");

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0.0");

        jLabel8.setText("Venta del dia: S/.");

        txtVentadelDia.setEditable(false);
        txtVentadelDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVentadelDia.setText("0.0");

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));

        lblFecha1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        lblFecha1.setText("dd/mm/aa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(lblFecha1))
        );

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnInciar.setText("Iniciar");
        btnInciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInciarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(txtVentadelDia))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFecha))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtReparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtVentadelDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        try {
            cajaTo to = new cajaTo();
            to.setFecha(lblFecha.getText());
            to.setVentas(Double.parseDouble(txtVentas.getText()));
            to.setReparaciones(Double.parseDouble(txtReparaciones.getText()));
            to.setCompras(Double.parseDouble(txtCompras.getText()));
            to.setTotalEfectivo(Double.parseDouble(txtTotal.getText()));
            to.setTotalVentas(Double.parseDouble(txtVentadelDia.getText()));
            cDao.finalizarCaja(to);
            btnFinalizar.setEnabled(false);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        // un pequeño error  :P
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnInciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarActionPerformed
        try {
            cajaTo to = new cajaTo();
            entrada = Double.parseDouble(txtEntrada.getText());
            ventas = 0.0;
            reparaciones = 0.0;
            compras = 0.0;
            totalEfec = 0.0;
            ventasTotal = 0.0;

            to.setFecha(lblFecha.getText());
            to.setEntrada(entrada);
            to.setVentas(ventas);
            to.setReparaciones(reparaciones);
            to.setCompras(compras);
            to.setTotalEfectivo(totalEfec);
            to.setTotalVentas(ventasTotal);
            if (entrada > 0) {
                cDao.insertar(to);
                btnInciar.setEnabled(false);
                txtEntrada.setEditable(false);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnInciarActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JTextField txtCompras;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtReparaciones;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVentadelDia;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
    private void IniciarCuentas() {
        try {
            ventas = 0;
            // captura las ventas del dia ***************************************
            rs = cDao.ventasFecha();
            while (rs.next()) {
                ventas = rs.getDouble(1);
                if (!rs.getString(2).equals(lblFecha1.getText())) {
                    txtVentas.setText("0.0");
                } else {
                    txtVentas.setText(String.valueOf(ventas));
                }
//                
            }

            // captura de reparaciones del dia *************************************
            rs1 = cDao.Reparaciones();
            while (rs1.next()) {
                reparaciones = rs1.getDouble(1);
                if (!rs1.getString(2).equals(lblFecha1.getText())) {
                    txtReparaciones.setText("0.0");
                } else {
                    txtReparaciones.setText(String.valueOf(reparaciones));
                }
            }

            // captura compras*******************************************************
            rs2 = cDao.Compras();
            while (rs2.next()) {
                compras = rs2.getDouble(1);
                if (!rs2.getString(2).equals(lblFecha.getText())) {
                    txtCompras.setText("0.0");
                } else {
                    txtCompras.setText(String.valueOf(compras));
                }
            }
            calculos();
        } catch (Exception e) {
            System.out.println(e);
        }

//           calculos();
    }

    private void calendario() {
        Calendar cal1 = Calendar.getInstance();
        String mesInt = "";
//********  AÑO   ********//
        int año = cal1.get(Calendar.YEAR);
        int añoAc = año - 2000;
//*********Mes*********//
        int mes = cal1.get(Calendar.MONTH);
        int mesActual = mes + 1;

        if (mesActual < 9) {
            mesInt = "/0" + mesActual;
        } else {
            mesInt = "/" + mesActual;
        }
//********Dia**********//
        int dia = cal1.get(Calendar.DAY_OF_YEAR);
        String diaInt = "";
        if (dia < 10) {
            diaInt = "/0" + dia;
        } else {
            diaInt = "/" + dia;
        }

        lblFecha.setText("" + añoAc + mesInt + diaInt);

    }

    private void calendario2() {
        Calendar cal1 = Calendar.getInstance();
        String mesInt = "";
//********  AÑO   ********//
        int año = cal1.get(Calendar.YEAR);
        int añoAc = año - 2000;
//*********Mes*********//
        int mes = cal1.get(Calendar.MONTH);
        int mesActual = mes + 1;

        if (mesActual < 9) {
            mesInt = "0" + mesActual + "/";
        } else {
            mesInt = mesActual + "/";
        }
//********Dia**********//
        int dia = cal1.get(Calendar.DAY_OF_YEAR);
        String diaInt = "";
        if (dia < 10) {
            diaInt = "0" + dia + "/";
        } else {
            diaInt = dia + "/";
        }

        lblFecha1.setText("" + diaInt + mesInt + añoAc);

    }

    private void inicio() {
        try {
            cajaTo to = new cajaTo();
            to.setFecha(lblFecha.getText());
            rs = cDao.cajaView(to);
            while (rs.next()) {
                entrada = rs.getDouble(1);
            }
            if (entrada > 0) {
                txtEntrada.setText(String.valueOf(entrada));
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void calculos() {
        //calculos
        totalEfec = 0;
        ventasTotal = 0;
        totalEfec = entrada + ventas + reparaciones + compras;
        ventasTotal = totalEfec - entrada;
        txtTotal.setText(String.valueOf(totalEfec));
        txtVentadelDia.setText(String.valueOf(ventasTotal));

    }
}
