package fr.umlv.devops.Project.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Animaux {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String sexe;
    private String signeDistinctif;
    private Date dateArrive;
    private Date dateDepart;


    public Animaux(String name, String sexe, String signeDistinctif, Date dateArrive, Date dateDepart){

        this.name = name;
        this.sexe = sexe;
        this.signeDistinctif = signeDistinctif;
        this.dateArrive = dateArrive;
        this.dateDepart = dateDepart;
    }

    public Animaux (String name, String sexe, Date dateArrive){
        this.name = "Aucun";
        this.sexe = sexe;
        this.signeDistinctif = signeDistinctif;
        this.dateArrive = dateArrive;
        this.dateDepart = null;
    }

    public Date getDateArrive() {
        return dateArrive;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSexe() {
        return sexe;
    }
    public String getSigneDistinctif() {
        return signeDistinctif;
    }
}
