package proyecto3;

public class Usuarios {

	private int id_usuario;
	private String nombre;
	private String apellido;
	private int telefono;
	private String direccion;
	private String correo_electronico;
	private String fecha_nacimiento;
	private int id_rol;
	private int activo;
	private String contraseña;
	
	public int getid_usuario() {
		return id_usuario;
	}
	
	public void setid_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getapellido() {
		return apellido;
	}
	
	public void setapellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int gettelefono() {
		return telefono;
	}
	
	public void settelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getdireccion() {
		return direccion;
	}
	
	public void setadireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getcorreo_electronico() {
		return correo_electronico;
	}
	
	public void setcorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	
	public String getfecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	public void setfecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public int getid_rol() {
		return id_rol;
	}
	
	public void setid_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	
	public int getactivo() {
		return activo;
	}
	
	public void setactivo(int activo) {
		this.activo = activo;
	}
	
	public String getcontraseña() {
		return contraseña;
	}
	
	public void setcontraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
