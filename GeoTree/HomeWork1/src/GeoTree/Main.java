package GeoTree;
public class Main {
    public static void main(String[] args) {
        Person Igor = new Person("Игорь", Sex.male, 1981);
        Person Evgeniy = new Person("Евгений", Sex.male, 1978);
        Person Galina = new Person("Галина", Sex.female, 1954);
        Person Victor = new Person("Виктор", Sex.male, 1950);
        Person Ludmila = new Person("Людмила", Sex.female, 1953);
        Person Nikolay = new Person("Николай", Sex.male, 1933);
        Person Olga = new Person("Ольга", Sex.female, 1935);
        Person Elena = new Person("Елена", Sex.female, 1930);
        Person Ivan = new Person("Иван", Sex.male, 1927);
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
        
        System.out.println(new Reserch(gt).spend(Igor, Relationship.children));
        new Reserch(gt).findMale(Victor, Sex.male);// выдает все связи по женской или мужской линии
        new Reserch(gt).bornBefor(1950); //выдает список людей, которые родились до указанного года
        new Reserch(gt).allRelations(Victor); // поиск всех связей человека
    }

}
