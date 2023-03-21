

import java.util.Collections;
import java.util.Random;

public class Man {
    private String fullName;
    private Integer age;

    public Man(String fullName, Integer age){
        this.fullName = fullName;
        this.age = age;
    }
    
    public Man(String fullName) {
        this.fullName = fullName;
    }

    public Random random = new Random();
    
    public Integer getAge(){
        return age;
    }
    
    public void setAge(Integer age){
        this.age = age;
    }

    public String getFullName(){
        return fullName;
    }

    public void callingForCat(Cat cat){
        System.out.println(this.getFullName() + " зовет кота. " + cat.getName() + " кис кис...");
    }

    public void callingForGDog(Dog dog){
        System.out.println(this.getFullName() + " зовет собаку. " + dog.getName() + "!");
    }

    public void takeEat(Animals animal){
        System.out.println(this.getFullName() + " накладывает корм. " + animal.getName() + " с удовольсвтием ест");
    }

    public void playingWithDog(Dog dog){
        System.out.println(this.getFullName() + " гуляет с собакой и бросает ей палку.");
    }

    public void whoMoreHungry(AnimalList animalList){
        Integer index = animalList.getAnimalList().size();
        System.out.println("Посмотрим, кто больше всего хочет есть...");
        Collections.sort(animalList.getAnimalList(), new AnimalsHungryComporator());
        for (Animals animals : animalList.getAnimalList()) {
            System.out.println(animals.getName() + " хочет есть на: " + animals.getHunger() + " ед");
        }
        System.out.println(animalList.getAnimalList().get(index-1).getName() + " хочет есть больше всех. Покормлю его первым!");

    }

    public void whoIsOlder(Animals a1, Animals a2){
        System.out.println("А кто же из нас старше, " + a1.getName() + " или " + a2.getName() + "?");
        Integer res =  a1.compareTo(a2);
        if (res < 0){
            System.out.println(a2.getName() + " - старше");
        }
        else if (res > 0){
            System.out.println(a1.getName() + " - старше");
        }
        else{
            System.out.println("Они одного возраста!");
        }    
    }
}
