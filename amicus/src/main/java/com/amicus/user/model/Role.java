package com.amicus.user.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 권한
 * @author socoolheeya
 * @since 2018.08.11
 */

@Entity
@Table(name = "t_role")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@ManyToMany(mappedBy="roles")
	private List<User> users = new ArrayList<>();
	
	public Role() {}
	
	public Role(String name) {
		this.name = name;
	}
	
	public Role(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Role(Long id, String name, List<User> users) {
		this.id = id;
		this.name = name;
		this.users = users;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
