package cl.praxis.model.dto;

public class Proveedores {
	// Atributos
	int id;
	String nombre;
	String rut;
	String direccion;
	String correo;
	int telefono;
	String contacto;
	int telefonoContacto;
	
	
	// Constructor Vacio
	public Proveedores() {
		super();
	}


	//Constructor Completo
	public Proveedores(int id, String nombre, String rut, String direccion, String correo, int telefono,
			String contacto, int telefonoContacto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.contacto = contacto;
		this.telefonoContacto = telefonoContacto;
	}

	//Metodos
	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion
				+ ", correo=" + correo + ", telefono=" + telefono + ", contacto=" + contacto + ", telefonoContacto="
				+ telefonoContacto + "]";
	}
	
	

	//Getters y Setters
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


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public int getTelefonoContacto() {
		return telefonoContacto;
	}


	public void setTelefonoContacto(int telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	
	
	

}