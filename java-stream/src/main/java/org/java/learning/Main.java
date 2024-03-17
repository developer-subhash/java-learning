package org.java.learning;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 10000.0),
                new Employee(2, "Bill Gates", 20000.0),
                new Employee(3, "Mark Zuckerberg", 30000.0)
        };

        Stream<Employee> s1 = Stream.of(arrayOfEmps); // one way from array
        double totalSalary = s1.map(emp -> emp.getSalary()).mapToDouble(salary -> salary).sum();
        System.out.println("total salary provided by company " + totalSalary);

        List<Employee> emps = Arrays.asList(arrayOfEmps);
        Stream<Employee> s2 = emps.stream();

        // filtering and mapping and then paraller processing
        // getting employee of salary greater than 10000 and add all salary
        totalSalary = s2.filter(employee -> employee.getSalary() > 10000).map(Employee::getSalary) // method reference
                .mapToDouble(salary -> salary).sum();
        System.out.println("total salary of employees having salary greater than 10000 " + totalSalary);

        // file processing
        try(Stream<String> lines = Files.lines(Paths.get("data.txt"))){ // file path start from root folder
//            lines.forEach(line -> System.out.println(line));
            lines.forEach(System.out::println); // method reference

        } catch (IOException ex){
            System.out.println("exception is " + ex.getMessage());
        }
    }
}