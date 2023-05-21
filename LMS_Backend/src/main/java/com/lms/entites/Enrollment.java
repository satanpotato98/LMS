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
public class Enrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enrollmentId;
	@OneToOne
	@JoinColumn(name="course")
	private Courses course;
	@OneToOne
	@JoinColumn(name="student")
	private User student;
	
}
