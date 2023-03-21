

public class MAAmain {
   public static void main(String[] args) {
    
       Man Igor = new Man("Игорь");
       Cat cat = new Cat("Барсик", 5);
       Cat seccat = new Cat("Пушок", 1);
       Dog dog = new Dog("Дружок", 3);
       Dog secdog = new Dog ("Тузик", 2);
       AnimalList list = new AnimalList();
       list.append(cat);
       list.append(seccat);
       list.append(dog);
       list.append(secdog);
       Igor.whoMoreHungry(list);
       System.out.println();
       Igor.whoIsOlder(seccat, cat);
       
       //cat.wantToEat();
       //cat.voice();
       //Igor.takeEat(cat);
       //System.out.println("\n");
       //dog.wantToEat();
       //dog.voice();
       //Igor.takeEat(dog);
       //System.out.println("\n");
       //Igor.callingForCat(cat);
       //cat.reactionForCall(Igor);
       //System.out.println("\n");
       //Igor.callingForGDog(dog);
       //dog.reactionForCall(Igor);
       //System.out.println("\n");
       //Igor.playingWithDog(dog);
       //dog.bringAStick();
           
   }

    
}
