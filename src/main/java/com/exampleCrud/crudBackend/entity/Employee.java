package com.exampleCrud.crudBackend.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 

@Entity
@Table(name="employees")
public class Employee {
	@Id // 'id' is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 'idUi' is another generated unique identifier, but not the primary key
	//@GeneratedValue(strategy = GenerationType.UUID)
//	private UUID idUi;
	@Column(name = "first_name")
	private String firstName;
	@Column (name = "last_name")
	private String lastName;
	@Column (name = "email_id", nullable = false , unique = true)
	private String email;
	

}
