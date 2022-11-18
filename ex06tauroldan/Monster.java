package ex06tauroldan;

import java.util.ArrayList;

public class Monster {
    public final String name, type, strongAgainst, weakAgainst; //variables are public
    public int maxHP, hp, xp, lvl; //variables are public
    public double atk, def; // atk and def are doubles
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.def));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.name +
            " and dealt " + damage + " damage, reducing it to " + m.hp + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.name + " fainted.\n\n");
        }
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }

    public void restoreHealth(){
        hp = maxHP;
    }

}
