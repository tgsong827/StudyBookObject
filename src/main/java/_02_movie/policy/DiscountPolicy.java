package _02_movie.policy;

import _02_movie.Money;
import _02_movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}