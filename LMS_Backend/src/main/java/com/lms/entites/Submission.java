package com.lms.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Submission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int submissionId;
	@OneToOne
	@JoinColumn(name="assignment")
	private Assignment assignment;
	@OneToOne
	@JoinColumn(name="student")
	private User student;
	

}
