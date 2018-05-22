import java.util.ArrayList;

import java.util.Comparator;
import java.util.stream.Collectors;


public class Platform {

    ArrayList<Mobile> mobiles;

    Platform(ArrayList<Mobile> mobiles) {

        this.mobiles =  mobiles;
    }

public ArrayList<Mobile> filterByOS(String os) {

        return (ArrayList<Mobile>)mobiles.stream().filter(x-> x.getOperatingSystem().equals(os)).collect(Collectors.toList());
}

public ArrayList<Mobile> filterByPriceRange(int low, int high) {

        return (ArrayList<Mobile>)mobiles.stream().filter(x-> low < x.getPrice() && high > x.getPrice()).collect(Collectors.toList());
}

public double countOfBrand(String brand) {

        return mobiles.stream().filter(x->x.getBrand().equals(brand)).count();

}

public ArrayList<Mobile> sortAccordingToEffectivePrice() {

        return (ArrayList<Mobile>)mobiles.stream().sorted(Comparator.comparingDouble(Mobile::getEffectivePrice)).collect(Collectors.toList());

}

public ArrayList<Mobile> filterByBackCameraResolution() {

        return (ArrayList<Mobile>)mobiles.stream().filter(x->x.getCameras().stream().filter(y->y.getResolution()>10 && y.isBackCamera()).count()>0).collect(Collectors.toList());

    }


    public ArrayList<Mobile> filterByBrand(String brand) {

        return (ArrayList<Mobile>)mobiles.stream().filter(x-> x.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public ArrayList<Mobile> filterByWidth() {

        return (ArrayList<Mobile>)mobiles.stream().filter(x->x.getDimensions().getBreadth()>2).collect(Collectors.toList());

    }
    }

