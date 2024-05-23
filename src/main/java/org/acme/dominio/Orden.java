package org.acme.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "t_ordenes")
public class Orden extends PanacheEntityBase {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Long idOrden;

    @Column(name = "ord_user")
    private String ord_user;

    @Column(name = "ord_item")
    private String ord_item;

    public Orden() {
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public String getOrd_user() {
        return ord_user;
    }

    public void setOrd_user(String ord_user) {
        this.ord_user = ord_user;
    }

    public String getOrd_item() {
        return ord_item;
    }

    public void setOrd_item(String ord_item) {
        this.ord_item = ord_item;
    }
}