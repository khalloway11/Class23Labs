/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class23labs;
import java.util.*;

/**
 *
 * @author khalloway
 */
public class Class23LabsPart1and2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List emp = new ArrayList(4);
        emp.add(0,new Employee(1, "Jobs", "Steve", "111-11-1111"));
        emp.add(1,new Employee(1, "Jobs", "Steve", "111-11-1111"));
        emp.add(2,new Employee(1, "Rogers", "Aaron", "222-22-2222"));
        emp.add(3,new Employee(1, "Gates", "Bill", "333-33-3333"));
        System.out.println(emp.size());
        //list size = 4
        
        Employee emp2 = (Employee)emp.get(1);
        System.out.println(emp2.toString());
        
        //error without cast
        //Employee emp3 = emp.get(1);
        
        for(int i = 0; i < emp.size(); i++){
            System.out.println(emp.get(i).toString());
            if(emp.get(i).equals(emp2)){
                //checks for equality
                System.out.println("emp2 is in the list");
            }
            
            
        }
        if(emp.contains(emp2)){
            //only tells if an object is in the list by returning a boolean
            System.out.println("emp2 is in the list");   
        }
        
    }
    
}
