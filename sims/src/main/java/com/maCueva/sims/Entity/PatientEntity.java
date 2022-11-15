package com.maCueva.sims.Entity;


import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "tbl_patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PatientId;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "UserId")
	private UserEntity User;
    private double weight;
    private String height;

    public PatientEntity() {
    }

	public PatientEntity(int patientId, UserEntity user, double weight, String height) {
		super();
		PatientId = patientId;
		User = user;
		this.weight = weight;
		this.height = height;
	}

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public UserEntity getUser() {
		return User;
	}

	public void setUser(UserEntity user) {
		User = user;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
