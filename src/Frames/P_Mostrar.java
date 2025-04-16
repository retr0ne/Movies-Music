package Frames;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.print.attribute.standard.Media;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import javafx.embed.swing.JFXPanel;
/**
 *
 * @author usuario
 */
public class P_Mostrar extends javax.swing.JFrame {

    FondoPanel fondo_p = new FondoPanel();
   /// Peliculas peli = new Peliculas();

    String rutaV = "C:\\Users\\PC\\OneDrive\\Documentos\\NetBeansProjects\\Movies&Music_version22\\src\\Trailers\\";
    String fuente = rutaV + Objetos.peliculas.Play[Objetos.peliculas.indicador];

    public P_Mostrar(int indice) {
        this.setContentPane(fondo_p);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        SetImageLabel("src" + Objetos.peliculas.Caratula[indice], cover);
        SetImageLabel("src" + Objetos.peliculas.Logos[indice], logo_peli);
        director.setText("Director: " + Objetos.peliculas.Director[indice]);
        actores.setText("Actores: "+Objetos.peliculas.actor1[indice]+", "+Objetos.peliculas.actor2[indice]);
        categoria.setText("Categorías: "+Objetos.peliculas.categoria1[indice]+", "+Objetos.peliculas.categoria2[indice]);
        
        jLabel4.setText(Objetos.peliculas.Nombre[indice]);
        sinopsis.setText(Objetos.peliculas.Sinopsis[indice]);
        titulo_original.setText(Objetos.peliculas.Titulo[indice]);

        miniatura.setIcon(setIcono(Objetos.peliculas.Miniatura[indice], miniatura));
        renta.setIcon(setIcono("/Imagenes/renta.png", renta));
        renta.setPressedIcon(setIconoPresionado("/Imagenes/renta.png", renta, 180, 50));
        compra.setIcon(setIcono("/Imagenes/comprar.png", compra));
        compra.setPressedIcon(setIconoPresionado("/Imagenes/comprar.png", compra, 180, 50));
        volver.setIcon(setIcono("/Imagenes/volver.png", volver));
        volver.setPressedIcon(setIconoPresionado("/Imagenes/volver.png", volver, 180, 50));
        transparencia();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cover = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        titulo_original = new javax.swing.JLabel();
        director = new javax.swing.JLabel();
        actores = new javax.swing.JLabel();
        logo_peli = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsis = new javax.swing.JTextArea();
        miniatura = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        renta = new javax.swing.JButton();
        compra = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Rubik Light", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BATMAN (2022)");

        categoria.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        categoria.setText("Categorías: Acción, Misterio, Crimen.");

        titulo_original.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        titulo_original.setText("Titulo Original: THE BATMAN");

        director.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        director.setText("Director: Matt Reeves");

        actores.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        actores.setText("Actores: Robert Pattinson, Zoë Kravitz");

        sinopsis.setEditable(false);
        sinopsis.setColumns(20);
        sinopsis.setFont(new java.awt.Font("Rubik Light", 0, 16)); // NOI18N
        sinopsis.setRows(5);
        sinopsis.setText("La reina Ramonda (Angela Bassett), Shuri (Letitia Wright), M’Baku \n(Winston Duke), Okoye (Danai Gurira) y las Dora Milaje (incluida Florence \nKasumba), luchan para proteger su nación de la injerencia de potencias \nmundiales a raíz de la muerte del rey T’Challa. Mientras los wakandianos \nse esfuerzan por adaptarse a su nueva etapa, los héroes deben actuar \nunidos, con la ayuda del Perro de la Guerra Nakia (Lupita Nyong’o) y \nEverett Ross (Martin Freeman), y forzar un nuevo destino para el reino de \nWakanda.");
        jScrollPane1.setViewportView(sinopsis);

        miniatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniaturaActionPerformed(evt);
            }
        });

        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentaActionPerformed(evt);
            }
        });

        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Rubik Light", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VER TRAILER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cover, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logo_peli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoria)
                            .addComponent(titulo_original, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(director, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(miniatura, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(renta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(cover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_original, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(actores, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logo_peli, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(renta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(miniatura, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miniaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniaturaActionPerformed
        // TODO add your handling code here: Contiene el metodo de los videos 
        
    String ruta = fuente;
    new reproductor_video(ruta).setVisible(true);

    }//GEN-LAST:event_miniaturaActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentaActionPerformed
        // TODO add your handling code here:
        Rentar_P rentar = new Rentar_P(Objetos.peliculas.indicador);
        rentar.setVisible(true);
    }//GEN-LAST:event_rentaActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        // TODO add your handling code here:
        System.out.println("Presionado");
        Peliculas pelis = new Peliculas();
        Comprar_P comprar = new Comprar_P(Objetos.peliculas.indicador);
        comprar.setVisible(true);
    }//GEN-LAST:event_compraActionPerformed

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
            java.util.logging.Logger.getLogger(P_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_Mostrar(0).setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel {

        private Image Imagen;

        public void paint(Graphics g) {
            Imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo_p.jpg")).getImage();
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
        int width = (boton.getWidth() + 185) - ancho;
        int height = (boton.getHeight() + 55) - alto;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

    public void transparencia() {
        miniatura.setOpaque(false);
        miniatura.setContentAreaFilled(false);
        miniatura.setBorderPainted(false);
        renta.setOpaque(false);
        renta.setContentAreaFilled(false);
        renta.setBorderPainted(false);
        compra.setOpaque(false);
        compra.setContentAreaFilled(false);
        compra.setBorderPainted(false);
        volver.setOpaque(false);
        volver.setContentAreaFilled(false);
        volver.setBorderPainted(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actores;
    private javax.swing.JLabel categoria;
    private javax.swing.JButton compra;
    private javax.swing.JLabel cover;
    private javax.swing.JLabel director;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo_peli;
    private javax.swing.JButton miniatura;
    private javax.swing.JButton renta;
    private javax.swing.JTextArea sinopsis;
    private javax.swing.JLabel titulo_original;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
