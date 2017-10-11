
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference (Apartment otherApartment) {
        int difference = (this.squareMeters * this.pricePerSquareMeter) - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        if (difference < 0) {
            difference = -difference;
        }
        return difference;        
    }
    
    public boolean moreExpensiveThan (Apartment otherApartment) {
        return this.pricePerSquareMeter * this.squareMeters > otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
    }
}
