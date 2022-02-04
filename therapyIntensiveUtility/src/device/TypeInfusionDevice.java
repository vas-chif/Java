package device;

public class TypeInfusionDevice implements IDevice {


    @Override
    public void central(int numberInfusionRouts) {
        if (numberInfusionRouts > 5 || numberInfusionRouts < 1) {
            System.out.println("The number of routes is out of range!");
            return;
        }
        System.out.println("The number of infusion routes is: " + numberInfusionRouts);
    }

    @Override
    public void periferic(int numberInfusionRouts) {
        if (numberInfusionRouts > 5 || numberInfusionRouts < 1) {
            System.out.println("The number of routes is out of range!");
            return;
        }
        System.out.println("The number of infusion routes is: " + numberInfusionRouts);
    }

    public void combined(int numberInfusionRoutsCVC, int numberInfusionRoutsCvp) {
        if (numberInfusionRoutsCVC > 5 || numberInfusionRoutsCVC < 1) {
            System.out.println("The number of routes is out of range!");
            return;
        }

        if (numberInfusionRoutsCvp > 5 || numberInfusionRoutsCvp < 1) {
            System.out.println("The number of routes is out of range!");
            return;
        }
        System.out.println("Selected the number of infusion CVC routes : " + numberInfusionRoutsCVC);
        System.out.println("Selected the number of periferic device: " + numberInfusionRoutsCvp);

        System.out.println(String.format("Total number of routs is: [central = %s, periferic = %s]", numberInfusionRoutsCVC, numberInfusionRoutsCvp));
    }

}
