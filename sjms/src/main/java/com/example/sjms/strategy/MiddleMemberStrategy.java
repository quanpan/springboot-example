package com.example.sjms.strategy;

public class MiddleMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {

        System.out.println("中级会员7折");

        return bookPrice * 0.7;
    }
}
