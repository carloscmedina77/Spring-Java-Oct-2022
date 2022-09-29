package com.caresoft.clinicapp;

public class Physician implements HIPAACompliantUser {

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}

}
//... imports class definition...

// Inside class:    
private ArrayList<String> patientNotes;

// TO DO: Constructor that takes an ID
// TO DO: Implement HIPAACompliantUser!

public void newPatientNotes(String notes, String patientName, Date date) {
    String report = String.format(
        "Datetime Submitted: %s \n", date);
    report += String.format("Reported By ID: %s\n", this.id);
    report += String.format("Patient Name: %s\n", patientName);
    report += String.format("Notes: %s \n", notes);
    this.patientNotes.add(report);
}

// TO DO: Setters & Getters
