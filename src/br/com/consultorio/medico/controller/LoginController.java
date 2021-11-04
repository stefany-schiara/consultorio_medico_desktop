package br.com.consultorio.medico.controller;

import br.com.consultorio.medico.dao.AcessoDao;
import br.com.consultorio.medico.helper.LoginHelper;
import br.com.consultorio.medico.model.Acesso;
import br.com.sistema.consultorio.view.Login;
import br.com.sistema.consultorio.view.MenuPrincipal;

/**
 *
 * @author esqui
 */
public class LoginController {

	private final Login view;
	private final LoginHelper helper;

	public LoginController(Login view) {
		this.view = view;
		this.helper = new LoginHelper(view);

	}

	public void acessarSistema() {
		try {

			Acesso acesso = helper.obterModelo();
			AcessoDao acessoDao = new AcessoDao();

			boolean isUser = acessoDao.checkLogin(acesso.getUsuario(), acesso.getSenha());

			if (isUser) {
				MenuPrincipal menu = new MenuPrincipal();
				menu.setVisible(true);
				this.view.dispose();
			} else {
				view.exibirMensagem("Usuario ou senha invalidos");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
