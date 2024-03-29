package at.htld.module.appointmentapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointments, String> {

    Appointments findByPatient(String patient);

    Appointments findByDay(String day);
}
