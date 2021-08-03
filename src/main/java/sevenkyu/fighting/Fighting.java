package sevenkyu.fighting;

import java.util.List;

class Fighting {

    public String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = selectAttacker(fighter1, fighter2, firstAttacker);
        Fighter defender = getOtherCharacter(attacker, fighter1, fighter2);
        while (true) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) {
                return attacker.name;
            }
            attacker = getOtherCharacter(attacker, fighter1, fighter2);
            defender = getOtherCharacter(defender, fighter1, fighter2);
        }
    }

    private Fighter selectAttacker(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        return List.of(fighter1, fighter2).stream()
            .filter(fighter -> fighter.name.equals(firstAttacker))
            .findFirst()
            .get();
    }

    private Fighter getOtherCharacter(Fighter current, Fighter fighter1, Fighter fighter2) {
        return current == fighter1 ? fighter2 : fighter1;
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }
}
