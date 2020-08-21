
public class Contato {
	private Integer id;
	private String nome;
	private Integer idade;
	private String telefone;
	private Endereco endereco;
	
	
	public Contato(int id, String nome, int idade, String telefone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getTelefone() {
		return telefone;
	}
	
	@Override
	public String toString() {
		return "\n---------------------------------------------------\n"
				+ "ID: " + id
				+ ", Nome " + nome
				+ ", Idade " + idade
				+ ", Telefone " + telefone
				+ ", \nEndereco: " + endereco;
	}
	
	
}
