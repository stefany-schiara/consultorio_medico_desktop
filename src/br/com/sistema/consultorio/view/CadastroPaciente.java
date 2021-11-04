package br.com.sistema.consultorio.view;

import javax.swing.JOptionPane;

/**
 *
 * @author esqui
 */
public class CadastroPaciente extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private final CadastroPacienteController controller;

	public CadastroPaciente() {
		initComponents();
		controller = new CadastroPacienteController(this);
	}

	private void initComponents() {

		lblCadastroPaciente = new javax.swing.JLabel();
		lblNome = new javax.swing.JLabel();
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
		lblCep = new javax.swing.JLabel();
		txtCep = new javax.swing.JFormattedTextField();
		lblLogradouro = new javax.swing.JLabel();
		txtLogradouro = new javax.swing.JTextField();
		lblNumero = new javax.swing.JLabel();
		txtNumero = new javax.swing.JTextField();
		lblComplemento = new javax.swing.JLabel();
		txtComplemento = new javax.swing.JTextField();
		lblEstado = new javax.swing.JLabel();
		comboEstado = new javax.swing.JComboBox<>();
		lblBairro = new javax.swing.JLabel();
		txtBairro = new javax.swing.JTextField();
		btnSalvar = new javax.swing.JButton();
		lblBackground = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		lblCadastroPaciente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		lblCadastroPaciente.setText("Cadastro Paciente");
		getContentPane().add(lblCadastroPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

		lblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblNome.setText("Nome");
		getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

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

		lblCep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblCep.setText("CEP");
		getContentPane().add(lblCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

		try {
			txtCep.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		txtCep.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCepActionPerformed(evt);
			}
		});
		getContentPane().add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 140, 30));

		lblLogradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblLogradouro.setText("Logradouro");
		getContentPane().add(lblLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

		txtLogradouro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtLogradouroActionPerformed(evt);
			}
		});
		getContentPane().add(txtLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 410, 30));

		lblNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblNumero.setText("Numero");
		getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

		txtNumero.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNumeroActionPerformed(evt);
			}
		});
		getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 140, 30));

		lblComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblComplemento.setText("Complemento");
		getContentPane().add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

		txtComplemento.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtComplementoActionPerformed(evt);
			}
		});
		getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 410, 30));

		lblEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblEstado.setText("Estado");
		getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

		comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
						"PE", "PI", "RJ", "RN", "RS", "RR", "SC", "SP", "SE", "TO", "DF4" }));
		getContentPane().add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 70, 30));

		lblBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		lblBairro.setText("Bairro");
		getContentPane().add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

		txtBairro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtBairroActionPerformed(evt);
			}
		});
		getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 410, 30));

		btnSalvar.setText("Salvar");
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarActionPerformed(evt);
			}
		});
		getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 80, 30));

		lblBackground.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/sistema/consultorio/view/images/principalBackground.png"))); // NOI18N
		getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

		pack();
	}

	private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
		controller.gravarPaciente();
	}

	public void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCelularActionPerformed

	private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCepActionPerformed

	private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}// GEN-LAST:event_txtLogradouroActionPerformed

	private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNumeroActionPerformed

	private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}// GEN-LAST:event_txtComplementoActionPerformed

	private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
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
			java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CadastroPaciente().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnSalvar;
	private javax.swing.JComboBox<String> comboEstado;
	private javax.swing.JLabel labelDtNascimento;
	private javax.swing.JLabel lblBackground;
	private javax.swing.JLabel lblBairro;
	private javax.swing.JLabel lblCadastroPaciente;
	private javax.swing.JLabel lblCelular;
	private javax.swing.JLabel lblCep;
	private javax.swing.JLabel lblComplemento;
	private javax.swing.JLabel lblCpf;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblEstado;
	private javax.swing.JLabel lblLogradouro;
	private javax.swing.JLabel lblNome;
	private javax.swing.JLabel lblNumero;
	private javax.swing.JLabel lblTelefone;
	private javax.swing.JTextField txtBairro;
	private javax.swing.JFormattedTextField txtCelular;
	private javax.swing.JFormattedTextField txtCep;
	private javax.swing.JTextField txtComplemento;
	private javax.swing.JFormattedTextField txtCpf;
	private javax.swing.JFormattedTextField txtDtNascimento;
	private javax.swing.JTextField txtEmail;

	public javax.swing.JButton getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(javax.swing.JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public javax.swing.JComboBox<String> getComboEstado() {
		return comboEstado;
	}

	public void setComboEstado(javax.swing.JComboBox<String> comboEstado) {
		this.comboEstado = comboEstado;
	}

	public javax.swing.JLabel getLabelDtNascimento() {
		return labelDtNascimento;
	}

	public void setLabelDtNascimento(javax.swing.JLabel labelDtNascimento) {
		this.labelDtNascimento = labelDtNascimento;
	}

	public javax.swing.JLabel getLblBackground() {
		return lblBackground;
	}

	public void setLblBackground(javax.swing.JLabel lblBackground) {
		this.lblBackground = lblBackground;
	}

	public javax.swing.JLabel getLblBairro() {
		return lblBairro;
	}

	public void setLblBairro(javax.swing.JLabel lblBairro) {
		this.lblBairro = lblBairro;
	}

	public javax.swing.JLabel getLblCadastroPaciente() {
		return lblCadastroPaciente;
	}

	public void setLblCadastroPaciente(javax.swing.JLabel lblCadastroPaciente) {
		this.lblCadastroPaciente = lblCadastroPaciente;
	}

	public javax.swing.JLabel getLblCelular() {
		return lblCelular;
	}

	public void setLblCelular(javax.swing.JLabel lblCelular) {
		this.lblCelular = lblCelular;
	}

	public javax.swing.JLabel getLblCep() {
		return lblCep;
	}

	public void setLblCep(javax.swing.JLabel lblCep) {
		this.lblCep = lblCep;
	}

	public javax.swing.JLabel getLblComplemento() {
		return lblComplemento;
	}

	public void setLblComplemento(javax.swing.JLabel lblComplemento) {
		this.lblComplemento = lblComplemento;
	}

	public javax.swing.JLabel getLblCpf() {
		return lblCpf;
	}

	public void setLblCpf(javax.swing.JLabel lblCpf) {
		this.lblCpf = lblCpf;
	}

	public javax.swing.JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(javax.swing.JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public javax.swing.JLabel getLblEstado() {
		return lblEstado;
	}

	public void setLblEstado(javax.swing.JLabel lblEstado) {
		this.lblEstado = lblEstado;
	}

	public javax.swing.JLabel getLblLogradouro() {
		return lblLogradouro;
	}

	public void setLblLogradouro(javax.swing.JLabel lblLogradouro) {
		this.lblLogradouro = lblLogradouro;
	}

	public javax.swing.JLabel getLblNome() {
		return lblNome;
	}

	public void setLblNome(javax.swing.JLabel lblNome) {
		this.lblNome = lblNome;
	}

	public javax.swing.JLabel getLblNumero() {
		return lblNumero;
	}

	public void setLblNumero(javax.swing.JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	public javax.swing.JLabel getLblTelefone() {
		return lblTelefone;
	}

	public void setLblTelefone(javax.swing.JLabel lblTelefone) {
		this.lblTelefone = lblTelefone;
	}

	public javax.swing.JTextField getTxtBairro() {
		return txtBairro;
	}

	public void setTxtBairro(javax.swing.JTextField txtBairro) {
		this.txtBairro = txtBairro;
	}

	public javax.swing.JFormattedTextField getTxtCelular() {
		return txtCelular;
	}

	public void setTxtCelular(javax.swing.JFormattedTextField txtCelular) {
		this.txtCelular = txtCelular;
	}

	public javax.swing.JFormattedTextField getTxtCep() {
		return txtCep;
	}

	public void setTxtCep(javax.swing.JFormattedTextField txtCep) {
		this.txtCep = txtCep;
	}

	public javax.swing.JTextField getTxtComplemento() {
		return txtComplemento;
	}

	public void setTxtComplemento(javax.swing.JTextField txtComplemento) {
		this.txtComplemento = txtComplemento;
	}

	public javax.swing.JFormattedTextField getTxtCpf() {
		return txtCpf;
	}

	public void setTxtCpf(javax.swing.JFormattedTextField txtCpf) {
		this.txtCpf = txtCpf;
	}

	public javax.swing.JFormattedTextField getTxtDtNascimento() {
		return txtDtNascimento;
	}

	public void setTxtDtNascimento(javax.swing.JFormattedTextField txtDtNascimento) {
		this.txtDtNascimento = txtDtNascimento;
	}

	public javax.swing.JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(javax.swing.JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public javax.swing.JTextField getTxtLogradouro() {
		return txtLogradouro;
	}

	public void setTxtLogradouro(javax.swing.JTextField txtLogradouro) {
		this.txtLogradouro = txtLogradouro;
	}

	public javax.swing.JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(javax.swing.JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public javax.swing.JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(javax.swing.JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public javax.swing.JFormattedTextField getTxtTelefone() {
		return txtTelefone;
	}

	public void setTxtTelefone(javax.swing.JFormattedTextField txtTelefone) {
		this.txtTelefone = txtTelefone;
	}

	private javax.swing.JTextField txtLogradouro;
	private javax.swing.JTextField txtNome;
	private javax.swing.JTextField txtNumero;
	private javax.swing.JFormattedTextField txtTelefone;

}
