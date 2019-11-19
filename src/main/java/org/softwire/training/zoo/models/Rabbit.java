package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rabbit extends AbstractAnimal implements SmallAnimal, CanBeGroomed, CanHavePoopSweptOut {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastCleaned;

    public Rabbit(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    public void feed() {
        System.out.println("Rabbit: Munch munch");
        super.feed();
    }

    public void clean() { lastCleaned = LocalDateTime.now(); }


    public void groom() {
        lastGroomed = LocalDateTime.now();
    }


    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}; Last Cleaned {2}", super.toString(), lastGroomed, lastCleaned);
    }
}
