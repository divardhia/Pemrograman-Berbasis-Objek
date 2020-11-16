/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HUAWEI
 */
public class Zombie implements IDestroyable {

    protected int health;
    protected int level;

    public void heal() {

    }

    @Override
    public void destroyed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getZombieInfo() {
        String info = "Health: " + health;
        info += "level: " + level;
        return info;
    }
}
