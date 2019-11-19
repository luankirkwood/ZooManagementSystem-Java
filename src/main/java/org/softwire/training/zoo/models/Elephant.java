package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Elephant extends AbstractAnimal implements LargeAnimal, CanHavePoopSweptOut{

    private LocalDateTime lastCleaned;

    public Elephant(LocalDate dateOfBirth) {super (dateOfBirth);}


    public void clean() {
        lastCleaned = LocalDateTime.now();
    }


    public String toString() {
        return MessageFormat.format("{0}; Last Cleaned {1}", super.toString(), lastCleaned);
    }
}