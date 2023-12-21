package entities;

import java.util.*;

public class AffectationHashMap {
    Map<Emp , Departement> ed = new HashMap<>();

    public void ajouterEmployesDepartement(Emp e , Departement d){
        ed.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Emp , Departement> d : ed.entrySet()){
            System.out.println(d.getKey() +":"+d.getValue());
        }
    }
    public void aff(){
        for(Emp e:ed.keySet()){
            System.out.println(e +" : "+ed.get(e));
        }
    }

    public void supprimerEmploye(Emp e){
        ed.remove(e);
    }

    public void supprimerEmployeEtDepartement(Emp e , Departement d){
        ed.remove(e , d) ;
    }

    public void afficherEmployer(){
      System.out.println(ed.keySet());
    }

    public void afficherDepartement(){
        System.out.println(ed.values());
    }

    public boolean rechercherEmploye(Emp e){
      if(ed.containsKey(e))
        return true ;
     return false ;
    }

    public boolean rechercherDepartement(Departement d){
        if(ed.containsValue(d))
            return true;
        return false ;
    }

    public TreeMap<Emp , Departement> trierMap(){
        Comparator<Emp> te = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeMap<Emp , Departement> e = new TreeMap<>(te);
        e.putAll(ed);
        return e;
    }


}
