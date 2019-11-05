/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import static facturacion.Interfaz_Clientes.valida;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDRES
 */
public class interfaz_reportes extends javax.swing.JInternalFrame {

    /**
     * Creates new form interfaz_consultas
     */
    private Object[][] datostabla;
    control_existencias ctr = new control_existencias();

    public interfaz_reportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        comCalendario = new com.toedter.calendar.JDateChooser();
        chCantidad = new javax.swing.JCheckBox();

        setTitle("Reportes");

        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);

        tablaReporte.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaReporte.setEnabled(false);
        tablaReporte.setName(""); // NOI18N
        jScrollPane1.setViewportView(tablaReporte);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Número de documento del cliente:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Filtros:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Fecha de proceso:");

        cmbTipo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venta", "Mantenimiento" }));
        cmbTipo.setToolTipText("");
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        comCalendario.setDateFormatString("d/M/yyyy");

        chCantidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        chCantidad.setText("Cantidad de Procesos");
        chCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(chCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(chCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(comCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String convertTostring(Date Date) {
        DateFormat df;
        String fech = null;
        df = new SimpleDateFormat("d/M/yyyy");
        fech = df.format(Date);
        return fech;
    }

    public void cantidadProcesos() {
        String tipo = "";
        String cedula = "";
        String fecha = "";
        
        tipo = cmbTipo.getSelectedItem().toString();
        cedula = txtCliente.getText();
        fecha = (comCalendario.getDate()!=null)?convertTostring(comCalendario.getDate()):"";
        if(tipo.equals("Venta")){
            if(!cedula.isEmpty() && fecha.isEmpty()){
                datostabla = ctr.contarFactura(cedula,fecha);
                String columnas[] = {"Cedula Cliente", "Fecha Ultima venta", "Número de ventas realizados al cliente"};
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }else if(cedula.isEmpty() && !fecha.isEmpty()){
                datostabla = ctr.contarFactura(cedula,fecha);
                String columnas[] = {"Ultimo cliente que realizo una compra a la fecha seleccionada", "Fecha de venta", "Número de ventas realizados en la fecha seleccionada"};
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }else{
                datostabla = ctr.contarFactura(cedula,fecha);
                String columnas[] = {"Cedula Cliente", "Fecha Ultima venta", "Número de ventas realizados al cliente"};
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }
        }else{
            if(!cedula.isEmpty() && fecha.isEmpty()){
                datostabla = ctr.contarMantenimiento(cedula,fecha);
                String columnas[] = {"Cedula Cliente", "Fecha Ultima matenimiento", "Número de mantenimientos realizados al cliente"};
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }else if(cedula.isEmpty() && !fecha.isEmpty()){
                datostabla = ctr.contarMantenimiento(cedula,fecha);
                String columnas[] = {"Ultimo cliente que realizo un Mantenimiento a la fecha seleccionada", "Fecha de Mantenimiento", "Número de mantenimientos realizados en la fecha seleccionada"};
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }else{
                datostabla = ctr.contarMantenimiento(cedula,fecha);
                String columnas[] = {"Cedula Cliente", "Fecha Ultima mantenimiento", "Número de mantenimientos realizados al cliente"};
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }
        }
        
    }

    
    public static boolean valida(String x) {
        int suma = 0;
        if (x.length() == 9) {
            System.out.println("Ingrese su cedula de 10 digitos");
            return false;
        } else {
            int a[] = new int[x.length() / 2];
            int b[] = new int[(x.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c)));
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }
        }

    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String tipo = "";
        String cedula = "";
        String fecha = "";
        String[] columnas;
        
       
        if(valida(txtCliente.getText())){
             if (chCantidad.isSelected()) {
            cantidadProcesos();
        } else {
            try {
                tipo = cmbTipo.getSelectedItem().toString();
                cedula = txtCliente.getText();
                fecha = convertTostring(comCalendario.getDate());

            } catch (NullPointerException e) {
                fecha = "";

            } finally {
                //System.out.println("tipo: " + tipo + " cedula: " + cedula + " fecha: " + fecha);
                if (cmbTipo.getSelectedItem().equals("Mantenimiento")) {
                    columnas = new String[5];
                    columnas[0] = "No Mantenimiento";
                    columnas[1] = "Cedula Cliente";
                    columnas[2] = "Fecha de entrega";
                    columnas[3] = "Total";
                    columnas[4] = "Observacion";

                } else {
                    columnas = new String[5];
                    columnas[0] = "No Factura";
                    columnas[1] = "Cedula Cliente";
                    columnas[2] = "Nombre Empleado";
                    columnas[3] = "Fecha de compra";
                    columnas[4] = "Total Pagado";
                }
                datostabla = ctr.consultaReporte(tipo, cedula, fecha);
                if(datostabla.length<0){
                     JOptionPane.showMessageDialog(null, "No se encontro registro", "Datos vacios", JOptionPane.ERROR_MESSAGE);
                }
                DefaultTableModel datostcli = new DefaultTableModel(datostabla, columnas);
                tablaReporte.setModel(datostcli);
            }
        }
            
        }else{
             JOptionPane.showMessageDialog(null, "Cedula Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
       
   

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void chCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chCantidadActionPerformed

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        // TODO add your handling code here:
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtClienteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox chCantidad;
    private javax.swing.JComboBox cmbTipo;
    private com.toedter.calendar.JDateChooser comCalendario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
