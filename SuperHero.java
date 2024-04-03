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
        System.out.println("Here is putting his " + this.suit + " on.");
    }
}

class BlackPanter extends HeroBase {

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
    }
}