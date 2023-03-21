package ManAndCat;

import java.util.Random;

public class Cat {
    private String name;
    private String color;
    private Integer age;

    public Cat(String name, String color,Integer age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Cat(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
    }

    public Random random = new Random();
    

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void reactionForCalling(){
        int res = random.nextInt(20);
        if (res%2 == 0){
            System.out.println(this.name + " откликается и подбегает...\n");
        }
        else{
            System.out.println("Нагло зевает и продолжает лежать.\n");
        }
    }

    public void reactionForPetCat(){
        int res = random.nextInt(3);
        if (res == 0){
            System.out.println(this.name + " щурит глаза и мурлычит...\n");
        }
        else if (res == 1){
            System.out.println(this.name + " отпихивает руку и убегает...\n");
        }
        else{
            System.out.println(this.name + " начинает кусаться и царапаться...\n");
        }
    }

    public void catWantsToEat(Human name){
        System.out.println(this.name + " захотел есть и начал мяукать...");
        name.reactionForCatWantsToEat();
    }

    public void catPeed(Human name){
        System.out.println(this.name + " нагадил в коридоре в тапок...");
        name.reactionForCatPeed();
    }

    public void catComeInNight(Human name){
        System.out.println(this.name + " залез ночью на подушку и начал мурчать...");
        name.reactionForCatComeInNight();
    }
}