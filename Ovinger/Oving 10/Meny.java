
import java.util.ArrayList;
import java.util.HashSet;

public class Meny {
    private ArrayList<Rett> menu;

    //Lager konstruktør
    public Meny() {
        menu = new ArrayList<Rett>();
    }

    //Metode for å registrere ny rett
    public void registerNewDish(String newName, String newType, int newPrice) {
        Rett newRett = new Rett(newName, newType, newPrice);
        menu.add(newRett);
    }
    //Metode for å finne rett, gitt navnet
    public ArrayList findDishByName(String specificName){
        ArrayList<Rett> findDish=new ArrayList<>();
        for(int i=0;i< menu.size();i++){
            if(menu.get(i).getName().equals(specificName)){
                findDish.add(menu.get(i));
            }
        }
        return findDish;
    }
    //Metode for å finne alle retter av en gitt type
    public ArrayList findDishesByType(String specificType){
        ArrayList<Rett> findDishes=new ArrayList<>();
        for(int i=0;i< menu.size();i++){
            if(menu.get(i).getType().equals(specificType)){
                findDishes.add(menu.get(i));
            }
        }
        return findDishes;
    }
    //Metode for å finne total pris til en meny
    public int getTotalPrice(int startPrice,int endPrice){
        int price=0;
        for(int i=0;i< menu.size();i++){
            price+=menu.get(i).getPrice();
        }
        return price;
    }
    //Lager toString-metode
    @Override
    public String toString() {
        return "Meny{" +
                "menu=" + menu +
                '}';
    }
    //public HashSet findDishByName(String specificDish) {
    //HashSet<Rett> findDish = new HashSet<Rett>();
    //java.util.Iterator<Rett> menuIterator = menu.iterator();
    //while (menuIterator.hasNext()) {
    //if (menuIterator.next().getName().equals(specificDish)) {
    //findDish.add(menuIterator.next());
    //}
    //}
    //findDish.toArray();
    //return findDish;
    //}

    //public HashSet findDishesByType(String specificType) {
    //HashSet<Rett> findDishes = new HashSet<>();
    //java.util.Iterator<Rett> menuIterator = menu.iterator();
    //while (menuIterator.hasNext()) {
    // if (menuIterator.next().getType().equals(specificType)) {
    //findDishes.add(menuIterator.next());
    //}
    //}
    //return findDishes;
    //}

    //public int getPrice(){
    //int price=0;
    //java.util.Iterator<Rett> menuIterator = menu.iterator();
    //while (menuIterator.hasNext()) {
    //price=menuIterator.next().getPrice();
    //}
    //return price;
    //}


}