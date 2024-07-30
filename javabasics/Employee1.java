package javabasics;
import java.lang.*;
import java.util.*;

public class Employee1 implements Comparable<Employee1>{
   private String name;
   private int id;
   public  Employee1(String name, int id)
   {
this.name=name;
this.id=id;
   }

   public String getName() {
      return name;
   }

   public int getId() {
      return id;
   }

   @Override
   public String toString() {
      return "Employee1{" +
              "name='" + name + '\'' +
              ", id=" + id +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee1 employee1 = (Employee1) o;
      return id == employee1.id && Objects.equals(name, employee1.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, id);
   }

   public int compareTo(Employee1 e)
   {
      return Integer.compare(this.id,e.getId());
   }
   public static void main(String args[])
   {
      Set<Employee1> linkedhashset=new LinkedHashSet<>();
      linkedhashset.add(new Employee1("kusuma",12));
      linkedhashset.add(new Employee1("harsha",10));
      linkedhashset.add(new Employee1("laxmi",11));
      for(Employee1 l:linkedhashset)
      {
         System.out.println(l);
      }
     List<Employee1>list=new ArrayList<>(linkedhashset);
      Collections.sort(list);
      for(Employee1 emp:list)
      {
         System.out.println(emp);
      }


   }
}
