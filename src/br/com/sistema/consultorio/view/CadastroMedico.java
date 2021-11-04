package br.com.sistema.consultorio.view;
/**
 *
 * @author esqui
 */
public class CadastroMedico extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public CadastroMedico() {
		initComponents();
	}

	private void initComponents() {

		lblNome = new javax.swing.JLabel();
		lblCadastroMedico = new javax.swing.JLabel();
		txtNome = new javax.swing.JTextField();
		labelDtNascimento = new javax.swing.JLabel();
		txtDtNascimento = new javax.swing.JFormattedTextField();
		lblCpf = new javax.swing.JLabel();
		txtCpf = new javax.swing.JFormattedTextField();
		lblEmail = new javax.swing.JLabel();
		txtEmail = new javax.swing.JTextField();
		lblTelefone = new javax.swing.JLabel();
		txtTelefone = new javax.swing.JFormattedTextField();
		lblCelular = new javax.swing.JLabel();
		txtCelular = new javax.swing.JFormattedTextField();
		lblEspecialidade = new javax.swing.JLabel();
		txtEspecialidade = new javax.swing.JTextField();
		lblCrm = new javax.swing.JLabel();
		txtCrm = new javax.swing.JTextField();
		btnSalvar = new javax.swing.JButton();
		lblBackground = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblNome.setText("Nome");
		getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

		lblCadastroMedico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		lblCadastroMedico.setText("Cadastro Medico");
		getContentPane().add(lblCadastroMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

		txtNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeActionPerformed(evt);
			}
		});
		getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 410, 30));

		labelDtNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		labelDtNascimento.setText("Data de Nascimento");
		getContentPane().add(labelDtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

		txtDtNascimento.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
		getContentPane().add(txtDtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 140, 30));

		lblCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblCpf.setText("CPF");
		getContentPane().add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

		try {
			txtCpf.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 140, 30));

		lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblEmail.setText("Email");
		getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

		txtEmail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEmailActionPerformed(evt);
			}
		});
		getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 410, 30));

		lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblTelefone.setText("Telefone");
		getContentPane().add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

		try {
			txtTelefone.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 140, 30));

		lblCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblCelular.setText("Celular");
		getContentPane().add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

		try {
			txtCelular.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtCelular.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCelularActionPerformed(evt);
			}
		});
		getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 140, 30));

		lblEspecialidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblEspecialidade.setText("Especialidade");
		getContentPane().add(lblEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

		txtEspecialidade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEspecialidadeActionPerformed(evt);
			}
		});
		getContentPane().add(txtEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 410, 30));

		lblCrm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblCrm.setText("CRM");
		getContentPane().add(lblCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

		txtCrm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCrmActionPerformed(evt);
			}
		});
		getContentPane().add(txtCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 120, 30));

		btnSalvar.setText("Salvar");
		getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 80, 30));

		lblBackground.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/sistema/consultorio/view/images/principalBackground.png"))); // NOI18N
		getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

		pack();
	}

	private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeActionPerformed

	private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEmailActionPerformed

	private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCelularActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCelularActionPerformed

	private void txtCrmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCrmActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCrmActionPerformed

	private void txtEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEspecialidadeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEspecialidadeActionPerformed

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
			java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CadastroMedico().setVisible(true);
			}
		});
	}
	
	private javax.swing.JButton btnSalvar;
	private javax.swing.JLabel labelDtNascimento;
	private javax.swing.JLabel lblBackground;
	private javax.swing.JLabel lblCadastroMedico;
	private javax.swing.JLabel lblCelular;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblCrm;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblEspecialidade;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JFormattedTextField txtCelular;
	private javax.swing.JFormattedTextField txtCpf;
	private javax.swing.JTextField txtCrm;
	private javax.swing.JFormattedTextField txtDtNascimento;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtEspecialidade;
	private javax.swing.JTextField txtNome;
	private javax.swing.JFormattedTextField txtTelefone;
	// End of variables declaration//GEN-END:variables
}
