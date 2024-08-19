package com.codetru.dataprovider;

import org.testng.annotations.DataProvider;

public class StateDataProvider {

    // Define the states to iterate over
    private static final String[] STATES = {"GA", "NY", "CA", "TX", "FL", "IL", "PA", "OH", "MI", "NC"};

    private static int currentIndex = 0;

    @DataProvider(name = "stateDataProvider")
    public static Object[][] stateDataProvider() {
        Object[][] data = new Object[1][1];
        data[0][0] = STATES[currentIndex];
        currentIndex = (currentIndex + 1) % STATES.length; // Move to the next state cyclically
        return data;
    }
}
