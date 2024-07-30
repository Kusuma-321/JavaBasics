package javabasics.java8;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String args[])
    {
        List<Person>personList=loadPersons();
        Person person=personList.stream().
                filter(per->per.getName().endsWith("a")).
                findFirst().orElse(new Person("keerthi",21));
        System.out.println(person);
        List<Person>othersList=personList.stream().filter(perso->perso.getAge()>20).collect(Collectors.toList());
        othersList.forEach(System.out::println);
    }
    public static List<Person>loadPersons()
    {
List<Person>list=new ArrayList<>();
list.add(new Person("kusuma",21));
list.add(new Person("harsha",19));
list.add(new Person("raju",15));
list.add(new Person("laxmi",30));
return list;
    }
}
