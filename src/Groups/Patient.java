package Groups;

public class Patient {
    String FullName;
    String dateOfBurthPat;
    String gender;
    String email;

    public Patient() {
    }

    public Patient(String fullName, String dateOfBurthPat, String gender, String email) {
        FullName = fullName;
        this.dateOfBurthPat = dateOfBurthPat;
        this.gender = gender;
        this.email = email;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getDateOfBurthPat() {
        return dateOfBurthPat;
    }

    public void setDateOfBurthPat(String dateOfBurthPat) {
        this.dateOfBurthPat = dateOfBurthPat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "FullName='" + FullName + '\'' +
                ", dateOfBurthPat='" + dateOfBurthPat + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
