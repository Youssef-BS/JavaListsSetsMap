package entities;
import interfaces.IGestion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class Emp implements Comparable<Emp>  , Comparator<Emp> {

    private int id ;
    private String nom ;
    private String nomDepartement ;
    private int grade ;

    private String prenom ;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Emp(){

    }

    public Emp(int id , String nom , String nomDepartement , int grade){
        this.id = id ;
        this.nom = nom ;
        this.nomDepartement = nomDepartement ;
        this.grade = grade ;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(nom, emp.nom);
    }


    @Override
    public int compareTo(Emp o) {
        return this.id - o.id ;
    }

    @Override
    public int compare(Emp o1 , Emp o2){
        return o1.getNom().compareTo(o2.getNom());
    }
}
