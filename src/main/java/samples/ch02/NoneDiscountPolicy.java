package samples.ch02;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    Money getDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
