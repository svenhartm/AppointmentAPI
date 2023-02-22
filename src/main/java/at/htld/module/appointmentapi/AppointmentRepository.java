package at.htld.module.appointmentapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointments, String> {

    Appointments findByName(String name);

    Appointments findByDate(Date date);
}
