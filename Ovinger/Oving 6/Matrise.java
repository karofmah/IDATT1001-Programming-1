package Oving_6;


public class Matrise {
    //Lager objektbariabler
    private int row;
    private int column;
    private int[][] matrise;

    public Matrise(int row, int column){//Lager konstruktør med antall rader og kolonner
        
    this.row=row;
    this.column=column;

    }
        
    public void makeMatrise(){//Lager metode for å lage/fylle opp en matrise
            matrise=new int[row][column];//Lager ny matrise

            for (int i = 0; i < row; i++) {//Dobbel for-løkke for å gi verdier langs rader og kolonner
                for (int j = 0; j < column; j++) {

                    matrise[i][j]=(i + 1)^(4 - j);//Verdiene som blir gitt følger denne formelen 
                }
            }
        }
    //Lager tilgangsmetoder
    public int[][] getMatrise(){
            return matrise;
            }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    
    public int[][] addMatrise(Matrise matrise2){//Lager metode for addisjon av to matriser
        int [][] nyMatrise = new int[column][row];//Lager en ny matrise som representerer produktet
            if(column!=matrise2.getColumn() && row!=matrise2.getRow()){//Hvis matrisene ikke har lik dimensjon (like mange rader og kolonner), er operasjonen umulig
                return null;//Returnerer null
            }
            for(int i=0;i<row;i++){//Dobbel for-løkke som adderer to matriser med hensyn på rader og kolonner
                for(int j=0;j<column;j++){
                    nyMatrise[i][j]=matrise[i][j]+matrise2.getMatrise()[i][j];
                }
            }
        return nyMatrise;//Returnerer ny matrise
        }

    public int[][] multiMatrise(Matrise matrise2){//Lager metode for mulitplikasjon av to matriser
    int [][] nyMatrise = new int[column][row];//Lager en ny matrise som representerer produktet
    if(column!=matrise2.getRow()){//Hvis antall kolonner til den første matrisen ikke er lik antall rader hos den andre matrisen, er operasjonen umulig
        return null;//Returnerer null
    }
            
    for(int i=0;i<row;i++){//Dobbel for-løkke som mulitpliserer to matriser med hensyn på rader og kolonner
        for(int j=0;j<column;j++){
            for(int k=0;k<row;k++){
                nyMatrise[i][j]+=matrise[i][k]*matrise2.getMatrise()[k][j];
                    
    }  
                }
            }
            return nyMatrise;//Returnerer ny matrise
        }        
    public int[][] transMatrise(){//Lager metode for å transponere en matrise
    int [][] nyMatrise = new int[column][row];//Lager en ny matrise som representerer matrisen etter transponering 
    for(int i=0;i<row;i++){//Dobbel for-løkke som transponerer den opprinnelige matrisen
        for(int j=0;j<column;j++){
            nyMatrise[i][j]=matrise[j][i];
                
            } 
        }
        return nyMatrise;//Returnerer ny matrise
    
        }
}

