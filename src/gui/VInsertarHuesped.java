/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import pojos.Visitante;

/**
 *
 * @author alumnogreibd
 */
public class VInsertarHuesped extends javax.swing.JFrame {
    private VHoteles padre;
    private aplicacion.FachadaAplicacion fa;
    private String hotel;
    /**
     * Creates new form VInsertarHuesped
     */
    public VInsertarHuesped(VHoteles vh, aplicacion.FachadaAplicacion fa, String hotel) {
        this.padre = vh;
        this.fa = fa;
        this.hotel = hotel;
        initComponents();
        btnInsertar.setEnabled(false);
        addCamposCompletosListener();
    }

    private void addCamposCompletosListener() {
        List<JTextField> listaTextField = new ArrayList();
        listaTextField.add(jTextFieldNombre);
        listaTextField.add(jTextFieldDni);
        listaTextField.add(jTextFieldNacionalidad);
        listaTextField.add(jTextFieldTelefono);
        listaTextField.add(jTextFieldFechaNac);
        listaTextField.add(jTextFieldAltura);
        listaTextField.add(jTextFieldFechaSalida);
        
        // Agrega un DocumentListener a cada uno de los campos de texto
        jTextFieldNombre.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        jTextFieldDni.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        jTextFieldNacionalidad.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));

        jTextFieldTelefono.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));

        jTextFieldFechaNac.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        jTextFieldAltura.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        jTextFieldFechaSalida.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNacionalidad = new javax.swing.JLabel();
        jTextFieldNacionalidad = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelFechaNac = new javax.swing.JLabel();
        jTextFieldFechaNac = new javax.swing.JTextField();
        jLabelAltura = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        jLabelFechaSalida = new javax.swing.JLabel();
        jTextFieldFechaSalida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        jLabelNacionalidad.setText("Nacionalidad");

        jLabelTelefono.setText("Teléfono");

        jLabelFechaNac.setText("Fecha de nacimiento(AA-mm-dd)");

        jLabelAltura.setText("Altura");

        jLabelDni.setText("DNI");

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabelFechaSalida.setText("Fecha de salida(AA-mm-dd)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNacionalidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInsertar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFechaSalida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNacionalidad)
                    .addComponent(jTextFieldNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac)
                    .addComponent(jTextFieldFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAltura)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaSalida)
                    .addComponent(jTextFieldFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnInsertar)
                .addGap(22, 22, 22)
                .addComponent(btnSalir)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        padre.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String fechaNac = jTextFieldFechaNac.getText();
        java.sql.Date fechaNacSQL = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDateNac = null;
        try{
            fechaDateNac = dateFormat.parse(fechaNac);
        } catch (ParseException e) {
             e.printStackTrace();
        }
        java.sql.Date fechaNacsql = new java.sql.Date(fechaDateNac.getTime());
        Visitante visitante = new Visitante(jTextFieldDni.getText(),jTextFieldNombre.getText(), jTextFieldNacionalidad.getText(), 
        jTextFieldTelefono.getText(), fechaNacsql,Float.parseFloat(jTextFieldAltura.getText()));
        String fechaSalida = jTextFieldFechaSalida.getText();
        java.sql.Date fechaSalidaSQL = null;
        Date fechaDateSalida = null;
        try{
            fechaDateSalida = dateFormat.parse(fechaSalida);
        } catch (ParseException e) {
             e.printStackTrace();
        }
        java.sql.Date fechaSalidasql = new java.sql.Date(fechaDateSalida.getTime());
        
        fa.insertarHuesped(visitante, hotel, fechaSalidasql);
        jTextFieldNombre.setText("");
        jTextFieldDni.setText("");
        jTextFieldNacionalidad.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldFechaNac.setText("");
        jTextFieldAltura.setText("");
        jTextFieldFechaSalida.setText("");
        
    }//GEN-LAST:event_btnInsertarActionPerformed

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaNac;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldFechaNac;
    private javax.swing.JTextField jTextFieldFechaSalida;
    private javax.swing.JTextField jTextFieldNacionalidad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
