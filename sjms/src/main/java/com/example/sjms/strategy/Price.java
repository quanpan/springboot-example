package com.example.sjms.strategy;

public class Price {

    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double calBookPrice(double bookPrice) {

        return memberStrategy.calPrice(bookPrice);
    }
}
