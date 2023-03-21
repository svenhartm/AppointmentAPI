package at.htld.module.appointmentapi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Appointments {

    @Id
    private String id;
    private String day;
    private String slot;
    private String doctor;
    private String patient;
    private String illness;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getDay() {return day;}
    public void setDay(String day) {this.day = day;}

    public String getSlot() {return slot;}
    public void setSlot(String slot) {this.slot = slot;}

    public String getDoctor() {return doctor;}
    public void setDoctor(String doctor) {this.doctor = doctor;}

    public String getPatient() {return patient;}
    public void setPatient(String patient) {this.patient = patient;}

    public String getIllness() {return illness;}
    public void setIllness(String illness) {this.illness = illness;}


}
