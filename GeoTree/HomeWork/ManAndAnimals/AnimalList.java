import java.util.ArrayList;

public class AnimalList {
    private ArrayList<Animals> animalList = new ArrayList<>();

    public ArrayList<Animals> getAnimalList(){
        return animalList;
    }

    public void append(Animals animals){
        if (!animalList.contains(animals)){
            animalList.add(animals);
        }
    }
    
}