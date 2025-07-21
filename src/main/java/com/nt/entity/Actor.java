package com.nt.entity;

import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="ACTOR")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Actor {
	
	@Id
	@SequenceGenerator(name="gen1",sequenceName="AID_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	@Column(name="AID")
	private Integer actorId;
	
	@NonNull
	@Column(name="ACTOR_NAME",length=20)
	private String actorName;
	
	@NonNull
	@Column(name="ACTOR_TYPE",length=20)
	private String actorType;
	
	@NonNull
	@Column(name="DOB")
	private LocalDate dob;
	
	@NonNull
	@Column(name="TOB")
	private LocalTime tob;
	
	@NonNull
	@Column(name="STARTED_ON")
	private LocalDateTime startedOn;
}

