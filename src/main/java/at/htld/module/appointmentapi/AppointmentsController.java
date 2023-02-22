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
        return appointmentsList;
    }

    @GetMapping("/findByName/{name}")
    public Appointments findByName(@PathVariable String name){
        return appointmentRepository.findByName(name);
    }

    @GetMapping("/findByDate/{date}")
    public Appointments findByDate(@PathVariable Date date){
        return appointmentRepository.findByDate(date);
    }

    @GetMapping("/add")
    public Appointments add (@RequestBody Appointments appointments) {
        appointmentRepository.save(appointments);
        return appointments;
    }
}
