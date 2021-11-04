package br.com.consultorio.medico.controller;

import br.com.consultorio.medico.helper.CadastroMedicoHelper;
import br.com.sistema.consultorio.view.CadastroMedico;
import br.com.sistema.consultorio.view.MenuPrincipal;

public class CadastroMedicoController {
	
	private final CadastroMedico view;
	private final CadastroMedicoHelper helper;
	
	public CadastroMedicoController(CadastroMedico view) {
		this.view = view;
		this.helper = new CadastroMedicoHelper(view);

	}
	
	public void voltarMenuPrincipal() {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.setVisible(true);
		this.view.dispose();
	}

}
