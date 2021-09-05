package samples.ch05;

import java.time.Duration;

public class NoneDiscountMovie extends Movie {
    public NoneDiscountMovie(final String title, final Duration runningTime, final Money fee) {
        super(title, runningTime, fee);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
