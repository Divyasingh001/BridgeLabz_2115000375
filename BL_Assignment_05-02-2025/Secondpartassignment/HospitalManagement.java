import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting " + patient.getName());
        } else {
            System.out.println(patient.getName() + " is not assigned to Dr. " + name);
        }
    }
}
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
}

class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in Hospital:");
        for (Doctor doc : doctors) {
            System.out.println("- " + doc.getName());
        }
    }

    public void showPatients() {
        System.out.println("Patients in Hospital:");
        for (Patient pat : patients) {
            System.out.println("- " + pat.getName());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        drSmith.addPatient(alice);
        drSmith.addPatient(bob);
        drJones.addPatient(bob);
        hospital.showDoctors();
        hospital.showPatients();

        drSmith.consult(alice);
        drJones.consult(bob);
        drJones.consult(alice); 
    }
}
