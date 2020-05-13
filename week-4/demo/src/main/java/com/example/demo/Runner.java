package com.example.demo;

import com.example.demo.Model.Animal;
import com.example.demo.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    AnimalRepository animalRepository;

    @Override
    public void run(String... args) throws Exception {

        animalRepository.save(new Animal("kangaroo", "tan"));
        animalRepository.save(new Animal("cobra", "red"));
        animalRepository.save(new Animal("whale", "blue"));


    }
}