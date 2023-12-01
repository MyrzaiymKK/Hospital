package Service.Impl;

import DataBasee.DataBase;
import Groups.Hospital;
import Service.HospitalService;

import java.util.Arrays;
import java.util.Scanner;

public class HospitalImpl implements HospitalService {


    @Override
    public Hospital[] register() {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        System.out.println("Write name of hospital: ");
        String name = scanner.nextLine();
        hospital.setName(name);

        System.out.println("Write address of hospital: ");
        String address = scanner.nextLine();
        hospital.setAddress(address);

        DataBase.hospitals = Arrays.copyOf(DataBase.hospitals,DataBase.hospitals.length+1);
        DataBase.hospitals[DataBase.hospitals.length-1] = hospital;;
        return DataBase.hospitals;
    }

    @Override
    public Hospital login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name: ");
        String name = scanner.nextLine();

        System.out.println("Write address: ");
        String address = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            if(name.equalsIgnoreCase(DataBase.hospitals[i].getName())&&address.equalsIgnoreCase(DataBase.hospitals[i].getAddress())){
                return DataBase.hospitals[i];
            }
        }
                return null;
    }

    @Override
    public Hospital getHospitalByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of hospital for search: ");
        String nameHospital = scanner.nextLine();
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            if(nameHospital.equalsIgnoreCase(DataBase.hospitals[i].getName())){
                return DataBase.hospitals[i];
            }
        }
        return null;
    }

    @Override
    public void getAllHospital() {
        for (int i = 0; i < DataBase.hospitals.length; i++) {
            System.out.println(DataBase.hospitals[i]);
        }
    }
}
