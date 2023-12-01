package Service.Impl;

import DataBasee.DataBase;
import Groups.Patient;
import Service.PatientService;

import java.util.Arrays;
import java.util.Scanner;

public class PatientImpl implements PatientService {

    @Override
    public void addPatientToDoctor() {
     Patient patient = new Patient();
     Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Doctor: ");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            for (int j = 0; j < DataBase.hospitals[i].doctors.length; j++) {
               if(DataBase.hospitals[i].doctors[j].getFirstName().equalsIgnoreCase(name)){
                   System.out.println("Write name of Patient: ");
                   String namee = scanner.nextLine();
                   patient.setFullName(namee);

                   System.out.println("Write date of Burth: ");
                   String date = scanner.nextLine();
                   patient.setDateOfBurthPat(date);

                   System.out.println("Write gender: ");
                   String gender = scanner.nextLine();
                   patient.setGender(gender);

                   System.out.println("Write email: ");
                   String email = scanner.nextLine();
                   patient.setEmail(email);

                   DataBase.hospitals[i].doctors[j].patients = Arrays.copyOf(DataBase.hospitals[i].doctors[j].patients,DataBase.hospitals[i].doctors[j].patients.length + 1);
                   DataBase.hospitals[i].doctors[j].patients[DataBase.hospitals[i].doctors[j].patients.length - 1] = patient;

               }
            }
        }
    }

    @Override
    public void  getAllPatient() {
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            for (int j = 0; j < DataBase.hospitals[i].doctors.length; j++) {
                for (int k = 0; k < DataBase.hospitals[i].doctors[j].patients.length; k++) {
                    System.out.println(DataBase.hospitals[i].doctors[j].patients[k]);
                }
            }
        }

    }

    @Override
    public String updateName() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Patient: ");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            for (int l = 0; l < DataBase.hospitals[i].doctors.length; l++) {
                for (int k = 0; k < DataBase.hospitals[i].doctors[l].patients.length; k++) {
                    if(name.equalsIgnoreCase(DataBase.hospitals[i].doctors[l].patients[k].getFullName())){
                        System.out.println("Write new name Patient: ");
                        String newName = scanner.nextLine();
                        DataBase.hospitals[i].doctors[l].patients[k].setFullName(newName);
                        return DataBase.hospitals[i].doctors[l].patients[k].getFullName();
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void deleteByName() {

    }


}
