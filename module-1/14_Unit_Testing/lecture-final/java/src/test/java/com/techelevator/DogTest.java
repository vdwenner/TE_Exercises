package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DogTest {

    Dog testDefaultDog;

    @Before
    public void setup(){
        System.out.println("Beginning Dog Test");
        testDefaultDog = new Dog();
    }

    @After
    public void teardown(){
        System.out.println("Ending Dog Test");
    }

    @Test
    public void dog_Alert_SetsMoodToAngryMood(){

        //Arrange
        Dog testAlertDog = new Dog("Fido",3,"whimper whimper","BaWoof woof woof");
        //Act
        System.out.println(testAlertDog.alert());
        //Assert
        Assert.assertEquals(Dog.ANGRY, testAlertDog.getMood());

    }

    @Test
    public void default_Dog_IsSpot1YOAdopted(){

        //Arrange
        int expectedAge = 1;
        String expectedName = "Spot";
        boolean expectedAdoptionStatus = true;
        //Act
        //Assert
        Assert.assertEquals(expectedAge, testDefaultDog.getAge());
        Assert.assertEquals(expectedName, testDefaultDog.getName());
        //OOPS! I never implemented that!!!
        //Assert.assertEquals(expectedAdoptionStatus, testDefaultDog.);

    }

    @Test
    public void setNameToFred_getnameReturnsFred(){

        //Arrange
        String newName = "Fred";
        //Act
        testDefaultDog.setName(newName);
        //Assert
        Assert.assertEquals(newName, testDefaultDog.getName());

    }



}
