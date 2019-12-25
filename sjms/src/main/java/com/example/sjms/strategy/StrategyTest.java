package com.example.sjms.strategy;

public class StrategyTest {

    public static void main(String[] args) {

        MemberStrategy memberStrategy = new SuperMemberStrategy();

        Price price = new Price(memberStrategy);

        double pay = price.calBookPrice(100);

        System.out.println("" + pay);
    }


}
