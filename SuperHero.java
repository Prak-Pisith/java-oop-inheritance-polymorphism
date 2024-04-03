class HeroBase {
    private String suit;
    private String color;
    private String specialPower;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    // Behavior
    public void useSpecialPower() {
        System.out.println("Hero is using his " + this.specialPower + " special power ...");
    }

    public void putOnSuit() {
        System.out.println("Hero is putting his " + this.suit + " on.");
    }
}

class BlackPanter extends HeroBase {}
class SuperMan extends HeroBase {

    @java.lang.Override
    public void useSpecialPower() {
        super.useSpecialPower();
        System.out.println("Super Man is using their unqui special power different from other super heroes.");
    }

    public void fly() {
        System.out.println("Super Man is Flying ...");
    }
}

// Main Class
class SuperHero {
    public static void main(String[] args) {
        System.out.println("Super Hero");

        BlackPanter bp = new BlackPanter();
        bp.setColor("Black");
        bp.setSuit("Block Adamatuim Suit");
        bp.setSpecialPower("Healing Factor");

        bp.putOnSuit();
        bp.useSpecialPower();

        System.out.println("============");

        SuperMan sm = new SuperMan();
        sm.setColor("Blue and Red");
        sm.setSuit("Spcial Super-Man suit");
        sm.setSpecialPower("Laser Eyes");
        sm.putOnSuit();
        sm.useSpecialPower();
        sm.fly();

        System.out.println("=================");
        bp.useSpecialPower();
        sm.useSpecialPower();
    }
}