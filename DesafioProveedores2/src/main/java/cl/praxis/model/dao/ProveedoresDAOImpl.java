package cl.praxis.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.model.conexion.Conexion;
import cl.praxis.model.dto.Proveedores;

public class ProveedoresDAOImpl implements ProveedoresDAO {
	
	public void crear(Proveedores p) {
		String querySql = "INSERT INTO proveedores	(nombre, rut, direccion, correo, telefono, contacto, telefono_contacto) VALUES 	('"+ p.getNombre() + "', '" + p.getRut() +"', '" + p.getDireccion() + "', '" + p.getCorreo() + "', '" + p.getTelefono() + "', '" + p.getContacto() + "', '" + p.getTelefonoContacto() + "')";
		System.out.println(querySql);		
		try {
			Connection con = Conexion.getConn();
			Statement st = con.createStatement();
			st.execute(querySql);	
		}catch (SQLException e) {
			System.out.println("Error en metodo Crear()");
			e.printStackTrace();
		}
	}
	
	public List<Proveedores> read(){
		List<Proveedores> proveedores = new ArrayList<Proveedores>();
		try {
			Connection conectar = Conexion.getConn();
			Statement s = conectar.createStatement();
			String querySql = "Select id, nombre, rut, direccion, correo, telefono, contacto, telefono_contacto from proveedores";
			ResultSet rs = s.executeQuery(querySql);
			while (rs.next()) {				
			proveedores.add(new Proveedores(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut"), rs.getString("direccion"), rs.getString("correo"), rs.getInt("telefono"), rs.getString("contacto"), rs.getInt("telefono_contacto")));
			}					
		}catch(SQLException ex){
			System.out.println("Error en el Metodo read()");
			ex.printStackTrace();
		}	
		return proveedores;
	}
	
	
	public Proveedores read(int id) {
		Proveedores p = null;

		try {
			Connection conectar = Conexion.getConn();
			Statement s = conectar.createStatement();
			String querySQL = "Select id, nombre, rut, direccion, correo, telefono, contacto, telefono_contacto from proveedores where id = "+ id;
			System.out.println(querySQL);
			ResultSet rs = s.executeQuery(querySQL);
			if (rs.next()) {
				p = new Proveedores(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut"), rs.getString("direccion"), rs.getString("correo"), rs.getInt("telefono"), rs.getString("contacto"), rs.getInt("telefono_contacto"));			
			}			
		}catch(SQLException e) {
			System.out.println("Error en el metodo Read(Id)");
			e.printStackTrace();		
		}
			
		return p;
		
	}
	
		
	
	public void update(Proveedores p) {

		String querySQL = "UPDATE proveedores SET nombre='" + p.getNombre()+"', rut='"+p.getRut()+"', direccion='"+p.getDireccion()+"', correo='"+p.getCorreo()+"', telefono='"+p.getTelefono()+"', contacto='"+p.getContacto()+"', telefono_contacto='"+p.getTelefonoContacto()+"' WHERE id=" + p.getId();
		System.out.println(querySQL);

		
		
		try {
			Connection conexion = Conexion.getConn();
			Statement s = conexion.createStatement();
			s.executeQuery(querySQL);
			
			
		}catch (SQLException e) {
			System.out.println("Error en metodo Update()");
			e.printStackTrace();
			
		}
		
		
	}

	public void delete(int id) {
		
		String querySql = " DELETE FROM proveedores WHERE id=" + id;
		
		try {
			Connection conexion= Conexion.getConn();
			Statement s = conexion.createStatement();

			s.executeQuery(querySql);
			
			
			
			
			
		}catch (SQLException e){
			System.out.println("Error en metodo delete();");
			e.printStackTrace();
			
		}
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
