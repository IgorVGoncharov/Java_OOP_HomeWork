// для каждого отдельного домашнего задания создаю новый обьект. 
//Считаю это правильно, т.к. по идее это не связанные задания.
// Если считаем их связанными, то можно human наследовать от Person.
//как лучше??

package ManAndCat;

import java.util.Random;

public class Human {
    private String fullName;
    private Integer age;

    public Human(String fullName, Integer age){
        this.fullName = fullName;
        this.age = age;
    }
    
    public Human(String fullName) {
        this.fullName = fullName;
    }

    public Human(){
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
  
    public void collingForCat(Cat cat){
        System.out.println(this.fullName + " решил позвать кота. " + cat.getName() + " кис кис кис...");
        cat.reactionForCalling();
    }

    public void patCat(Cat cat){
        System.out.println(this.fullName + " решил погладить кота. ");
        cat.reactionForPetCat();
    }

    public void reactionForCatWantsToEat(){
        int res = random.nextInt(1);
        if (res == 0){
            System.out.println(this.fullName + " продолжает лежать на диване и игнорирует кота.\n");
        }
        else{
            System.out.println(this.fullName + " идет и накладывает коту еду.\n");
        }

    }

    public void reactionForCatPeed(){
        int res = random.nextInt(2);
        if (res == 0){
            System.out.println("Кот получает этим же тапком.....\n");
        }
        else if (res == 1){
            System.out.println(this.fullName + " молча убирает за котом. Ругать бесполезно....\n");
        }
        else{
            System.out.println(this.fullName + " продолжает лежать на диване. Тапок жены))) Придет, пусть сама разбирается....\n");
        }
    }
    
    public void reactionForCatComeInNight(){
        int res = random.nextInt(2);
        if (res == 0){
            System.out.println(this.fullName + " продолжает крепко спать....\n");
        }
        else if (res == 1){
            System.out.println(this.fullName + " просыпается, гладит кота и снова засыпает....\n");
        }
        else{
            System.out.println(this.fullName + " сгоняет кота с дивана....\n");
        }
    }    
}
