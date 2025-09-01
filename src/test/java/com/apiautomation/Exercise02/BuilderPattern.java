package com.apiautomation.Exercise02;

public class BuilderPattern {
    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.Step1().Step2().Step3();
    }
    static class Pattern
    {
        //Builder pattern is a design pattern that allows building complex objects step by step

        public Pattern Step1()
        {
            System.out.println("Builder Pattern - Step 1");
            return this;
        }

        public Pattern Step2()
        {
            System.out.println("Builder Pattern - Step 2");
            return this;
        }

        public Pattern Step3()
        {
            System.out.println("Builder Pattern - Step 3");
            return this;
        }

    }
}
