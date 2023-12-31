package org.example.Presentacion;

import org.example.BD.ConexionBD;
import org.example.MaterialSwing.MaterialButtomPanel;
import org.example.MaterialSwing.MaterialComboBox;
import org.example.MaterialSwing.MaterialTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class frmListadoEstudiante extends javax.swing.JFrame implements IFormularioReceptor {

    DefaultTableModel modelo = new DefaultTableModel();
    ConexionBD con = new ConexionBD();
    static IFormularioReceptor _formularioInstanciador;
    String usuario = "profesor";
    String grupo = "";
    boolean modificar = false;
    boolean informes = false;

    /**
     * Creates new form Home16
     */
    public frmListadoEstudiante(IFormularioReceptor formularioInstanciador) {
        setIconImage(new ImageIcon(getClass().getResource("imagenes/logoupc.png")).getImage());
        _formularioInstanciador = formularioInstanciador;
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTabla = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        panelContenedor = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnl_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        materialComboBox1 = new MaterialComboBox();
        materialTextField1 = new MaterialTextField();
        jLabel1 = new javax.swing.JLabel();
        materialButtomPanel3 = new MaterialButtomPanel();
        jLabel10 = new javax.swing.JLabel();

        menuTabla.setBorder(null);
        menuTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuTabla.setEnabled(false);
        menuTabla.setLabel("Menu de Opciones");

        jMenuItem3.setBackground(new java.awt.Color(75, 146, 45));
        jMenuItem3.setForeground(new java.awt.Color(75, 146, 45));
        jMenuItem3.setText("Opciones ");
        jMenuItem3.setEnabled(false);
        menuTabla.add(jMenuItem3);
        menuTabla.add(jSeparator1);

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuTabla.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuTabla.add(jMenuItem2);

        jMenuItem4.setText("Obtener codigo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuTabla.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowRightShadow(false);
        panelTitulo.setBorder(dropShadowBorder1);
        panelTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelTituloMouseDragged(evt);
            }
        });
        panelTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelTituloMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(112, 182, 32));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/icons8-llamada-de-conferencia-48.png"))); // NOI18N
        jLabel18.setText("Listado ");
        jLabel18.setToolTipText("");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ingenieria del sofware");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/logoupcmediano.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(75, 146, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addGap(107, 107, 107)
                                                .addComponent(jLabel7))
                                        .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel7))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jLabel18)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
                panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
                panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_table.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        pnl_table.setBorder(dropShadowBorder2);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        jScrollPane1.setOpaque(false);

        tablaEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaEstudiantes.setForeground(new java.awt.Color(51, 51, 51));
        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        tablaEstudiantes.setComponentPopupMenu(menuTabla);
        tablaEstudiantes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setRowHeight(20);
        tablaEstudiantes.setSelectionBackground(new java.awt.Color(112, 182, 32));
        tablaEstudiantes.setShowHorizontalLines(false);
        tablaEstudiantes.setShowVerticalLines(false);
        tablaEstudiantes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaEstudiantes);

        materialComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Identificacion" }));

        materialTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTextField1ActionPerformed(evt);
            }
        });
        materialTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                materialTextField1KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Por: ");

        javax.swing.GroupLayout pnl_tableLayout = new javax.swing.GroupLayout(pnl_table);
        pnl_table.setLayout(pnl_tableLayout);
        pnl_tableLayout.setHorizontalGroup(
                pnl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tableLayout.createSequentialGroup()
                                .addGroup(pnl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnl_tableLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(materialComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(materialTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_tableLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jScrollPane1)))
                                .addGap(31, 31, 31))
        );
        pnl_tableLayout.setVerticalGroup(
                pnl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_tableLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(materialTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(materialComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addContainerGap())
        );

        materialButtomPanel3.setBackground(new java.awt.Color(112, 182, 32));
        materialButtomPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialButtomPanel3MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/imagenes/icons8-long-arrow-left-24.png"))); // NOI18N
        jLabel10.setText("Regresar");

        javax.swing.GroupLayout materialButtomPanel3Layout = new javax.swing.GroupLayout(materialButtomPanel3);
        materialButtomPanel3.setLayout(materialButtomPanel3Layout);
        materialButtomPanel3Layout.setHorizontalGroup(
                materialButtomPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(materialButtomPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        materialButtomPanel3Layout.setVerticalGroup(
                materialButtomPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(materialButtomPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
                panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addComponent(materialButtomPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(pnl_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(131, 131, 131))
        );
        panelContenedorLayout.setVerticalGroup(
                panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelContenedorLayout.createSequentialGroup()
                                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(pnl_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(materialButtomPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTituloMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_panelTituloMousePressed

    private void panelTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTituloMouseDragged
        // TODO add your handling code here:


    }//GEN-LAST:event_panelTituloMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        CrearTabla();
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "has echo clic en modificar");
        int filaselecionada = tablaEstudiantes.getSelectedRow();
        if (filaselecionada >= 0) {
            if (modificar) {
                if (DPFP.Lector.isStarted()) {
                    DPFP.Lector.stopCapture();
                    DPFP.Reclutador.clear();
                }
                _formularioInstanciador.recibirCodigo(tablaEstudiantes.getValueAt(filaselecionada, 0).toString());
                this.dispose();
            } else {
                frmModificarEstudiante frm = new frmModificarEstudiante(this);
                String codigo = tablaEstudiantes.getValueAt(filaselecionada, 0).toString();
                frm.grupo = grupo;
                frm.cargarFormulario(codigo);
                frm.habilitarFormulario();
                frm.setExtendedState(MAXIMIZED_BOTH);
                frm.setVisible(true);
                if (DPFP.Lector.isStarted()) {
                    DPFP.Lector.stopCapture();
                    DPFP.Reclutador.clear();
                }
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No has selecionado Ningun registro", "error de selecion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int filaselecionada = tablaEstudiantes.getSelectedRow();
        if (filaselecionada >= 0) {
            eliminarEstudiante(tablaEstudiantes.getValueAt(filaselecionada, 0).toString());
        } else {
            JOptionPane.showMessageDialog(this, "No has selecionado Ningun registro", "error de selecion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void materialTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materialTextField1KeyReleased
        // TODO add your handling code here:
        if (materialComboBox1.getSelectedItem() == "Nombre") {
            CargarTablaxNombre(materialTextField1.getText());
        }
        if (materialComboBox1.getSelectedItem() == "Identificacion") {
            CargarTablaxIdentificacion(materialTextField1.getText());
        }
    }//GEN-LAST:event_materialTextField1KeyReleased

    private void materialButtomPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtomPanel3MouseClicked
        // TODO add your handling code here:
        _formularioInstanciador.setVisible(true);
        this.dispose();
        if (DPFP.Lector.isStarted()) {
            DPFP.Lector.stopCapture();
            DPFP.Reclutador.clear();
        }

    }//GEN-LAST:event_materialButtomPanel3MouseClicked

    private void materialTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTextField1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        _formularioInstanciador.setVisible(true);
        if (DPFP.Lector.isStarted()) {
            DPFP.Lector.stopCapture();
            DPFP.Reclutador.clear();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (informes) {
            int filaselecionada = tablaEstudiantes.getSelectedRow();
            if (filaselecionada >= 0) {
                _formularioInstanciador.recibirCodigo(tablaEstudiantes.getValueAt(filaselecionada, 0).toString());
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No has elegido ningun registro", "obtener codigo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListadoEstudiante(_formularioInstanciador).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private MaterialButtomPanel materialButtomPanel3;
    private MaterialComboBox materialComboBox1;
    private MaterialTextField materialTextField1;
    private javax.swing.JPopupMenu menuTabla;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel pnl_table;
    private javax.swing.JTable tablaEstudiantes;
    // End of variables declaration//GEN-END:variables

    public void CrearTabla() {
        String[] titulos = new String[]{"IDENTIFICACION", "NOMBRE", "APELLIDO", "EMAIL"};
        modelo.setColumnIdentifiers(titulos);
        tablaEstudiantes.setModel(modelo);
        tablaEstudiantes.setComponentPopupMenu(menuTabla);
    }

    //    void setFilas() {
//        CrearTabla();
//        try {
//            //Establece los valores para la sentencia SQL
//            Connection c = con.conectar();
//
//            //Obtiene todas las huellas de la bd
//            PreparedStatement identificarStmt = c.prepareStatement("SELECT * FROM estudiante");
//            ResultSet rs;
//
//            rs = identificarStmt.executeQuery();
//            //objetoi que almacenara todos los usuarios
//            Object[] datos = new Object[4];
//            //Si se encuentra el nombre en la base de datos
//            while (rs.next()) {
//                //Lee la plantilla de la base de datos
//                for (int i = 0; i < 4; i++) {
//                    datos[i] = rs.getObject(i + 1);
//                }
//                modelo.addRow(datos);
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(frmListadoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    public void LimpiarTabla() {
        int filas = tablaEstudiantes.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    public void cargarTabla() {

        LimpiarTabla();
        Connection c = con.conectar();
        //Obtiene todas las huellas de la bd
        PreparedStatement buscarStmt;
        try {

            buscarStmt = c.prepareStatement("Select * from estudiante WHERE grupo_codigo=?");
            buscarStmt.setString(1, (grupo.split(":")[1]).trim());
            ResultSet rs = buscarStmt.executeQuery();
            //objetoi que almacenara todos los usuarios
            Object[] datos = new Object[4];
            //Si se encuentra el nombre en la base de datos
            int cont = 0;
            while (rs.next()) {
                cont++;
                //Lee la plantilla de la base de datos
                for (int i = 0; i < 4; i++) {
                    datos[i] = rs.getObject(i + 1);
                    System.out.println("Nombre  " + datos[i]);
                }
                modelo.addRow(datos);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmListadoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void CargarTablaxNombre(String nombre) {

        LimpiarTabla();
        Connection c = con.conectar();
        //Obtiene todas las huellas de la bd
        PreparedStatement buscarStmt;
        try {
            buscarStmt = c.prepareStatement("Select * from estudiante where nombre like '%" + nombre + "%' AND grupo_codigo=?  order by nombre");
            buscarStmt.setString(1, (grupo.split(":")[1]).trim());
            ResultSet rs = buscarStmt.executeQuery();
            //objetoi que almacenara todos los usuarios
            Object[] datos = new Object[4];
            //Si se encuentra el nombre en la base de datos
            while (rs.next()) {
                //Lee la plantilla de la base de datos
                for (int i = 0; i < 4; i++) {
                    datos[i] = rs.getObject(i + 1);
                    System.out.println("Nombre  " + datos[i]);
                }
                modelo.addRow(datos);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmListadoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void CargarTablaxIdentificacion(String text) {

        LimpiarTabla();
        Connection c = con.conectar();
        //Obtiene todas las huellas de la bd
        PreparedStatement buscarStmt;
        try {
            buscarStmt = c.prepareStatement("Select * from estudiante where codigo like  '%" + text + "%'  and grupo_codigo=? order by codigo");
            buscarStmt.setString(1, (grupo.split(":")[1]).trim());
            ResultSet rs = buscarStmt.executeQuery();
            //objetoi que almacenara todos los usuarios
            Object[] datos = new Object[4];
            //Si se encuentra el nombre en la base de datos
            while (rs.next()) {
                //Lee la plantilla de la base de datos
                for (int i = 0; i < 4; i++) {
                    datos[i] = rs.getObject(i + 1);
                    System.out.println("Identificacion " + datos[i]);
                }
                modelo.addRow(datos);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmListadoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void eliminarEstudiante(String codigo) {
        Connection c = con.conectar();
        //Obtiene todas las huellas de la bd
        try {
            PreparedStatement st = c.prepareStatement("DELETE FROM estudiante WHERE codigo = ? ");
            st.setString(1, codigo);
            //Ejecuta la sentencia
            st.execute();
            JOptionPane.showMessageDialog(this, "Estudiante Eliminado correctamente", "Eliminando", JOptionPane.INFORMATION_MESSAGE);
            c.close();
            cargarTabla();
        } catch (SQLException ex) {
            JTextArea txtAddress = new JTextArea();
            txtAddress.append(ex.toString());
            txtAddress.setBorder(BorderFactory.createLineBorder(Color.black));
            txtAddress.setLineWrap(true);
            txtAddress.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(txtAddress,
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setPreferredSize(new Dimension(400, 200));

            JOptionPane.showMessageDialog(this, scrollPane, "Error al eliminar", JOptionPane.WARNING_MESSAGE);

        }

    }

    @Override
    public void recibirCodigo(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
