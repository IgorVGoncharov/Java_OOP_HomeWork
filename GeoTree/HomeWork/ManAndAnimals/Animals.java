
import java.util.Random;

public abstract class Animals implements Comparable<Animals>{
    private String name;
    private Integer age;
    private String color;
    private Integer hunger;
    
    Random random = new Random();
    
    public Animals(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hunger = random.nextInt(100);
    }
    
    public Animals(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.hunger = random.nextInt(100);
    }
      
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public Integer getHunger() {
        return hunger;
    }
    
    public void setHunger(Integer hunger) {
        this.hunger = hunger;
    }
    
    public abstract void reactionForCall(Man man);
    public abstract void wantToEat();

    @Override
    public int compareTo(Animals o) {
        return this.getAge() - o.getAge();
    }
    
    
}
