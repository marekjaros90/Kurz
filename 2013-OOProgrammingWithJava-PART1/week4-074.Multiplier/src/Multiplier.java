/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek
 */
public class Multiplier {
    
    private int multip;
    
    public Multiplier (int number) {
        this.multip = number;
    }
    
    public int multiply (int otherNumber) {
        int result = this.multip * otherNumber;
        return result;
    }
    
}
