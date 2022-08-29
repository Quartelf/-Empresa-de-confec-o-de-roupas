import java.util.Scanner;

public class executavel {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String calcatipo;
	int escolha, escolha2, escolha3, escolha4, escolha5, escolha6, numerodecalcas = 0, numerodecamisas = 0;
	do{
		
	System.out.println("Menu Principal"
			+ "\n1 Cadastrar"
			+ "\n2 Listar"
			+ "\n3 Editar"
			+ "\n4 Remover"
			+ "\n5 Fechar");
	escolha = sc.nextInt();
	
	switch(escolha) {
		case 1:
			System.out.println("Você deseja cadastrar"
					+ "\n1 Uma calca"
					+ "\n2 Uma camisa");
			escolha2 = sc.nextInt();
			
		switch(escolha2) {
			case 1:
				numerodecalcas = (numerodecalcas + 1);			
				System.out.println("Qual gênero?");
				String calcagenero = sc.next();
				
				System.out.println("Qual codigo da calca?");
				int codigocalca = sc.nextInt(); 
				
				System.out.println("Qual tecido?");
				String calcatecido = sc.next();
				
				System.out.println("Qual tipo da calça?");
				String calcatipo1 = sc.next();
				
				System.out.println("Qual o custo da calça?");
				int calcacusto = sc.nextInt();
			break;
				case 2:
				numerodecamisas = (numerodecamisas + 1);
				System.out.println("Qual o codigo da camisa");
				int codigo = sc.nextInt();
				
				System.out.println("Qual a cor da camisa");
				String cor = sc.next();
				
				System.out.println("Qual o tipo da camisa");
				String tipo = sc.next();
				
				System.out.println("Tem tampa na camisa?"
						+ "\n1 Sim"
						+ "\n2 Não");
				break;
		} return;
	case 2:
		System.out.println("Numero de Calcas = " + numerodecalcas);
		System.out.println("Numeor de Camisas = " + numerodecamisas);	
	break;
	case 3:
		System.out.println("Oque você deseja editar?"
				+ "\n1 Calca"
				+ "\n2 Camisa");
		escolha3 = sc.nextInt();
		switch(escolha3) {
		case 1:
			System.out.println("Oque você deseja editar na Calça?"
					+ "\n1 Genero"
					+ "\n2 Código"
					+ "\n3 Tecido"
					+ "\n4 Tipo"
					+ "\n5 Custo");
			escolha4 = sc.nextInt();
			switch(escolha4) {
			case 1:
				System.out.println("Digite o novo Genero da calca");
				String calcagenero = sc.next();
				break;
			case 2:
				System.out.println("Qual o novo codigo da calca?");
				int codigocalca = sc.nextInt(); 
				break;
			case 3: 
				System.out.println("Qual o novo tecido?");
				String calcatecido = sc.next();
				break;
			case 4:
				System.out.println("Qual o novo tipo da calça?");
				String calcatipo1 = sc.next();
				break;
			case 5:
				System.out.println("Qual o novo custo da calca?");
				int calcacusto = sc.nextInt();
				break;
			} return;
		case 2:
			System.out.println("Oque você deseja editar na Calça?"
					+ "\n1 Código"
					+ "\n2 Cor"
					+ "\n3 Tipo"
					+ "\n4 Se tem estampa");
			escolha5 = sc.nextInt();
			switch(escolha5) {
			case 1:
			System.out.println("Qual o novo codigo da camisa");
			int codigo = sc.nextInt();
			break;
			case 2:
			System.out.println("Qual a nova cor da camisa");
			String cor = sc.next();
			break;
			case 3:
			System.out.println("Qual o novo tipo da camisa");
			String tipo = sc.next();
			break;
			case 4:
			System.out.println("Tem tampa na camisa?"
					+ "\n1 Sim"
					+ "\n2 Não");
			break;
					}return;
				
				}
	case 4:
		System.out.println("Você quer remover"
				+ "\n1 Uma camisa"
				+ "\n2 Uma calca");
		escolha6 = sc.nextInt();
		switch(escolha6) {
		case 1:
			(numerodecamisas - 1);
			System.out.println("Você removeu uma camisa");
		break;
		case 2:
			(numerodecalcas - 1);
			System.out.println("Você removeu uma calça");
			break;
				}
			}while(true);
			
		}
	}
}

