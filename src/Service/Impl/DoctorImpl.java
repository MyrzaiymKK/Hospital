package Service.Impl;

import DataBasee.DataBase;
import Groups.Doctor;
import Service.DoctorService;

import java.util.Arrays;
import java.util.Scanner;

public class DoctorImpl implements DoctorService {
    @Override
    public void AddDoctorToHospital() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Hospital: ");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            if(name.equalsIgnoreCase(DataBase.hospitals[i].getName())){
            Doctor doctor = new Doctor();

                System.out.println("Write name of Doctor: ");
                String nameD = scanner.nextLine();
                doctor.setFirstName(nameD);

                System.out.println("Write date of Burth: ");
                String data = scanner.nextLine();
                doctor.setDateOfBurth(data);

                System.out.println("Write gender: ");
                String gender = scanner.nextLine();
                doctor.setGender(gender);

                System.out.println("Write email: ");
                String email = scanner.nextLine();
                doctor.setEmail(email);

                DataBase.hospitals[i].doctors = Arrays.copyOf(DataBase.hospitals[i].doctors,DataBase.hospitals[i].doctors.length +1);
                DataBase.hospitals[i].doctors[DataBase.hospitals[i].doctors.length-1] = doctor;


            }
        }

    }

    @Override
    public Doctor[] getAllDoctors() {
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            for (int j = 0; j < DataBase.hospitals[i].doctors.length; j++) {
                return DataBase.hospitals[i].getDoctors();
            }
        }
        return null ;
    }

    @Override
    public String updateDoctorById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Doctor: ");
        String updaten = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            for (int j = 0; j < DataBase.hospitals[i].doctors.length; j++) {
                if(updaten.equalsIgnoreCase(DataBase.hospitals[i].doctors[j].getFirstName())){
                    System.out.println("Write new name: ");
                    String nameee = scanner.nextLine();
                    DataBase.hospitals[i].doctors[j].setFirstName(nameee);
                    return DataBase.hospitals[i].doctors[j].getFirstName();
                }

            }
        }
       return null;
    }

    @Override
    public void deleteDoctorByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Doctor: ");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            for (int j = 0; j < DataBase.hospitals[i].doctors.length; j++) {
                if(name.equalsIgnoreCase(DataBase.hospitals[i].doctors[j].getFirstName())){
                    for (int k = 0; k < DataBase.hospitals[i].doctors.length - 1; k++) {
                        DataBase.hospitals[i].doctors[k] = DataBase.hospitals[i].doctors[k+1];
                    }

                }
            }
            DataBase.hospitals[i].setDoctors(Arrays.copyOf(DataBase.hospitals[i].doctors,DataBase.hospitals[i].doctors.length-1));
        }

    }
}
