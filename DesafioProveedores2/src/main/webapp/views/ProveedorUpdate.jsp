<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <jsp:include page="/assets/html/header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<main>
		<!-- Seccion Form -->
			<section >
				<br/>
				<div class="container ">
					 
						
					<div id=" "   >
				<form class="row g-3" id="form1" method="post" action="${pageContext.request.contextPath}/ProveedoresDetailUpdate"  >
							<h2>Formulario de Registro de Proveedores</h2>
							<hr/>
						
						
							<input type="hidden" id="id" name="id" value="${proveedores.getId()}">
							
							<div class="col-md-3">
								<label for="inputRut" class="form-label">Rut :</label> <input
									type="text" class="form-control" id="rut" name="rut" value="${proveedores.getRut()}" required>
							</div>
							<div class="col-md-4">
								<label for="inputid" class="form-label">Nombre Proveedor:</label> 
								<input type="text" class="form-control" id="nombre" name="nombre" value="${proveedores.getNombre()}" required>
							</div>
							<div class="col-5">
								<label for="inputAddress" class="form-label">Dirección :</label> <input
									type="text" class="form-control" id="direccion" name="direccion" value="${proveedores.getDireccion()}" required>
							</div>
							<div class="col-3">
								<label for="inputEmail" class="form-label">Correo :</label> <input
									type="email" class="form-control" id="correo" name="correo" value="${proveedores.getCorreo()}" required>
							</div>
							<div class="col-md-3">
								<label for="inputTelefono" class="form-label">Telefono :</label> <input
									type="tel" class="form-control" id="telefono" name="telefono" pattern="[0-9]{9}" placeholder="Ej 999999999" value="${proveedores.getTelefono()}" required>
							</div>
							
							<div class="col-md-3">
								<label for="inputContacto" class="form-label">Nombre de contacto :</label> <input
									type="text" class="form-control" id="contacto" name="contacto" value="${proveedores.getContacto()}" required>
							</div>
							<div class="col-md-3">
								<label for="inputTelefono2" class="form-label">Telefono de Contacto :</label> <input
									type="tel" class="form-control" id="telContacto" name="telContacto" pattern="[0-9]{9}" placeholder="Ej 999999999" value="${proveedores.getTelefonoContacto()}" required>
							</div>
								
							<hr/>		
								<div class="col-12">
									<button type="submit" class="btn btn-primary">Guardar Registro <i class="bi bi-floppy"></i></button>

									<a 	href="${pageContext.request.contextPath}/Proveedores" 
										class="btn btn-danger">Cancelar
										<i class="bi bi-x-square"></i>
									</a>
									
								</div>
							<hr/>
						</form>
					</div>
					
				</div>
			</section>	 
			
<jsp:include page="/assets/html/footer.jsp"></jsp:include>