package fiap.scj.seguranca;

import java.security.Principal;

public class PerfilEntidade implements Principal {

	private String descricao;

	public PerfilEntidade(String groupName) {
		this.descricao = groupName;
	}

	@Override
	public String getName() {
		return this.descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



}
