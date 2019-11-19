package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zebra extends AbstractAnimal implements LargeAnimal, CanBeGroomed, CanHavePoopSweptOut {

    private LocalDateTime lastGroomed;
    private LocalDateTime lastCleaned;

    public Zebra(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }


    public void groom() {
        lastGroomed = LocalDateTime.now();
    }


    public void clean(){
        lastCleaned = LocalDateTime.now();
    }


    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}; Last Cleaned {2}", super.toString(), lastGroomed, lastCleaned);
    }
}
