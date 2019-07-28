package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specalities;

    public Set<Speciality> getSpecalities() {
        return specalities;
    }

    public void setSpecalities(Set<Speciality> specalities) {
        this.specalities = specalities;
    }
}
