package testealura.core;

public class Carrinho implements Comparable<Carrinho>{
	private String produto;
	private double valor;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "\n--------------------------------------------------------------\n"
				+ "Produto: " + this.getProduto()+ "\nValor: R$" + this.getValor()+""
						+ "\n--------------------------------------------------------------\n";
	}
	@Override
	public int compareTo(Carrinho o) {
		return this.getProduto().compareTo(o.getProduto());
	}
	
	
	

}
