package device;

public class MainDevice {
    public static void main(String[] args) {

        TypeInfusionDevice typeInfusionDevice = new TypeInfusionDevice();

        typeInfusionDevice.central(3);
        typeInfusionDevice.periferic(2);
        typeInfusionDevice.combined(2,2);

    }
}
