/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author pc2
 */
public class bomberosgrupo17 extends javax.swing.JFrame {

    /**
     * Creates new form bomberosgrupo17
     */
    public bomberosgrupo17() {
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

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/siniestro1.jpg"));
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
        jbMenu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbBombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brigada1.jpeg"))); // NOI18N
        jbBombero.setText("Bombero");
        jbBombero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBomberoActionPerformed(evt);
            }
        });

        jbSiniestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/siniestroIcono.png"))); // NOI18N
        jbSiniestro.setText("Siniestro");

        jbBrigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/brigadaIcono.png"))); // NOI18N
        jbBrigada.setText("Brigada");

        jbCuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuartelIcono.png"))); // NOI18N
        jbCuartel.setText("Cuartel");
        jbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCuartelActionPerformed(evt);
            }
        });

        jbMenu.setText("menu");
        jbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuActionPerformed(evt);
            }
        });

        escritorio.setLayer(jbBombero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBrigada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSiniestro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBombero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMenu)
                    .addComponent(jbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jbMenu)
                .addGap(26, 26, 26)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jMenu1.setText("Boberos");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Brigadas");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cuarteles");

        jMenuItem3.setText("jMenuItem3");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Siniestros");

        jMenuItem4.setText("jMenuItem4");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
=======
            .addComponent(escritorio)
>>>>>>> ebaae9f8d21ce25931348df8fc6109a2f721363a
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBomberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBomberoActionPerformed
        escritorio.repaint();
        bomberoview bom=new bomberoview();
        bom.setVisible(true);
        escritorio.add(bom);
        escritorio.moveToFront(bom);
    }//GEN-LAST:event_jbBomberoActionPerformed

<<<<<<< HEAD
    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
//        escritorio.repaint();
//        menu bom=new menu();
//        bom.setVisible(true);
//        escritorio.add(bom);
//        escritorio.moveToFront(bom);
    }//GEN-LAST:event_jbMenuActionPerformed
=======
    private void jbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCuartelActionPerformed
        // TODO add your handling code here:
        escritorio.repaint();
        cuartelview cuartel=new cuartelview();
        cuartel.setVisible(true);
        escritorio.add(cuartel);
        escritorio.moveToFront(cuartel);
    }//GEN-LAST:event_jbCuartelActionPerformed
>>>>>>> ebaae9f8d21ce25931348df8fc6109a2f721363a

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JButton jbBombero;
    private javax.swing.JButton jbBrigada;
    private javax.swing.JButton jbCuartel;
    private javax.swing.JButton jbMenu;
    private javax.swing.JButton jbSiniestro;
    // End of variables declaration//GEN-END:variables

}
