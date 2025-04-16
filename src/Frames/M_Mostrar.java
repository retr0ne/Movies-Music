package Frames;

import static Frames.Objetos.clips;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class M_Mostrar extends javax.swing.JFrame {

    FondoPanel fondo_m = new FondoPanel();
    BasicPlayer repro = new BasicPlayer();
    String ruta = "C:\\Users\\PC\\OneDrive\\Documentos\\NetBeansProjects\\Movies&Music_version22\\src\\Clips\\"; /// Ruta solo tendra lo que es la ruta modificable 
    String reproduce = ruta + Objetos.clips.Play[Objetos.clips.indice]; /// Aca pues conbino los String (lo hice de esa manera por que me daba pereza copiar y pegar xD)

    public M_Mostrar(int indice) {
        this.setContentPane(fondo_m);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        SetImageLabel("src" + Objetos.clips.Caratula[indice], caratula);
        titulo.setText("Titulo: " + Objetos.clips.Nombre[indice]);
        cantante.setText("Cantante(s): " + Objetos.clips.Cantante1[indice] + ", " + Objetos.clips.Cantante2[indice]);
        categorias.setText("Categoria(s): " + Objetos.clips.categoria1[indice] + ", " + Objetos.clips.categoria2[indice]);
        compositor.setText("Compositor(es): "+Objetos.clips.compositor[indice]);
        album.setText("Album: "+Objetos.clips.album[indice]);
        duracion.setText("Duración: "+Objetos.clips.Duracion[indice]);
        titulo_original.setText(Objetos.clips.Nombre[indice]); /// Se le habia olvidado esa parte dylan 
        reproducir.setIcon(setIcono("/Imagenes/m_play.png", reproducir));
        reproducir.setPressedIcon(setIconoPresionado("/Imagenes/m_play.png", reproducir, 180, 50));
        renta.setIcon(setIcono("/Imagenes/renta.png", renta));
        renta.setPressedIcon(setIconoPresionado("/Imagenes/renta.png", renta, 180, 50));
        compra.setIcon(setIcono("/Imagenes/comprar.png", compra));
        compra.setPressedIcon(setIconoPresionado("/Imagenes/comprar.png", compra, 180, 50));
        volver.setIcon(setIcono("/Imagenes/volver.png", volver));
        volver.setPressedIcon(setIconoPresionado("/Imagenes/volver.png", volver, 180, 50));
       /// reproducir.
        transparencia();
    }
    public boolean play = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caratula = new javax.swing.JLabel();
        titulo_original = new javax.swing.JLabel();
        cantante = new javax.swing.JLabel();
        categorias = new javax.swing.JLabel();
        album = new javax.swing.JLabel();
        compositor = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        reproducir = new javax.swing.JButton();
        titulo_original6 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        compra = new javax.swing.JButton();
        renta = new javax.swing.JButton();
        duracion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        titulo_original.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        titulo_original.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_original.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        cantante.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        cantante.setText("Cantante(s): Cuco, Jean Carter");

        categorias.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        categorias.setText("Categorias: difhsdf");

        album.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        album.setText("Álbum: Single");

        compositor.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        compositor.setText("Compositor(es): Jean Carter, Omar Banos");

        titulo.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        titulo.setText("Titulo: BOSSA NO SÉ");

        reproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproducirActionPerformed(evt);
            }
        });

        titulo_original6.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        titulo_original6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_original6.setText("REPRODUCIR PRUEBA");

        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });

        renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentaActionPerformed(evt);
            }
        });

        duracion.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        duracion.setText("Duración: 3:21 minutos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caratula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(categorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addComponent(compositor, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo_original, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(142, 142, 142))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(titulo_original6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(renta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caratula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compositor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(album, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(renta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_original, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_original6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        try {
            // TODO add your handling code here:
            repro.pause();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(M_Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentaActionPerformed
        // TODO add your handling code here:
        Rentar_M rentar = new Rentar_M(Objetos.clips.indice);
        rentar.setVisible(true);
    }//GEN-LAST:event_rentaActionPerformed

    private void reproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproducirActionPerformed
       ///Bueno aca esta todo el metodo de reproduccion de musica las lineas de codigo son basicas
       ///Practicamente open sirve para cargarle el archivo que esta en un objeto tipo FILE y pues lee los String (Todo piola la libreria)
        try {
            
            if(play == false) {
                repro.open(new File(reproduce));///Si quieren modificar algo simplemente cambien la variable xD
                repro.play();///Play reproduce la cancion xD
                play = true;
            } else {
                repro.pause();
                play = false;
            }
            
        } catch (BasicPlayerException ex) {
            Logger.getLogger(M_Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_reproducirActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        // TODO add your handling code here:
        Clips clip = new Clips();
        Comprar_M buy = new Comprar_M(Objetos.clips.indice);
        buy.setVisible(true);
    }//GEN-LAST:event_compraActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_Mostrar(0).setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel {

        private Image Imagen;

        public void paint(Graphics g) {
            Imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo_m.jpg")).getImage();
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
        reproducir.setOpaque(false);
        reproducir.setContentAreaFilled(false);
        reproducir.setBorderPainted(false);
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
    private javax.swing.JLabel album;
    private javax.swing.JLabel cantante;
    private javax.swing.JLabel caratula;
    private javax.swing.JLabel categorias;
    private javax.swing.JLabel compositor;
    private javax.swing.JButton compra;
    private javax.swing.JLabel duracion;
    private javax.swing.JButton renta;
    private javax.swing.JButton reproducir;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_original;
    private javax.swing.JLabel titulo_original6;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
