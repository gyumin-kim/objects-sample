package samples.ch04;

public class ReservationAgency {
    public Reservation reserve(final Screening screening, final Customer customer, final int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
