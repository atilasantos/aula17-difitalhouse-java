import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	static List<Contato> contatos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean opt = true;
		
		while(opt) {
			
			System.out.printf("**** Menu Principal *****\n");
			System.out.printf("[ 1 ] Incluir Contato\n"); //add
			System.out.printf("[ 2 ] Excluir Contato\n"); //remove
			System.out.printf("[ 3 ] Listar Contatos\n"); //for
			System.out.printf("[ 4 ] Pesquisar Contato\n"); //for
			System.out.printf("[ 0 ] Encerrar o Programa\n");
			System.out.printf("\nOpção Desejada: ");
			int option = sc.nextInt();
			
			switch(option) {
			
				case 1:
					criaContato();
					break;
				case 2:
					System.out.print("\nEntre com o id a ser removido: ");
					int idRemoved = sc.nextInt();
					int idIndex = idToIndex(idRemoved, contatos);
					if( idIndex < 0) {
						System.out.println("\nId nao encontrado ou lista vazia!\n\n");
						break;
					}
					contatos.remove(idIndex);
					break;
				case 3:
					listarContatos(contatos);
					break;
				case 4:
					System.out.print("\nEntre com o id a ser pesquisado");
					int id = sc.nextInt();
					listarContato(contatos,id);
					break;
				case 0:
					opt = false;
			}
		}

	}
	
	public static void criaContato() {
		
		System.out.print("\n\nEntre com o id: ");
		int id = sc.nextInt();
		System.out.print("Entre com o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Entre com a idade: ");
		int idade = sc.nextInt();
		System.out.print("Entre com o telefone ");
		sc.nextLine();
		String telefone = sc.nextLine();
		System.out.print("Entre com a rua ");
		String rua = sc.nextLine();
		System.out.print("Entre com o numero do endereco ");
		int numero = sc.nextInt();
		System.out.print("Entre com o bairro ");
		String bairro = sc.nextLine();
		System.out.print("Entre com o estado ");
		String estado = sc.nextLine();
		
		contatos.add(new Contato(id,nome,idade,telefone, new Endereco(rua,numero,bairro,estado)));
	}
	
	public static boolean listaEstaVazia(List<Contato> list) {
		
		if(list.size() == 0) {
			return true;
		}
		return false;
	}
	
	public static int idToIndex(int id, List<Contato> list) {
		
		if(listaEstaVazia(list) == false) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}return -1;
		} return -1;
		
	}
	
	public static void listarContatos(List<Contato> list) {
		
		if(listaEstaVazia(list) == false) {
			for(Contato contato : list) {
				System.out.println(contato);
			}
		} else {
			System.out.println("\nLista Vazia!\n\n");
		}
		
	}
	
	public static void listarContato(List<Contato> list, int id) {
		
		if(listaEstaVazia(list) == false) {
			if(id == 0) {
				for(Contato contato : list) {
					System.out.println(contato);
				}
			} else {
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getId() == id) {
						System.out.println(list.get(i));
					}
				}
					
			}
		} else {
			System.out.println("\nLista Vazia!!\n\n");
		}
	}
}
