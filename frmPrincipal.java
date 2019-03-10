package tema2;
public class frmPrincipal extends javax.swing.JFrame {
    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        smnuBiseccion = new javax.swing.JMenuItem();
        smnuPuntoFIjo = new javax.swing.JMenuItem();
        smnuNewton = new javax.swing.JMenuItem();
        smnuSecante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Métodos No Lineales");

        smnuBiseccion.setText("Bisección");
        smnuBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuBiseccionActionPerformed(evt);
            }
        });
        jMenu1.add(smnuBiseccion);

        smnuPuntoFIjo.setText("PuntoFijo");
        smnuPuntoFIjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuPuntoFIjoActionPerformed(evt);
            }
        });
        jMenu1.add(smnuPuntoFIjo);

        smnuNewton.setText("Newton");
        smnuNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuNewtonActionPerformed(evt);
            }
        });
        jMenu1.add(smnuNewton);

        smnuSecante.setText("Secante");
        smnuSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuSecanteActionPerformed(evt);
            }
        });
        jMenu1.add(smnuSecante);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Biseccion //    
    
    private void smnuBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuBiseccionActionPerformed
        // TODO add your handling code here:
        dlgBiseccion biseccion = new dlgBiseccion(this,true);
        biseccion.setLocationRelativeTo(null);
        biseccion.setVisible(true);   
    }//GEN-LAST:event_smnuBiseccionActionPerformed

// Punto FIjo //
    
    private void smnuPuntoFIjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuPuntoFIjoActionPerformed
        // TODO add your handling code here:
        dlgPuntoFijo PuntoFijo= new dlgPuntoFijo (this,true);
        PuntoFijo.setLocationRelativeTo(null);
        PuntoFijo.setVisible(true);
    }//GEN-LAST:event_smnuPuntoFIjoActionPerformed

//Newton//
    private void smnuNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuNewtonActionPerformed
        // TODO add your handling code here:
        dlgNewton Newton= new dlgNewton  (this,true);
        Newton.setLocationRelativeTo(null);
        Newton.setVisible(true);
    }//GEN-LAST:event_smnuNewtonActionPerformed

    private void smnuSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuSecanteActionPerformed
        // TODO add your handling code here:
        dlgSecante Secante= new dlgSecante  (this,true);
        Secante.setLocationRelativeTo(null);
        Secante.setVisible(true);
    }//GEN-LAST:event_smnuSecanteActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem smnuBiseccion;
    private javax.swing.JMenuItem smnuNewton;
    private javax.swing.JMenuItem smnuPuntoFIjo;
    private javax.swing.JMenuItem smnuSecante;
    // End of variables declaration//GEN-END:variables
}
