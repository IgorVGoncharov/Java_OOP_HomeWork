
public class Node {

    public Node(Peoples p1, Relationship re, Peoples p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Peoples p1;

    Relationship re;
    Peoples p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>\n", p1.getFullName(), re, p2.getFullName());
    }

}
