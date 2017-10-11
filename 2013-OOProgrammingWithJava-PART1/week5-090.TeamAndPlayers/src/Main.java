public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        Player pekka = new Player ("pekka");
        Player marek = new Player ("Marek", 20);
        
        barcelona.addPlayer(marek);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("jan", 5));
        
        
        barcelona.printPlayers();
        
        System.out.println(barcelona.size());
        System.out.println(barcelona.goals());
        

    }
}
