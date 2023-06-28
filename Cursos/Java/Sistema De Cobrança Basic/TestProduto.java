package sistema_faturamento;

import java.util.Scanner;

public class TestProduto {

	public static void main(String[] args) {
		
		Produtos produto = new Produtos();
		
		System.out.println("O valor do produto é: R$" + produto.getValor());
		System.out.println("Insira a quantia a ser paga: ");
		produto.realizarPagamento();
		
	}

}
