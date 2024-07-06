package testealura.core;

public class CartaoCredito {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Limite Cartão: " + this.getLimite();
	}
	
	

}
