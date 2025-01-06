package Design.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private int id;
    private List<Seat> seats;

    public Screen(int id) {
        this.id = id;
        this.seats = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
