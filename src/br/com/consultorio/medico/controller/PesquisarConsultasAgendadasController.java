package br.com.consultorio.medico.controller;

import br.com.consultorio.medico.helper.AgendarConsultaHelper;
import br.com.consultorio.medico.helper.PesquisarConsultasAgendadasHelper;
import br.com.sistema.consultorio.view.AgendarConsulta;
import br.com.sistema.consultorio.view.MenuPrincipal;
import br.com.sistema.consultorio.view.PesquisarConsultasAgendadas;

public class PesquisarConsultasAgendadasController {
	
	private final PesquisarConsultasAgendadas view;
	private final PesquisarConsultasAgendadasHelper helper;
	
	public PesquisarConsultasAgendadasController(PesquisarConsultasAgendadas view) {
		this.view = view;
		this.helper = new PesquisarConsultasAgendadasHelper(view);

	}
	
	public void voltarMenuPrincipal() {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.setVisible(true);
		this.view.dispose();
	}

}
