package fr.umlv.devops.Project.model;

import fr.umlv.devops.Project.model.enumeration.Etat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Bassin {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<Espece> listeEspece;
    private int capacite;
    private int volumeEau;
    private Etat etat;

    public Bassin(){

    }

    public Bassin(int capacite, int volumeEau, Etat etat){
        this.listeEspece = new ArrayList<>();
        this.capacite = capacite;
        this.volumeEau = volumeEau;
        this.etat = etat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bassin bassin = (Bassin) o;
        return capacite == bassin.capacite &&
                volumeEau == bassin.volumeEau &&
                Objects.equals(id, bassin.id) &&
                Objects.equals(listeEspece, bassin.listeEspece) &&
                etat == bassin.etat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listeEspece, capacite, volumeEau, etat);
    }

    public Long getId() {
        return id;
    }

    public Etat getEtat() {
        return etat;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getVolumeEau() {
        return volumeEau;
    }

    public List<Espece> getListeEspece() {
        return listeEspece;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void setListeEspece(List<Espece> listeEspece) {
        this.listeEspece = listeEspece;
    }

    public void setVolumeEau(int volumeEau) {
        this.volumeEau = volumeEau;
    }
}
