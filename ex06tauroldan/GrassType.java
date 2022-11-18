package ex06tauroldan;

public class GrassType extends Monster{
    
    public GrassType(String n, int m, int base){
    super(n, "grass", "water", "fire", m, base);
    }
    
    @Override
    public void special() {
        hp += 0.20*maxHP;
    }
    
    @Override
    public void restoreHealth(){
        hp += 0.5*maxHP;
    }
}