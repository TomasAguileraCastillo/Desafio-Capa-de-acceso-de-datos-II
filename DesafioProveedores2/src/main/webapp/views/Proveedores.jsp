<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <jsp:include page="/assets/html/header.jsp"></jsp:include>
 	<!-- Inicio Main -->
	<main>
	

	
		<!-- Seccion Form -->
			<section >
				<br/>
				<div class="container ">
					<div class="col-12">
						<a class="btn btn-primary" role="button" id="btnAgregarR">Agregar Registro
							<i class="bi bi-file-earmark-plus"></i>
						</a>
						
						
						
					</div>
						
					<div id="seccionForm" >
				<form class="row g-3" id="form1" method="post" action="${pageContext.request.contextPath}/ProveedoresDetails"  >
							<h2>Formulario de Registro de Proveedores</h2>
							<hr/>
						
						
							<input type="hidden" id="id" name="id" value="${a.getId()}">
							
							<div class="col-md-3">
								<label for="inputRut" class="form-label">Rut :</label> <input
									type="text" class="form-control" id="rut" name="rut" value="${a.getRut()}" required>
							</div>
							<div class="col-md-4">
								<label for="inputid" class="form-label">Nombre Proveedor:</label> 
								<input type="text" class="form-control" id="nombre" name="nombre" value="" required>
							</div>
							<div class="col-5">
								<label for="inputAddress" class="form-label">Dirección :</label> <input
									type="text" class="form-control" id="direccion" name="direccion" value="" required>
							</div>
							<div class="col-3">
								<label for="inputEmail" class="form-label">Correo :</label> <input
									type="email" class="form-control" id="correo" name="correo" value="" required>
							</div>
							<div class="col-md-3">
								<label for="inputTelefono" class="form-label">Telefono :</label> <input
									type="tel" class="form-control" id="telefono" name="telefono" pattern="[0-9]{9}" placeholder="Ej 999999999" value="" required>
							</div>
							
							<div class="col-md-3">
								<label for="inputContacto" class="form-label">Nombre de contacto :</label> <input
									type="text" class="form-control" id="contacto" name="contacto" value="" required>
							</div>
							<div class="col-md-3">
								<label for="inputTelefono2" class="form-label">Telefono de Contacto :</label> <input
									type="tel" class="form-control" id="telContacto" name="telContacto" pattern="[0-9]{9}" placeholder="Ej 999999999" value="" required>
							</div>
								
							<hr/>		
								<div class="col-12">
									<button type="submit" class="btn btn-primary">Agregar Registro <i class="bi bi-floppy"></i></button>
									<button type="button" class="btn btn-danger" id="btnCancela"   >Cancelar <i class="bi bi-x-square"></i>
									</button>
									
								</div>
							<hr/>
						</form>
					</div>
					
				</div>
			</section>	
			<!-- Fin Seccion Form -->
			<!-- Seccion DataTable -->
			<section id="seccionTabla">
				<div class="container">
					<div>
					<br/>
						<table id="tblProveedores"  >
							<thead>
						    	<tr>
						      		<th  >Id</th>
						      		<th  >Nombre</th>
						      		<th  >Rut</th>
						      		<th  >Direccion</th>
						      		<th  >Correo</th>
						      		<th  >Telefono</th>
						      		<th  >Nombre Contacto</th>
						      		<th  >Telefono Contacto</th>
						      		<th  >   Acciones  </th>
						      	</tr>
							</thead>
							<tbody>
								<c:forEach var="a" items="${proveedores}">
									<tr>
										<td >
											<c:out value="${a.getId()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getNombre()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getRut()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getDireccion()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getCorreo()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getTelefono()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getContacto()}"></c:out>
										</td>
										<td >
											<c:out value="${a.getTelefonoContacto()}"></c:out>
										</td>
										<td>
										
										
											<a href="${pageContext.request.contextPath}/ProveedoresDetailUpdate?id=${a.getId()}" class="btn btn-success" data-bs-toggle="tooltip" data-bs-title="Editar Registro"><i class="bi bi-pencil-square"> </i></a>
											<a href="${pageContext.request.contextPath}/ProveedoresDetails?id=${a.getId()}&op=del" class="btn btn-danger" data-bs-toggle="tooltip" data-bs-title="Eliminar Registro" ><i class="bi bi-trash3"> </i></a>
										</td>
										 
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</section>
			<!-- Fin DataTable -->
	</main>
	<!-- Fin Main -->
 <jsp:include page="/assets/html/footer.jsp"></jsp:include>
 
 <script>
	const tooltipTriggerList = document.querySelectorAll('[data-bs-toggle="tooltip"]')
	const tooltipList = [...tooltipTriggerList].map(tooltipTriggerEl => new bootstrap.Tooltip(tooltipTriggerEl))
</script>
