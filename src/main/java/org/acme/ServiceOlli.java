package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dominio.Usuaria;

import java.util.Optional;

@ApplicationScoped
public class ServiceOlli {

    ServiceOlli() {}

    public Usuaria cargaUsuaria(String nameUsuaria) {
        Optional<Usuaria> usuaria = Usuaria.findByIdOptional(nameUsuaria);
        return usuaria.isPresent() ? usuaria.get() : new Usuaria();
    }
}
