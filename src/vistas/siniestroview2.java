/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import acceso.a.datos.BrigadaData;
import acceso.a.datos.CuartelData;
import acceso.a.datos.SiniestroData;
import entidades.Brigada;
import entidades.Cuartel;
import entidades.Siniestro;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class siniestroview2 extends javax.swing.JInternalFrame {
    private SiniestroData sinData = new SiniestroData();
    private Siniestro sin = null;
    private String[] especial = {"incendios", "salvamento", "rescates en montaña", "inundaciones", "accidentes de tráfico", "prevención"};
    private BrigadaData brigadas = new BrigadaData();
    private Brigada brigada = new Brigada();
    /**
     * Creates new form siniestroview2
     */
    public siniestroview2() {
        initComponents();
        cargarCombo ();
        CargarEspecialidad();
        transparenciaBotones();
        jcEspecialidad.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/fondoS2.png"));
        Image gen= icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen,0,0,getWidth(),getHeight(),this);

            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtBrigada = new javax.swing.JTextField();
        jdResol = new com.toedter.calendar.JDateChooser();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtPuntos = new javax.swing.JTextField();
        jtDetalle = new javax.swing.JTextField();
        jtCoord_Y = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtCoord_X = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcEspecialidad = new javax.swing.JComboBox<>();
        jbAsignarB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(1000, 574));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1000, 574));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Tipo");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Siniestro");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Coord X");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Coord Y");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Detalle");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Resol");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Puntuacion");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("CodBrigada");

        jtBrigada.setEditable(false);
        jtBrigada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBrigadaActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jtPuntos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtDetalle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtCoord_Y.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbBuscar.setBackground(new java.awt.Color(255, 153, 204));
        jbBuscar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar323232.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtCoord_X.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbNuevo.setBackground(new java.awt.Color(255, 153, 204));
        jbNuevo.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas112.png"))); // NOI18N
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(102, 102, 255));
        jbEliminar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar12321.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir777777777.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(102, 102, 255));
        jbGuardar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar123123.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbAsignarB.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jbAsignarB.setText("Asignar brigada");
        jbAsignarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignarBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Siniestro");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Brigada 1 = sin asignar por defecto ");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtBrigada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdResol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtPuntos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtDetalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtCoord_Y, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtCoord_X, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcEspecialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbAsignarB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(jtCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdResol, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbAsignarB)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(419, 419, 419))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jcEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCoord_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtCoord_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAsignarB))
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdResol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Siniestro a =(Siniestro)jComboBox1.getSelectedItem();
        //        SiniestroData cargar = new SiniestroData();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
           limpiar();
        try{

             sin =(Siniestro)jComboBox1.getSelectedItem();
//sin =(Siniestro)jComboBox1.getSelectedItem();
           sin=sinData.buscarSiniestro(sin.getCodigo());
            if (sin!=null) {

                jcEspecialidad.setSelectedItem(sin.getTipo());
                jtDetalle.setText(sin.getDetalles());
                jtBrigada.setText(sin.getCodBrigada().getCodBrigada()+"");

                jtCoord_X.setText(sin.getCoord_X()+"");
                jtCoord_Y.setText(sin.getCoord_Y()+"");
                Date date = Date.from(sin.getFechaSiniestro().atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdFecha.setDate(date);
                if (sin.getFechaResolucion()!=null) {
                     Date date2 = Date.from(sin.getFechaResolucion().atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdResol.setDate(date2);
                jtPuntos.setText(sin.getPuntuacion()+"");
                }
               

               


                
               // jrEstado.setSelected(sin.isEstado());
//
            }else{
                JOptionPane.showMessageDialog(this, "intenté otra vez");
            }

        }catch (NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "error al llenar los campos");
        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        sin=null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // sin terminar
          try {

            if (jdResol.getDate() != null && jtBrigada.getText() != null) {
                int nbrigada = Integer.parseInt(jtBrigada.getText());
                if (nbrigada==0) {
                      JOptionPane.showMessageDialog(this, "No se encuentra una Brigada disponible para asignar" );
                      return ;
                }
                brigada = brigadas.buscarBrigada(nbrigada);

                String detalle = jtDetalle.getText();

                LocalDate fechaR = jdResol.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                if (jtPuntos.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(this, " Colocar una puntuación al finalizar el Sinestro ");
                    return;
                }
               
                int puntos = Integer.parseInt(jtPuntos.getText());
                int coordX = Integer.parseInt(jtCoord_X.getText());
                int coordY = Integer.parseInt(jtCoord_Y.getText());
                if (!(coordX>0 && coordX<800)|| !(coordY>0 && coordY<800)) {
                    JOptionPane.showMessageDialog(this, "Coordenada fuera de rango, ingrese solo numeros enteros  de 0  a 800 ");
                    return ;
                }
                if (!(puntos>=0 && puntos<=10)) {
                    JOptionPane.showMessageDialog(this, "Coloque una nota de 0 a 10 ");
                    return ;
                }
               
                if (jcEspecialidad.getSelectedItem() == null || jdFecha.getDate() == null) {
                    JOptionPane.showMessageDialog(this, " Complete campos requeridos * ");
                    return;
                }
                LocalDate fechaN = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                 if (fechaN.isAfter(fechaR)) {
                    JOptionPane.showMessageDialog(this, "La fecha de Resolucion no puede ser anterior a la fecha del Siniestro ");
                    return ;
                }
                String tipo = jcEspecialidad.getSelectedItem() + "";
                if (sin == null) {
                    if (brigada.getCodBrigada()==0) {
                        JOptionPane.showMessageDialog(this, "No puede grabar una Brigada 0 ");
                        return ;
                    }
                    sin = new Siniestro(tipo, fechaN, coordX, coordY, detalle, fechaR, puntos, brigada,true);
                    sinData.guardarSiniestro(sin);
                    brigada.setLibre(true);

                    brigadas.modificarBrigada(brigada);
                } else {

                    sin.setCodBrigada(brigada);
                    sin.setCoord_X(coordX);
                    sin.setCoord_Y(coordY);
                    sin.setDetalles(detalle);
                    sin.setFechaResolucion(fechaR);
                    sin.setFechaSiniestro(fechaN);
                    sin.setPuntuacion(puntos);
                    sin.setTipo(tipo);
                    brigada.setLibre(true);

                    brigadas.modificarBrigada(brigada);
                    sinData.modificarSiniestro(sin);
                    sinData.modificarSiniestro(sin);

                }
            } else {

                brigada = brigadas.buscarBrigada(1);
                if (!jtBrigada.getText().equals("1") && !jtBrigada.getText().equals("")) {
                    int numbrigada = Integer.parseInt(jtBrigada.getText());

                    brigada = brigadas.buscarBrigada(numbrigada);
                    brigada.setLibre(false);

                    brigadas.modificarBrigada(brigada);
                }

                String tipo = jcEspecialidad.getSelectedItem() + "";
                String detalle = jtDetalle.getText();
                LocalDate fechaN = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int coordX = Integer.parseInt(jtCoord_X.getText());
                int coordY = Integer.parseInt(jtCoord_Y.getText());
                if (sin == null) {

                    sin = new Siniestro(tipo, fechaN, coordX, coordY, detalle, brigada,true);
                    sinData.guardarSinResolver(sin);

                } else {

                    sin.setCodBrigada(brigada);
                    sin.setCoord_X(coordX);
                    sin.setCoord_Y(coordY);
                    sin.setDetalles(detalle);
                    sin.setFechaSiniestro(fechaN);
                    sin.setTipo(tipo);
                    sinData.modificarSinResolver(sin);
                    brigada.setLibre(false);

                    brigadas.modificarBrigada(brigada);
                }

            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "error al llenar los camposss" + nf);
            System.out.println("" + nf);
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbAsignarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignarBActionPerformed
     String espe= jcEspecialidad.getSelectedItem()+"";
        double Distancia=999999;
        Brigada brigada1=new Brigada();
        Cuartel cuartel1=new Cuartel();
        CuartelData busq=new CuartelData();
        ArrayList<Cuartel> Cuarteles = busq.listarcuartel();
        Iterator<Cuartel> Iterator2 = Cuarteles.iterator();
        
        while (Iterator2.hasNext()) {
//            boolean sitiene=false;
            Cuartel cua = Iterator2.next();
             ArrayList<Brigada> BrigadaPorCuartel =brigadas.buscarBrigadaPorCuartel(cua.getCodCuartel()); 
            Iterator<Brigada> Iterator3 = BrigadaPorCuartel.iterator();
            while (Iterator3.hasNext()) {
            Brigada bri3 = Iterator3.next();
                if (bri3.getEspecialidad().equals(espe)) {
                    
                    int x1=cua.getCoorX();
                    int x2=sin.getCoord_X();
                    int y1=cua.getCoorY();
                    int y2=sin.getCoord_Y();
                    
                   int x = x2 - x1;
                   int y = y2 - y1;
                    
                    if (Math.sqrt(x * x + y * y)<Distancia) {
                        Distancia = Math.sqrt(x * x + y * y);
                        brigada1=bri3;
                        cuartel1=cua;
                        
                    }
//                    System.out.println(Distancia);
                    
                    
                }
            
            }

        }
      double distancia= ((double)Math.round(Distancia * 100d) / 100d);
     
       JOptionPane.showMessageDialog(this,distancia + " metros ","      Distacia  entre el Cuartel y el Siniestro es: ",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/imagenes/distancia.jpg"));
        if (brigada1.getCodBrigada()==0) {
             jtBrigada.setText("1");
             
        }else
       jtBrigada.setText(brigada1.getCodBrigada()+"");
       
    }//GEN-LAST:event_jbAsignarBActionPerformed

    private void jtBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBrigadaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jtBrigadaActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        try{


                if (sin!=null) {

            sinData.eliminarSiniestro(sin.getCodigo());


                }else{
                    JOptionPane.showMessageDialog(this, "Siniestro no encontrado");
                }


        }catch (NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "error al intentar eliminar el siniestro ");
        }
    
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Siniestro> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAsignarB;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcEspecialidad;
    private com.toedter.calendar.JDateChooser jdFecha;
    private com.toedter.calendar.JDateChooser jdResol;
    private javax.swing.JTextField jtBrigada;
    private javax.swing.JTextField jtCoord_X;
    private javax.swing.JTextField jtCoord_Y;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtPuntos;
    // End of variables declaration//GEN-END:variables
private void cargarCombo (){
SiniestroData busca=new SiniestroData();
ArrayList<Siniestro> lista=busca.cargarSiniestro(); 

    for (int i = 0; i < lista.size(); i++) {
//   alumno p=new alumno(lista.get(i).getIdAlumno(),lista.get(i).getDni(),lista.get(i).getApellido(),lista.get(i).getNombre(),lista.get(i).getFechaNac(),lista.get(i).isActivo());
        jComboBox1.addItem(lista.get(i));
                
               
    }
}
public void transparenciaBotones(){
    jbGuardar.setOpaque(false);
    jbGuardar.setContentAreaFilled(false);
    jbGuardar.setBorderPainted(false);
    jbSalir.setOpaque(false);
    jbSalir.setContentAreaFilled(false);
    jbSalir.setBorderPainted(false);
    jbNuevo.setOpaque(false);
    jbNuevo.setContentAreaFilled(false);
    jbNuevo.setBorderPainted(false);
    jbEliminar.setOpaque(false);
    jbEliminar.setContentAreaFilled(false);
    jbEliminar.setBorderPainted(false);
    jbBuscar.setOpaque(false);
    jbBuscar.setContentAreaFilled(false);
    jbBuscar.setBorderPainted(false);
    jbSalir.setOpaque(false);
    jbSalir.setContentAreaFilled(false);
    jbSalir.setBorderPainted(false);
}
public void limpiar(){
        jcEspecialidad.setSelectedItem(null);
        jtDetalle.setText("");
        jtBrigada.setText("");

        jtCoord_X.setText("");
        jtCoord_Y.setText("");
        jdFecha.setDate(null);
        jdResol.setDate(null);

        jtPuntos.setText("");
        
    
}
    private void CargarEspecialidad(){

        
        for (int i = 0; i < especial.length; i++) {
            jcEspecialidad.addItem(especial[i]);

        }

    }
    private void setEspecialidad(String ep){

        
        for (int i = 0; i < especial.length; i++) {
            
            if (especial[i].equals(ep)) {
                jcEspecialidad.setSelectedIndex(i);
               
            }

        }

    }

}
