import DataBasee.DataBase;
import Service.Impl.DoctorImpl;
import Service.Impl.HospitalImpl;
import Service.Impl.PatientImpl;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        HospitalImpl hospital = new HospitalImpl();
        DoctorImpl doctor = new DoctorImpl();
        PatientImpl patient = new PatientImpl();

   while (true){
       System.out.println("""
               1.Register
               2.Login
               3.Get Hospital By Name;
               4.Get all Hospital
               5.Add doctor to Hospital;
               6.Get all doctors;
               7.Update Doctor by Name
               8.Delete Doctor by name
               9.Add Patient to Doctor
               10.Get all Patient
               11.Update Patient by Name 
               12.Delete Patient by Name 
              
               """);
       switch (scanner.nextLine()){
           case"1"->{
             hospital.register();
           }
           case"2"->{
               hospital.login();
           }
           case"3"->{
               System.out.println(hospital.getHospitalByName());
           }
           case"4"->{
               hospital.getAllHospital();
           }
           case"5"->{
               doctor.AddDoctorToHospital();
           }
           case"6"->{
               System.out.println(doctor.getAllDoctors());
           }
           case"7"->{
               doctor.updateDoctorById();
           }
           case"8"->{
               doctor.deleteDoctorByName();
           }
           case "9"->{
               patient.addPatientToDoctor();
           }
           case "10"->{
               patient.getAllPatient();
           }
           case"11"->{
               patient.updateName();
           }
           case"12"->{
               patient.deleteByName();
           }
       }
   }


    }
}