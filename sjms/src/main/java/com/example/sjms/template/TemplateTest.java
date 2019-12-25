package com.example.sjms.template;

public class TemplateTest {

    public static void main(String[] args) {

        String exp = "10+10";
        String opt = "\\+";
        AbstactCalculator calculator = new Plus();
        int result = calculator.calculate(exp, opt);
        System.out.println(result);
    }
}
