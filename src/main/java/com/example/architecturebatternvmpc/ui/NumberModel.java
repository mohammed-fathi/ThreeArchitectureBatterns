package com.example.architecturebatternvmpc.ui;

public class NumberModel {
    private int firstNum, secondNum;

    public NumberModel(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int plus() {
        int result = firstNum + secondNum;
        return result;
    }
}
