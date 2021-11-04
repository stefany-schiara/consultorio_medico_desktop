package br.com.consultorio.medico.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroPacienteHelper {

	private final CadastroPaciente view;

	public CadastroPacienteHelper(CadastroPaciente view) {
		this.view = view;
	}

	public Paciente obterModelo() throws ParseException {

		String nome = view.getTxtNome().getText();
		String dtNascimento = view.getTxtDtNascimento().getText();
		String cpf = view.getTxtCpf().getText();
		String email = view.getTxtEmail().getText();
		String telefone = view.getTxtTelefone().getText();
		String celular = view.getTxtCelular().getText();
		String cep = view.getTxtCep().getText();
		String logradouro = view.getTxtLogradouro().getText();
		String numero = view.getTxtNumero().getText();
		String complemento = view.getTxtComplemento().getText();
		String estado = view.getComboEstado().getSelectedItem().toString();
		String bairro = view.getTxtBairro().getText();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dtNascimentoFormatada = sdf.parse(dtNascimento);

		Paciente modeloPaciente = new Paciente(nome, dtNascimentoFormatada, cpf, email, telefone, celular, cep,
				logradouro, numero, complemento, estado, bairro);

		return modeloPaciente;
	}

	public void setarModelo(Paciente modeloPaciente) {
		String nome = modeloPaciente.getNome();
		String dtNascimento = modeloPaciente.getDtNascimento().toString();
		String cpf = modeloPaciente.getCpf();
		String email = modeloPaciente.getEmail();
		String telefone = modeloPaciente.getTelefone();
		String celular = modeloPaciente.getCelular();
		String cep = modeloPaciente.getCep();
		String logradouro = modeloPaciente.getLogradouro();
		String numero = modeloPaciente.getNumero();
		String complemento = modeloPaciente.getComplemento();
		String estado = modeloPaciente.getEstado();
		String bairro = modeloPaciente.getBairro();

		view.getTxtNome().setText(nome);
		view.getTxtDtNascimento().setText(dtNascimento);
		view.getTxtCpf().setText(cpf);
		view.getTxtEmail().setText(email);
		view.getTxtTelefone().setText(telefone);
		view.getTxtCelular().setText(celular);
		view.getTxtCep().setText(cep);
		view.getTxtLogradouro().setText(logradouro);
		view.getTxtNumero().setText(numero);
		view.getTxtComplemento().setText(complemento);
		view.getComboEstado().setSelectedItem(estado);
		view.getTxtBairro().setText(bairro);

	}

	public void limparTela() {
		view.getTxtNome().setText("");
		view.getTxtDtNascimento().setText("");
		view.getTxtCpf().setText("");
		view.getTxtEmail().setText("");
		view.getTxtTelefone().setText("");
		view.getTxtCelular().setText("");
		view.getTxtCep().setText("");
		view.getTxtLogradouro().setText("");
		view.getTxtNumero().setText("");
		view.getTxtComplemento().setText("");
		view.getComboEstado().setSelectedIndex(0);
		view.getTxtBairro().setText("");
	}

}
