package javabasics;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class LinkedHashmapExample{
    public static void main(String args[])
    {

        Map<Employee,String> linkedhashmap=getAllEmployees();
        System.out.println(linkedhashmap.get(new Employee("kusuma",12)));
    }
    public static Map<Employee,String>getAllEmployees()
    {
        Map<Employee,String>hashmap=new LinkedHashMap<>();
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
