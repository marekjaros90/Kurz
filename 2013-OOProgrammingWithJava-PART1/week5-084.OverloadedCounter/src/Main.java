public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter coun = new Counter (3,true);
        
        coun.decrease();
        
        System.out.println(coun.value());
    }
}
