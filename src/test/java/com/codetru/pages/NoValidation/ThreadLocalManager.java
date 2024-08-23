package com.codetru.pages.NoValidation;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalManager {

    // ThreadLocal variables to hold the lists
    private static ThreadLocal<List<String>> licenseStateList = ThreadLocal.withInitial(ArrayList::new);
    private static ThreadLocal<List<String>> appointmentStatusList = ThreadLocal.withInitial(ArrayList::new);
    private static ThreadLocal<Integer> flag = ThreadLocal.withInitial(() -> 1);


    // Getters
    public static List<String> getLicenseStateList() {
        return licenseStateList.get();
    }

    public static List<String> getAppointmentStatusList() {
        return appointmentStatusList.get();
    }

    // Setters
    public static void setLicenseStateList(List<String> list) {
        licenseStateList.set(list);
    }

    public static void setAppointmentStatusList(List<String> list) {
        appointmentStatusList.set(list);
    }

    // Clearing thread-local variables after use
    public static void clear() {
        licenseStateList.remove();
        appointmentStatusList.remove();
        flag.remove();
    }
    
    public static void setFlag(int value) {
        flag.set(value);
    }

    public static int getFlag() {
        return flag.get();
    }
}
