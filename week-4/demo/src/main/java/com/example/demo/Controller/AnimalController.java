package com.example.demo.Controller;

import com.example.demo.Model.Animal;
import com.example.demo.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {


    @Autowired
    AnimalRepository animalRepository;

//    For your Post method, you would need RequestBody in your parameters
//    this makes sure your arguments are mapped to the http request
//    we can have this method return a result as a well
    @PostMapping("/animals")
    public Animal addAnimal(@RequestBody Animal animal){
        animalRepository.save(animal);
        return animal;
    }

    @GetMapping("/animals")
    public List<Animal> getAnimals(){
        animalRepository.save(new Animal("bear", "brown"));
        animalRepository.save(new Animal("salmon", "pink"));

        return animalRepository.findAll();
    }

}
