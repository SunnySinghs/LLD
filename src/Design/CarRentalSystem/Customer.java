package Design.CarRentalSystem;

public class Customer {
    private int id;
    private String name;
    private int phoneNo;
    private String drivingLicenseNumber;

    public Customer(int id, String name, int phoneNo, String drivingLicenseNumber) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
                '}';
    }
}
