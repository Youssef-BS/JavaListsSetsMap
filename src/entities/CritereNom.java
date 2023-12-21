package entities;

import java.util.Comparator;

public class CritereNom implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
}
