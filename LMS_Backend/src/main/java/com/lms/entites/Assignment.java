package com.lms.entites;

import java.time.LocalDate;

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
public class Assignment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int assignmentId;
	@OneToOne
	@JoinColumn(name="course")
	private Courses course;
	private String name;
	private LocalDate dueDate;
	

}
