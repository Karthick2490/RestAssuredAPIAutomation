package com.apiautomation.Exercise02;

public class NonBuilderPattern {

    static class NoPattern
    {
        public void step1()
        {
            System.out.println("Step 1");
        }

        public void step2()
        {
            System.out.println("After Step 1, Step 2!");
        }
    }

    public static void main(String[] args) {
        NoPattern noPattern = new NoPattern();
        noPattern.step1();
        noPattern.step2();
    }
}


