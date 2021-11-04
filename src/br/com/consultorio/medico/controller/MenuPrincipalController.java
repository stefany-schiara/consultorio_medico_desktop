package br.com.consultorio.medico.controller;

import br.com.sistema.consultorio.view.CadastroPaciente;
import br.com.sistema.consultorio.view.MenuPrincipal;

public class MenuPrincipalController {

	private final MenuPrincipal view;
	//private final MenuPrincipalHelper helper;

	public MenuPrincipalController(MenuPrincipal view) {
		this.view = view;
		//this.helper = new MenuPrincipalHelper(view);

	}

	public void acessarCadastroPaciente() {
		try {

			CadastroPaciente cadastroPaciente = new CadastroPaciente();
			cadastroPaciente.setVisible(true);
			this.view.dispose();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
