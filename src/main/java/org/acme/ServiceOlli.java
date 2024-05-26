package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dominio.Item;
import org.acme.dominio.Orden;
import org.acme.dominio.Usuaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ServiceOlli {

    ServiceOlli() {}

    public Usuaria cargaUsuaria(String nameUsuaria) {
        Optional<Usuaria> usuaria = Usuaria.findByIdOptional(nameUsuaria);
        return usuaria.isPresent() ? usuaria.get() : new Usuaria();
    }

    public Item cargaItem(String nameItem) {
        Optional<Item> item = Item.findByIdOptional(nameItem);
        return item.isPresent() ? item.get() : new Item();
    }

    public List<Orden> cargaOrden(String nameUsuaria) {
        List<Orden> ordenes = Orden.listAll();
        return ordenes.stream()
                .filter(orden -> orden.getUser().getNombre().equals(nameUsuaria))
                .toList();
    }
}
