/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import acceso.a.datos.SiniestroData;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author pc2
 */
public class bomberosgrupo17 extends javax.swing.JFrame {
private SiniestroData sd= new SiniestroData();
    /**
     * Creates new form bomberosgrupo17
     */
    public bomberosgrupo17() {
        initComponents();
        transparenciaBotones();
        jtTotalSin.setText(sd.cantidadDeSiniestros().size()+"");
        jtSinAyHoy.setText(sd.ListarSiniestrosEntreFechas().size()+"");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/menu1.png"));
        Image gen= icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen,0,0,getWidth(),getHeight(),this);

            }
        }
        ;
        jbBombero = new javax.swing.JButton();
        jbSiniestro = new javax.swing.JButton();
        jbBrigada = new javax.swing.JButton();
        jbCuartel = new javax.swing.JButton();
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/imagenes/bannner.png"));
        Image gen2= icono2.getImage();
        jDBanner = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen2,0,0,getWidth(),getHeight(),this);

            }
        };
        jLabel1 = new javax.swing.JLabel();
        jtTotalSin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtSinAyHoy = new javax.swing.JTextField();
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/imagenes/FondoP1.png"));
        Image gen3= icono3.getImage();
        jDFormularios = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(gen3,0,0,getWidth(),getHeight(),this);

            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmBomberos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBrigadas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmCuarteles = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmSiniestros = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setPreferredSize(new java.awt.Dimension(203, 714));

        jbBombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonbobero.png"))); // NOI18N
        jbBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBomberoActionPerformed(evt);
            }
        });

        jbSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonsini.png"))); // NOI18N
        jbSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiniestroActionPerformed(evt);
            }
        });

        jbBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonbri.png"))); // NOI18N
        jbBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBrigadaActionPerformed(evt);
            }
        });

        jbCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botoncuar.png"))); // NOI18N
        jbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCuartelActionPerformed(evt);
            }
        });

        escritorio.setLayer(jbBombero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBrigada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jbBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(jbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jbBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jDBanner.setBackground(new java.awt.Color(153, 255, 255));
        jDBanner.setPreferredSize(new java.awt.Dimension(1000, 140));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Siniestros totalas ");

        jtTotalSin.setEditable(false);
        jtTotalSin.setBackground(new java.awt.Color(255, 102, 0));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Siniestros ocurridos  entre ayer y hoy");

        jtSinAyHoy.setEditable(false);
        jtSinAyHoy.setBackground(new java.awt.Color(255, 102, 0));

        jDBanner.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDBanner.setLayer(jtTotalSin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDBanner.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDBanner.setLayer(jtSinAyHoy, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDBannerLayout = new javax.swing.GroupLayout(jDBanner);
        jDBanner.setLayout(jDBannerLayout);
        jDBannerLayout.setHorizontalGroup(
            jDBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDBannerLayout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(jDBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jDBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtTotalSin)
                    .addComponent(jtSinAyHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jDBannerLayout.setVerticalGroup(
            jDBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDBannerLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jDBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtTotalSin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtSinAyHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jDBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jDFormularios.setPreferredSize(new java.awt.Dimension(1000, 574));

        javax.swing.GroupLayout jDFormulariosLayout = new javax.swing.GroupLayout(jDFormularios);
        jDFormularios.setLayout(jDFormulariosLayout);
        jDFormulariosLayout.setHorizontalGroup(
            jDFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDFormulariosLayout.setVerticalGroup(
            jDFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        getContentPane().add(jDFormularios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jMenu1.setText("Boberos");

        jmBomberos.setText("Bomberos");
        jmBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBomberosActionPerformed(evt);
            }
        });
        jMenu1.add(jmBomberos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Brigadas");

        jmBrigadas.setText("Brigadas");
        jmBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBrigadasActionPerformed(evt);
            }
        });
        jMenu2.add(jmBrigadas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cuarteles");

        jmCuarteles.setText("Cuarteles");
        jmCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCuartelesActionPerformed(evt);
            }
        });
        jMenu3.add(jmCuarteles);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Siniestros");

        jmSiniestros.setText("Siniestros");
        jmSiniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSiniestrosActionPerformed(evt);
            }
        });
        jMenu4.add(jmSiniestros);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        jMenuItem1.setText("Seguro quiere salir?");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBomberoActionPerformed
         jDFormularios.removeAll();
        jDFormularios.repaint();
        bomberoview bom=new bomberoview();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jbBomberoActionPerformed

    private void jbBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBrigadaActionPerformed
       jDFormularios.removeAll();
        jDFormularios.repaint();
        brigadaview bom=new brigadaview();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jbBrigadaActionPerformed

    private void jbSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiniestroActionPerformed
        jDFormularios.removeAll();
        jDFormularios.repaint();
        siniestroview2 bom=new siniestroview2();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jbSiniestroActionPerformed

    private void jbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCuartelActionPerformed
         jDFormularios.removeAll();
        jDFormularios.repaint();
        cuartelview2 bom=new cuartelview2();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jbCuartelActionPerformed

    private void jmBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBomberosActionPerformed
        // TODO add your handling code here:
           jDFormularios.removeAll();
        jDFormularios.repaint();
        bomberoview bom=new bomberoview();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jmBomberosActionPerformed

    private void jmBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBrigadasActionPerformed
        // TODO add your handling code here:
         jDFormularios.removeAll();
        jDFormularios.repaint();
        brigadaview bom=new brigadaview();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jmBrigadasActionPerformed

    private void jmCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCuartelesActionPerformed
        // TODO add your handling code here:
           jDFormularios.removeAll();
        jDFormularios.repaint();
        cuartelview2 bom=new cuartelview2();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jmCuartelesActionPerformed

    private void jmSiniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSiniestrosActionPerformed
        // TODO add your handling code here:
         jDFormularios.removeAll();
        jDFormularios.repaint();
        siniestroview2 bom=new siniestroview2();
        bom.setVisible(true);
        jDFormularios.add(bom);
        jDFormularios.moveToFront(bom);
    }//GEN-LAST:event_jmSiniestrosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System. exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(bomberosgrupo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bomberosgrupo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bomberosgrupo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bomberosgrupo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bomberosgrupo17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JDesktopPane jDBanner;
    private javax.swing.JDesktopPane jDFormularios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jbBombero;
    private javax.swing.JButton jbBrigada;
    private javax.swing.JButton jbCuartel;
    private javax.swing.JButton jbSiniestro;
    private javax.swing.JMenuItem jmBomberos;
    private javax.swing.JMenuItem jmBrigadas;
    private javax.swing.JMenuItem jmCuarteles;
    private javax.swing.JMenuItem jmSiniestros;
    private javax.swing.JTextField jtSinAyHoy;
    private javax.swing.JTextField jtTotalSin;
    // End of variables declaration//GEN-END:variables
private void siniestroTotales(int s){
    
    
}
public void transparenciaBotones(){
    jbBombero.setOpaque(false);
    jbBombero.setContentAreaFilled(false);
    jbBombero.setBorderPainted(false);
    jbBrigada.setOpaque(false);
    jbBrigada.setContentAreaFilled(false);
    jbBrigada.setBorderPainted(false);
    jbCuartel.setOpaque(false);
    jbCuartel.setContentAreaFilled(false);
    jbCuartel.setBorderPainted(false);
    jbSiniestro.setOpaque(false);
    jbSiniestro.setContentAreaFilled(false);
    jbSiniestro.setBorderPainted(false);
  
}

}
