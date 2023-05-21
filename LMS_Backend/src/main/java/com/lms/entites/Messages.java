package com.lms.entites;

import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Messages {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int messageId;
	@OneToOne
	@JoinColumn(name="sender")
	private User sender;
	@ManyToOne
	@JoinColumn(name="receiver")
	private User receiver;
	private String content;
	private LocalTime timeStamp;
}
