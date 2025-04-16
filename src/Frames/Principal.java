/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author usuario
 */
public class Principal extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); ///LLama a la clase FondoPanel 

    public Principal() {
        this.setContentPane(fondo); ///
        initComponents();
        CrearTodo();

        this.setTitle("Movies&Music");
        setSize(820, 588);
        setPreferredSize(new Dimension(1380, 580));
        setLocationRelativeTo(null);
        setResizable(false);

        SetImageLabel("src/Imagenes/separador.png", separator);
        SetImageLabel("src/Imagenes/logo_1.png", jLabel2);

        movie.setIcon(setIcono("/Imagenes/peliculas.png", movie));
        movie.setPressedIcon(setIconoPresionado("/Imagenes/peliculas.png", movie, 155, 85));
        music.setIcon(setIcono("/Imagenes/musica.png", music));
        music.setPressedIcon(setIconoPresionado("/Imagenes/musica.png", music, 155, 85));
        movements.setIcon(setIcono("/Imagenes/movimientos.png", movements));
        movements.setPressedIcon(setIconoPresionado("/Imagenes/movimientos.png", movements, 155, 85));
        leave.setIcon(setIcono("/Imagenes/salir_2.png", leave));
        leave.setPressedIcon(setIconoPresiona("/Imagenes/salir_2.png", leave, 155, 36));

        transparencia();

        scrollPaneles = new JScrollPane(); /// Crear el fondo para los botones
        //scrollPaneles.setBackground(Color.red);
        scrollPaneles.getViewport().setBackground(new Color(245, 239, 239));
        scrollPaneles.setOpaque(false);
        scrollPaneles.setBounds(288, 0, 520, 520);

        add(scrollPaneles);

    }
    public JButton[] btn_p;
    public JButton[] btn_m;
    public JTextArea[] text_c;
    public boolean BanderaP = false; ///Condicion para no crear mas veces
    public boolean BanderaM = false;
    public boolean BanderaC = false;
    public JPanel PanelMusic;
    public JPanel PanelPelis;
    public JPanel PanelClientes;
    public JScrollPane scrollPaneles;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        movie = new javax.swing.JButton();
        music = new javax.swing.JButton();
        leave = new javax.swing.JButton();
        movements = new javax.swing.JButton();
        separator = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Buscar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(869, 1380));

        jLabel2.setText("jLabel2");

        movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieActionPerformed(evt);
            }
        });

        music.setPreferredSize(new java.awt.Dimension(1300, 580));
        music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicActionPerformed(evt);
            }
        });

        leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveActionPerformed(evt);
            }
        });

        separator.setBackground(new java.awt.Color(255, 255, 0));

        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        menu.setOpaque(true);

        jMenu2.setText("Clientes");

        jMenuItem1.setText("Ver Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Registrar Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        menu.add(jMenu2);

        Buscar.setText("Buscar");
        menu.add(Buscar);

        jMenu1.setText("Informe");

        jMenuItem4.setText("Ver informe");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menu.add(jMenu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movements, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leave, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(585, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(movie, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(movements, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(leave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_leaveActionPerformed

    private void musicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicActionPerformed
        // TODO add your handling code here:

        if (BanderaM != true) {
            crearBtn1_M();
            System.out.println("Creado Musica");
        }

        scrollPaneles.setViewportView(PanelMusic);
    }//GEN-LAST:event_musicActionPerformed

    private void movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieActionPerformed
        // TODO add your handling code here:
        if (BanderaP != true) {
            crearBtn1_P();
            System.out.println("Creado peliculas");
        }

        scrollPaneles.setViewportView(PanelPelis);
    }//GEN-LAST:event_movieActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Register_User ru = new Register_User();
        ru.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        if (BanderaC != true) {
            crearBtn1_C();
            System.out.println("Creado Clientes");
        }

        scrollPaneles.setViewportView(PanelClientes);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel { ///Clase del fondo del panel

        private Image Imagen;

        public void paint(Graphics g) {
            Imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo_main.jpg")).getImage();
            g.drawImage(Imagen, 0, 0, getWidth(), getHeight(), this);///Coloca una imagen con una posion, con un tamallo (todo a gusto del cliente)
            setOpaque(false); 
            super.paint(g);
        }

    }

    public class Panels extends JPanel implements ActionListener {

        public Panels() {
            setLayout(null);
            setPreferredSize(new Dimension(1300, 580));

        }

        @Override
        public void actionPerformed(ActionEvent e) {

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
        int width = (boton.getWidth() + 160) - ancho;
        int height = (boton.getHeight() + 90) - alto;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

    public Icon setIconoPresiona(String url, JButton boton, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = (boton.getWidth() + 160) - ancho;
        int height = (boton.getHeight() + 41) - alto;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }

    public void transparencia() { ///Solo deja la imagen 
        leave.setOpaque(false);
        leave.setContentAreaFilled(false);
        leave.setBorderPainted(false);
        movie.setOpaque(false);
        movie.setContentAreaFilled(false);
        movie.setBorderPainted(false);
        music.setOpaque(false);
        music.setContentAreaFilled(false);
        music.setBorderPainted(false);
        movements.setOpaque(false);
        movements.setContentAreaFilled(false);
        movements.setBorderPainted(false);
    }

    /*
    public void borrarBtn(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setVisible(false);
        }
    }
     */
    public void crearBtn1_P() { ///Genera el boton de pelicula
        BanderaP = true;

        PanelPelis = new JPanel();
        PanelPelis.setBackground(Color.red);
        PanelPelis.setBounds(0, 0, 500, 125);
        PanelPelis.setOpaque(false);
        PanelPelis.setPreferredSize(new Dimension(490, 490));
        PanelPelis.setLayout(null);

        ActionListener Oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indicador = Integer.parseInt(e.getActionCommand());
                Objetos.peliculas.indicador = indicador;
                P_Mostrar p_mostrar = new P_Mostrar(indicador);
                p_mostrar.setVisible(true);
            }

        };

        btn_p = new JButton[Objetos.peliculas.Nombre.length];
        int posicionador = 0;
        int x = 0;
        int y = 16;
        for (int i = 0; i < Objetos.peliculas.Nombre.length; i++) {

            if (x >= 300) {
                posicionador = 0;
                y = y + 133;
                x = (posicionador * 128);
            } else {
                x = (posicionador * 128);
                y = y;
            }

            btn_p[i] = new JButton("" + i);
            btn_p[i].setBounds(x, y, 128, 128);
            btn_p[i].setIcon(setIcono(Objetos.peliculas.Caratula[i], btn_p[i]));
            btn_p[i].setPressedIcon(setIconoPresionado(Objetos.peliculas.Caratula[i], btn_p[i], 155, 85));
            btn_p[i].addActionListener(Oyente);
            PanelPelis.add(btn_p[i]);
            btn_p[i].setOpaque(false);
            btn_p[i].setContentAreaFilled(false);
            btn_p[i].setBorderPainted(false);
            posicionador++;

        }
    }

    public void crearBtn1_M() { ///Genera los botones de musica

        BanderaM = true; ///Condicion para la generacion y elinacion de los botones de musica

        //Generar el panel de la musica para poder añadirlo al scroll;
        PanelMusic = new JPanel();
        PanelMusic.setBackground(Color.red);
        PanelMusic.setBounds(0, 0, 500, 125);
        PanelMusic.setOpaque(false);
        PanelMusic.setPreferredSize(new Dimension(490, 1736));
        PanelMusic.setLayout(null);

        ActionListener Oyente = new ActionListener() { ///Darle accion a los botones
            @Override
            public void actionPerformed(ActionEvent e) {
                int indice = Integer.parseInt(e.getActionCommand());
                Objetos.clips.indice = indice;
                M_Mostrar m_mostrar = new M_Mostrar(indice); 
                m_mostrar.setVisible(true);
            }

        };

        btn_m = new JButton[Objetos.clips.Nombre.length];
        int posicionador = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < Objetos.clips.Nombre.length; i++) {

            y = 6 + (posicionador * 133);

            btn_m[i] = new JButton("" + i);
            btn_m[i].setBounds(x, y, 490, 125);
            btn_m[i].setIcon(setIcono(Objetos.clips.CaratulaBoton[i], btn_m[i]));
            btn_m[i].setPressedIcon(setIconoPresionado(Objetos.clips.CaratulaBoton[i], btn_m[i], 155, 85));
            btn_m[i].addActionListener(Oyente);
            PanelMusic.add(btn_m[i]);
            btn_m[i].setOpaque(false);
            btn_m[i].setContentAreaFilled(false);
            btn_m[i].setBorderPainted(false);
            posicionador++;
        }

    }

    public void crearBtn1_C() { ///Genera los usuarios

        BanderaC = true; ///Condicion para la generacion y eliminacion de los botones de musica

        //Generar el panel de la musica para poder añadirlo al scroll;
        PanelClientes = new JPanel();
        PanelClientes.setBackground(Color.red);
        PanelClientes.setBounds(0, 0, 500, 125);
        PanelClientes.setOpaque(false);
        PanelClientes.setPreferredSize(new Dimension(490, 1336));
        PanelClientes.setLayout(null);

        text_c = new JTextArea[Objetos.clientes.Nombre.length];
        int posicionador = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < Objetos.clientes.Nombre.length; i++) {

            y = 6 + (posicionador * 165);

            text_c[i] = new JTextArea("" + i);
            text_c[i].setBounds(x, y, 490, 160);
            text_c[i].setText("Cedula: " + Objetos.clientes.Cedula[i] + "\n"
                    + "Nombre: " + Objetos.clientes.Nombre[i] + "\n"
                    + "Apellido: " + Objetos.clientes.Apellido[i] + "\n"
                    + "Genero: " + Objetos.clientes.Genero[i] + "\n"
                    + "Direccion: " + Objetos.clientes.Direccion[i] + "\n"
                    + "Barrio: " + Objetos.clientes.Barrio[i] + "\n"
                    + "Correo: " + Objetos.clientes.Correo[i] + "\n"
                    + "Telefono fijo: " + Objetos.clientes.Tel_fijo[i] + "\n"
                    + "Telefono celular: " + Objetos.clientes.Tel_cel[i] + "\n");
            PanelClientes.add(text_c[i]);
            text_c[i].setOpaque(false);
            posicionador++;
        }

    }

    public void CrearTodo() {
        //Crear Clientes
        Clientes clientes = Objetos.clientes;

        String cedula[] = {"1002133399", "109037712", "1004819569", "60309262", "1112982321", "1092382317", "1030040371", "1116776858"};
        String nombreC[] = {"Bryan", "Dylan", "Javier", "Margarita", "Daniela", "Sean", "Geraldine", "Dorelis"};
        String apellido[] = {"Cortine", "Vargas", "Hernandez", "Hernandez", "Cisneros", "Johnson", "Vargas", "Macareo"};
        String genero[] = {"Masculino", "Masculino", "Masculino", "Femenino", "Femenino", "Masculino", "Femenino", "Femenino"};
        String direccion[] = {"Calle 13b 11a-47", "Calle 17 17-02", "Av. Libertadores 8N-64", "Calle 17 17-15", "Calle 2N 2 NORTE 20", "Calle 14 8-96", "Calle 14 #16B-41", "Cra. 38c 18c-04"};
        String barrio[] = {"Montebello1", "Vallesther", "Ciudad Jardín", "Vallesther", "Ceiba II", "El Paramo", "Torcoroma 1", "PorVenir"};
        String correo[] = {"bryancortine17@gmail.com", "dylansbn.11@gmail.com", "hernandezgomezjavier2425@gmail.com", "margaritahernandezrozo@gmail.com", "danielaciscal0211@hotmail.com", "pac24lifejohson@google.com", "geraldina777siu@hotmail.com", "tatamakareo22@gmail.com"};
        String tel_fijo[] = {"5555313", "5555714", "5555897", "5555920", "5555342", "5555238", "5555371", "5555858"};
        String tel_cel[] = {"3222880965", "3246720691", "3505320809", "3134604451", "3165721877", "3025722910", "3204923578", "3178375309"};

        clientes.Cedula = cedula;
        clientes.Nombre = nombreC;
        clientes.Apellido = apellido;
        clientes.Genero = genero;
        clientes.Direccion = direccion;
        clientes.Barrio = barrio;
        clientes.Correo = correo;
        clientes.Tel_fijo = tel_fijo;
        clientes.Tel_cel = tel_cel;

        //Crear Musica
        Clips clip = Objetos.clips;

        String nombreM[] = {"BOSSA NO SÉ", "JUNTO A TU CORAZON", "CASTIGO", "LOUNGE ACT", "POR UN SEGUNDO", "MOONLIGHT", "BONES", "ENEMY", "COMO PASA EL TIEMPO", "ASI SOY YO"};
        String Caratulas[] = {"/Imagenes/btm_1.png", "/Imagenes/btm_2.png", "/Imagenes/btm_3.png", "/Imagenes/btm_4.png", "/Imagenes/btm_5.png", "/Imagenes/btm_6.png", "/Imagenes/btm_7.png", "/Imagenes/btm_8.png", "/Imagenes/btm_9.png", "/Imagenes/btm_10.png"};
        String Caratulas_2[] = {"/Imagenes/cuco.jfif", "/Imagenes/miguel moly.jfif", "/Imagenes/feid.jfif", "/Imagenes/nirvana.png", "/Imagenes/aventura.jfif", "/Imagenes/beethoven.jpg", "/Imagenes/imagine.jpg", "/Imagenes/dragons.jfif", "/Imagenes/nos4.jpg", "/Imagenes/nosfour.jfif"};
        String cant_1[] = {"Cuco", "Miguel Moly", "Feid", "Kurt Cobain", "Romeo Santos", "Ludwig van Beethoven", "Dan Reynolds", "Dan Reynolds", "Roberto Musso", "Roberto Musso"};
        String cant_2[] = {"Jean Carter", "", "", "Nirvana", "", "", "", "J.I.D", "", ""};
        String duracion[] = {"3:21", "4:42", "2:59", "2:37", "4:16", "17:26", "2:46", "2:51", "4:24", "3:46"};//duracion
        String album[] = {"Para Mi", "¿Y Como Se Mata El Gusano?", "FELIZ CUMPLEAÑOS FERXXO", "No importa", "The Last", "Opus 27, n.º 2", "Mercury – Act 2", "Arcane - League of Legends", "Habla tu espejo", "Raro"}; //album
        String cat_1[] = {"Alternativo", "Música tropical", "Urbano latino", "Rock alternativo", "Bachata", "Romanticismo", "Rock", "Electropop", "Alternativa", "Rock en español"}; //categoria 1
        String cat_2[] = {"", "Bachata", "", "Grunge", "", "", "Pop", "", "Rock en español", "Pop"}; // categoria 2
        String compositor[] = {"Jean Carter, Omar Banos", "Miguel Moly", "Feid", "Kurt Cobain ,Dave Grohl", "Romeo Santos", "Ludwig van Beethoven", "Mattman & Robin", "Justin Tranter", "Roberto Musso", "Roberto Musso"};
        String precioc[] = {"25.000", "60.000", "40.000", "55.000", "90.000", "25.000", "180.000", "30.000", "25.000", "50.000", "45.000"};
        String precior[] = {"3.000", "5.000", "4.000", "6.000", "8.000", "7.000", "3.000", "10.000", "3.000", "3.000", "4.000", "4.000"};
        String canciones[] = {"Bossa No Sé Cuco ft Jean Carter.mp3", "junto-a-tu-corazon.mp3", "feid-castigo.mp3", "nirvana-lounge-act.mp3", "aventura-por-un-segundo.mp3", "beethoven-moonlight-sonata.mp3", "bones-imagine-dragons.mp3", "enemy-imagine-dragons-x-jid.mp3", "como-pasa-el-tiempo.mp3", "asi-soy-yo.mp3"};
        String Codigo_M[] = {"M_11102941", "M_11102942", "M_11102943", "M_11102944", "M_11102945", "M_11102946", "M_11102947", "M_11102948", "M_11102949", "M_111029410"};

        clip.Nombre = nombreM;
        clip.CaratulaBoton = Caratulas;
        clip.Caratula = Caratulas_2;
        clip.Cantante1 = cant_1;
        clip.Cantante2 = cant_2;
        clip.Duracion = duracion;
        clip.categoria1 = cat_1;
        clip.categoria2 = cat_2;
        clip.album = album;
        clip.compositor = compositor;
        clip.PrecioC = precioc;
        clip.PrecioR = precior;
        clip.Play = canciones;
        clip.MusicaComprada = new String[Objetos.clips.Nombre.length];
        clip.Codigo = Codigo_M;

        //Crear Peliculas
        String act_prin[] = {"Robert Pattinson", "Chris Evans", "Crhis Hemswhoth", "Ashton Kutcher", "Emma Stone", "Hayden Christensen", "Shameik Moore", "Letitia Wright"};
        String act_secun[] = {"Zoë Kravitz", "Taika Waititi", "Natalie Portman", "Amy Smart", "Ryan Gosling", "Ewan McGregor", "Hailee Steinfeld", "Angela Bassett"};
        String cat_prin[] = {"Crimen", "Animación", "Acción", "Thriller", "Musical", "Jedis", "Super Herores", "Acción"};
        String cat_secun[] = {"Acción", "Aventura", "Aventura", "Drama", "Romance", "Acción", "Animación", "Aventura"};
        String directores[] = {"Matt Reeves", "Angus MacLane", "Taika Waititi", "Eric Bress, J. Mackye Gruber", "Damien Chazelle", "George Lucas", "Bob Persichetti, Peter Ramsey, Rodney Rothman", "Ryan Coogler"};
        String TituloOriginal[] = {"Titulo original: THE BATMAN", "Titulo original: LIGHTYEAR", "Titulo original: THOR: LOVE AND THUNDER", "Titulo original: BUTTERFLY EFFECT", "Titulo original: LA LA LAND", "Titulo original: STAR WARS EPISODE III: THE REVENGE OF THE SITH", "Titulo original: SPIDERMAN INTO THE SPIDERVERSE", "Titulo original: BLACKPANTHER: WAKANDA FOR EVER"};
        String NombrePeliculas[] = {"BATMAN", "LIGHTYEAR", "THOR: AMOR Y TRUENO", "EFECTO MARIPOSA", "LA LA LAND", "STAR WARS EPISODIO III", "SPIDERMAN", "PANTERA NEGRA"};
        String SinopsisPeliculas[] = {"Después de dos años acechando por las calles de la ciudad como \n"
            + "Batman (Robert Pattinson), e infundiendo miedo en las mentes \n"
            + "perversas de los criminales, Bruce Wayne está sumido en las \n"
            + "profundidades de las sombras de Gotham City. Este vigilante solitario \n"
            + "cuenta con pocos aliados de confianza y eso le ha llevado a \n"
            + "convertirse en la única encarnación de la venganza entre sus \n"
            + "conciudadanos. Cuando un asesino apunta a la élite de Gotham con \n"
            + "una serie de maquinaciones sádicas, un rastro de pistas crípticas \n"
            + "lleva a Batman a realizar una investigación en el inframundo.",
            "'Lightyear' se distancia de las aventuras domésticas de los juguetes de \n"
            + "'Toy Story' para ir al infinito y más allá en una entrega ciencia ficción, \n"
            + "aventuras y acción en el espacio. Se trata de la historia de los orígenes \n"
            + "de Buzz Lightyear y de cómo pasó de ser un piloto de pruebas al \n"
            + "astronauta que inspirara el juguete Space Ranger de la franquicia que \n"
            + "todos concemos y amamos. En Pixar han querido hacer algo \n"
            + "independiente y al margen del mundo de Toy Story, con entidad propia, \n"
            + "y han insistido mucho en que se trata de la historia del guardián espacial\n"
            + "real y no del juguete.",
            "El Dios del Trueno (Chris Hemsworth) emprende un viaje que no se parece \n"
            + "en nada a lo que se ha enfrentado hasta ahora: una búsqueda de la paz \n"
            + "interior. Pero el retiro de Thor se ve interrumpido por un asesino galáctico \n"
            + "conocido como Gorr el Carnicero de Dioses (Christian Bale), que busca la \n"
            + "extinción de los dioses. Para hacer frente a la amenaza, Thor solicita la \n"
            + "ayuda del Rey Valkiria (Tessa Thompson), de Korg (Taika Waititi) y de su \n"
            + "ex novia Jane Foster (Natalie Portman) que, para sorpresa de Thor, \n"
            + "empuña inexplicablemente su martillo mágico, Mjolnir, como la Poderosa \n"
            + "Thor. ",
            "Evan Treborn, un joven que se está esforzando por superar unos dolorosos \n"
            + "recuerdos de su infancia, descubre una técnica que le permite viajar atrás \n"
            + "en el tiempo y ocupar su cuerpo de niño para poder cambiar el curso de su \n"
            + "dolorosa historia. Sin embargo también descubre que cualquier mínimo \n"
            + "cambio en el pasado altera enormemente su futuro.",
            "Mia (Emma Stone), una joven aspirante a actriz que trabaja como camarera \n"
            + "mientras acude a castings, y Sebastian (Ryan Gosling), un pianista de jazz \n"
            + "que se gana la vida tocando en sórdidos tugurios, se enamoran, pero su \n"
            + "gran ambición por llegar a la cima en sus carreras artísticas amenaza con \n"
            + "separarlos.",
            "¡Guerra! La República se desmorona bajo los ataques del despiadado \n"
            + "¡Guerra! La República se desmorona bajo los ataques del despiadado \n"
            + "Lord Sith, el conde Dooku. Hay héroes en ambos bandos, pero el mal \n"
            + "está por doquier. En una contundente jugada, el diabólico líder droide, el \n"
            + "general Grievous, ha irrumpido en la capital de la República y ha \n"
            + "secuestrado al Canciller Palpatine, líder del senado Galáctico. Mientras el \n"
            + "ejército droide separatista trata de huir con su valioso rehén, dos \n"
            + "caballeros Jedi inician una misión desesperada para liberar al Canciller \n"
            + "cautivo.",
            "En un universo paralelo donde Peter Parker ha muerto, un joven de \n"
            + "secundaria llamado Miles Morales es el nuevo Spider-Man. Sin embargo, \n"
            + "cuando el líder mafioso Wilson Fisk (a.k.a Kingpin) construye el \"Super \n"
            + "Colisionador\" trae a una versión alternativa de Peter Parker que tratará de \n"
            + "enseñarle a Miles como ser un mejor Spider-Man. Pero no será el único \n"
            + "Spider Man en entrar a este universo, 4 versiones alternas de Spidey \n"
            + "aparecerán y buscarán regresar a su universo antes de que toda la realidad \n"
            + "colapse.",
            "La reina Ramonda (Angela Bassett), Shuri (Letitia Wright), M’Baku \n"
            + "(Winston Duke), Okoye (Danai Gurira) y las Dora Milaje (incluida Florence \n"
            + "Kasumba), luchan para proteger su nación de la injerencia de potencias \n"
            + "mundiales a raíz de la muerte del rey T’Challa. Mientras los wakandianos \n"
            + "se esfuerzan por adaptarse a su nueva etapa, los héroes deben actuar \n"
            + "unidos, con la ayuda del Perro de la Guerra Nakia (Lupita Nyong’o) y \n"
            + "Everett Ross (Martin Freeman), y forzar un nuevo destino para el reino de \n"
            + "Wakanda."
        };
        String Miniatura_[] = {"/Imagenes/mini_batman.jpg", "/Imagenes/mini_lightyear.jpg", "/Imagenes/mini_thor.jpg", "/Imagenes/mini_efectom.jpg", "/Imagenes/mini_lalaland.jpg", "/Imagenes/mini_st.jpg", "/Imagenes/mini_sp.jpg", "/Imagenes/mini_bp2.jpg"};
        String Logotipos[] = {"/Imagenes/bat1.png", "/Imagenes/lightyear1.png", "/Imagenes/thor1.png", "/Imagenes/efectobtt1.png", "/Imagenes/lalaland1.png", "/Imagenes/st1.png", "/Imagenes/spider1.png", "/Imagenes/blackp1.png"};
        String Caratulas_P[] = {"/Imagenes/Caratula-Batman_2.jpg", "/Imagenes/Caratula-Lightyear_2.jpg", "/Imagenes/Caratula-ThorLT.jpg", "/Imagenes/Caratula-EfectoMariposa.jpg", "/Imagenes/Caratula-Lalaland.jpg", "/Imagenes/Caratula-StarWars.jpg", "/Imagenes/Caratula-Spiderman.jpg", "/Imagenes/Caratula-BlackPanther.jpg"};
        String precioc_P[] = {"90.000", "50.000", "60.000", "30.000", "50.000", "40.000", "40.000", "80.000"};
        String precior_P[] = {"10.000", "5.000", "5.000", "4.000", "6.000", "4.000", "4.000", "12.000"};
        String trailers[] = {"BATMAN _Tráiler.mp4", "Lightyear _Tráiler.mp4", "Thor_ Amor_ y_Trueno_Trailer.mp4", "El_Efecto_Mariposa_Trailer.mp4", "lalaland_trailer.mp4", "Star_Wars_Episodio_III_trailer.mp4", "SPIDER-MAN_Tráiler.mp4", "PanteraNegra _Tráiler.mp4"};
        String Codigo_P[] = {"P_11102941", "P_11102942", "P_11102943", "P_11102944", "P_11102945", "P_11102946", "P_11102947", "P_11102948"};

        Peliculas Pelis = Objetos.peliculas;
        Pelis.Play = trailers;
        Pelis.Titulo = TituloOriginal;
        Pelis.Nombre = NombrePeliculas;
        Pelis.Sinopsis = SinopsisPeliculas;
        Pelis.Caratula = Caratulas_P;
        Pelis.Logos = Logotipos;
        Pelis.Director = directores;
        Pelis.actor1 = act_prin;
        Pelis.actor2 = act_secun;
        Pelis.categoria1 = cat_prin;
        Pelis.categoria2 = cat_secun;
        Pelis.Miniatura = Miniatura_;
        Pelis.PrecioC = precioc_P;
        Pelis.PrecioR = precior_P;
        Pelis.Codigo = Codigo_P;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Buscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton leave;
    private javax.swing.JMenuBar menu;
    private javax.swing.JButton movements;
    private javax.swing.JButton movie;
    private javax.swing.JButton music;
    private javax.swing.JLabel separator;
    // End of variables declaration//GEN-END:variables
}
