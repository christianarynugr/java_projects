package com.hatesunday;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add("Daisy, Daisy");
        a.add("gimme");
        a.add("ur answer");
        a.add("do");
        System.out.println(a);
        
        a.set(0,"Fiony, Fiony");
        System.out.println(a);
        
        a.remove(0);
        System.out.println(a);
        
        System.out.println("I have " + a.size() + " balls");
        System.out.println(a.get(2));
    }
    
}
