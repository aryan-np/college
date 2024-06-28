package wk3;
class Address {
    private String street;
    private String city;
    private String zipCode;

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

public class Task11 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Hadi gaun");
        address.setCity("KTM");
        address.setZipCode("1000");
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("Zip Code: " + address.getZipCode());
    }
}
