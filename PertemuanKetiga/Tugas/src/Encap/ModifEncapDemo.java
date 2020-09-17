/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encap;

/**
 *
 * @author HP 14-BW005AU
 */
public class ModifEncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {;
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void status() {
        System.out.println("Name : " + getName());
        if (age > 18 && age < 30) {
            System.out.println("age : " + getAge());
        } else {
            System.out.println("age bernilai minimal 18 dan maksimal 30.");;
        }
        System.out.println();
    }
}
