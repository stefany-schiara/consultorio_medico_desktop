package br.com.sistema.consultorio.view;

/**
 *
 * @author esqui
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	
	public MenuPrincipal() {
        initComponents();
    }
   
    private void initComponents() {

        lblBackground = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        itemMenuCadastroPaciente = new javax.swing.JMenuItem();
        itemMenuCadastroMedico = new javax.swing.JMenuItem();
        menuPesquisa = new javax.swing.JMenu();
        itemMenuPesquisaPaciente = new javax.swing.JMenuItem();
        itemMenuPesquisaMedico = new javax.swing.JMenuItem();
        itemMenuPesquisaConsulta = new javax.swing.JMenuItem();
        menuAgendamento = new javax.swing.JMenu();
        itemMenuAgendamentoConsulta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/images/principalBackground.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 700));

        menuCadastro.setText("Cadastro");

        itemMenuCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/icons/cadastro_paciente_icon.png"))); // NOI18N
        itemMenuCadastroPaciente.setText("Paciente");
        menuCadastro.add(itemMenuCadastroPaciente);

        itemMenuCadastroMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/icons/cadastro_medico_icon.png"))); // NOI18N
        itemMenuCadastroMedico.setText("Médico");
        menuCadastro.add(itemMenuCadastroMedico);

        menuPrincipal.add(menuCadastro);

        menuPesquisa.setText("Pesquisa");

        itemMenuPesquisaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/icons/pesquisar_paciente_icon.png"))); // NOI18N
        itemMenuPesquisaPaciente.setText("Pacientes");
        menuPesquisa.add(itemMenuPesquisaPaciente);

        itemMenuPesquisaMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/icons/pesquisar_medico_icon.png"))); // NOI18N
        itemMenuPesquisaMedico.setText("Médicos");
        menuPesquisa.add(itemMenuPesquisaMedico);

        itemMenuPesquisaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/icons/pesquisar_consulta_icon.png"))); // NOI18N
        itemMenuPesquisaConsulta.setText("Consultas");
        menuPesquisa.add(itemMenuPesquisaConsulta);

        menuPrincipal.add(menuPesquisa);

        menuAgendamento.setText("Agendamento");

        itemMenuAgendamentoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/consultorio/view/icons/agenda_icon.png"))); // NOI18N
        itemMenuAgendamentoConsulta.setText("Agendar Consulta");
        menuAgendamento.add(itemMenuAgendamentoConsulta);

        menuPrincipal.add(menuAgendamento);

        setJMenuBar(menuPrincipal);

        pack();
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuAgendamentoConsulta;
    private javax.swing.JMenuItem itemMenuCadastroMedico;
    private javax.swing.JMenuItem itemMenuCadastroPaciente;
    private javax.swing.JMenuItem itemMenuPesquisaConsulta;
    private javax.swing.JMenuItem itemMenuPesquisaMedico;
    private javax.swing.JMenuItem itemMenuPesquisaPaciente;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JMenu menuAgendamento;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuPesquisa;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
