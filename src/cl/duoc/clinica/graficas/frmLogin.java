/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl.duoc.clinica.graficas;

import cl.duoc.clinica.negocio.negUsuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteb
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public frmLogin() {
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

        BackGround = new javax.swing.JPanel();
        ZonaLogin = new javax.swing.JPanel();
        UserBigIcon = new javax.swing.JLabel();
        InicioDeSesion = new javax.swing.JLabel();
        UserMiniIcon = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Separador1 = new javax.swing.JSeparator();
        passwordIcon = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        Separador2 = new javax.swing.JSeparator();
        EnterButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ImagenLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGround.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ZonaLogin.setBackground(new java.awt.Color(0, 135, 193));

        UserBigIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbv/images/BIgUser.png"))); // NOI18N

        InicioDeSesion.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        InicioDeSesion.setText("INICIO DE SESION");

        UserMiniIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbv/images/Small User.png"))); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(0, 135, 193));
        txtUsuario.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(11, 11, 11));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbv/images/password.png"))); // NOI18N

        passField.setBackground(new java.awt.Color(0, 135, 193));
        passField.setText("********");
        passField.setBorder(null);
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
        });
        passField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passFieldMousePressed(evt);
            }
        });
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
        });

        EnterButton.setBackground(new java.awt.Color(0, 0, 255));
        EnterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnterButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnterButtonMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 149, 213));
        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTRAR");

        javax.swing.GroupLayout EnterButtonLayout = new javax.swing.GroupLayout(EnterButton);
        EnterButton.setLayout(EnterButtonLayout);
        EnterButtonLayout.setHorizontalGroup(
            EnterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EnterButtonLayout.setVerticalGroup(
            EnterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ZonaLoginLayout = new javax.swing.GroupLayout(ZonaLogin);
        ZonaLogin.setLayout(ZonaLoginLayout);
        ZonaLoginLayout.setHorizontalGroup(
            ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ZonaLoginLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ZonaLoginLayout.createSequentialGroup()
                        .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(ZonaLoginLayout.createSequentialGroup()
                        .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ZonaLoginLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ZonaLoginLayout.createSequentialGroup()
                                .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordIcon)
                                    .addComponent(UserMiniIcon, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(46, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ZonaLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(ZonaLoginLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(InicioDeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ZonaLoginLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(UserBigIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ZonaLoginLayout.setVerticalGroup(
            ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZonaLoginLayout.createSequentialGroup()
                .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ZonaLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(UserBigIcon))
                    .addGroup(ZonaLoginLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InicioDeSesion)
                .addGap(62, 62, 62)
                .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserMiniIcon))
                .addGap(2, 2, 2)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ZonaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        BackGround.add(ZonaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 410));

        ImagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbv/images/ImagenLogin.jpg"))); // NOI18N
        BackGround.add(ImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 410, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario"))
        {
            txtUsuario.setText("");
        }
        if(String.valueOf(passField.getPassword()).isEmpty())
        {
            passField.setText("********");
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void passFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMousePressed
        if(String.valueOf(passField.getPassword()).equals("********"))
        {
            passField.setText("");
        }
        if(txtUsuario.getText().isEmpty())
        {
            txtUsuario.setText("Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_passFieldMousePressed

    private void EnterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMouseClicked
        iniciarSesion();            
    }//GEN-LAST:event_EnterButtonMouseClicked

    private void EnterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMouseEntered
        EnterButton.setBackground(Color.ORANGE);
    }//GEN-LAST:event_EnterButtonMouseEntered

    private void EnterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterButtonMouseExited
        EnterButton.setBackground(Color.blue);
    }//GEN-LAST:event_EnterButtonMouseExited

    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();           
        }
    }//GEN-LAST:event_passFieldKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();           
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained

        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        passField.setText("");
    }//GEN-LAST:event_passFieldFocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
                new frmLogin().setVisible(true);
            }
        });
    }
    
    private void iniciarSesion() {

        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre de usuario no puede estar vacio");
        } else if (passField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Introduzca una contraseña");
        } else {
            String login = txtUsuario.getText();
            String password = passField.getText();

            negUsuario usuario = new negUsuario();

            if (usuario.inicioSesion(login, password)) {
                frmMenuP menuPrincipal = new frmMenuP();
                menuPrincipal.setVisible(true);
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos");
                txtUsuario.setText("");
                passField.setText("");
                txtUsuario.requestFocus();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel EnterButton;
    private javax.swing.JLabel ImagenLogin;
    private javax.swing.JLabel InicioDeSesion;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JLabel UserBigIcon;
    private javax.swing.JLabel UserMiniIcon;
    private javax.swing.JPanel ZonaLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
