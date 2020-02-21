package fr.umlv.devops.Project.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Espece {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Animaux> listeAnimaux;

    private String regimeAlimentaire;
    private int niveauDeMenace;

    public Espece(){

    }

    public Espece(String regimeAlimentaire, int niveauDeMenace){
        this.regimeAlimentaire = regimeAlimentaire;
        this.niveauDeMenace = niveauDeMenace;
        listeAnimaux = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Espece espece = (Espece) o;
        return niveauDeMenace == espece.niveauDeMenace &&
                Objects.equals(id, espece.id) &&
                Objects.equals(listeAnimaux, espece.listeAnimaux) &&
                Objects.equals(regimeAlimentaire, espece.regimeAlimentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listeAnimaux, regimeAlimentaire, niveauDeMenace);
    }

    public Long getId() {
        return id;
    }

    public int getNiveauDeMenace() {
        return niveauDeMenace;
    }

    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNiveauDeMenace(int niveauDeMenace) {
        this.niveauDeMenace = niveauDeMenace;
    }

    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }


}
