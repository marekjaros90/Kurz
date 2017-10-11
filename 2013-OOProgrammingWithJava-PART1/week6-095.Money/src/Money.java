
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money newMoney = new Money(this.euros + added.euros, this.cents + added.cents);
        return newMoney;
    }

    public boolean less(Money compared) {
        return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
    }

    public Money minus(Money decremented) {
        if (this.euros < decremented.euros()) {
            return new Money(0, 0);
        }
        
        int euroDiff = euros - decremented.euros;
        int centDiff = cents - decremented.cents;
        
         if (centDiff < 0) {
            euroDiff --;
            centDiff += 100;
        }
        
        return new Money(euroDiff, centDiff);
    }

}
