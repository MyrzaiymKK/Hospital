package Service;

import Groups.Hospital;
import Service.Impl.HospitalImpl;

public interface HospitalService {
    public Hospital[] register();

    public Hospital login();
    public Hospital getHospitalByName();
    public void getAllHospital();
}
