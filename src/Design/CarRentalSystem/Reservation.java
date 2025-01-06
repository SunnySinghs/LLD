package Design.CarRentalSystem;

import Design.CarRentalSystem.Enum.ReservationStatus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private int reservationId;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private double amount;
    private ReservationStatus status;

    public Reservation(int reservationId, Customer customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate, double amount, ReservationStatus status) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = calculateAmount();
        this.status = status;
    }

    private double calculateAmount() {
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        return days * amount;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", customer=" + customer +
                ", vehicle=" + vehicle +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
