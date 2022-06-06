package _05_movie_refactoring;

public class ReservationAgency {
//    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
//        Movie movie = screening.getMovie();
//
//        boolean discountable = false;
//        for(DiscountCondition condition : movie.getDiscountConditions()) {
//            if (condition.getType() == DiscountConditionType.PERIOD) {
//                discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
//                        condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
//                        condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
//            } else {
//                discountable = condition.getSequence() == screening.getSequence();
//            }
//
//            if (discountable) {
//                break;
//            }
//        }
//        Money fee;
//        if (discountable) {
//            Money discountAmount = Money.ZERO;
//            switch(movie.getMovieType()) {
//                case AMOUT_DISCOUNT:
//                    discountAmount = movie.getDiscountAmount();
//                    break;
//                case PERCENT_DISCOUNT:
//                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
//                    break;
//                case NONE_DISCOUNT:
//                    discountAmount = Money.ZERO;
//                    break;
//            }
//
//            fee = movie.getFee().minus(discountAmount);
//        } else {
//            fee = movie.getFee();
//        }
//
//        return new Reservation(customer, screening, fee, audienceCount);
//    }

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
