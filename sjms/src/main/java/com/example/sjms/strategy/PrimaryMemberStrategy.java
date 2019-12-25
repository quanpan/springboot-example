package com.example.sjms.strategy;

public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double bookPrice) {

        System.out.println("普遍会员9折");

        return bookPrice * 0.9;
    }
}
