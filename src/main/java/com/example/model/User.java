package com.example.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.*;

@Entity(name = "tbl_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private long id;

	@Column(name = "col_name")
	private String name;

	@Column(name = "col_createdate")
	private LocalDate createDate;

	@Column(name = "col_password")
	private String password;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Collection<Role> role;

	@Column(name = "col_status")
	private String status;

	@Column(name = "col_updatedate")
	private LocalDate updateDate;

	@PrePersist
	public void prePersist() {
		createDate = LocalDate.now();
		updateDate = LocalDate.now();
	}

	@PreUpdate
	public void preUpdate() {
		updateDate = LocalDate.now();
	}

	public User() {
		super();
	}

	public User(long id, String name, LocalDate createDate, String password, Collection<Role> role, String status,
			LocalDate updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
		this.password = password;
		this.role = role;
		this.status = status;
		this.updateDate = updateDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRole() {
		return role;
	}

	public void setRole(Collection<Role> role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

}
