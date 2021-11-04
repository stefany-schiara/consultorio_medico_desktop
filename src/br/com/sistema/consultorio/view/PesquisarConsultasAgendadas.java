package br.com.sistema.consultorio.view;

import br.com.consultorio.medico.controller.CadastroMedicoController;
import br.com.consultorio.medico.controller.PesquisarConsultasAgendadasController;

/**
 *
 * @author esqui
 */
public class PesquisarConsultasAgendadas extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private final PesquisarConsultasAgendadasController controller;
	
    public PesquisarConsultasAgendadas() {
        initComponents();
        controller = new PesquisarConsultasAgendadasController(this);
    }
   
    private void initComponents() {

        lblConsultarAgendamentos = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        comboPaciente = new javax.swing.JComboBox<>();
        lblMedico = new javax.swing.JLabel();
        comboMedico = new javax.swing.JComboBox<>();
        lblDtAgendamento = new javax.swing.JLabel();
        txtDtAgendamento = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        tblAgendamentos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConsultarAgendamentos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblConsultarAgendamentos.setText("Consultar Agendamentos");
        getContentPane().add(lblConsultarAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

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

        txtDtAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(txtDtAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 130, 30));
        
        btnVoltar.setText("Voltar");
		btnVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnVoltarActionPerformed(evt);
			}
		});
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 80, 30));

        btnPesquisar.setText("Pesquisar");
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Paciente", "Médico", "Especialidade", "Data", "Hora", "Observação"
            }
        ));
        tblAgendamentos.setViewportView(jTable1);

        getContentPane().add(tblAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 740, 360));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/images/principalBackground.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }
    
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
            java.util.logging.Logger.getLogger(PesquisarConsultasAgendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarConsultasAgendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarConsultasAgendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarConsultasAgendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarConsultasAgendadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboMedico;
    private javax.swing.JComboBox<String> comboPaciente;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblConsultarAgendamentos;
    private javax.swing.JLabel lblDtAgendamento;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JScrollPane tblAgendamentos;
    private javax.swing.JFormattedTextField txtDtAgendamento;
    // End of variables declaration//GEN-END:variables
}
