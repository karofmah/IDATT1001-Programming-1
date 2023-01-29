public class Client {
    public static void main(String[] args) {


        HearingAidCentral central = new HearingAidCentral("business' central");

        central.registerHearingAid(3918,"Høreapparat");
        central.rentOutHearingAid()
    }
}
