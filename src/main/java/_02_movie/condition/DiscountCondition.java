package _02_movie.condition;

import _02_movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}