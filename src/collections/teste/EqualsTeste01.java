package collections.teste;

import collections.core.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("AKIEOA", "iphone");
       // Smartphone s2 = new Smartphone("AKIEOA", "iphone");
        //System.out.println(s1.equals(s2)); //falso pq s1 e s2 fazem referência a objetos diferentes na memoria
        Smartphone s2 = s1;
        System.out.println(s1.equals(s2)); //true, pq fazem referência ao mesmo objeto

    }
}
