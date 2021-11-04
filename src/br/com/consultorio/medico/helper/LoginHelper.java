package br.com.consultorio.medico.helper;

import br.com.consultorio.medico.model.Acesso;
import br.com.sistema.consultorio.view.Login;

/**
 *
 * @author esqui
 */
public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Acesso obterModelo(){
        
        String usuario = view.getTxtUsuario().getText();
        @SuppressWarnings("deprecation")
		String senha = view.getTxtSenha().getText();        
        Acesso modeloAcesso = new Acesso(usuario, senha); 
        
        return modeloAcesso;
    }
    
    public void setarModelo(Acesso modeloAcesso){
        String usuario = modeloAcesso.getUsuario();
        String senha = modeloAcesso.getSenha();
        
        view.getTxtUsuario().setText(usuario);
        view.getTxtSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }
    
}
