import java.util.ArrayList;

public class MenyRegister {
    private ArrayList<Meny> register;
//Lager kontruktør
    public MenyRegister(){

        register=new ArrayList<Meny>();
    }
    //Lager metode for å registrere ny rett
    public void registerNewDish(String newName,String newType,int newPrice,int menyNr){
        register.get(menyNr-1).registerNewDish(newName,newType,newPrice);

    }
    //Lager metode for å finne rett, gitt navnet
    public ArrayList findDishByName(String specificName){
       ArrayList<ArrayList> findDish=new ArrayList<>();
        for (int i=0;i< register.size();i++){
            findDish.add(register.get(i).findDishByName(specificName));
            //hvorfor kan man ikke sette findDish lik det som midlertidig skal legges til
        }
    return findDish;
    }
    //Lager metode for å finne rett av en gitt type
    public ArrayList findDishesbyType(String specificType){
        ArrayList<ArrayList> findDishes=new ArrayList<>();
        for (int i=0;i<register.size();i++){
            findDishes.add(register.get(i).findDishesByType(specificType));
        }
    return findDishes;
    }
    //Metode for å registrere ny meny
    public void registerNewMenu(){
        Meny meny_1=new Meny();
        register.add(meny_1);
    }
    //Metode for å finne alle menyer med totalpris innenfor et gitt intervall
    public ArrayList findMenusByPrice(int startPrice,int endPrice){
        ArrayList<Meny> findMenusByPrice=new ArrayList<>();
        for (int i=0;i< register.size();i++) {
            int price=register.get(i).getTotalPrice(startPrice, endPrice);
            if(price>startPrice && price<endPrice){
                findMenusByPrice.add(register.get(i));
            }
        }
    return findMenusByPrice;
        }
//Lager toString-Metode
    @Override
    public String toString() {
        return "MenyRegister{" +
                "register=" + register +
                '}';
    }
}
