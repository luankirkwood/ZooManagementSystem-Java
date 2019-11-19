package org.softwire.training.zoo.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RedPanda extends AbstractAnimal implements SmallAnimal, CanBeGroomed {

    private LocalDateTime lastGroomed;

    public RedPanda(LocalDate dateOfBirth) {super(dateOfBirth);}


    public void groom() {
        lastGroomed = LocalDateTime.now();
    }


    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }
}
