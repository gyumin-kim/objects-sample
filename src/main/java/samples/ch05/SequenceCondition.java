package samples.ch05;

public class SequenceCondition {
    private int sequence;

    public SequenceCondition(final int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(final Screening screening) {
        return sequence == screening.getSequence();
    }
}
