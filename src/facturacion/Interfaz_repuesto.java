/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import sun.util.calendar.BaseCalendar;

/**
 *
 * @author ANDRES
 */
public class Interfaz_repuesto extends javax.swing.JInternalFrame {

    control_existencias con = new control_existencias();

    /**
     * Creates new form Interfaz_articulo
     */
    public Interfaz_repuesto() {
        initComponents();
        limpiar();
        bloquear_cajas();
        this.calendario.setEnabled(false);

        String[] campos = {"id_tipoarticulo", "descripcion_articulo"};
        List<OpcionGenerica> tipo = con.combox("tipo_articulo", campos);

        String[] campos1 = {"No_documento","Nombre"};
        List<OpcionGenerica> prov = con.combox("proveedor", campos1);
        comboproveedor.removeAllItems();
        for (OpcionGenerica prov1 : prov) {
            comboproveedor.addItem(prov1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descripcion_prod = new javax.swing.JTextField();
        pre_venta = new javax.swing.JTextField();
        cant_prod = new javax.swing.JTextField();
        comboproveedor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nuevoreg = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JDateChooser();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Repuesto");
        setPreferredSize(new java.awt.Dimension(800, 500));

        descripcion_prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcion_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion_prodActionPerformed(evt);
            }
        });

        pre_venta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pre_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_ventaActionPerformed(evt);
            }
        });
        pre_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pre_ventaKeyTyped(evt);
            }
        });

        cant_prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cant_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_prodActionPerformed(evt);
            }
        });
        cant_prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cant_prodKeyTyped(evt);
            }
        });

        comboproveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboproveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboproveedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descripción :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Precio venta :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Proveedor :");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nuevoreg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nuevoreg.setText("Nuevo registro");
        nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoregActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fecha ingreso :");

        registrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        calendario.setDateFormatString("yyyy/MM/d");
        calendario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cant_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pre_venta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar)
                                .addGap(35, 35, 35)
                                .addComponent(cancelar)
                                .addGap(101, 101, 101)))))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pre_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(descripcion_prod)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar() {

        descripcion_prod.setText("");
        pre_venta.setText("");

        cant_prod.setText("");

        comboproveedor.setName("");
        calendario.setName("");
    }

    public void bloquear_cajas() {

        descripcion_prod.setEnabled(false);
        pre_venta.setEnabled(false);

        cant_prod.setEnabled(false);

        comboproveedor.setEnabled(false);
        nuevoreg.setEnabled(true);
        registrar.setEnabled(false);
        cancelar.setEnabled(false);
        this.calendario.getCalendarButton().setEnabled(false);

    }

    public void desbloquear() {

        descripcion_prod.setEnabled(true);
        pre_venta.setEnabled(true);

        cant_prod.setEnabled(true);

        comboproveedor.setEnabled(true);
        nuevoreg.setEnabled(false);
        registrar.setEnabled(true);
        cancelar.setEnabled(true);
        this.calendario.getCalendarButton().setEnabled(true);

    }
    private void comboproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboproveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        bloquear_cajas();
        limpiar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoregActionPerformed
        desbloquear();
        descripcion_prod.requestFocus();
    }//GEN-LAST:event_nuevoregActionPerformed

    private void descripcion_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcion_prodActionPerformed
        descripcion_prod.transferFocus();
    }//GEN-LAST:event_descripcion_prodActionPerformed

    private void pre_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_ventaActionPerformed
        pre_venta.transferFocus();
    }//GEN-LAST:event_pre_ventaActionPerformed

    private void cant_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_prodActionPerformed
        cant_prod.transferFocus();
    }//GEN-LAST:event_cant_prodActionPerformed
    public static String convertTostring(Date Date) {
        DateFormat df;
        String fech = null;
        df = new SimpleDateFormat("yyyy-MM-d");
        fech = df.format(Date);
        return fech;
    }
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String des, tipo, prov, fecha;
        int preve, precos, sto;
        double preve2;
        des = descripcion_prod.getText();

        fecha = convertTostring(calendario.getDate());
        preve2 = Double.valueOf(pre_venta.getText());

        sto = Integer.parseInt(cant_prod.getText());
        OpcionGenerica opcion1 = (OpcionGenerica) comboproveedor.getSelectedItem();

        prov = String.valueOf(opcion1.getId());

        control_articulos ctrl = new control_articulos();
        if (!des.equals("")) {

            if (ctrl.ingresar_repuesto(null, des, preve2, sto, fecha, prov)) {
                JOptionPane.showMessageDialog(null, "El repuesto se registro con exito");
                limpiar();
                bloquear_cajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el repuesto", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos obligatorios");
        }

    }//GEN-LAST:event_registrarActionPerformed

    private void cant_prodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant_prodKeyTyped
        // TODO add your handling code here:
          char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_cant_prodKeyTyped

    private void pre_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pre_ventaKeyTyped
        // TODO add your handling code here:
          char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_pre_ventaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cant_prod;
    private javax.swing.JComboBox comboproveedor;
    private javax.swing.JTextField descripcion_prod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton nuevoreg;
    private javax.swing.JTextField pre_venta;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
