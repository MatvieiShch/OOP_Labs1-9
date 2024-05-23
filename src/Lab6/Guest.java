import java.util.Scanner;
public class Guest {
    String name;
    String address;
    double pricePerDay;
    int duration;

    // Конструктор класу
    public Guest(String name, String address, double pricePerDay, int duration) {
        this.name = name;
        this.address = address;
        this.pricePerDay = pricePerDay;
        this.duration = duration;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter price per day: ");
        this.pricePerDay = scanner.nextDouble();
        System.out.print("Enter duration of stay: ");
        this.duration = scanner.nextInt();
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Price per day: " + pricePerDay);
        System.out.println("Duration of stay: " + duration);
    }


    public double calculateCost() {
        return pricePerDay * duration;
    }
}

