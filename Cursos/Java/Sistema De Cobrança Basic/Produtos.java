package sistema_faturamento;

import java.util.Scanner;

public class Produtos {
	
	Scanner scan = new Scanner(System.in);
	private double valor;
	private String nome;
	private int quantidade;
	private double pagamento;
	private boolean aceito = false;
	private double soma;
	
	public Produtos() {
		System.out.println("Insira o nome do produto: ");
		nome = scan.nextLine();
		System.out.println("Insira o valor do produto: ");
		valor = scan.nextDouble();
		System.out.println("Insia a quantidade do produto: ");
		quantidade = scan.nextInt();
	}

	public double getValor() {
		this.soma = valor * quantidade;
		return soma;
	}

	public void realizarPagamento() {
		while(!aceito) {
			this.pagamento = scan.nextDouble();
			if (pagamento >= soma) {
				System.out.println("Produto pago");
				double troco = pagamento - soma;
				System.out.println("Troco: " + troco);
				aceito = true;
			} else {
				System.out.println("Por favor insira um valor válido");
				aceito = false;
			}
		}
	}
	
}
