import java.util.Comparator;

public class PeaplesDateOfBirthComporator implements Comparator<Node>{

    @Override
    public int compare(Node o1, Node o2) {
        return o1.p1.getBirthYear() - o2.p1.getBirthYear();
    }
     
}
