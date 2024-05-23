package org.acme.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_items")
public class Item extends PanacheEntityBase {

    @Id
    @Column(name = "item_nom")
    private String item_nom;

    @Column(name = "item_prop")
    private Integer item_prop;

    @Column(name = "item_tipo")
    private String item_tipo;

    public Item() {
    }

    public String getItem_nom() {
        return item_nom;
    }

    public void setItem_nom(String item_nom) {
        this.item_nom = item_nom;
    }

    public Integer getItem_prop() {
        return item_prop;
    }

    public void setItem_prop(Integer item_prop) {
        this.item_prop = item_prop;
    }

    public String getItem_tipo() {
        return item_tipo;
    }

    public void setItem_tipo(String item_tipo) {
        this.item_tipo = item_tipo;
    }
}
