package com.nomApplication.persistance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NomModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String attributChat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttributChat() {
		return attributChat;
	}

	public void setAttributChat(String attributChat) {
		this.attributChat = attributChat;
	}

	public NomModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NomModel(Long id, String attributChat) {
		super();
		this.id = id;
		this.attributChat = attributChat;
	}
	
}
