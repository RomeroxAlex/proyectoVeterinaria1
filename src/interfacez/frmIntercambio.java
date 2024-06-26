/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacez;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class frmIntercambio extends javax.swing.JFrame {

    /**
     * Creates new form frmIntercambio
     */
    public frmIntercambio() {
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

        btnResponsable = new javax.swing.JButton();
        btnMascotas = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxCambioPaneles = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria Mascota Feliz");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        btnResponsable.setText("Responsables");
        btnResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponsableActionPerformed(evt);
            }
        });

        btnMascotas.setText("Mascotas");
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnCitas.setText("Citas");
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        pnlContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jLabel1.setText("Buscar Id");

        txtBuscarId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarIdKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");

        cbxCambioPaneles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Responsables", "Mascotas", "Citas", "Consultas" }));
        cbxCambioPaneles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCambioPanelesActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(35, 35, 35)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResponsable)
                            .addComponent(btnMascotas)
                            .addComponent(btnCitas)
                            .addComponent(btnConsultas)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbxCambioPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(txtBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxCambioPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnResponsable)
                        .addGap(37, 37, 37)
                        .addComponent(btnMascotas)
                        .addGap(27, 27, 27)
                        .addComponent(btnCitas)
                        .addGap(32, 32, 32)
                        .addComponent(btnConsultas))
                    .addComponent(pnlContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        if (txtBuscarId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Id");
            txtBuscarId.requestFocus();
        } else {
            pnlMascotas pnlM = new pnlMascotas();
            pnlM.setSize(495, 495);
            pnlM.setLocation(2, 3);
            pnlContenido.removeAll();
            pnlContenido.add(pnlM, BorderLayout.CENTER);
            pnlContenido.revalidate();
            pnlContenido.repaint();
        }
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if (txtBuscarId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Id");
            txtBuscarId.requestFocus();
        } else {

            pnlConsultas pnlCo = new pnlConsultas();
            pnlCo.setSize(495, 495);
            pnlCo.setLocation(2, 3);
            pnlContenido.removeAll();
            pnlContenido.add(pnlCo, BorderLayout.CENTER);
            pnlContenido.revalidate();
            pnlContenido.repaint();
        }
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponsableActionPerformed
        if (txtBuscarId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Id");
            txtBuscarId.requestFocus();
        } else {

            pnlResponsables pnlResponsable = new pnlResponsables();
            pnlResponsable.setSize(495, 495);
            pnlResponsable.setLocation(2, 3);
            pnlContenido.removeAll();
            pnlContenido.add(pnlResponsable, BorderLayout.CENTER);
            pnlContenido.revalidate();
            pnlContenido.repaint();
        }
    }//GEN-LAST:event_btnResponsableActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        if (txtBuscarId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Id");
            txtBuscarId.requestFocus();
        } else {
            pnlCitas pnlC = new pnlCitas();
            pnlC.setSize(495, 495);
            pnlC.setLocation(2, 3);
            pnlContenido.removeAll();
            pnlContenido.add(pnlC, BorderLayout.CENTER);
            pnlContenido.revalidate();
            pnlContenido.repaint();
        }
    }//GEN-LAST:event_btnCitasActionPerformed

    private void cbxCambioPanelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCambioPanelesActionPerformed

    }//GEN-LAST:event_cbxCambioPanelesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscarId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un id");

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarIdKeyTyped
     char validar = evt.getKeyChar();

        //Character.is Digit(validar)--> Si lo que quiero escribir son letras
        //Character.isLetter(validar)--> Si lo que quiero escribir son números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
    }//GEN-LAST:event_txtBuscarIdKeyTyped

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
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIntercambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIntercambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResponsable;
    private javax.swing.JComboBox<String> cbxCambioPaneles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTextField txtBuscarId;
    // End of variables declaration//GEN-END:variables
}
