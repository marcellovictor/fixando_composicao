package entities;

import java.util.Date;
import util.DateFormats;

public class Client {

	//Atributos:
	
	private String name;
	private String email;
	private Date birthDate;
	
	//Construtores:
	
	public Client() {
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	//Getters e Setters:
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	//Métodos: 
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " ");
		sb.append("(" + DateFormats.standard.format(birthDate) + ") ");
		sb.append("- " + email);
		return sb.toString();
	}
	
	
}
