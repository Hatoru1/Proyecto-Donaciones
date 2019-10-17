package com.proyecto.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tb_donante")

public class Donante implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_donante")
	private int codDonante;
	@Column(name="nom_donante")
	private String nomDonante;
	@Column(name="ape_donante")
	private String apeDonante;
	@Column(name="fec_nac_donante")
	@Temporal(TemporalType.DATE)
	private Date fecnacDonante;
	
	@Column(name="departamento_donante")
	private String deparDonante;
	@Column(name="distrito_donante")
	private String disDonante;
	@Column(name="correo_donante")
	private String correoDonante;
	@Column(name="dir_donante")
	private String dirDonante;
	
	@Column(name="numero_celular")
	private int celDonante;
	@Column(name="dni_donante")
	private int dniDonante;
	@Column(name="carnet_extranjeria_donante")
	private int carnetDonante;
	@Column(name="usuario_donante")
	private String usuDonante;
	@Column(name="pass_donante")
	private String contraDonante;
	
	
	
	public int getCodDonante() {
		return codDonante;
	}
	public void setCodDonante(int codDonante) {
		this.codDonante = codDonante;
	}
	public String getNomDonante() {
		return nomDonante;
	}
	public void setNomDonante(String nomDonante) {
		this.nomDonante = nomDonante;
	}
	public String getApeDonante() {
		return apeDonante;
	}
	public void setApeDonante(String apeDonante) {
		this.apeDonante = apeDonante;
	}
	public Date getFecnacDonante() {
		return fecnacDonante;
	}
	public void setFecnacDonante(Date fecnacDonante) {
		this.fecnacDonante = fecnacDonante;
	}
	public String getDeparDonante() {
		return deparDonante;
	}
	public void setDeparDonante(String deparDonante) {
		this.deparDonante = deparDonante;
	}
	public String getDisDonante() {
		return disDonante;
	}
	public void setDisDonante(String disDonante) {
		this.disDonante = disDonante;
	}
	public String getCorreoDonante() {
		return correoDonante;
	}
	public void setCorreoDonante(String correoDonante) {
		this.correoDonante = correoDonante;
	}
	public String getDirDonante() {
		return dirDonante;
	}
	public void setDirDonante(String dirDonante) {
		this.dirDonante = dirDonante;
	}
	public int getCelDonante() {
		return celDonante;
	}
	public void setCelDonante(int celDonante) {
		this.celDonante = celDonante;
	}
	public int getDniDonante() {
		return dniDonante;
	}
	public void setDniDonante(int dniDonante) {
		this.dniDonante = dniDonante;
	}
	public int getCarnetDonante() {
		return carnetDonante;
	}
	public void setCarnetDonante(int carnetDonante) {
		this.carnetDonante = carnetDonante;
	}
	public String getUsuDonante() {
		return usuDonante;
	}
	public void setUsuDonante(String usuDonante) {
		this.usuDonante = usuDonante;
	}
	public String getContraDonante() {
		return contraDonante;
	}
	public void setContraDonante(String contraDonante) {
		this.contraDonante = contraDonante;
	}
	
	
	
	
	

}
