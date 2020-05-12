package com.example.demo.Controller;

import com.example.demo.Fruit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MainController {

    Fruit apple = new Fruit(0, "Apple", "red");
    Fruit papaya = new Fruit(1, "Papaya", "orange");

    ArrayList<Fruit> fruitArrayList = new ArrayList<>();

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/lionel")
    public String getName(){
        return "My Name is Lionel";
    }

    @GetMapping("/apple")
    public Fruit getFruit(){
        return apple;
    }

    @GetMapping("/papaya")
    public Fruit getPapaya(){
        return papaya;
    }

    @GetMapping("/allfruits")
    public ArrayList<Fruit> getFruitArrayList(){
        fruitArrayList.add(apple);
        fruitArrayList.add(papaya);
        return fruitArrayList;
    }


}
