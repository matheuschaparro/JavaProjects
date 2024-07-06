package testealura.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Menu  {
	private int estado = 1;
	
	Scanner teclado = new Scanner(System.in);
	
	List<Carrinho> listaCompra = new ArrayList<>();
	
	public void usandoMenu() {
		CartaoCredito cartao = new CartaoCredito();
		System.out.println("Digite o limite do seu cartão: ");
		cartao.setLimite(teclado.nextDouble());
		while(this.estado == 1) {
			Carrinho c = new Carrinho();
			System.out.println("Nome do produto:");
			String nome = teclado.next();
			c.setProduto(nome);
			System.out.println("Digite o valor:");
			double preco = teclado.nextDouble();
			c.setValor(preco);
			if(c.getValor()<=cartao.getLimite()) {
				listaCompra.add(c);
				double novolimite = cartao.getLimite()- preco;
				cartao.setLimite(novolimite);
				System.out.println("Deseja continuar comprando?"
						+ "\nSe sim digite 1, caso contrário 0:");
				this.estado = teclado.nextInt();				
			}else {
				System.out.println("Limite excedido.\nLimite disponível:"
						+ " R$"+cartao.getLimite());
				this.estado = 0;
			}
				
		}
		
		Collections.sort(listaCompra);
		listaCompra.forEach(System.out::println);
		System.out.println(cartao.toString());;
		
	}
	
}
