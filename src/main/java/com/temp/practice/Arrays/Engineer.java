package com.temp.practice.Arrays;

public abstract class Engineer {
    public static String name() {
        return "Engineer";
    }
    public String favorite() {
        return "Math and Physics";
    }
    public static void main(String[] args) {
        Engineer e2 = new ElectricalEngineer();
        Engineer e3 = new SoftwareEngineer();
        ElectricalEngineer ee = new ElectricalEngineer();
        SoftwareEngineer se = new SoftwareEngineer();
        System.out.format("%s %s \n", e2.name(), e2.favorite());
        System.out.format("%s %s \n", e3.name(), e3.favorite());
        System.out.format("%s %s \n", ee.name(), ee.favorite());
        System.out.format("%s %s", se.name(), se.favorite());
    }
}
class ElectricalEngineer extends Engineer {
    public static String name() { 
    	return "Electrical Engineer";
    	}
    public String favorite() { return "Electricity"; }
}
class SoftwareEngineer extends Engineer {
    public static String name() { return "Software Engineer"; }
    public String favorite() { return "Java"; }
} 