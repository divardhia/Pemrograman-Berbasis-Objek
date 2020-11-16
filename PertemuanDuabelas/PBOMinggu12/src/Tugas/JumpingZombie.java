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
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        switch (level) {
            case 1:
                health += (health * 0.3);
                break;
            case 2:
                health += (health * 0.4);
                break;
            case 3:
                health += (health * 0.5);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.1); //To change body of generated methods, choose Tools | Templates.
    }

    public String getZombieInfo() {
        System.out.println("Jumping Zombie Data : ");
        String info = "Health: " + health + "\n";
        info += "level: " + level + "\n";
        return info;
    }
}
