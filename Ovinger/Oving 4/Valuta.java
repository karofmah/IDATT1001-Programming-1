
public class Valuta2{

    private double valutakurs;
    

    public Valuta2(double valutakurs){
        this.valutakurs=valutakurs;
        
    }
        
        public double getvalutakurs(){
            return valutakurs;
        }
        public double ConvertTo(double beløp){//Konverterer beløpet til valutaen som har blitt valgt, fra NOK
        return beløp*=valutakurs;

        }
        public double ConvertFrom(double beløp){//Konverterer beløpet fra valutaen som har blitt valgt, til NOK
           return beløp/=valutakurs;
        }
        
    }
    
    