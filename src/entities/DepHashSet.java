package entities;
import interfaces.IDepartement;
import java.util.*;
public class DepHashSet implements IDepartement<Departement>{
    Set<Departement> setDep = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        setDep.add(departement);
    }
    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d:setDep){
            if(d.getNomDEP().equals(nom))
                return true ;
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement departement) {
        return setDep.contains(departement);
    }
    @Override
    public void supprimerDepartement(Departement departement) {

        setDep.remove(departement);
    }
    @Override
    public void displayDepartement() {
        for (Departement d : setDep) {
            System.out.println(d);
        }
    }
    public void fetch(){
        Iterator<Departement> dep = setDep.iterator();
        while(dep.hasNext()){
            System.out.println(dep.next());
        }
        }
    @Override
    public TreeSet<Departement> trierDepartementById() {
TreeSet<Departement> newtr = new TreeSet<>(new Comparator<Departement>() {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getId()-o2.getId();
    }
});
    newtr.addAll(setDep);
    return newtr ;
    }
public TreeSet<Departement> trieDepById(){
       TreeSet<Departement> newT = new TreeSet<>(new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId() - o2.getId() ;
            }
        });
       newT.addAll(setDep);
       return newT;
}
}
