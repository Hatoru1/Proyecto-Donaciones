package com.proyecto.modelo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.proyecto.entidad.Donante;

public class ModeloDonante {

////declara un objeto para invocar la unidad de persistencia 
	//que se encuentra en el archivo persistence.xml
	EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("PE");

	
	public void AdicionarDonante(Donante don){
		EntityManager em=fabrica.createEntityManager();
		try {
		  em.getTransaction().begin();
		  em.persist(don);
		  em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
			fabrica.close();
		}
	}
	
	
//public List<Donante> IniciarSesion(String usu, String contra){
//	EntityManager em=fabrica.createEntityManager();
//	List<Donante> datos=null;
//	TypedQuery<Donante>consulta=null;
//	try {
//		String hql="select d from Donante d where d.usuDonante=?1 and d.contraDonante=?2)";
//		consulta=em.createQuery(hql,Donante.class);
//		consulta.setParameter(1, usu);
//		consulta.setParameter(2, contra);
//		datos=consulta.getResultList();
////		if (!lista.isEmpty()){
////			datos = lista.get(0);
////		}
//	} catch (Exception e) {
//		e.printStackTrace();
//	}finally {
//		em.close();
//		fabrica.close();
//	}
//	return datos;
//}

public void verificarDatos(Donante donante){
	EntityManager em=fabrica.createEntityManager();
	TypedQuery<Donante>consulta=null;
	List<Donante> datos=null;
	Donante don=null;
	try {
		
		String hql= "FROM Donante where usuDonante = '" + donante.getUsuDonante() + "' and contraDonante = '" + donante.getContraDonante() + "'";
		consulta = em.createQuery(hql,Donante.class);
		datos=consulta.getResultList();
//		if (!lista.isEmpty()){
//		datos = lista.get(0);
//	}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}finally {
		em.close();
		fabrica.close();
	}
}


}
