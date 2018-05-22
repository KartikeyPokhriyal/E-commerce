import java.util.ArrayList;

public class ProductList {

    public static void main(String[] args) {


        ArrayList<Mobile> products = new ArrayList<>();
        ArrayList<String> colour = new ArrayList<>();
        colour.add("black");
        colour.add("red");
        colour.add("blue");
        colour.add("golden");

        Camera frontCamera = new Camera(5.6, false, true);
        Camera backCamera = new Camera(16.0, false, true);

        Dimension dimension;
        Mobile mobile, mobile1, mobile2, mobile3;
        ArrayList<Camera> cameras = new ArrayList<>();
        cameras.add(frontCamera);
        cameras.add(backCamera);


        mobile = new Mobile(2000, "SE", "MAC OS", 20, colour, "Apple", 4, 32, true, 2000, cameras, 500, new Dimension(5, 2, 12), 5.6, 899);
        mobile1 = new Mobile(3000, "Galaxy", "Android", 10, colour, "Samsung", 2, 16, true, 2400, cameras, 1, new Dimension(3, 1, 8), 4.5, 877);
        mobile2 = new Mobile(1500, "plus", "Android", 15, colour, "Oppo", 4, 32, true, 2000, cameras, 1, new Dimension(6, 2, 11), 7.6, 678);
        mobile3 = new Mobile(1000, "Asha", "Android", 6, colour, "Nokia", 4, 128, true, 2000, cameras, 600, new Dimension(7, 2, 10), 3.6, 900);

        ArrayList<Mobile> mobiles = new ArrayList<>();

        mobiles.add(mobile);
        mobiles.add(mobile1);
        mobiles.add(mobile2);
        mobiles.add(mobile3);

        Platform kartikey = new Platform(mobiles);

        System.out.println(kartikey.filterByOS("Android"));
        System.out.println(kartikey.filterByPriceRange(1400, 2500));
        System.out.println(kartikey.countOfBrand("Apple"));
        System.out.println(kartikey.sortAccordingToEffectivePrice());
        System.out.println(kartikey.filterByBackCameraResolution());
        System.out.println(kartikey.filterByBrand("Apple"));
        System.out.println(kartikey.filterByWidth());

    }


    }

