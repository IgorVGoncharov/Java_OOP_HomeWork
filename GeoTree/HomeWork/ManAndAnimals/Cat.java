

public class Cat extends Animals implements Say{

    public Cat(String name, Integer age, String color) {
        super(name, age, color);
    }
    
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println(super.getName() + " мяукает...");
    }

    @Override
    public void reactionForCall(Man man) {
        if (man.random.nextInt(2) == 0){
            System.out.println(super.getName() + " откликается и подбегает...");
        }
        else{
            System.out.println(super.getName() + " нагло зевает и продолжает лежать.");
        }
    }
    
    @Override
    public void wantToEat() {
        System.out.println(super.getName() + " подходит и начинает тереться о ноги...");
    }


}
