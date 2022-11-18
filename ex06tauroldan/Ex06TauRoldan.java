package ex06tauroldan;

public class Ex06TauRoldan {

    
    public static void main(String[] args) {
        FireType blossom = new FireType("Blossom", 50, 10);
        GrassType buttercup = new GrassType("Buttercup", 40, 20);
        WaterType bubbles = new WaterType("Bubbles", 30, 25);
    
        while(blossom.hp > 0 && buttercup.hp > 0){
        blossom.attack(buttercup);
        buttercup.attack(blossom);
        }
        
        blossom.hp = blossom.maxHP;
        buttercup.hp = buttercup.maxHP;
        bubbles.hp = bubbles.maxHP;
        
        while(blossom.hp > 0 && bubbles.hp > 0){
        blossom.attack(bubbles);
        bubbles.attack(blossom);
        }
        
        blossom.hp = blossom.maxHP;
        buttercup.hp = buttercup.maxHP;
        bubbles.hp = bubbles.maxHP;
        
        while(bubbles.hp > 0 && buttercup.hp > 0){
        bubbles.attack(buttercup);
        buttercup.attack(bubbles);
        }
    }
    
}
