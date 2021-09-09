package samples.ch06;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(final String subject, final LocalDateTime from, final Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(final RecurringSchedule schedule) {
        if (from.getDayOfWeek() != schedule.getDayOfWeek()
            || !from.toLocalTime()
                    .equals(schedule.getFrom())
            || !duration.equals(schedule.getDuration())) {
            reschedule(schedule);
            return false;
        }
        return true;
    }

    private void reschedule(final RecurringSchedule schedule) {
        from = LocalDateTime.of(from.toLocalDate()
                                    .plusDays(daysDistance(schedule)),
                                schedule.getFrom());
        duration = schedule.getDuration();
    }

    private long daysDistance(final RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }
}
