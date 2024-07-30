package javabasics;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class HashMapExample {
    public static void main(String args[])
    {

        Map<Employee,String> hashmap=getAllEmployees();
        System.out.println(hashmap.get(new Employee("kusuma",12)));
    }
    public static Map<Employee,String>getAllEmployees()
    {
        Map<Employee,String>hashmap=new HashMap<>();
        hashmap.put(new Employee("kusuma",12),"kusumaaaa");
        hashmap.put(new Employee("harsha",10),"harshaaa");
        hashmap.put(new Employee("laxmi",11),"laxmiiii");
        for(Map.Entry<Employee,String>emp:hashmap.entrySet())
        {
            System.out.println(emp.getKey()+"->"+emp.getValue());
        }
        return hashmap;
    }
}
