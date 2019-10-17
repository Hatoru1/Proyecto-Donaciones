package com.proyecto.donante;

import java.text.SimpleDateFormat;
import com.proyecto.entidad.Donante;
import com.proyecto.modelo.ModeloDonante;


public class AdicionarMedicamento {

	public static void main(String[] args) {

		try {
			
			Donante me=new Donante();
			me.setNomDonante("Carlos");
			me.setApeDonante("Castro");
			me.setFecnacDonante(new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-03"));
			me.setDeparDonante("Lima");
			me.setDisDonante("Lince");
			me.setCorreoDonante("ejemplo@gmail.com");
			me.setDirDonante("San Carlos");
			me.setCelDonante(967777522);
			me.setDniDonante(12345678);
			me.setCarnetDonante(12);
			me.setUsuDonante("nuevo");
			me.setContraDonante("123");

			new ModeloDonante().AdicionarDonante(me);
			System.out.println("Registrado correctamente");

				} catch (Exception e) {
					e.printStackTrace();
				}


	}

}