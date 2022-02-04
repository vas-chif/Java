package CalculateOAndAir;

/**
 * Created by vas-chif
 */
////this.oxigen = (Flow * (FiO2 - 21)) / ((100 - FiO2) + (FiO2 - 21));
//this.air = Flow - Oxigen;
public class CalculateValueO2 {
    private double oxigen, air;
    public int fiO2;
    int flow;

    public CalculateValueO2(int fiO2, int flow) {
        this.fiO2 = fiO2;
        this.flow = flow;
    }


    public double oxigen() {
        oxigen = (flow * (fiO2 - 21)) / ((100 - fiO2) + (fiO2 - 21));
        System.out.print("Set oxygen to :");
        return oxigen;
    }

    public double air() {
        System.out.print("Set air to :");
        return flow - oxigen;
    }

}
