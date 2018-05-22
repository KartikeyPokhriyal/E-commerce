import java.util.ArrayList;

public class Mobile {

    private double price;
    private String name;
    private String operatingSystem;
    private double discount;
    private ArrayList<String> colour;
    private String brand;
    private int ram;
    private int storage;
    private boolean dualSim;
    private int battery;
    private ArrayList<Camera> cameras;
    private int weight;
    private Dimension dimension;
    private double screenSize;

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", discount=" + discount +
                ", colour=" + colour +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", dualSim=" + dualSim +
                ", battery=" + battery +
                ", cameras=" + cameras +
                ", weight=" + weight +
                ", dimensions=" + dimension +
                ", screenSize=" + screenSize +
                ", id=" + id +
                '}';
    }

    private int id;

    public Mobile(double price, String name, String operatingSystem, double discount, ArrayList<String> colour, String brand, int ram, int storage, boolean dualSim, int battery, ArrayList<Camera> cameras, int weight, Dimension dimension, double screenSize, int id) {
        this.price = price;
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.discount = discount;
        this.colour = colour;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.dualSim = dualSim;
        this.battery = battery;
        this.cameras = cameras;
        this.weight = weight;
        this.dimension = dimension;
        this.screenSize = screenSize;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getDiscount() {
        return discount;
    }

    public ArrayList<String> getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public int getBattery() {
        return battery;
    }

    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    public int getWeight() {
        return weight;
    }

    public Dimension getDimensions() {
        return dimension;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getId() {
        return id;
    }

    public void makePackage(Mobile mobile) {
        ArrayList<Mobile> packet = new ArrayList<>();
        packet.add(mobile);

    }

    public double getEffectivePrice() {

        return this.price*(100 - this.discount)/100;

    }
}


class Camera {
    private double resolution;
    boolean frontCamera;
    boolean backCamera;

    public Camera(double resolution, boolean backCamera, boolean frontCamera) {
        this.resolution = resolution;
        this.frontCamera = frontCamera;
        this.backCamera = backCamera;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "resolution=" + resolution +
                ", frontCamera=" + frontCamera +
                ", backCamera=" + backCamera +
                '}';
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isFrontCamera() {
        return frontCamera;
    }

    public boolean isBackCamera() {
        return backCamera;
    }
}

class Dimension {

    int length;
    int breadth;
    int height;

    public Dimension(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                '}';
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }
}

