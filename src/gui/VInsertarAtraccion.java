/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import pojos.Atraccion;

/**
 *
 * @author alumnogreibd
 */
public class VInsertarAtraccion extends javax.swing.JFrame {

    private VAtraccion padre;
    private aplicacion.FachadaAplicacion fa;

    /**
     * Creates new form VInsertarAtraccion
     */
    public VInsertarAtraccion(VAtraccion padre, aplicacion.FachadaAplicacion fa) {
        this.padre = padre;
        this.fa = fa;
        initComponents();
        btnInsertar.setEnabled(false);
        addCamposCompletosListener();
    }
    
    private void addCamposCompletosListener() {
        List<JTextField> listaTextField = new ArrayList();
        listaTextField.add(TextInsertNombre);
        listaTextField.add(TextInsertAforo);
        listaTextField.add(TextInsertAlturaMin);
        listaTextField.add(TextInsertCoste);
        listaTextField.add(TextInsertUbicacion);
        // Agrega un DocumentListener a cada uno de los campos de texto
        TextInsertNombre.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        TextInsertAforo.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        TextInsertAlturaMin.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));

        TextInsertCoste.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));

        TextInsertUbicacion.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tagInsertarNombre = new javax.swing.JLabel();
        TextInsertNombre = new javax.swing.JTextField();
        tagInsertAforo = new javax.swing.JLabel();
        TextInsertAforo = new javax.swing.JTextField();
        tagAlturaMin = new javax.swing.JLabel();
        TextInsertAlturaMin = new javax.swing.JTextField();
        textInsertCoste = new javax.swing.JLabel();
        TextInsertCoste = new javax.swing.JTextField();
        TagInsertUbicacion = new javax.swing.JLabel();
        TextInsertUbicacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextInsertDescripcion = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tagInsertarNombre.setText("Nombre");

        tagInsertAforo.setText("Aforo");

        TextInsertAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInsertAforoActionPerformed(evt);
            }
        });

        tagAlturaMin.setText("Altura mínima");

        textInsertCoste.setText("Coste mantenimiento");

        TagInsertUbicacion.setText("Ubicacion");

        jLabel2.setText("Descripción");

        TextInsertDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInsertDescripcionActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tagInsertarNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextInsertNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(tagAlturaMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextInsertAlturaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tagInsertAforo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextInsertAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(textInsertCoste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextInsertCoste, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextInsertDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnInsertar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(TagInsertUbicacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TextInsertUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagInsertarNombre)
                    .addComponent(TextInsertNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagAlturaMin)
                    .addComponent(TextInsertAlturaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagInsertAforo)
                    .addComponent(TextInsertAforo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textInsertCoste)
                    .addComponent(TextInsertCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TagInsertUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextInsertUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextInsertDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnSalir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextInsertAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInsertAforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInsertAforoActionPerformed

    private void TextInsertDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInsertDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextInsertDescripcionActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // Obtener los datos de los text fields
        String nombre = null;
        if (TextInsertNombre.getText() != null && !TextInsertNombre.getText().isEmpty()) {
            nombre = TextInsertNombre.getText();
        }

        Integer aforo = null;
        try {
            if (TextInsertAforo.getText() != null && !TextInsertAforo.getText().isEmpty()) {
                aforo = Integer.parseInt(TextInsertAforo.getText());
            }
        } catch (NumberFormatException e) {
            aforo = 0;
        }

        Float alturaMin = null;
        try {
            if (TextInsertAlturaMin.getText() != null && !TextInsertAlturaMin.getText().isEmpty()) {
                alturaMin = Float.parseFloat(TextInsertAlturaMin.getText());
            }
        } catch (NumberFormatException e) {
            alturaMin = 1.5f;
        }

        Float custoMantenimiento = null;
        try {
            if (textInsertCoste.getText() != null && !textInsertCoste.getText().isEmpty()) {
                custoMantenimiento = Float.parseFloat(textInsertCoste.getText());
            }
        } catch (NumberFormatException e) {
            custoMantenimiento = 5000f;
        }

        String ubicacion = null;
        if (TextInsertUbicacion.getText() != null && !TextInsertUbicacion.getText().isEmpty()) {
            ubicacion = TextInsertUbicacion.getText();
        }

        String descripcion = null;
        if (TextInsertDescripcion.getText() != null && !TextInsertDescripcion.getText().isEmpty()) {
            descripcion = TextInsertDescripcion.getText();
        }

// Crear la atracción con los datos obtenidos
        Atraccion atraccion = new Atraccion(nombre, aforo, alturaMin, custoMantenimiento, ubicacion, descripcion);
        fa.insertaAtraccion(atraccion);
        TextInsertNombre.setText("");
        TextInsertAlturaMin.setText("");
        TextInsertAforo.setText("");
        TextInsertUbicacion.setText("");
        TextInsertDescripcion.setText("");
        TextInsertCoste.setText("");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        padre.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TagInsertUbicacion;
    private javax.swing.JTextField TextInsertAforo;
    private javax.swing.JTextField TextInsertAlturaMin;
    private javax.swing.JTextField TextInsertCoste;
    private javax.swing.JTextField TextInsertDescripcion;
    private javax.swing.JTextField TextInsertNombre;
    private javax.swing.JTextField TextInsertUbicacion;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel tagAlturaMin;
    private javax.swing.JLabel tagInsertAforo;
    private javax.swing.JLabel tagInsertarNombre;
    private javax.swing.JLabel textInsertCoste;
    // End of variables declaration//GEN-END:variables
}
