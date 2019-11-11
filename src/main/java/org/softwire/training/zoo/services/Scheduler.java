package org.softwire.training.zoo.services;

import org.softwire.training.zoo.models.Animal;
import org.softwire.training.zoo.models.CanBeGroomed;
import org.softwire.training.zoo.models.CanHavePoopSweptOut;
import org.softwire.training.zoo.models.Keeper;

import java.util.List;

public class Scheduler {
    private static Scheduler instance;

    private Scheduler() {
    }

    public static Scheduler getInstance() {
        if (instance == null) {
            instance = new Scheduler();
        }
        return instance;
    }

    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(keeper::feed));

        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanBeGroomed) {
                keeper.groom((CanBeGroomed) animal);
            }
            if (animal instanceof CanHavePoopSweptOut) {
                keeper.cleanPoop((CanHavePoopSweptOut) animal);
            }
        }));
    }
}
