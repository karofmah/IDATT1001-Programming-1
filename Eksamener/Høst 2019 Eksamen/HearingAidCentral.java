import java.util.ArrayList;

public class HearingAidCentral {
    private String name;
    private ArrayList <HearingAid> central;

    HearingAidCentral(String name){
        this.name=name;
        central= new ArrayList<>();
    }
    public boolean registerHearingAid(int aidID, String type){
        HearingAid hearingAid=new HearingAid(aidID,type);
        for(HearingAid aid:central){
            if(aid.getID()!=aidID){
                return central.add(hearingAid);
            }
        }
        return false;
    }
    public boolean rentOutHearingAid(String rentOutToName,int aidID){
        for(HearingAid aid:central){
            if(aid.getID()==aidID){
            return aid.rentOut(rentOutToName);
            }
        }
        return false;
    }
    public boolean deliverHearingAid(int aidID){
        for(HearingAid aid:central){
            if(aid.getID()==aidID){
                return aid.deliver();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for(HearingAid aid : central){
            info.append(aid.toString()).append("\n");
        }
        return info.toString();
    }
    public String availableHearingAidsByType(String Type){
        StringBuilder availableHearingAids = new StringBuilder();
        for(HearingAid aid:central){
            if(aid.getTYPE().equals(Type)){
                availableHearingAids.append(aid.toString()).append("\n");

            }
        }
        return availableHearingAids.toString();
    }

}
