/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Ver_User extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    public Ver_User() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        
        SetImageLabel("src/Imagenes/header.jpg", headers);
        
        save.setIcon(setIcono("/Imagenes/guardar.png", save));
        save.setPressedIcon(setIconoPresionado("/Imagenes/guardar.png", save, 120, 40));
        
        leave.setIcon(setIcono("/Imagenes/descartar.png", leave));
        leave.setPressedIcon(setIconoPresionado("/Imagenes/descartar.png", leave, 120, 40));
        transparencia();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headers = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        leave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        headers.setText("jLabel1");

        leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(headers, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(leave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(headers, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_leaveActionPerformed


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
            java.util.logging.Logger.getLogger(Ver_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_User().setVisible(true);
            }
        });
    }
    class FondoPanel extends JPanel {

        private Image Imagen;

        public void paint(Graphics g) {
            Imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo_main.jpg")).getImage();
            g.drawImage(Imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    
    public void SetImageLabel(String url, JLabel label) {
        ImageIcon image = new ImageIcon(url);
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
        this.repaint();
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPresionado(String url, JButton boton, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = (boton.getWidth() + 130) - ancho;
        int height = (boton.getHeight() + 50) - alto;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }
    public void transparencia() {
        leave.setOpaque(false);
        leave.setContentAreaFilled(false);
        leave.setBorderPainted(false);
        save.setOpaque(false);
        save.setContentAreaFilled(false);
        save.setBorderPainted(false);
    }
    public void usuarios(){
        String[] clientes_name = {"Juan","Luan"};
        String[] clientes_apellidos = {"Abedaño","Jhonson"};
        String[] clientes_cc = {"1090872233","8716523"};
        String[] clientes_dir = {"Calle #34 21-54","Av. Libetadores 52 n-65"};
    JTextField[] text = new JTextField[clientes_name.length];
    int posicionador = 0;
        int x = 0;
        int y = 16;
        for (int i = 0; i < clientes_name.length; i++) {

            if (x >= 91) {
                posicionador = 0;
                y = y + 133;
                x = 290 + (posicionador * 128);
            } else {
                x = 290 + (posicionador * 128);
                y = y;
            }

            text[i] = new JTextField("" + i);
            text[i].setBounds(x, y, 128, 128);
            //text[i].setBorder();
            text[i].setText("");
            this.add(text[i]);
            
            posicionador++;

        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leave;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
