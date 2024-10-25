public class Employee {
    private String name;
    private String gender;
    private String birthdate; // Giả sử định dạng "yyyy-MM-dd"

    public Employee(String name, String gender, String birthdate) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return name + ", " + gender + ", " + birthdate;
    }
}
