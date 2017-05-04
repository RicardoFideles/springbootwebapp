package guru.springframework.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
    @SequenceGenerator(name="cliente_id_seq", sequenceName = "CLIENTE_ID_SEQ", allocationSize = 100)
	private Long id;

	private String nome;

	private String endereco;

	private String cpf;

	@Version
	private Integer version;

	@OneToMany(targetEntity = Compra.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private List<Compra> compras;
	
	public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

}