
package com.tekup.project_erh.model;


import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import java.time.LocalDate;  // Import LocalDate from java.time package

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "ville")
    private String ville;

    @Column(name = "logo")
    private String logo;
    
    public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "pays")
    private String pays;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "date_creation")
    private LocalDate  dateCreation;

    @Column(name = "domaine_activite")
    private String domaineActivite;
    
    @OneToMany(mappedBy = "entreprise")
    @JsonIgnore
    private List<User> users;
	
    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL)
    private List<Project> projects;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	public Entreprise(Long id, String nom, String adresse, String ville, String logo, String pays, String email,
			String telephone, LocalDate dateCreation, String domaineActivite, List<User> users,
			List<Project> projects) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.logo = logo;
		this.pays = pays;
		this.email = email;
		this.telephone = telephone;
		this.dateCreation = dateCreation;
		this.domaineActivite = domaineActivite;
		this.users = users;
		this.projects = projects;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public String getDomaineActivite() {
		return domaineActivite;
	}

	public void setDomaineActivite(String domaineActivite) {
		this.domaineActivite = domaineActivite;
	}

	
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", ville=" + ville + ", pays=" + pays
				+ ", email=" + email + ", telephone=" + telephone + ", dateCreation=" + dateCreation
				+ ", domaineActivite=" + domaineActivite + "]";
	}
    
    
    
}