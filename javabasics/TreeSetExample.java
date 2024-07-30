package javabasics;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;
import java.util.*;
public class TreeSetExample {
    public static void main(String args[])
    {
        Set<Employee>treeSet=new TreeSet<>(new EmployeeIdComparator());
        treeSet=getAllEmployees();
        treeSet.contains(new Employee("kusuma",12));
        for(Employee e:treeSet)
        {
            System.out.println(e);
        }
    }
    public static TreeSet<Employee>getAllEmployees()
    {
        Set<Employee>ts=new TreeSet<>(new EmployeeIdComparator());
        ts.add(new Employee("kusuma",12));
        ts.add(new Employee("harshaa",10));
        ts.add(new Employee("laxmiii",11));
        return (TreeSet<Employee>)ts;
    }
}
