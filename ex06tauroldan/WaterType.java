package ex06tauroldan;

public class WaterType extends Monster{
    
    public WaterType(String n, int m, int base){
    super(n, "water", "fire", "grass", m, base);
    atk = 0.7*base;
    def = 1.3*base;
    }
    
    @Override
    public void special(){
        def += 2;
        hp -= 0.10*maxHP;
    }
}