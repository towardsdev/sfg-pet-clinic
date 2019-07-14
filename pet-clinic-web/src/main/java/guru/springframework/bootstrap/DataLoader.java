package guru.springframework.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirtName("Mohamad Kassim");
        owner1.setLastName("Madarsha");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirtName("Sathya");
        owner1.setLastName("Vasanth");

        ownerService.save(owner2);

        System.out.println("Loader owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirtName("Tommy");
        vet1.setLastName("Shepered");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirtName("Jimmy");
        vet2.setLastName("Pommer");

        vetService.save(vet2);
        System.out.println("Loader vets...");
    }
}
