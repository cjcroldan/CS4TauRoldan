package ex06tauroldan;

public class FireType extends Monster{
    
    public FireType (String n, int m, int base){
    super(n, "fire", "grass", "water", m, base);
    atk = 1.3*base;
    def = 0.7*base;
    }
    
    @Override
    public void special(){
        atk += 2;
        hp -= 0.10*maxHP;
    }
}
