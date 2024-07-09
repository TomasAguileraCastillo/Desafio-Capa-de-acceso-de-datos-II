/**
 * 
 */


$(document).ready( function () {
    $('#tblProveedores').DataTable();
} );


//funcion para ocultar formulario de registro data table segun opciones de ingresar  	
	$(function (){
		let form = $('#seccionForm');
		let btnAgr = $('#btnAgregarR')
		let tabla = $('#seccionTabla')
		form.hide();
		let ocultar = true;
		
		$(btnAgr).click(function(){
			if (ocultar){
				tabla.hide();
				form.show();
				btnAgr.hide();
				ocultar = false;
			}else {
				form.hide();
				ocultar = true;
			}
		});
		
		$(btnCancela).click(function(){
			limpiaForm();
			//document.getElementById("form1").reset();
			if (ocultar){
				//form.hide();	
				ocultar = false;
			}else {
				tabla.show();
				btnAgr.show();
				form.hide();
				ocultar = true;
			}
		});
				
	});
	
	function limpiaForm(){
		document.getElementById("form1").reset();
	}		

