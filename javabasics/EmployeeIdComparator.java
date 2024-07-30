package javabasics;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {
    public int  compare(Employee e1,Employee e2)
    {

        int idComparison=Integer.compare(e1.getId(),e2.getId());
        if(idComparison!=0)
        {
            return idComparison;
        }
        else {
            return e1.getName().compareTo(e2.getName());
        }
    }



}
