package collections.teste;

import collections.core.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("HAHAHA", "iphone");
        Smartphone s2 = new Smartphone("HEHEHE", "google");
        Smartphone s3 = new Smartphone("HIHIHI", "samsung");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
    }
}
