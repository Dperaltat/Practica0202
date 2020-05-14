package Modelo;

public class Credito {
	
	private double saldo;
	private Usuario usu;
	
	public Credito(double saldo, Usuario usu) {
		super();
		this.saldo = saldo;
		this.usu = usu;
	}

	public Credito() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsu() {
		return usu;
	}

	public void setUsu(Usuario usu) {
		this.usu = usu;
	}

	@Override
	public String toString() {
		return "Credito [saldo=" + saldo + ", usu=" + usu + "]";
	}
	
	
}
