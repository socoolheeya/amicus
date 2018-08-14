package com.amicus.user.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/**
 * 사용자
 * @author socoolheeya
 * @since 2018.08.11
 */

@Entity
@Table(name = "t_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 255, unique = true)
	private String email;
	
	@Column(nullable = false, length = 500)
	private String password;
	
	@Column(length = 50)
	private String name;
	
	@Column(length = 8)
	private String birthday;
	
	@Column(length = 50)
	private String position;
	
	@Column(length = 50)
	private String grade;
	
	private LocalDateTime createdt;
	
	private LocalDateTime updatedt;
	
	@Column(name = "confirm_yn", length = 1)
	private String confirmYn;
	
	@Column(name = "del_yn", length = 1)
	private String delyn;
	
	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "t_user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private List<Role> roles = new ArrayList<>();
	
	public User() {}
	
	public User(String email) {
		this.email = email;
	}
	
	public User(String email, List<Role> role) {
		this.email = email;
		this.roles = role;
	}
	
	public User(Long id, String email, List<Role> role) {
		super();
		this.id = id;
		this.email = email;
		this.roles = role;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public LocalDateTime getCreatedt() {
		return createdt;
	}

	public void setCreatedt(LocalDateTime createdt) {
		this.createdt = createdt;
	}

	public LocalDateTime getUpdatedt() {
		return updatedt;
	}

	public void setUpdatedt(LocalDateTime updatedt) {
		this.updatedt = updatedt;
	}
	
	public String getConfirmYn() {
		return confirmYn;
	}

	public void setConfirmYn(String confirmYn) {
		this.confirmYn = confirmYn;
	}
	
	public String getDelyn() {
		return delyn;
	}

	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@PrePersist
	protected void prePersist() {
		this.createdt = this.updatedt = LocalDateTime.now();
	}

	@PreUpdate
	protected void preUpdate() {
		this.updatedt = LocalDateTime.now();
	}
	
	public String toString() {
		return String.format("id: %d, email: %s, password: %s, name: %s, birthday: %s", id, email, password, name, birthday);
	}
}
