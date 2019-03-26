package com.evry.dao;

import java.util.List;

import com.evry.model.Patient;

public interface PatientDao {
public void addPatient(Patient patient);
public List<Patient> getAllPatients();
}
