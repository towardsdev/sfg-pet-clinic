package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyLastName(String lastName);
    Vet findbyId(Long id);
    Vet save(Vet owner);

    Set<Vet> findAll();
}
