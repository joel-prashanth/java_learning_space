package Methods;

public class Methods {
    
    public static int calculatePunchDamage(int punchStrength){
        return punchStrength * 2;
    }

    public static int calculateSpecialAttackDamage(int punchStrength, String attackType){

        int damage = punchStrength;
        if(attackType.equals("Fire Punch")){
            damage *= 3;
        }else if(attackType.equals("Ice Blast")){
            damage *= 2;
        }
        return damage;
    }
    
    
    
    public static void main(String[] args){

        int villainHealth = 100;
        int punchStrength = 20;
        String attackType = "Fire Punch";

        int damageByPunch = calculatePunchDamage(punchStrength);

        int damageBySpecialAttack = calculateSpecialAttackDamage(punchStrength, attackType);

        System.out.println(damageByPunch);
        System.out.println(damageBySpecialAttack);
        System.out.println(villainHealth);


    }
    
}
