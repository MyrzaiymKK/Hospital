package Service;

import Groups.Doctor;

public interface DoctorService {
   void AddDoctorToHospital();
   Doctor[] getAllDoctors();
   String updateDoctorById();
   void deleteDoctorByName();

}
