package ManAndCat;

public class CatMain {
    public static void main(String[] args) {
        System.out.println("dd");
        Human igor = new Human("Игорь");
        Cat pushok = new Cat("Пушок");
        igor.collingForCat(pushok);
        igor.patCat(pushok);
        pushok.catWantsToEat(igor);
        pushok.catPeed(igor);
        pushok.catComeInNight(igor);
    }
}
