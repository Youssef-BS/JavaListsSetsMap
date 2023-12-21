package entities;

import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListEmp implements IGestion<Emp> {
    ArrayList<Emp> empList = new ArrayList<>();
    @Override
    public void ajouterEmploye(Emp emp) {
        empList.add(emp);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(int i=0 ; i<empList.size() ; i++){
            if(empList.get(i).getNom().equals(nom))
                return true;
        }
        return false ;
    }

    @Override
    public boolean rechercherEmploye(Emp emp) {
        return empList.contains(emp);
    }

    @Override
    public void supprimerEmploye(Emp emp) {
        empList.remove(emp);
    }

    @Override
    public void displayEmploye() {
        for(Emp e:empList){
            System.out.println(e);
        }
    }

    public void display(){
        Iterator<Emp> it = empList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(empList);
    }
    public void trieEmployerParNom(){
        Collections.sort(empList , new Emp());
    }

    public void trieEmployerParPrenom(){
        Collections.sort(empList , new CritereNom());
    }
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Emp> depTrie = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        };
       Comparator<Emp> trieG = new Comparator<Emp>() {
           @Override
           public int compare(Emp o1, Emp o2) {
               return o1.getGrade()-o2.getGrade();
           }
       };
       Collections.sort(empList , depTrie.thenComparing(trieG));
    }
public void trie(){
     Comparator<Emp> nameDep = new Comparator<Emp>() {
       @Override
         public int compare(Emp o1 , Emp o2){
           return o1.getNomDepartement().compareTo(o2.getNomDepartement());
         }
     } ;
     Comparator<Emp> grade = new Comparator<Emp>() {
         @Override
         public int compare(Emp o1, Emp o2) {
             return o1.getGrade() - o2.getGrade() ;
         }
     };
     Collections.sort(empList , nameDep.thenComparing(grade));
    }
}



