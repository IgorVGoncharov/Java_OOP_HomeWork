package GeoTree;
import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    

    public void append(Person firstPerson, Relationship relationship, Person secPerson) {
        if (relationTry(firstPerson, secPerson)){
            System.out.println("Между " + firstPerson + " и " + secPerson + " уже есть родственная связь!");
        }
        else{
            tree.add(new Node(firstPerson, relationship, secPerson));
            if ((firstPerson.getSex() == secPerson.getSex()) && (relationship == Relationship.brother || relationship == Relationship.sister)) {
                tree.add(new Node(secPerson, relationship, firstPerson));
            }
            else{
                tree.add(new Node(secPerson, relationship.getConnection() , firstPerson));
            }
        }

    }
    
    public boolean relationTry(Person firstPerson, Person secPerson){
        for (Relationship relations : Relationship.values()) {
            for (Node node : tree) {
                if(node.p1.equals(firstPerson) && node.p2.equals(secPerson) && node.re == relations){
                    return true;
                }
            }
        }
        return false;
    }

}
