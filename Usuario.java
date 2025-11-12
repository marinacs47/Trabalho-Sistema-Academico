package sistema_academico.modelo;

import java.util.ArrayList;
import java.util.List;

class Usuario implements IAutenticacao(){

	private String login;
	private String senha;
	private TipoUsuario tipoUsuario;
	private static List<Usuario> usuarios = new ArrayList<>();

	static{
						usuarios = new ArrayList<Usuario>();
						usuarios.add(new Usuario("Administrador"));
						usuarios.add(new Usuario("Professor1"));
						usuarios.add(new Usuario("Professor2"));
						usuarios.add(new Usuario("Aluno1"));
						usuarios.add(new Usuario("Aluno2"));
						usuarios.add(new Usuario("Aluno3"));
						usuarios.add(new Usuario("Aluno4"));
						usuarios.add(new Usuario("Aluno5"));
						usuarios.add(new Usuario("Turma1"));
	}


	public Usuario(String nome, String login, String senha, TipoUsuario tipoUsuario){
		super(login, senha);
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
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
