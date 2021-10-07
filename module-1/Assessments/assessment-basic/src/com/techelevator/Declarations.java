package com.techelevator;

public class Declarations {

    // ********************************************
    // ************** DECLARATIONS ****************
    // ********************************************
    // Declare four (4) public variables of the appropriate
    //  datatype to store the number of quarters,
    //  dimes, nickels, and pennies in a US Dollar as:
    //      quartersInDollar,
    //      dimesInDollar,
    //      nickelsInDollar,
    //      penniesInDollar
    // ********************************************

    /* ADD CODE HERE */
    public int quartersInDollar;
    public int dimesInDollar;
    public int nickelsInDollar;
    public int penniesInDollar;

    // ********************************************
    // Declare a array of an appropriate type that
    // store the four variables you just created
    // and name it: partsOfDollar
    // make the array publicly available
    // ********************************************

    /* ADD CODE HERE */
    public int[] partsOfDollar;

    // ************** ASSIGNMENT ****************
    // Write a public method named assignDollarParts
    //  to assign the correct values to each of the
    //  four variables created above and then add
    //  each one in ascending order to the array you
    //  just created. Do not forget to initialize
    //  the array. This method does not return
    //  any value.
    // ******************************************

    /* ADD CODE HERE */
    public void assignDollarParts(){
        quartersInDollar = 4;
        dimesInDollar = 10;
        nickelsInDollar = 20;
        penniesInDollar = 100;

        partsOfDollar = new int[4];

        partsOfDollar[0] = quartersInDollar;
        partsOfDollar[1] = dimesInDollar;
        partsOfDollar[2] = nickelsInDollar;
        partsOfDollar[3] = penniesInDollar;

    }

}
