package cl.praxis.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.ProveedoresDAO;
import cl.praxis.model.dao.ProveedoresDAOImpl;
import cl.praxis.model.dto.Proveedores;

 
@WebServlet("/ProveedoresDetails")
public class ProveedoresDetailsControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public ProveedoresDetailsControllers() {
        super();
         
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String iD = request.getParameter("id");
		String op = request.getParameter("op");
		System.out.println(iD + op );
		
		int id = 0;
		
		//Primera Validacion
		if (iD != null) {
			id =  Integer.parseInt(iD);
		}
		
		if (id>0 && op==null) {
			System.out.println("no es posible Eliminar el registro");
		}else if (id > 0 && op.equalsIgnoreCase("del")) {
			
			ProveedoresDAOImpl pDAO = new ProveedoresDAOImpl();
			pDAO.delete(id);
			
			response.sendRedirect(request.getContextPath()+ "/Proveedores");
					
			
		}
		
		
		
		
		if (op.equalsIgnoreCase("del")) {
			
		}
		
		
		
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String iD = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String correo = request.getParameter("correo");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String contacto = request.getParameter("contacto");
		int telefonoContacto = Integer.parseInt(request.getParameter("telContacto"));
		
		System.out.println(iD + nombre + rut + direccion + correo + telefono + contacto + telefonoContacto);
		
		
		
		Proveedores p = null;
		ProveedoresDAOImpl pDAO = new ProveedoresDAOImpl();
		
		if (!iD.isEmpty()) {
			System.out.println("registro vacio");
			
		}else {
			p = new Proveedores();
			p.setNombre(nombre);
			p.setRut(rut);
			p.setDireccion(direccion);
			p.setCorreo(correo);
			p.setTelefono(telefono);
			p.setContacto(contacto);
			p.setTelefonoContacto(telefonoContacto);
			
			pDAO.crear(p);
			
			
		}
		
		
		response.sendRedirect(request.getContextPath() + "/Proveedores");
		
		
	}

}
