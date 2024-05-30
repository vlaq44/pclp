package ro.unitbv.pclp2.lab10;


interface IceCream {
    String getDescription();
    double getCost();
}


abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}


class BasicIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "cone";
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}


class Chocolate extends ToppingDecorator {
    public Chocolate(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding chocolate");
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", chocolate";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 1.5;
    }
}

class Vanilla extends ToppingDecorator {
    public Vanilla(IceCream iceCream) {
        super(iceCream);
        System.out.println("Adding vanilla");
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", vanilla";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 2.0;
    }
}


public class p1 {
    public static void main(String[] args) {
        IceCream iceCream = new Vanilla(new Chocolate(new BasicIceCream()));
        System.out.println("Ingredients: " + iceCream.getDescription());
        System.out.println("Cost: " + iceCream.getCost());
    }
}
