package Modelo;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private String pwd;
	private String ceudla;
	
	public Usuario(int id, String nombre, String apellido, String correo, String pwd, String ceudla) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.pwd = pwd;
		this.ceudla = ceudla;
	}
	
	public Usuario(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCeudla() {
		return ceudla;
	}

	public void setCeudla(String ceudla) {
		this.ceudla = ceudla;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", pwd="
				+ pwd + ", ceudla=" + ceudla + "]";
	}
	
	
}
