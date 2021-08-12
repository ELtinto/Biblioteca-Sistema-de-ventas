/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioprincipal;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexionSQL.conexionSQL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author Pc gamer
 */
public class facturas extends javax.swing.JInternalFrame {
    
   conexionSQL cc=new conexionSQL();
   Connection con=cc.conexion();

    /**
     * Creates new form facturas
     */
    public facturas() {
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttotalventa = new javax.swing.JTextField();
        cbmetodopago = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtarticulosvendidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRO DE VENTAS");

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setText("Total venta");

        jLabel3.setText("Metodo de pago");

        txttotalventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalventaActionPerformed(evt);
            }
        });

        cbmetodopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Debito", "Credito", " " }));
        cbmetodopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmetodopagoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad de articulos vendidos");

        txtarticulosvendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtarticulosvendidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txttotalventa)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbmetodopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtarticulosvendidos)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtarticulosvendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbmetodopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttotalventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addGap(26, 26, 26))
        );

        tablaventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaventas);

        jLabel4.setText("Busqueda");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalventaActionPerformed

    private void cbmetodopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmetodopagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmetodopagoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        insertarDatos();
        limpiarCajas();
        mostrarDatos();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistros();
        mostrarDatos();
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarDatos();
        limpiarCajas();
        mostrarDatos();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaventasMouseClicked

        int filaSeleccionada=tablaventas.rowAtPoint(evt.getPoint());

        txtarticulosvendidos.setText(tablaventas.getValueAt(filaSeleccionada,1).toString());
        cbmetodopago.setSelectedItem(tablaventas.getValueAt(filaSeleccionada,2).toString());
       txttotalventa.setText(tablaventas.getValueAt(filaSeleccionada,3).toString());

    }//GEN-LAST:event_tablaventasMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtarticulosvendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtarticulosvendidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtarticulosvendidosActionPerformed

    
    public void mostrarDatos(){
 // MUESTRO LOS DATOS DE LOS REGISTROS ///    
    
    String[] titulos={"ID Folio ","Cantidad de articulos vendidos","Metodo de Pago","Total Valor Venta"};
    String[] registros=new  String[5];
    
    DefaultTableModel modelo=new DefaultTableModel(null,titulos);
    
    
    String SQL="select * from ventas";
    
    try {
        
        
        Statement st=(Statement) con.createStatement();
        ResultSet rs=st.executeQuery(SQL);
        
        while (rs.next()){
            
            
        registros[0]=rs.getString("idfolio");
        registros[1]=rs.getString("cantidad");
        registros[2]=rs.getString("metodopago");
        registros[3]=rs.getString("totalventa");
        
        
        
      modelo.addRow(registros);
        
         
        }
        
        tablaventas.setModel(modelo);
    } catch  (Exception e)  {
        
        JOptionPane.showMessageDialog(null,"Error al mostrar Datos"+ e.getMessage());
    }
       
}
    
    
    
    
     // ingreso de datos en la pantalla pricipal//
    public void insertarDatos(){
    
        try {
            
            String SQL="insert into ventas (cantidad,metodopago,totalventa) values (?,?,?)";
            
            PreparedStatement pst=(PreparedStatement) con.clientPrepareStatement(SQL);
            
            
            //nombre de libro//
            pst.setString(1,txtarticulosvendidos.getText());
            
            // categoria //
            int seleccionado=cbmetodopago.getSelectedIndex();
            pst.setString(2,cbmetodopago.getItemAt(seleccionado));
            
            
           pst.setString(3,txttotalventa.getText());
           
           
           pst.execute();
           
           JOptionPane.showMessageDialog(null,"registro exitoso");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro" +e.getMessage());
        }
        
        
    }
    
    
     public void eliminarRegistros(){
        
        int filaSeleccionada=tablaventas.getSelectedRow();
        
        try {
            String SQL="delete from Libros where idlibros="+tablaventas.getValueAt(filaSeleccionada,0);
            
            
            Statement st=(Statement) con.createStatement();
            
            int n=st.executeUpdate(SQL);
            
            
            if (n>=0) {
                JOptionPane.showMessageDialog(null,"Registro Eliminado");
                
            }
             
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al eliminar registro"+e.getMessage());
                    
        }
         
    }
     
     
     public void limpiarCajas(){
    // ACA INGRESO EL CODIGO PARA LIMPIAR LAS  CAJAS LUEGO DE UN INGRESO DE DATOS ///
    
    /// reliazo luego de caDa registro los espacios vuleva blanco otra vez 
    txtarticulosvendidos.setText("");
   cbmetodopago.setSelectedItem(null);
    txttotalventa.setText("");
    
} 
     
     
      public void ActualizarDatos(){
    
        try {
            
            String SQL=" update ventas set cantidad=?,metodopago=?,totalventa=? where idfolio=? ";
            
            
            int filaSeleccionado=tablaventas.getSelectedRow();
            String dao=(String)tablaventas.getValueAt(filaSeleccionado, 0);
            
            PreparedStatement pst=(PreparedStatement) con.clientPrepareStatement(SQL);
            
            
            
            pst.setString(1,txtarticulosvendidos.getText());
            
            
            int seleccionado=cbmetodopago.getSelectedIndex();
            pst.setString(2,cbmetodopago.getItemAt(seleccionado));
            
            
            
            pst.setString(3,txttotalventa.getText());
            
            
             
   
           
           pst.setString(4, dao);
           pst.execute();
           
           JOptionPane.showMessageDialog(null,"Registro editado con exito");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de edicion" +e.getMessage());
        }
        
        
    }
      
      
      
      
      public void filtrarDatos(String valor){
    // ACA INGRESO EL FILTRO DE LA BARRA BUSCAR /// 
    
    
    String[] titulos={"idfolio","cantidad","metodopago","totalventa"};
    String[] registros=new  String[5];
    
    DefaultTableModel modelo=new DefaultTableModel(null,titulos);
    
    
    String SQL="select * from ventas where nombre like '%"+valor+"%'";
    
    try {
        
        
        Statement st=(Statement) con.createStatement();
        ResultSet rs=st.executeQuery(SQL);
        
        while (rs.next()){
            
            
        registros[0]=rs.getString("idfolio");
        registros[1]=rs.getString("cantidad");
        registros[2]=rs.getString("metodopago");
        registros[3]=rs.getString("totalventa");
        
        
        
         modelo.addRow(registros);
        
         
        }
        
        tablaventas.setModel(modelo);
    } catch  (Exception e)  {
        
        JOptionPane.showMessageDialog(null,"Error al mostrar Datos"+ e.getMessage());
    }
       
}

        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbmetodopago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaventas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtarticulosvendidos;
    private javax.swing.JTextField txttotalventa;
    // End of variables declaration//GEN-END:variables
}
