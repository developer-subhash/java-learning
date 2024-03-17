package org.java.learning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        String value= "";
        Optional<String> optional = Optional.ofNullable(value);

        // check if value is present
        if(optional.isPresent()){
            System.out.println("value present " + optional.get());
        } else {
            System.out.println("value absent ");
        }

        // do some operation if value present
        optional.ifPresent(val -> System.out.println("value present and length is " + val.length()));

        // provide some value is value is null or absent
        String v = optional.orElse("suman");

        // chaining methods
        int length = optional.map(val -> val.length()).orElse(0);
        System.out.println("length of value or 0 if absent " + length);

        List<Integer> list = Arrays.asList(1,2,3,4);
        Optional<List<Integer>> o2 = Optional.ofNullable(list);

        int x = o2.map(val -> val.get(2)).orElse(0);
        System.out.println("x is " + x);
    }
}
