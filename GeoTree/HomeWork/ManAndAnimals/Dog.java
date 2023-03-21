

public class Dog extends Animals implements BringAStick  {

    public Dog(String name, Integer age, String color) {
        super(name, age, color);
    }
    
    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println(super.getName() + " гавкает...");
    }

    @Override
    public void bringAStick() {
        System.out.println(super.getName() + " приносит палку. И довольно машет хвостом");
    }

    @Override
    public void reactionForCall(Man man) {
        if (man.random.nextInt(2) == 0){
            System.out.println(super.getName() + " лишь слегка приоткрывает глаза и продолжает лежать дальше...");
        }
        else{
            System.out.println(super.getName() + " подбегает, становиться на задние лапы и весело виляет хвостом");
        }
    }

    @Override
    public void wantToEat() {
        System.out.println(super.getName() + " идет к своей миске и мордой начинает двигать ее по полу....");
    }




}   
