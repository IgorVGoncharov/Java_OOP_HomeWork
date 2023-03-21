

public class ResidentPerson extends Peoples{
    
    public ResidentPerson(String fullName, Sex sex, Integer birthYear) {
        super(fullName, birthYear, sex);
    }

    public ResidentPerson(String fullName, Integer birthYear) {
        super(fullName, birthYear);
    }

    public ResidentPerson(String fullName, Sex sex) {
        super(fullName, sex);
    }

    public ResidentPerson(String fullName) {
        super(fullName);
    } 
}
