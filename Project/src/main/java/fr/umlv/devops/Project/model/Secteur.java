package fr.umlv.devops.Project.model;

import fr.umlv.devops.Project.model.Bassin;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Secteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Bassin> listeBassin;

    private String nom;
    private String localisation;

    public Secteur(){

    }

    public Secteur (String nom, String localisation){
        this.listeBassin = new ArrayList<>();
        this.nom = nom;
        this.localisation = localisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secteur secteur = (Secteur) o;
        return Objects.equals(id, secteur.id) &&
                Objects.equals(listeBassin, secteur.listeBassin) &&
                Objects.equals(nom, secteur.nom) &&
                Objects.equals(localisation, secteur.localisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listeBassin, nom, localisation);
    }

    public Long getId() {
        return id;
    }

    public List<Bassin> getListeBassin() {
        return listeBassin;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getNom() {
        return nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setListeBassin(List<Bassin> listeBassin) {
        this.listeBassin = listeBassin;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
