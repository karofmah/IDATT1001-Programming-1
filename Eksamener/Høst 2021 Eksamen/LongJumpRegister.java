import java.util.ArrayList;

public class LongJumpRegister {
    /**
     *Class LongJumpRegister
     * @author 10046 (projectfile has wrong number as its name)
     * @version 1.01 2021.12.16
     * @see LongJumpResult
     * @see LongJumpGUI
     * LongJumpRegister is where the register is constructed
     * in addition to the functions/methods that are crucial part of the program
     */
    private ArrayList <LongJumpResult> results;

    /**
     * The results are represented in ArrayList because it
     * has more built in methods than fixed array.
     * It also generally makes it possible to
     * utilize the index of the list, which might be useful.
     * These qualities combined are not included in hashset/hashmap
     */
    public LongJumpRegister() {
        results=new ArrayList();
    }

    /**
     * Adds new result from Long Jump (LongJumpResult)
     * @param startNumber the start number of the participant
     * @param nameOfAthlete name of the Athlete
     * @param result result of the long jump (meters)
     * @param valid whether the jump of the participant is valid or not
     * @param time the time it takes from jumping to landing
     * @return boolean depending on whether a result is added or not
     * Therefore it also depends on whether the result already exsits in the register
     * It is also important to acknowledge that I have used composition in this program
     * It can be observed by noticiing the composits in the parameter, in opposition to an object
     * The reason for that is that in reality the information is directly registered
     * from observation to the register of results.
     * Therefore the results can not exist/accessed outside of this register
     * This can be accomplished by using compositon, in opposition to aggregation
     */
    public boolean addNewResult(int startNumber, String nameOfAthlete, double resultLength, boolean valid, String time){
        LongJumpResult result=new LongJumpResult(startNumber,nameOfAthlete,resultLength,valid,time);
        if(results.contains(result)){
            return false;
        }
        return results.add(result);
    }

    /**
     *toString-Method
     * @return results as a String
     * It is important to notice that the method overrides a built in method, hence @Override
     * I already explained why I chose ArrayList, but another option is to use
     * stringbuilder and use this toString as a help-method.
     * Even though the differences are not that many in my opinion,
     * I would implement stringbuilder for better readability if
     * I had more time
     */
    @Override
    public String toString() {
        return "LongJumpRegister{" +
                "results=" + results +
                '}';
    }

    /**
     * Shows results from a specific athlete that can be identified by
     * start number and name of the athlete. Both is required to identify
     * the athlete because several athletes can have the same name.
     * @param startNumber start number of the athlete one would want the results of
     * @param nameOfAthlete the name of the ethlete one would want the results of
     * @return resultFromAthlete as ArrayList because there can be several results
     */
    public ArrayList showResultFromAthlete(int startNumber, String nameOfAthlete){
        ArrayList resultsFromAthlete=new ArrayList();
        for (LongJumpResult result : results){
            if(result.getStartNumber()==startNumber && result.getNameOfAthlete().trim().equals(nameOfAthlete.trim())){
                resultsFromAthlete.add(new LongJumpResult(result));
            }
        }
        return resultsFromAthlete;
    }

    /**
     * Shows the best result
     * @return bestResult as ArrayList because there is
     * a sligtht chance that several athletes have the same exact results.
     * If this was not the case, the return type would be LongJumpResult
     */
    public ArrayList showBestResult(){
        ArrayList bestResult=new ArrayList();
        for(int i=0; i<results.size()-1;i++){
            if(results.get(i+1).getTime().isAfter(results.get(i).getTime())){
                if(results.get(i+1).getResultLength()<results.get(i).getResultLength()) {
                    bestResult.add(new LongJumpResult(results.get(i)));
                    return bestResult;
                }
            }
        }
        return null;
    }

    /**
     * Calculates the average of the lengths of the jumps.
     * This is from all results.
     * @return averageJump as a double
     * because decimal number is likely when calculating averages
     * The task asked for a method that should calculate average
     * of all jumps, and I interpreted this as calculating the average
     * of the lengths of the jumps. The specifics were not stated in the task.
     */
    public double findAverageJump(){
        int totalJumps=0;
        for(LongJumpResult result : results){
            totalJumps+=result.getResultLength();
        }
        int averageJump=totalJumps/results.size();
        return averageJump;

    }

}
