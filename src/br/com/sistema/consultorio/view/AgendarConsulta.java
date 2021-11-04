package br.com.sistema.consultorio.view;

import br.com.consultorio.medico.controller.AgendarConsultaController;


/**
 *
 * @author esqui
 */
public class AgendarConsulta extends javax.swing.JFrame {
   
	private static final long serialVersionUID = 1L;
	private final AgendarConsultaController controller;
	
    public AgendarConsulta() {
        initComponents();
        controller = new AgendarConsultaController(this);
    }
    
    private void initComponents() {

        lblAgendarConsulta = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        comboPaciente = new javax.swing.JComboBox<>();
        lblMedico = new javax.swing.JLabel();
        comboMedico = new javax.swing.JComboBox<>();
        lblDtAgendamento = new javax.swing.JLabel();
        comboDtDisponiveis = new javax.swing.JComboBox<>();
        lblHorario = new javax.swing.JLabel();
        txtHorario = new javax.swing.JFormattedTextField();
        lblEspecialidade = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgendarConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAgendarConsulta.setText("Agendar Consulta");
        getContentPane().add(lblAgendarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        lblPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPaciente.setText("Paciente");
        getContentPane().add(lblPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        comboPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 410, 30));

        lblMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMedico.setText("Médico");
        getContentPane().add(lblMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        comboMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 410, 30));

        lblDtAgendamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDtAgendamento.setText("Data Agendamento");
        getContentPane().add(lblDtAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        comboDtDisponiveis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboDtDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDtDisponiveisActionPerformed(evt);
            }
        });
        getContentPane().add(comboDtDisponiveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 410, 30));

        lblHorario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHorario.setText("Horario");
        getContentPane().add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        txtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 30));

        lblEspecialidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEspecialidade.setText("Especialidade");
        getContentPane().add(lblEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        txtEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 410, 30));

        btnVoltar.setText("Voltar");
		btnVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnVoltarActionPerformed(evt);
			}
		});
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 80, 30));
        
        btnSalvar.setText("Salvar");
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 80, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/images/principalBackground.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadeActionPerformed

    private void comboDtDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDtDisponiveisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDtDisponiveisActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		controller.voltarMenuPrincipal();
	}
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboDtDisponiveis;
    private javax.swing.JComboBox<String> comboMedico;
    private javax.swing.JComboBox<String> comboPaciente;
    private javax.swing.JLabel lblAgendarConsulta;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDtAgendamento;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JFormattedTextField txtHorario;
    // End of variables declaration//GEN-END:variables
}
