/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import aplicacion.FachadaAplicacion;
/**
 *
 * @author alumnogreibd
 */
public class VPrincipal extends javax.swing.JFrame {

    FachadaGUI fgui;
    FachadaAplicacion fa;
    /**
     * Creates new form VPrincipal
     */
    public VPrincipal(FachadaAplicacion fa) {
        this.fa = fa;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPersonas = new javax.swing.JMenu();
        jMenuItemVisitantes = new javax.swing.JMenuItem();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenuOcio = new javax.swing.JMenu();
        jMenuItemAtracciones = new javax.swing.JMenuItem();
        jMenuHosteleria = new javax.swing.JMenu();
        jMenuItemRestaurantes = new javax.swing.JMenuItem();
        jMenuItemHoteles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/logo_azul.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jMenuPersonas.setText("Personas");
        jMenuPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPersonasActionPerformed(evt);
            }
        });

        jMenuItemVisitantes.setText("Visitantes");
        jMenuItemVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisitantesActionPerformed(evt);
            }
        });
        jMenuPersonas.add(jMenuItemVisitantes);

        jMenuItemEmpleados.setText("Empleados");
        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenuPersonas.add(jMenuItemEmpleados);

        jMenuBar1.add(jMenuPersonas);

        jMenuOcio.setText("Ocio");
        jMenuOcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOcioActionPerformed(evt);
            }
        });

        jMenuItemAtracciones.setText("Atracciones");
        jMenuItemAtracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtraccionesActionPerformed(evt);
            }
        });
        jMenuOcio.add(jMenuItemAtracciones);

        jMenuBar1.add(jMenuOcio);

        jMenuHosteleria.setText("Hosteleria");
        jMenuHosteleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHosteleriaActionPerformed(evt);
            }
        });

        jMenuItemRestaurantes.setText("Restaurantes");
        jMenuItemRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestaurantesActionPerformed(evt);
            }
        });
        jMenuHosteleria.add(jMenuItemRestaurantes);

        jMenuItemHoteles.setText("Hoteles");
        jMenuItemHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHotelesActionPerformed(evt);
            }
        });
        jMenuHosteleria.add(jMenuItemHoteles);

        jMenuBar1.add(jMenuHosteleria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPersonasActionPerformed
        
    }//GEN-LAST:event_jMenuPersonasActionPerformed

    private void jMenuOcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOcioActionPerformed
        
    }//GEN-LAST:event_jMenuOcioActionPerformed

    private void jMenuItemRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestaurantesActionPerformed

        fa.iniciarInterfazRestaurantes();
        setVisible(false);
    }//GEN-LAST:event_jMenuItemRestaurantesActionPerformed

    private void jMenuItemHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHotelesActionPerformed
        fa.iniciarInterfazHoteles();
        setVisible(false);
    }//GEN-LAST:event_jMenuItemHotelesActionPerformed

    private void jMenuItemAtraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtraccionesActionPerformed
        fa.IniciarInterfazAtracciones();
        setVisible(false);
    }//GEN-LAST:event_jMenuItemAtraccionesActionPerformed

    private void jMenuItemVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisitantesActionPerformed

        fa.iniciarInterfazVisitantes();
        setVisible(false);
    }//GEN-LAST:event_jMenuItemVisitantesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpleadosActionPerformed
        fa.iniciarInterfazEmpleados();
        setVisible(false);
    }//GEN-LAST:event_jMenuItemEmpleadosActionPerformed

    private void jMenuHosteleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHosteleriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuHosteleriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHosteleria;
    private javax.swing.JMenuItem jMenuItemAtracciones;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemHoteles;
    private javax.swing.JMenuItem jMenuItemRestaurantes;
    private javax.swing.JMenuItem jMenuItemVisitantes;
    private javax.swing.JMenu jMenuOcio;
    private javax.swing.JMenu jMenuPersonas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
