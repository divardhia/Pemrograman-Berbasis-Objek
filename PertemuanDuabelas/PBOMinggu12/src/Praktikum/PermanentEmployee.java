/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author HUAWEI
 */
public class PermanentEmployee extends Employee implements Payable {

    private int salary;

    public PermanentEmployee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int getPaymetAmount() {
        return (int) (salary + 0.05 * salary); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}
