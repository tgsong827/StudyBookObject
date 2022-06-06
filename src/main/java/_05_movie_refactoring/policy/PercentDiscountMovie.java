package _05_movie_refactoring.policy;

import _05_movie_refactoring.Money;
import _05_movie_refactoring.Movie;
import _05_movie_refactoring.condition.DiscountCondition;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {
    private double percent;

    public PercentDiscountMovie(String title, Duration runningTime,
                                Money fee, double percent, DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
