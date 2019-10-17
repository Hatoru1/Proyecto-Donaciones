package com.proyecto.action;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.proyecto.entidad.Donante;
import com.proyecto.modelo.ModeloDonante;

@ManagedBean (name="CRUDDonante")
public class DonanteAction {
	
	
	//objeto para listAR TODOS LOS MEDICAMENTOS
	private List<Donante>listaDonante; 
	
private Donante donante;

public DonanteAction(){
donante=new Donante();	
}
	
	//un metodo para registrar los datos
	public String IngresarDonante(){
		String redireccion=null;
		new ModeloDonante().verificarDatos(donante);
		redireccion ="/ui/bienvenido";
		return redireccion;
	}

	public Donante getDonante() {
		return donante;
	}

	public void setDonante(Donante donante) {
		this.donante = donante;
	}

	public List<Donante> getListaDonante() {
		return listaDonante;
	}

	public void setListaDonante(List<Donante> listaDonante) {
		this.listaDonante = listaDonante;
	}
	
	
	

}
