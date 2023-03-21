
public class Main {
    public static void main(String[] args) {
        ResidentPerson Igor = new ResidentPerson("Игорь", Sex.male, 1981);
        ResidentPerson Igor1 = new ResidentPerson("Игорь", Sex.male, 1981);
        ResidentPerson Evgeniy = new ResidentPerson("Евгений", Sex.male, 1978);
        ResidentPerson Galina = new ResidentPerson("Галина", Sex.female, 1954);
        ResidentPerson Victor = new ResidentPerson("Виктор", Sex.male, 1950);
        NonResidentPerson Ludmila = new NonResidentPerson("Людмила", "Германия", Sex.female, 1953);
        ResidentPerson Nikolay = new ResidentPerson("Николай", Sex.male, 1933);
        ResidentPerson Olga = new ResidentPerson("Ольга", Sex.female, 1935);
        NonResidentPerson Elena = new NonResidentPerson("Елена", "Германия",Sex.female, 1930);
        ResidentPerson Ivan = new ResidentPerson("Иван", Sex.male, 1927);
        GeoTree gt = new GeoTree();
        gt.append(Igor, Relationship.brother, Evgeniy);
        gt.append(Igor, Relationship.children, Galina);
        gt.append(Igor, Relationship.children, Victor);
        gt.append(Evgeniy, Relationship.children, Galina);
        gt.append(Evgeniy, Relationship.children, Victor);
        gt.append(Galina, Relationship.wife, Victor);
        gt.append(Galina, Relationship.children, Olga);
        gt.append(Galina, Relationship.children, Nikolay);
        gt.append(Nikolay, Relationship.husband, Olga);
        gt.append(Victor, Relationship.children, Elena);
        gt.append(Victor, Relationship.children, Ivan);
        gt.append(Elena, Relationship.wife, Ivan);
        gt.append(Ludmila, Relationship.sister, Victor);
        gt.append(Ludmila, Relationship.children, Elena);
        gt.append(Ludmila, Relationship.children, Ivan);
        
        //new Reserch(gt).spend(Igor, Relationship.children);
        //System.out.println("\n");
        //new Reserch(gt).findMale(Victor, Sex.male);
        //System.out.println("\n");
        //new Reserch(gt).bornBefor(1950); 
        //System.out.println("\n");
        //new Reserch(gt).allRelations(Victor);
        //System.out.println("\n");
        //new Reserch(gt).nonResidentFind(Victor);
        //System.out.println(gt);
        
        new Reserch(gt).listOfAllRelatives();
        new Reserch(gt).sortByBirthday();
        new Reserch(gt).listOfAllRelatives();
        new Reserch(gt).delNonResident();
        new Reserch(gt).listOfAllRelatives();
        
        System.out.println("\nПросто проверка переопределения equals: ");
        System.out.println(Igor.equals(Igor1));
        

    }

}
