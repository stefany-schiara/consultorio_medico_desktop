package br.com.sistema.consultorio.view;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author esqui
 */
public class Cadastro extends javax.swing.JFrame {    
  
	private static final long serialVersionUID = 1L;
	
    public Cadastro() {
        initComponents();        
    }
       
    private void initComponents() {

        lblCadastro = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnSalvar = new javax.swing.JButton();
        lblPainelLogin = new javax.swing.JLabel();
        lblBackgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCadastro.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastro.setText("Cadastro");
        getContentPane().add(lblCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 200, 30));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 200, 30));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 80, 30));

        lblPainelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/images/painel-login.png"))); // NOI18N
        getContentPane().add(lblPainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        lblBackgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/images/backgroundLogin.jpg"))); // NOI18N
        getContentPane().add(lblBackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
               
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblBackgroundLogin;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblPainelLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
