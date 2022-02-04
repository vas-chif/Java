package com.example.calculateoandair;

public class CalculateValueO2 {
    private double oxigen, air;
    private int fiO2, flow;

    //calculate flow oxygen in liter/minute
    public double oxigen(int fiO2, int flow) {
        this.fiO2 = fiO2;
        this.flow = flow;
        oxigen = (flow * (fiO2 - 21)) / ((100 - fiO2) + (fiO2 - 21));
        // System.out.print("Set oxygen to :");
        return oxigen;
    }

    //calculate flow air in liter/minute
    public double air(int flow, double oxigen) {
        this.flow = flow;
        this.oxigen = oxigen;
        // System.out.print("Set air to :");
        return flow - oxigen;
    }
}
