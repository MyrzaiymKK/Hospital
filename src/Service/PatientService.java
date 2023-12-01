package Service;

import Groups.Patient;

public interface PatientService {
    void addPatientToDoctor();
    void getAllPatient();
    String updateName();
    void deleteByName();
}
