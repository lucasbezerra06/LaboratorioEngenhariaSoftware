package br.com.fatec.exercicio3.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fatec.exercicio3.model.Contato;

@ManagedBean
@SessionScoped
public class ContatoBean {
	private Contato currentContato = new Contato();
	public String login() {
		if("admin".equals(currentContato.getUsuario()) && "1234".equals(currentContato.getSenha())) {
			System.out.println("Logado");
			return "";
		}else {
			System.out.println("Não Logado");
			return "";
		}
	}
}
