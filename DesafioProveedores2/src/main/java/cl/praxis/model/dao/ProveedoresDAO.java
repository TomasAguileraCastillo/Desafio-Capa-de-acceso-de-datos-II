package cl.praxis.model.dao;

import java.util.List;

import cl.praxis.model.dto.Proveedores;

public interface ProveedoresDAO {
	void crear(Proveedores p); // crea Proveedor
	Proveedores read(int id);// lee proveedor 
	List<Proveedores> read(); //muestra listado de Proveedor
	void update(Proveedores p);//Actualizacion de Proveedor
	void delete(int id); // elimina proveedor
	
	
	
	

}
