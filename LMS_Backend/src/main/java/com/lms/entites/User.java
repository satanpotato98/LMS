package com.lms.entites;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lms.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String username;
	private String password;
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	@OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("receiver")
	private List<Messages> messageRecieved;
}
