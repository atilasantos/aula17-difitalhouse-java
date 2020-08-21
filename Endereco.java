
public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String estado;
	
	public Endereco(String rua, int numero, String bairro, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", estado=" + estado + "]";
	}

	
}

	