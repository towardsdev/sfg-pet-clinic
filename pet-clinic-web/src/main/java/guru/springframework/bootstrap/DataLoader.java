package guru.springframework.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mohamad Kassim");
        owner1.setLastName("Madarsha");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Sathya");
        owner2.setLastName("Vasanth");

        ownerService.save(owner2);

        System.out.println("Loader owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Tommy");
        vet1.setLastName("Shepered");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jimmy");
        vet2.setLastName("Pommer");

        vetService.save(vet2);
        System.out.println("Loader vets...");
    }
}
