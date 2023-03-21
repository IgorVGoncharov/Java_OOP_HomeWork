package GeoTree;

public class Person {
    private String fullName;
    private Sex sex;
    private Integer birthYear;//


    public Person(String fullName, Sex sex, Integer birthYear) {
        this.fullName = fullName;
        this.sex = sex;
        this.birthYear = birthYear;
    }

    public Person(String fullName, Sex sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public Person (String fullName, Integer birthYear){
        this.fullName = fullName;
        this.birthYear = birthYear;
    }


    public Person (String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName() {
        return fullName;
    }


    public Sex getSex() {
        return sex;
    }
    
    public Integer getbirthYear() {
        return birthYear;
    }

}

