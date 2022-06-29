package proyecto3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class acciones {

	int r;
	PreparedStatement ps;
	ResultSet su;
	Connection con;
	conexion acceso = new conexion();
	Usuarios pro = new Usuarios();
	
	public List listarUsuarios() {
		String sql = "select*from usuarios";
		List<Usuarios> listaprod = new ArrayList<>();
		try {
			con = acceso.Conectar();
			ps = con.prepareStatement(sql);
			su = ps.executeQuery();
			while (su.next()) {
				Usuarios P = new Usuarios();
				P.setid_usuario(su.getInt(1));
				P.setnombre(su.getString(2));
				P.setapellido(su.getString(3));
				P.settelefono(su.getInt(4));
				P.setadireccion(su.getString(5));
				P.setcorreo_electronico(su.getString(6));
				P.setfecha_nacimiento(su.getString(7));
				P.setid_rol(su.getInt(8));
				P.setactivo(su.getInt(9));
				P.setcontraseña(su.getString(10));
				listaprod.add(P);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	return listaprod;
	}
	
	public int modificar (int id_usuario, String nombre, String apellido, int telefono, String direccion, String correo_electronico, String fecha_nacimiento, int id_rol, int activo, String contraseña) {
		String sql = "update usuarios set id_usuario = ?, nombre = ?, apellido = ?, telefono = ?, direccion = ?, correo_electronico = ?, fecha_nacimiento = ?, id_rol = ?, activo = ?, contraseña = ?";
		try {
			con = acceso.Conectar();
			ps.setInt(1, id_usuario);
			ps.setString(2, nombre);
			ps.setString(3, apellido);
			ps.setInt(4, telefono);
			ps.setString(5, direccion);
			ps.setString(6, correo_electronico);
			ps.setString(7, fecha_nacimiento);
			ps.setInt(8, id_rol);
			ps.setInt(9, activo);
			ps.setString(10, contraseña);
			ps.setInt(1, id_usuario);
			ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
		return r;
	}
	
	
	public void agregar (int id_usuario, String nombre, String apellido, int telefono, String direccion, String correo_electronico, String fecha_nacimiento, int id_rol, int activo, String contraseña) {
		String sql = "insert into usuarios(id_usuario, nombre, apellido, telefono, direccion, correo_electronico, fecha_nacimiento, id_rol, activo, contraseña) values (?,?,?,?,?,?,?,?,?,?)";
		try {
			con = acceso.Conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id_usuario);
			ps.setString(2, nombre);
			ps.setString(3, apellido);
			ps.setInt(4, telefono);
			ps.setString(5, direccion);
			ps.setString(6, correo_electronico);
			ps.setString(7, fecha_nacimiento);
			ps.setInt(8, id_rol);
			ps.setInt(9, activo);
			ps.setString(10, contraseña);
			ps.setInt(1, id_usuario);
			ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	public void delete (int id){
		String sql = "delete from usuarios where id_usuario = ?";
		try {
			con = acceso.Conectar();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		}catch (Exception e) {
		
		}
		
	}
	
}