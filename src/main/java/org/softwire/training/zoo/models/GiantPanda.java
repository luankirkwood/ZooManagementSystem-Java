package org.softwire.training.zoo.models;

import java.time.LocalDate;

public class GiantPanda extends AbstractAnimal implements LargeAnimal {

    public GiantPanda(LocalDate dateOfBirth) {super(dateOfBirth);}

    @Override
    public void feed() {
        System.out.println("Giant Panda: Nom nom bamboo");
        super.feed();
    }
}
