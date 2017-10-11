/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek
 */
public class LyyraCard {
    
    private double balance;
    private final double Gourmet = 4.0;
    private final double Economical = 2.5;
    
    public LyyraCard (double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        if (this.balance >= Economical) {
            this.balance -= Economical;
        }
    }
    
    public void payGourmet() {
        if (this.balance >= Gourmet) {
            this.balance -= Gourmet;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
                if (this.balance > 150) {
                    this.balance = 150;
                }
        }
    }
}
