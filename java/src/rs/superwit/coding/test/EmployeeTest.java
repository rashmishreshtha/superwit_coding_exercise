package rs.superwit.coding.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rs.superwit.coding.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getInfoTest() {
        Employee emp = new Employee();
        emp.getinfo(543, 7);
        Assert.assertEquals(String.valueOf(548.00), String.valueOf(emp.salary));
        System.out.println(emp.salary);
    }
}