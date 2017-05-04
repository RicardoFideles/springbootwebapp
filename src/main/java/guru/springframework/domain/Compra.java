package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compra_id_seq")
    @SequenceGenerator(name="compra_id_seq", sequenceName = "COMPRA_ID_SEQ", allocationSize = 100)
	private Long id;

	private float valorTotal;
	private int numeroProdutos;

	@Version
	private Integer version;

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

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroProdutos() {
		return numeroProdutos;
	}

	public void setNumeroProdutos(int numeroProdutos) {
		this.numeroProdutos = numeroProdutos;
	}

}