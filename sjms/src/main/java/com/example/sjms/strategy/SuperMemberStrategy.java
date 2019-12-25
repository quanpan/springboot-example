package com.example.sjms.strategy;

public class SuperMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {

        System.out.println("超级会员5折");

        return bookPrice * 0.5;
    }
}
