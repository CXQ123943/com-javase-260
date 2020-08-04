package com.steven.test;

import com.steven.pojo.Bird;
import com.steven.pojo.Dog;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class AnimalAndBirdAndDogTest {

    @Test
    public void animalAndBirdAndDog(){
        System.out.println(new Bird().getName());
        new Dog().methodA();
    }
}
