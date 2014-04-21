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
public class Class23LabsPart567 {
    public static void main(String[] args){
//        List<Employee> emp = new ArrayList(4);
//        
//        emp.add(0,new Employee(1, "Jobs", "Steve", "111-11-1111"));
//        emp.add(1,new Employee(1, "Jobs", "Steve", "111-11-1111"));
//        emp.add(2,new Employee(1, "Rogers", "Aaron", "222-22-2222"));
//        emp.add(3,new Employee(1, "Gates", "Bill", "333-33-3333"));
//        System.out.println(emp.size());
//        
        //key will be ssn
        HashMap<String, Employee> emp = new HashMap();
        
        Employee e1 = new Employee(1, "Jobs", "Steve", "111-11-1111");
        Employee e2 = new Employee(2, "Jobs", "Steve", "111-11-1111");
        Employee e3 = new Employee(3, "Rogers", "Aaron", "222-22-2222");
        Employee e4 = new Employee(4, "Gates", "Bill", "333-33-3333");
        
        //add emplyees to hashmap
        emp.put(e1.getSsn(), e1);
        emp.put(e2.getSsn(), e2);
        emp.put(e3.getSsn(), e3);
        emp.put(e4.getSsn(), e4);
        
        //check how many values are in the map
        Set mapKeys = emp.keySet();
        //should print 3
        System.out.println(mapKeys.size());
        //create an array of the ketSe
        Object[] keys = mapKeys.toArray();
        //iterate through the array of keys and use them to retrieve objects from the map
        for(Object o : keys){
            System.out.println(o.toString());
            String key = o.toString();
            Employee temp = emp.get(key);
            System.out.println(temp.toString());
        }
    }
}
