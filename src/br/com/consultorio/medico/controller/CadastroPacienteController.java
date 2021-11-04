package br.com.consultorio.medico.controller;

import br.com.consultorio.medico.dao.PacienteDao;
import br.com.consultorio.medico.helper.CadastroPacienteHelper;
import br.com.consultorio.medico.model.Paciente;
import br.com.sistema.consultorio.view.CadastroPaciente;
import br.com.sistema.consultorio.view.MenuPrincipal;

public class CadastroPacienteController {
	
	private final CadastroPaciente view;
	private final CadastroPacienteHelper helper;
	
	public CadastroPacienteController(CadastroPaciente view) {
		this.view = view;
		this.helper = new CadastroPacienteHelper(view);

	}
	
	public void gravarPaciente() {
		try {						

			if (view.getTxtNome().getText().equals("")) {
				view.exibirMensagem("Campo Nome não pode ser vazio!");
			} else if(view.getTxtDtNascimento().getText().equals("")) {
				view.exibirMensagem("Campo Data de Nascimento não pode ser vazio!");
			} else if (view.getTxtCpf().getText().equals("")) {
				view.exibirMensagem("Campo CPF não pode ser vazio!");
			} else if (view.getTxtCelular().getText().equals("")) {
				view.exibirMensagem("Campo Celular não pode ser vazio!");
			} else if (view.getTxtCep().getText().equals("")) {
				view.exibirMensagem("Campo CEP não pode ser vazio!");
			} else if (view.getTxtLogradouro().getText().equals("")) {
				view.exibirMensagem("Campo Logradouro não pode ser vazio!");
			} else if (view.getTxtNumero().getText().equals("")) {
				view.exibirMensagem("Campo Numero não pode ser vazio!");
			} else if (view.getTxtBairro().getText().equals("")) {
				view.exibirMensagem("Campo Bairro não pode ser vazio!");
			} else {
				Paciente paciente = helper.obterModelo();
				PacienteDao pacienteDao = new PacienteDao();
				pacienteDao.insertPaciente(paciente);	
				helper.limparTela();
			}
		} catch (Exception e) {
			e.printStackTrace();			
		}

	}
	
	public void voltarMenuPrincipal() {
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.setVisible(true);
		this.view.dispose();
	}

}
