/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.BorderLayout;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
/**
 * ancho: 1553 ---- 1662
 * alto: 664
 * 
 * [1774, 676]
 * @author PC
 * //  jfxpanel.setScene(null);
      //  this.setVisible(false);
 */
public class reproductor_video extends javax.swing.JFrame {

    private final JFXPanel jfxpanel = new JFXPanel();
    File archivo;
    Peliculas pelis = new Peliculas();
    
    
    public reproductor_video(String ruta) {
        initComponents();
        archivo = new File(ruta);
        System.out.println("Hi");
        createScene();
        setTitle("Reproductor");
        
        setResizable(false);
        setLocationRelativeTo(null);
        
        panelV.setLayout(new BorderLayout());
        
        panelV.add(jfxpanel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
    }


    public void createScene() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                  MediaPlayer reproductor = new MediaPlayer(new Media(archivo.toURI().toString()));
                
                jfxpanel.setScene(new Scene(new Group(new MediaView(reproductor))));
                
                reproductor.setVolume(0.7);
                reproductor.play();
            }
        });
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelV = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 840));

        panelV.setBackground(new java.awt.Color(204, 204, 204));
        panelV.setMaximumSize(new java.awt.Dimension(720, 720));
        panelV.setPreferredSize(new java.awt.Dimension(1280, 720));

        Volver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Volver.setForeground(new java.awt.Color(204, 204, 204));
        Volver.setText("VOLVER");
        Volver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVLayout = new javax.swing.GroupLayout(panelV);
        panelV.setLayout(panelVLayout);
        panelVLayout.setHorizontalGroup(
            panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVLayout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        panelVLayout.setVerticalGroup(
            panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVLayout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelV, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
       jfxpanel.setScene(null);
       this.setVisible(false);
       //this.dispose();
       
     
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(reproductor_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reproductor_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reproductor_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reproductor_video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

              new reproductor_video("C:\\Users\\PC\\OneDrive\\Documentos\\NetBeansProjects\\Movies&Music_version2\\src\\Trailers\\BATMAN _Tráiler.mp4").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JPanel panelV;
    // End of variables declaration//GEN-END:variables
}
