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
@Table(name="tb_voluntario")

public class Voluntario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_voluntario")
	private int codVoluntario;
	
	@Column(name="nom_voluntario")
	private String nomVoluntario;
	
	@Column(name="ape_pat_voluntario")
	private String apePaternov;
	
	@Column(name="ape_mat_voluntario")
	private String apeMaternov;
	
	@Column(name="fec_nac_voluntario")
	@Temporal(TemporalType.DATE)
	private Date fecnacVoluntario;
	
	@Column(name="numero_documento_identidad")
	private int numeroDocumento;
	
	@Column(name="correo_voluntario")
	private String correoVoluntario;
	
	@Column(name="numero_celular")
	private int numeroCelular;

	
	@Column(name="dir_voluntario")
	private String dirVoluntario;
	
	@Column(name="usuario_voluntario")
	private String usuarioVoluntario;
	
	@Column(name="pass_voluntario")
	private String passVoluntario;

	public int getCodVoluntario() {
		return codVoluntario;
	}

	
	
	public void setCodVoluntario(int codVoluntario) {
		this.codVoluntario = codVoluntario;
	}

	public String getNomVoluntario() {
		return nomVoluntario;
	}

	public void setNomVoluntario(String nomVoluntario) {
		this.nomVoluntario = nomVoluntario;
	}

	public String getApePaternov() {
		return apePaternov;
	}

	public void setApePaternov(String apePaternov) {
		this.apePaternov = apePaternov;
	}

	public String getApeMaternov() {
		return apeMaternov;
	}

	public void setApeMaternov(String apeMaternov) {
		this.apeMaternov = apeMaternov;
	}

	public Date getFecnacVoluntario() {
		return fecnacVoluntario;
	}

	public void setFecnacVoluntario(Date fecnacVoluntario) {
		this.fecnacVoluntario = fecnacVoluntario;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getCorreoVoluntario() {
		return correoVoluntario;
	}

	public void setCorreoVoluntario(String correoVoluntario) {
		this.correoVoluntario = correoVoluntario;
	}

	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getDirVoluntario() {
		return dirVoluntario;
	}

	public void setDirVoluntario(String dirVoluntario) {
		this.dirVoluntario = dirVoluntario;
	}

	public String getUsuarioVoluntario() {
		return usuarioVoluntario;
	}

	public void setUsuarioVoluntario(String usuarioVoluntario) {
		this.usuarioVoluntario = usuarioVoluntario;
	}

	public String getPassVoluntario() {
		return passVoluntario;
	}

	public void setPassVoluntario(String passVoluntario) {
		this.passVoluntario = passVoluntario;
	}
	
	
	
}
