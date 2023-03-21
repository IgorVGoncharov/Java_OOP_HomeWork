import java.util.Comparator;

public class AnimalsHungryComporator implements Comparator<Animals>{

    @Override
    public int compare(Animals o1, Animals o2) {
       return o1.getHunger() - o2.getHunger();
    }
    
}
