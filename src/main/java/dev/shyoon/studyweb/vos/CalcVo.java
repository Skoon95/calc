package dev.shyoon.studyweb.vos;

//entity
public class CalcVo {
    private int a;
    private int b;
    private String operator;

    public int getA() {
        return a;
    }

    public CalcVo setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public CalcVo setB(int b) {
        this.b = b;
        return this;
    }

    public String getOperator() {
        return operator;
    }

    public CalcVo setOperator(String operator) {
        this.operator = operator;
        return this;
    }
}
