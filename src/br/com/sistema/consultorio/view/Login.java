package br.com.sistema.consultorio.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.consultorio.medico.controller.LoginController;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private final LoginController controller;

	public Login() {
		initComponents();
		controller = new LoginController(this);
	}

	private void initComponents() {

		lblLogin = new javax.swing.JLabel();
		lblUsuario = new javax.swing.JLabel();
		txtUsuario = new javax.swing.JTextField();
		lblSenha = new javax.swing.JLabel();
		txtSenha = new javax.swing.JPasswordField();
		btnEntrar = new javax.swing.JButton();
		lblNovoUsuario = new javax.swing.JLabel();
		btnCadastrar = new javax.swing.JButton();
		lblPainelLogin = new javax.swing.JLabel();
		lblBackgroundLogin = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		lblLogin.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
		lblLogin.setForeground(new java.awt.Color(255, 255, 255));
		lblLogin.setText("Login");
		getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

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

		btnEntrar.setText("Entrar");
		btnEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEntrarActionPerformed(evt);
			}
		});
		getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 80, 30));

		lblNovoUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
		lblNovoUsuario.setText("Nao tem cadastro?");
		getContentPane().add(lblNovoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, -1, -1));

		btnCadastrar.setText("Cadastrar");
		getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 690, 90, 30));

		lblPainelLogin.setIcon(
				new ImageIcon(Login.class.getResource("/br/com/sistema/consultorio/view/images/painel-login.png")));
		getContentPane().add(lblPainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

		lblBackgroundLogin.setIcon(
				new ImageIcon(Login.class.getResource("/br/com/sistema/consultorio/view/images/backgroundLogin.jpg")));
		getContentPane().add(lblBackgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		pack();
	}

	private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
		controller.acessarSistema();
	}

	public void exibirMensagem(String mensagem) {
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
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnCadastrar;
	private javax.swing.JButton btnEntrar;
	private javax.swing.JLabel lblBackgroundLogin;
	private javax.swing.JLabel lblLogin;
	private javax.swing.JLabel lblNovoUsuario;
	private javax.swing.JLabel lblPainelLogin;
	private javax.swing.JLabel lblSenha;
	private javax.swing.JLabel lblUsuario;
	private javax.swing.JPasswordField txtSenha;
	private javax.swing.JTextField txtUsuario;

}
