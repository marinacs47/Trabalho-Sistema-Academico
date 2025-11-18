package sistema_academico.modelo;

import java.util.ArrayList;
import java.util.List;

class Usuario implements IAutenticacao(){

	private String login;
	private String senha;
	private TipoUsuario tipoUsuario;
	private static List<Usuario> usuarios = new ArrayList<>();

	public Usuario(String nome, String login, String senha, TipoUsuario tipoUsuario){
		this.login = login;
   this.senha = senha;
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
	}

	static{
	}

	public getTipoUsuario getTipoUsuario(){
		return(tipoUsuario);
	}

	public Usuario obter(String login, String senha){
		
	}

@Override
	public boolean autenticar(String login, String senha){
		return this.login.equals(login) && this.senha.equals(senha);
	}  
}
