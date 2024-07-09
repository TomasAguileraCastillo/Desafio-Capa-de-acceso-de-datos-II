package cl.praxis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.*;
import cl.praxis.model.dao.ProveedoresDAOImpl;
import cl.praxis.model.dto.Proveedores;

 
@WebServlet("/ProveedoresDetailUpdate")
public class ProveedoresDetailsUpdateControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProveedoresDetailsUpdateControllers() {
        super();
     }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strId = request.getParameter("id");
		System.out.println(strId);
		
		int id = 0;
		
		if (strId != null) {
			id = Integer.parseInt(strId);

		}

		if (id > 0) {

			ProveedoresDAOImpl pDAO = new ProveedoresDAOImpl();
			Proveedores p = pDAO.read(id);
					
					
			request.setAttribute("proveedores", p);

			getServletContext().getRequestDispatcher("/views/ProveedorUpdate.jsp").forward(request, response);

		}
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
		String iD = request.getParameter("id");
		
		String nombre = 		request.getParameter("nombre");
		String rut = 			request.getParameter("rut");
		String direccion = 		request.getParameter("direccion");
		String correo = 		request.getParameter("correo");
		int telefono = 			Integer.parseInt(request.getParameter("telefono"));
		String contacto = 		request.getParameter("contacto");
		int telefonoContacto = 	Integer.parseInt(request.getParameter("telContacto"));
		
		 Proveedores p = null; 
		 
		 ProveedoresDAO pDAO = new ProveedoresDAOImpl();
		 	
		
		if (!iD.isEmpty()) {
			int id = Integer.parseInt(iD);
			p = new Proveedores(id, nombre, rut, direccion, correo, telefono, contacto, telefonoContacto);
			System.out.println(p);
			pDAO.update(p);
		}
		
		
		
		response.sendRedirect(request.getContextPath()+ "/Proveedores");
		
		
		
 		
	}

}
