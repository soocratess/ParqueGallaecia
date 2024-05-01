/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;


import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import pojos.Restaurante;
import java.util.Date;
import java.text.ParseException;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;



/**
 *
 * @author alumnogreibd
 */
public class VRestaurantes extends javax.swing.JFrame {
     private VPrincipal padre;
     private aplicacion.FachadaAplicacion fa;
    /**
     * Creates new form VRestaurantes
     */
    public VRestaurantes(VPrincipal vp, aplicacion.FachadaAplicacion fa) {//, java.util.List<Restaurante> restauracion, java.util.List<Restaurante> restauranteExitoso
        this.padre = vp;
        this.fa=fa;
        initComponents();
        // Desactiva el botón de inserción por defecto
        tablaBusqueda.setModel(new ModeloTablaRestaurantes());
        btnInsertar.setEnabled(false);
        addCamposCompletosListener();
       
        
    }
    
    private void addCamposCompletosListener() {
        List<JTextField> listaTextField = new ArrayList();
        listaTextField.add(textFieldNombreNuevo);
        listaTextField.add(textFieldUbicacionNuevo);
        listaTextField.add(textFieldAforoNuevo);
        listaTextField.add(textFieldHoraAperturaNuevo);
        listaTextField.add(textFieldHoraCierreNuevo);
        // Agrega un DocumentListener a cada uno de los campos de texto
        textFieldNombreNuevo.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        textFieldUbicacionNuevo.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
        textFieldAforoNuevo.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));

        textFieldHoraAperturaNuevo.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));

        textFieldHoraCierreNuevo.getDocument().addDocumentListener(new CamposCompletosListener(btnInsertar, listaTextField));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuTabla = new javax.swing.JPopupMenu();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuItemInsertar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelNuevo = new javax.swing.JPanel();
        labelNombreNuevo = new javax.swing.JLabel();
        textFieldNombreNuevo = new javax.swing.JTextField();
        labelUbicacionNuevo = new javax.swing.JLabel();
        textFieldUbicacionNuevo = new javax.swing.JTextField();
        labelAforoNuevo = new javax.swing.JLabel();
        labelHoraApertura = new javax.swing.JLabel();
        labelHoraCierre = new javax.swing.JLabel();
        textFieldHoraCierreNuevo = new javax.swing.JFormattedTextField();
        textFieldAforoNuevo = new javax.swing.JFormattedTextField();
        textFieldHoraAperturaNuevo = new javax.swing.JFormattedTextField();
        btnInsertar = new javax.swing.JButton();
        PanelBuscar = new javax.swing.JPanel();
        labelNombreBuscar = new javax.swing.JLabel();
        NombreBuscar = new javax.swing.JTextField();
        LabelAforoBuscar = new javax.swing.JLabel();
        LabelHoraBuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        AforoBuscar = new javax.swing.JFormattedTextField();
        HoraBuscar = new javax.swing.JFormattedTextField();
        btnExitoso = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jMenuItemEliminar.setText("Eliminar restaurante");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenuTabla.add(jMenuItemEliminar);

        jMenuItemInsertar.setText("Insertar cliente");
        jMenuItemInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsertarActionPerformed(evt);
            }
        });
        jPopupMenuTabla.add(jMenuItemInsertar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNombreNuevo.setText("Nombre");

        labelUbicacionNuevo.setText("Ubicacion");

        textFieldUbicacionNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUbicacionNuevoActionPerformed(evt);
            }
        });

        labelAforoNuevo.setText("Aforo");

        labelHoraApertura.setText("Hora apertura");

        labelHoraCierre.setText("Hora cierre(HH:mm)");

        textFieldHoraCierreNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHoraCierreNuevoActionPerformed(evt);
            }
        });

        textFieldHoraAperturaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHoraAperturaNuevoActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelNuevoLayout = new javax.swing.GroupLayout(PanelNuevo);
        PanelNuevo.setLayout(PanelNuevoLayout);
        PanelNuevoLayout.setHorizontalGroup(
            PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNuevoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNuevoLayout.createSequentialGroup()
                        .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelNuevoLayout.createSequentialGroup()
                                .addComponent(labelNombreNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldNombreNuevo)
                                .addGap(58, 58, 58))
                            .addGroup(PanelNuevoLayout.createSequentialGroup()
                                .addComponent(labelUbicacionNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldUbicacionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelNuevoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(labelHoraCierre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldHoraCierreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelNuevoLayout.createSequentialGroup()
                                .addComponent(labelAforoNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldAforoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(335, Short.MAX_VALUE))
                    .addGroup(PanelNuevoLayout.createSequentialGroup()
                        .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertar)
                            .addGroup(PanelNuevoLayout.createSequentialGroup()
                                .addComponent(labelHoraApertura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldHoraAperturaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelNuevoLayout.setVerticalGroup(
            PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNuevoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreNuevo)
                    .addComponent(textFieldNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUbicacionNuevo)
                    .addComponent(textFieldUbicacionNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAforoNuevo)
                    .addComponent(textFieldAforoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHoraApertura)
                    .addComponent(labelHoraCierre)
                    .addComponent(textFieldHoraCierreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldHoraAperturaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnInsertar)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Nuevo", PanelNuevo);

        labelNombreBuscar.setText("Nombre");

        LabelAforoBuscar.setText("Aforo");
        LabelAforoBuscar.setToolTipText("Se mostrarán los restaurantes con aforo superior al introducido");

        LabelHoraBuscar.setText("Hora");
        LabelHoraBuscar.setToolTipText("Se mostrarán los restaurantes abiertos a la hora introducida");

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ubicación", "Aforo", "Hora apertura", "Hora cierre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaBusquedaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBusqueda);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        HoraBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraBuscarActionPerformed(evt);
            }
        });

        btnExitoso.setText("Restaurante más exitoso");
        btnExitoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitosoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreBuscar)
                    .addComponent(LabelAforoBuscar))
                .addGap(18, 18, 18)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarLayout.createSequentialGroup()
                        .addComponent(AforoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelHoraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(NombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExitoso)
                        .addGap(21, 21, 21))))
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreBuscar)
                    .addComponent(NombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExitoso))
                .addGap(21, 21, 21)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAforoBuscar)
                    .addComponent(LabelHoraBuscar)
                    .addComponent(AforoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", PanelBuscar);

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarRestaurantes();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void textFieldUbicacionNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUbicacionNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUbicacionNuevoActionPerformed

    private void HoraBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraBuscarActionPerformed

    private void textFieldHoraAperturaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHoraAperturaNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHoraAperturaNuevoActionPerformed

    private void textFieldHoraCierreNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHoraCierreNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHoraCierreNuevoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String horaApertura = textFieldHoraAperturaNuevo.getText();
        String horaCierre = textFieldHoraCierreNuevo.getText();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        Date horaDateA = null;
        Date horaDateB = null;
        try {
          horaDateA = formato.parse(horaApertura);
          horaDateB = formato.parse(horaCierre);
        } catch (ParseException e) {
             e.printStackTrace();
        }
        java.sql.Time horaSQLA = new java.sql.Time(horaDateA.getTime());
        java.sql.Time horaSQLB = new java.sql.Time(horaDateB.getTime());
        Restaurante r = new Restaurante(textFieldNombreNuevo.getText(), textFieldUbicacionNuevo.getText(), Integer.parseInt(textFieldAforoNuevo.getText()),
        horaSQLA, horaSQLB);
        fa.insertarRestaurante(r);
        textFieldNombreNuevo.setText("");
        textFieldUbicacionNuevo.setText("");
        textFieldAforoNuevo.setText("");
        textFieldHoraAperturaNuevo.setText("");
        textFieldHoraCierreNuevo.setText("");
        
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        padre.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnExitosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitosoActionPerformed
        fa.iniciarInterfazExito(this);
        setVisible(false);
    }//GEN-LAST:event_btnExitosoActionPerformed

    private void tablaBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBusquedaMousePressed
        if(SwingUtilities.isRightMouseButton(evt)){
            int row = tablaBusqueda.rowAtPoint(evt.getPoint());
            if(row>=0 && row< tablaBusqueda.getRowCount()){
                tablaBusqueda.setRowSelectionInterval(row, row);
                jPopupMenuTabla.show(evt.getComponent(), evt.getX(), evt.getY());
            
            }
        }
    }//GEN-LAST:event_tablaBusquedaMousePressed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        int row = tablaBusqueda.getSelectedRow();
        if(row>0 && row < tablaBusqueda.getRowCount()){
            String nombreRestaurante = (String) tablaBusqueda.getValueAt(row, 0);
            fa.borrarRestaurante(nombreRestaurante);
            buscarRestaurantes();
        }
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jMenuItemInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsertarActionPerformed
        int row = tablaBusqueda.getSelectedRow();
        if(row>=0 && row < tablaBusqueda.getRowCount()){
            String nombreRestaurante = (String) tablaBusqueda.getValueAt(row, 0);
            fa.iniciarInterfazInsertarCliente(this, nombreRestaurante);
            setVisible(false);
        }
    }//GEN-LAST:event_jMenuItemInsertarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField AforoBuscar;
    private javax.swing.JFormattedTextField HoraBuscar;
    private javax.swing.JLabel LabelAforoBuscar;
    private javax.swing.JLabel LabelHoraBuscar;
    private javax.swing.JTextField NombreBuscar;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelNuevo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExitoso;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemInsertar;
    private javax.swing.JPopupMenu jPopupMenuTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelAforoNuevo;
    private javax.swing.JLabel labelHoraApertura;
    private javax.swing.JLabel labelHoraCierre;
    private javax.swing.JLabel labelNombreBuscar;
    private javax.swing.JLabel labelNombreNuevo;
    private javax.swing.JLabel labelUbicacionNuevo;
    private javax.swing.JTable tablaBusqueda;
    private javax.swing.JFormattedTextField textFieldAforoNuevo;
    private javax.swing.JFormattedTextField textFieldHoraAperturaNuevo;
    private javax.swing.JFormattedTextField textFieldHoraCierreNuevo;
    private javax.swing.JTextField textFieldNombreNuevo;
    private javax.swing.JTextField textFieldUbicacionNuevo;
    // End of variables declaration//GEN-END:variables
public void buscarRestaurantes(){
    ModeloTablaRestaurantes m ;

        m=(ModeloTablaRestaurantes) tablaBusqueda.getModel();
        //tomamos la hora
        String horaStr = HoraBuscar.getText();
        java.sql.Time horaSQL = null;
        if(horaStr.length()>0){
            SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
            Date horaDate = null;
            try {
            horaDate = formato.parse(horaStr);
        } catch (ParseException e) {
             e.printStackTrace();
        }
            horaSQL = new java.sql.Time(horaDate.getTime());
        }
        //tomamos el aforo
        Integer aforo = null;
        String aforo_aux = AforoBuscar.getText();
        if(aforo_aux.length()>0){
            aforo = Integer.parseInt(aforo_aux);
        }
        m.setFilas(fa.obtenerRestaurantes(NombreBuscar.getText(), aforo, horaSQL));
}

}
