package designpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Customer customer = new Customer.CustomBuilder("Bugra","Dal","bugradal4@gmail.com")
                .age(25)
                .address("Ankara")
                .build();

        System.out.println(customer);
    }

}
