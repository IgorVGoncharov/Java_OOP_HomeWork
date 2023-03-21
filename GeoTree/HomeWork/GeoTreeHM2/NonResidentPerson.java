

public class NonResidentPerson extends Peoples {
    private String countryOfResidence;

    
    public NonResidentPerson(String fullName, String countryOfResidence, Sex sex, Integer birthYear) {
        super(fullName, birthYear, sex);
        this.countryOfResidence = countryOfResidence;
    }
    
    public NonResidentPerson(String fullName, String countryOfResidence, Integer birthYear) {
        super(fullName, birthYear);
        this.countryOfResidence = countryOfResidence;
    }
    
    public NonResidentPerson(String fullName, String countryOfResidence, Sex sex) {
        super(fullName, sex);
        this.countryOfResidence = countryOfResidence;
    }
    
    public NonResidentPerson(String fullName, String countryOfResidence) {
        super(fullName);
        this.countryOfResidence = countryOfResidence;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }
    
    
    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }
}
