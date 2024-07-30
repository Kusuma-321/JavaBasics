package javabasics;

import java.util.HashSet;
import java.util.*;
public class HashSetExample {
    public static void main(String args[])
    {

        Set<Employee>hashset=getAllEmployees();
        System.out.println(hashset.contains(new Employee("kusuma",12)));
    }
    public static Set<Employee>getAllEmployees()
    {
        Set<Employee>hashset=new HashSet<>();
        hashset.add(new Employee("kusuma",12));
        hashset.add(new Employee("harsha",10));
        hashset.add(new Employee("laxmi",11));
        for(Employee employee:hashset)
        {
            System.out.println(employee);
        }
        return hashset;
    }
}
