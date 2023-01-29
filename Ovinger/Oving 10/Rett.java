public class Rett {
    private final String name;
    private String type;
    private int price;

    public Rett(String name,String type,int price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
//Lager tilgangsmetoder
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    //Lager toString-metode
    @Override
    public String toString() {
        return "Rett{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
