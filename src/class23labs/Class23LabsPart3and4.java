/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class23labs;
import java.util.*;

/**
 *
 * @author Keiji
 */
public class Class23LabsPart3and4 {
    public static void main(String[] args){
        List<Employee> emp = new ArrayList(4);
        
        emp.add(0,new Employee(1, "Jobs", "Steve", "111-11-1111"));
        emp.add(1,new Employee(1, "Jobs", "Steve", "111-11-1111"));
        emp.add(2,new Employee(1, "Rogers", "Aaron", "222-22-2222"));
        emp.add(3,new Employee(1, "Gates", "Bill", "333-33-3333"));
        System.out.println(emp.size());
        
        //no cast needed for get()
        Employee emp2 = emp.get(1);
        //output is the same
        System.out.println(emp2.toString());
        
        //new for loop
        for(Employee e: emp){
            System.out.println(e.toString());
        }
        
        Set<Employee> emp3 = new HashSet();
        List<Employee> emp4 = new ArrayList();
        boolean notContain = false;
        for(Employee e: emp){
            //prints "false" if element is already contained in the set
            notContain = emp3.add(e);
            System.out.println(notContain);
            //if the element is not already in the set, add it to temp
            if(notContain){
                emp4.add(e);
            }
        }
        //should print 3
        System.out.println(emp4.size());
    }
}
