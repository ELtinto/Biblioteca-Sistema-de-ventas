
package formularioprincipal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexionSQL.conexionSQL;
import javax.swing.JPanel;

/**
 *
 * @author Pc gamer
 */
public class principal extends javax.swing.JFrame {
    
    
   conexionSQL cc=new conexionSQL();
   Connection con=cc.conexion();
    ///instancio la conexion a la base de datos ////
    
    

    public principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        // la aplicacion de abrira en el centro de la pantalla //
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
        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        L = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        libros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        distribuidores = new javax.swing.JMenuItem();
        BorrarFolio = new javax.swing.JMenu();
        facturas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        compras = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        L.setText("Libros");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        L.add(jSeparator1);

        libros.setText("Registro de Libros");
        libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosActionPerformed(evt);
            }
        });
        L.add(libros);

        jMenuBar1.add(L);

        jMenu2.setText("Distribuidores");

        distribuidores.setText("Registro Distribuidores");
        distribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distribuidoresActionPerformed(evt);
            }
        });
        jMenu2.add(distribuidores);

        jMenuBar1.add(jMenu2);

        BorrarFolio.setText("Gestion Ventas");

        facturas.setText("Registro de Ventas");
        facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturasActionPerformed(evt);
            }
        });
        BorrarFolio.add(facturas);

        jMenuBar1.add(BorrarFolio);

        jMenu4.setText("Gestion Compra");

        compras.setText("Registro de Compras");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jMenu4.add(compras);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        
    }//GEN-LAST:event_LActionPerformed

    private void librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosActionPerformed
       libros verventana = new libros ();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_librosActionPerformed

    private void distribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distribuidoresActionPerformed
         distribuidores verventana = new distribuidores ();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_distribuidoresActionPerformed

    private void facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturasActionPerformed
            facturas verventana = new facturas ();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_facturasActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
            compras verventana = new compras ();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_comprasActionPerformed

    
    // ingreso de datos en la pantalla pricipal/
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BorrarFolio;
    private javax.swing.JMenu L;
    private javax.swing.JMenuItem compras;
    private javax.swing.JMenuItem distribuidores;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem facturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem libros;
    // End of variables declaration//GEN-END:variables



}
