package designpatterns.builder;

public class Customer {
    String name;
    String surname;
    String email;
    int age;
    String phone;
    String address;

    private Customer(CustomBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer: {"+
                " Name: "+this.name+
                ", Surname: "+this.surname+
                ", Email: "+this.email+
                ", Age: "+this.age+
                ", Phone: "+this.phone+
                ", Address: "+this.address+" }";
    }

    public static class CustomBuilder {
        private final String name;
        private final String surname;
        private final String email;
        private int age;
        private String phone;
        private String address;

        public CustomBuilder(String name, String surname, String email) {
            this.name = name;
            this.surname = surname;
            this.email = email;
        }

        public CustomBuilder age(int age) {
            this.age = age;
            return this;
        }

        public CustomBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public CustomBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Customer build() {
            Customer user = new Customer(this);
            return user;
        }
    }
}

