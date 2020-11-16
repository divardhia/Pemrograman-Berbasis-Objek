# Tugas Jobsheet 12

## Source Code

- interface IDestroyable

public interface IDestroyable {

    public void destroyed();
}

- class Zombie

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

- class WalkingZombie

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        switch (level) {
            case 1:
                health += (health * 0.1);
                break;
            case 2:
                health += (health * 0.3);
                break;
            case 3:
                health += (health * 0.4);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.2); //To change body of generated methods, choose Tools | Templates.
    }

    public String getZombieInfo() {
        System.out.println("Walking Zombie Data : ");
        String info = "Health: " + health + "\n";
        info += "level: " + level + "\n";
        return info;
    }

}

- class JumpingZombie

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

- class Barrier

public class Barrier implements IDestroyable {

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 9; //To change body of generated methods, choose Tools | Templates.
    }

    public String getBarrierInfo() {
        return "Barrier Strength : " + strength;
    }
}

- class Plant

public class Plant {

    public void doDestroy(IDestroyable d) {
        if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();
        } else if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyed();
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}

- class Tester

public class Tester {

    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("-------------------");

        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}

## Output

<img src = 'output.png'>