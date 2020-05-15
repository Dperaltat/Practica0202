package Modelo;

public abstract class Calcu_Saldo{
	
	private double saldo;
	protected double credito;

	public Calcu_Saldo(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getCredito() {
		return credito;
	}
	
	//public abstract void calcularSaldo(double precio, double saldo);
	
}
