package at.htld.module.appointmentapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentsController {

    public List<Appointments> appointmentsList = new ArrayList<>();

    private final AppointmentRepository appointmentRepository;

    public AppointmentsController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @GetMapping("/findAll")
    public List<Appointments> findAll() {
        return appointmentRepository.findAll();
    }

    @GetMapping("/findByName/{patient}")
    public Appointments findByName(@PathVariable String patient){
        return appointmentRepository.findByPatient(patient);
    }

    @GetMapping("/findByDay/{day}")
    public Appointments findByDay(@PathVariable String day){
        return appointmentRepository.findByDay(day);
    }

    @PostMapping("/add")
    public Appointments add (@RequestBody Appointments appointments) {
        appointmentRepository.save(appointments);
        return appointments;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        appointmentRepository.deleteById(id);
        return "Deleted!";
    }
}
