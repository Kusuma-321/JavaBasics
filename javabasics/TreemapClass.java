package javabasics;

import java.util.Map;
import java.util.TreeMap;

public class TreemapClass {
    public static void main(String args[]) {
        Map<Employee, String> treemap = new TreeMap<>(new EmployeeIdComparator());
      treemap.put(new Employee("kusuma",121),"kusumaa");
      treemap.put(new Employee("harsha",100),"harshaa");
      treemap.put(new Employee("laxmi",95),"laxmiiii");
    for(Map.Entry<Employee,String>emp:treemap.entrySet())
    {
        System.out.println(emp.getKey()+"->"+emp.getValue());
    }
    }

}
