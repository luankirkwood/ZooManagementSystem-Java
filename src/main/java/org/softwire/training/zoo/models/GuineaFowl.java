package org.softwire.training.zoo.models;

import java.time.LocalDate;

public class GuineaFowl extends AbstractAnimal implements SmallAnimal{

    public GuineaFowl(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }


    public void feed() {
        System.out.println("Guinea Fowl: Thanks keeper for feeding me today, it was delicioso");
        super.feed();
    }
}
