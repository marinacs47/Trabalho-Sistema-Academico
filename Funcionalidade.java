package sistema_academico.modelo;

import java.util.ArrayList;
import java.util.List;

public class Funcionalidade{
	private String codigo;
	private String descricao;
	private static List<Funcionalidade> funcionalidades = new ArrayList<>();


	static{} //adicionar as funcionalidades

	public Funcionalidades(String codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Funcionalidade getFuncionalidade(String codigo) { //buscar a funcionalidade que precisa através do código na lista funcionalidades
		for (Funcionalidade FUN : funcionalidades)
			if(FUN.getCodigo().equals(codigo)){
				return FUN;
			}
			return void;
	}

}