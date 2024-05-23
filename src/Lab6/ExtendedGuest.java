class ExtendedGuest extends Guest {

    String phoneNumber;
    String email;

    public ExtendedGuest(String name, String address, double pricePerDay, int duration, String phoneNumber, String email) {
        super(name, address, pricePerDay, duration);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    @Override
    public void display() {
        super.display(); // Виклик функції виведення батьківського класу
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

