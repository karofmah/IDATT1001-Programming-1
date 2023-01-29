public class MenyRegisterKlient {
    public static void main(String[] args) {
        MenyRegister register=new MenyRegister();
        register.registerNewMenu();
        register.registerNewMenu();
        register.registerNewDish("Biffsnadder","Hovedrett",200,1);
        register.registerNewDish("Pizza","Hovedrett",100,2);
        System.out.println(register.toString());
        System.out.println(register.findDishByName("Biffsnadder"));
        System.out.println(register.findDishesbyType("Hovedrett"));
        System.out.println(register.findMenusByPrice(50,150));

    }
}
