package br.com.consultorio.medico.controller;

import br.com.consultorio.medico.helper.AgendarConsultaHelper;
import br.com.sistema.consultorio.view.AgendarConsulta;
import br.com.sistema.consultorio.view.MenuPrincipal;

public class AgendarConsultaController {

	private final AgendarConsulta view;
	private final AgendarConsultaHelper helper;
	
	public AgendarConsultaController(AgendarConsulta view) {
		this.view = view;
		this.helper = new AgendarConsultaHelper(view);

	}
	
	public void voltarMenuPrincipal() {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.setVisible(true);
		this.view.dispose();
	}
}
