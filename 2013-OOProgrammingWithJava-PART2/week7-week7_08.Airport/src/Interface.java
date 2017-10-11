
import java.util.Scanner;

public class Interface {

    private Scanner reader;
    private Planes planes;
    private Airports airports;

    public Interface(Scanner reader, Planes planes, Airports airports) {
        this.reader = reader;
        this.planes = planes;
        this.airports = airports;
    }

    public void start() {
        this.airportPanel();
        this.flightService();
    }

    public void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");

            System.out.print(">");
            String operation = reader.nextLine();
            if (operation.equals("1")) {
                this.addPlane();
            } else if (operation.equals("2")) {
                this.addAirport();
            } else if (operation.equals("x")) {
                break;
            }
            System.out.println("");
        }
    }

    public void flightService() {
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            
            System.out.print(">");
            String operation = reader.nextLine();
            if (operation.equals("1")) {
                this.planes.printPlanes();
            } else if (operation.equals("2")) {
                this.airports.printAirports();
            } else if (operation.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println(this.planes.getPlane(id));
            } else if (operation.equals("x")) {
                break;
            }
            System.out.println("");
        }
    }

    public void addPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());

        this.planes.addPlane(id, capacity);
    }

    public void addAirport() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String dep = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String des = reader.nextLine();
        
        String code = " (" + dep + "-" + des + ")";

        this.airports.add(code, planes.getPlane(id));
    }
    
    
}
