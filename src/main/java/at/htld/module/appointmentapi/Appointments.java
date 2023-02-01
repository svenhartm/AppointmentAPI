package at.htld.module.appointmentapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Appointments {
    @Id
    private String id;
    private Date date = new Date();
    private String name;
    private String illness;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getIllness() {return illness;}
    public void setIllness(String illness) {this.illness = illness;}
}
