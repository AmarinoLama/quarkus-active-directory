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
    private String nombre = "";

    @Column(name="user_prop")
    private Integer destreza = 0;

    public Usuaria() {
    }

    public Usuaria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }
}
