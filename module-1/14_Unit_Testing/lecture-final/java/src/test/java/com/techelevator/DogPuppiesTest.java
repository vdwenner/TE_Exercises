package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DogPuppiesTest {

    @Test
    public void adding4PuppiesReturnsgetPuppiesSize4(){

        //Arrange
        List<Dog> puppies = new ArrayList<>();
        puppies.add(new Dog());
        puppies.add(new Dog());
        puppies.add(new Dog());
        puppies.add(new Dog());

        Dog mommaDog = new Dog();

        //Act
        mommaDog.setPuppies(puppies);

        //Assert
        Assert.assertEquals(puppies.size(),mommaDog.getPuppies().size());


    }

}
