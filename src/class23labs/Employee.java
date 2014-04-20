package class23labs;

//import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Objects;

/**
 * This class represents an Employee entity that will be sorted by its
 * "natural order," defined to be by empID.
 * 
 * @author jlombardo
 */
public class Employee  {
    private int empID;
    private String lastName;
    private String firstName;
    private String ssn;


    public Employee() {
    }

    public Employee(int empID, String lastName, String firstName, String ssn) {
        this.empID = empID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.empID = empID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }
    


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) throws IllegalArgumentException {
            if(value == null || value.length() == 0) {
                    throw new IllegalArgumentException("value cannot be null or zero length");
            }
            firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpID(int id) {
        this.empID = id;
    }

    public int getEmpID() {
        return empID;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

}
