package entities;
import java.util.Objects;


public class Departement  {
    private int id ;
    private String nomDEP ;
    private int nbEmp ;

    public Departement(){

    }
    public Departement(int id , String nomDep , int nbEmp){
        this.id = id ;
        this.nomDEP = nomDep ;
        this.nbEmp = nbEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDEP, that.nomDEP);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDEP='" + nomDEP + '\'' +
                ", nbEmp=" + nbEmp +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNomDEP() {
        return nomDEP;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDEP(String nomDEP) {
        this.nomDEP = nomDEP;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }
}
