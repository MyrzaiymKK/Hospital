package Groups;

import Groups.Doctor;

import java.util.Arrays;

public class Hospital {
    String name;
    String address;
   public Doctor [] doctors = new Doctor[0];

    public Hospital() {
    }

    public Hospital(String name, String address, Doctor[] doctors) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", doctors=" + Arrays.toString(doctors) +
                '}';
    }
}
