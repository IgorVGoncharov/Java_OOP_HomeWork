
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Reserch {
    private ArrayList<String> result = new ArrayList<>();
    private ArrayList<Node> tree;
    private ArrayList<Peoples> List = new ArrayList<>();



    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public void spend(Peoples p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName()) && t.re == re){
                result.add(t.p2.getFullName());
            }
        }
        System.out.println(p.getFullName() + " c " + result + ", имеет следующую связь: " + re);
    }
    

    public void findMale(Peoples per, Sex male){
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
            if (tree.p1.getBirthYear() < year){
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
    
    public void allRelations(Peoples per){
        System.out.println("Найдены следующие связи для " + per.getFullName() + ": " );
        for (Node tree : tree) {
            if (tree.p1.getFullName().equals(per.getFullName())){
                if (!result.contains(tree.p1.getFullName() + tree.p2.getFullName())){
                    result.add(tree.p1.getFullName() + tree.p2.getFullName());
                        if (tree.p2.getSex() == Sex.male){
                            System.out.println("- " + tree.p2.getFullName() + ", для которого " + per.getFullName() + ": " + tree.re);
                        }
                        else{
                            System.out.println("- " + tree.p2.getFullName() + ", для которой " + per.getFullName() + ": " + tree.re);
                        }
                
                }
            }
        }
    }

    public void nonResidentFind(Peoples per){
        for (Node tree : tree) {
            if (tree.p1.getFullName() == per.getFullName()){
                if (tree.p2 instanceof NonResidentPerson){
                    result.add(tree.p2.getFullName());
                }
            }   
        }
        if (result.size() == 0){
            System.out.println("У персоны " + per.getFullName() + " нет родственников, которые живут за границей.");
        }
        else if ((result.size() == 1)){
            System.out.println("У персоны " + per.getFullName() + " есть родственник, который живет за границей. Вот он:\n" + result);
        }
        else{
            System.out.println("У персоны " + per.getFullName() + " есть родственники, которые живут за границей. Вот они:\n" + result);
        }

    }

    public void listOfAllRelatives(){
        String res = new String();
        System.out.println("Список всех родственников: ");
        for (Node tree : tree) {
            if (!List.contains(tree.p1)){
                List.add(tree.p1);
                if (tree.p1 instanceof NonResidentPerson){
                    res = "Нет";
                }
                else{
                    res = "Да";
                }
                System.out.print("Имя: " + tree.p1.getFullName() + ",\tпол: " + tree.p1.getSex() + ",\tдата рождения: " + tree.p1.getBirthYear());
                System.out.print(",\t живет в России: " + res + "\n");
            }
        }
    }

    public void delNonResident(){
        Iterator<Node> iterator = tree.iterator();
        while (iterator.hasNext()){
            Node next = iterator.next();
            if (next.p1 instanceof NonResidentPerson){
                iterator.remove();
            }
        }
        System.out.println("\nУбираем всем родственников, кто живет за границей!\n");
    }
    
    public void sortByBirthday(){
        Collections.sort(tree, new PeaplesDateOfBirthComporator());
        System.out.println("\nОтсортированно по году рождения.\n");
    }
    
}