package Modelo;

public class Credito extends Calcu_Saldo{
	
	private int id;

	public Credito(int id) {
		super(id);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
