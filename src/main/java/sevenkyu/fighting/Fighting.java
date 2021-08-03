package sevenkyu.fighting;

class Fighting {

    public String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (fighter1.damagePerAttack > fighter2.damagePerAttack) {
            return fighter1.name;
        } else if (fighter1.damagePerAttack == fighter2.damagePerAttack) {
            return firstAttacker;
        } else {
            return fighter2.name;
        }
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
