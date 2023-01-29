//Klientprogrammet konverterer et beløp som brukeren bestemmer, og konverterer dette fra og til en bestemt valuta
import static javax.swing.JOptionPane.*;


class ValutaKlient{
    public static void main(String[] args) {
    int choice=YES_OPTION;   
        do{
            System.out.println(" 1: Dollar\n 2: Euro\n 3: Svenske kroner (SEK)"); //Presenterer meny for brukeren
            String valutaLest=showInputDialog("Bestem Valuta"); //Velge en valuta man vil 
            int VelgValuta = Integer.parseInt(valutaLest);

            String beløpLest=showInputDialog("Skriv beløp");//Skriv inn beløpet
            double beløp=Double.parseDouble(beløpLest);
             
            //Dersom tallet 1 skrives inn, blir Dollar valgt
             if(VelgValuta==1){
                    Valuta2 Dollar=new Valuta2(0.12);
                    System.out.println(" 0: Fra NOK til Dollar\n 1: Fra Dollar til NOK");//Velge fra eller til valgt Valuta
                    String NOKorNOTLest=showInputDialog("Bestem Valuta (fra/til)");
                    int NOKorNOT=Integer.parseInt(NOKorNOTLest);

                    //Dersom tallet 0 skrives inn, konverteres beløpet fra NOK til Dollar
                    if(NOKorNOT==0){
                        System.out.println("Fra NOK til Dollar");
                        double NyBeløp=Dollar.ConvertTo(beløp);
                        System.out.println(beløp + " NOK" + "=" + NyBeløp + " Dollar");
                        choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Valuta", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet
                    }   //Dersom tallet 1 skrives inn, konverteres beløpet fra Dollar til NOK
                    if(NOKorNOT==1){
                        System.out.println("Fra Dollar til NOK:");
                        double NyBeløp=Dollar.ConvertFrom(beløp);
                        System.out.println(beløp + " Dollar"+ "=" + NyBeløp + " NOK");
                        choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Valuta", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet

                    }
                }//Dersom tallet 2 skrives inn i 'skriv tall', blir Euro valgt
                
                    if(VelgValuta==2){
                        Valuta2 Euro=new Valuta2(0.098);
                        System.out.println(" 0: Fra NOK til Euro\n 1: Fra Euro til NOK");//Velge fra eller til valgt Valuta
                        String NOKorNOTLest=showInputDialog("Bestem Valuta (fra/til)");
                        int NOKorNOT=Integer.parseInt(NOKorNOTLest);
    
                        //Dersom tallet 0 skrives inn, konverteres beløpet fra NOK til Euro
                        if(NOKorNOT==0){
                            System.out.println("Fra NOK til Euro");
                            double NyBeløp=Euro.ConvertTo(beløp);
                            System.out.println(beløp + " NOK" + "=" + NyBeløp + " Euro");
                            choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Valuta", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet
                        }   
                        //Dersom tallet 1 skrives inn, konverteres beløpet fra Euro til NOK
                        if(NOKorNOT==1){
                            System.out.println("Fra Euro til NOK");
                            double NyBeløp=Euro.ConvertFrom(beløp);
                            System.out.println(beløp + " Euro" + "=" + NyBeløp + " NOK");
                            choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Valuta", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet
                        }
                    }
                    //Dersom tallet 3 skrives inn i 'skriv tall', blir svenske kroner (SEK) valgt
                    if(VelgValuta==3){
                        Valuta2 SEK=new Valuta2(1);
                        System.out.println(" 0: Fra NOK til SEK\n 1: Fra SEK til NOK");//Velge fra eller til valgt Valuta
                        String NOKorNOTLest=showInputDialog("Bestem Valuta (fra/til)");
                        int NOKorNOT=Integer.parseInt(NOKorNOTLest);
                        //Dersom tallet 0 skrives inn, konverteres beløpet fra NOK til Euro
                        if(NOKorNOT==0){
                            System.out.println("Fra NOK til SEK");
                            double NyBeløp=SEK.ConvertTo(beløp);
                            System.out.println(beløp + " NOK" + "=" + NyBeløp + " SEK");
                            choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Valuta", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet (starte loop på nytt)
                            
                        }
                        //Dersom tallet 1 skrives inn, konverteres beløpet fra Euro til NOK
                        if(NOKorNOT==1){
                            System.out.println("Fra SEK til NOK");
                            double NyBeløp=SEK.ConvertFrom(beløp);
                            System.out.println(beløp + " SEK" + "=" + NyBeløp + " NOK");
                            choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Valuta", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet (starte loop på nytt)
                           
                        }
                        
                    }

            } while(choice==YES_OPTION);

            

} 
    
}