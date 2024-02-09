public class Customer {
    private String name;
    private double creditLimit;
    private String email;


    public Customer (){
        this ( "nobody", "nobody@fuckoff.com");
    }
    public Customer(String name, String email) {
        this("ajinkya", 1000, "hello.ajinkya@email.com");

    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}


