package ManAndCupboard;

import GeoTree.Sex;

public class CupboardMain {
    public static void main(String[] args) {
        Man Igor = new Man("Игорь", Sex.male);
        Man Marina = new Man("Марина", Sex.female);
        Cupboard cupboard = new Cupboard("Белый");
        Igor.openDor(cupboard);
        Igor.addItem("Майка", cupboard);
        Igor.addItem("Рубашка", cupboard);
        Marina.openDor(cupboard);
        Marina.addItem("Юбка", cupboard);
        Marina.addItem("Платье", cupboard);
        Marina.closeDor(cupboard);
        Igor.addItem("Штаны", cupboard);
        Igor.openDor(cupboard);
        Igor.addItem("Штаны", cupboard);
        Igor.whatInCupboard(cupboard);
        Marina.removeItem("Юбка", cupboard);
        Marina.closeDor(cupboard);
        Igor.whatInCupboard(cupboard);
        Igor.removeItem("Штаны", cupboard);
        Igor.openDor(cupboard);
        Igor.removeItem("Штаны", cupboard);
        Igor.whatInCupboard(cupboard);
        Igor.closeDor(cupboard);
        Marina.closeDor(cupboard);
        



    }
    
    

}
