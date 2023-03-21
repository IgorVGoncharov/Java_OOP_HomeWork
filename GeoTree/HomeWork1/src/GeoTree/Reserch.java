package GeoTree;
import java.util.ArrayList;

public class Reserch {
    private ArrayList<String> result = new ArrayList<>();
    private ArrayList<Node> tree;



    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName()) && t.re == re){
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
    

    


    public void findMale(Person per, Sex male){
        for (Node tree : tree) {
            if (tree.p1.getFullName().equals(per.getFullName()) && tree.p2.getSex() == male){
                result.add(tree.p2.getFullName());
            }

        }
        if (result.size() == 0){
            System.out.println("Таких связей не найдено!");
        }
        else{
            if (male != Sex.male)
            System.out.println(per.getFullName() + " - имеет следующие родственные связи с женщинами: \n" + result);
            else{
                System.out.println(per.getFullName() + " - имеет следующие родственные связи с мужчинами: \n" + result);
            }
        }
    }

    public void bornBefor(int year){
        for (Node tree : tree) {
            if (tree.p1.getbirthYear() < year){
                if (!result.contains(tree.p1.getFullName()))
                result.add(tree.p1.getFullName());
            }
        }
        if (result.size() == 0){
            System.out.println("Рожденных до " + year + " года, не найдено.");
        }
        else{
            System.out.println("Следующие люди родились до " + year + " года: \n" + result);
        }
    }
    
    public void allRelations(Person per){
        System.out.println("Найдены следующие связи для " + per.getFullName() + ": " );
        for (Node tree : tree) {
            if (tree.p1.getFullName().equals(per.getFullName())){
                if (!result.contains(tree.p1.getFullName() + tree.p2.getFullName())){
                    result.add(tree.p1.getFullName() + tree.p2.getFullName());
                        if (tree.p2.getSex() == Sex.male){
                            System.out.println("- " + tree.p2.getFullName() + ", для котрого " + per.getFullName() + ": " + tree.re);
                        }
                        else{
                            System.out.println("- " + tree.p2.getFullName() + ", для котрой " + per.getFullName() + ": " + tree.re);
                        }
                
                }
            }
        }
    }
}
