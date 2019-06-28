package guru.springframework.sfgpetclinic.services;


import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyLastName(String lastName);
    Pet findbyId(Long id);
    Pet save(Pet owner);

    Set<Pet> findAll();
}
