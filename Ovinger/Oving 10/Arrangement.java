public class Arrangement {
    private final int number;
    private String place;
    private String host;
    private String type;
    private long time;

    public Arrangement(int number, String place, String host, String type, long time){
        this.number=number;
        this.place=place;
        this.host=host;
        this.type=type;
        this.time=time;

    }
//Lager tilgangsmetoder
    public int getNumber() {
        return number;
    }

    public long getTime() {
        return time;
    }

    public String getHost() {
        return host;
    }

    public String getPlace() {
        return place;
    }

    public String getType() {
        return type;
    }


//toString-metode
    public String toString() {
        return "Arrangement{" +
                "number=" + number +
                ", place='" + place + '\'' +
                ", host='" + host + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
