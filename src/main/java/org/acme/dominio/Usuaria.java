package org.acme.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_users")
public class Usuaria extends PanacheEntityBase {

    @Id
    @Column(name="user_nom")
    private String user_nom;

    @Column(name="user_prop")
    private Integer user_prop;

    public Usuaria() {
    }

    public String getUser_nom() {
        return user_nom;
    }

    public void setUser_nom(String user_nom) {
        this.user_nom = user_nom;
    }

    public Integer getUser_prop() {
        return user_prop;
    }

    public void setUser_prop(Integer user_prop) {
        this.user_prop = user_prop;
    }
}
