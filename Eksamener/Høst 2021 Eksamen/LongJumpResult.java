import java.time.LocalTime;

/**
 *Class LongJumpResult
 * @author 10046 (projectfile has wrong number as its name)
 * @version 1.01 2021.12.16
 * @see LongJumpRegister
 * @see LongJumpGUI
 * LongJumpResult is where the objects
 * and methods connected to these objects are constructed
 */
public class LongJumpResult {
    private int startNumber; //number
    private String nameOfAthlete;
    private double resultLength;
    private boolean valid;
    private LocalTime time;

    /**
     * Constructor for LongJumpResult
     * @param startNumber the start number of the participant
     * @param nameOfAthlete name of the Athlete, can not be blank
     * @param result result of the long jump (meters)
     * @param valid whether the jump of the participant is valid or not
     * @param timeString the time it takes from jumping to landing.
     * timeString is defined by  hours:minutes:seconds
     * because it can be useful when for example deciding what result is the best. Another option
     * would have been to use hours:minutes, which is possible by using the method LocalTime of
     * (int hour, int minute).
     */
    public LongJumpResult(int startNumber, String nameOfAthlete, double resultLength, boolean valid, String timeString) throws IllegalArgumentException{
        this.startNumber = startNumber;
        if(nameOfAthlete.isBlank()) throw new IllegalArgumentException("The name of the athlete can not be blank");
        this.nameOfAthlete = nameOfAthlete;//include exceptions
        this.resultLength = resultLength;
        this.valid = valid;
        this.time = time=LocalTime.parse(timeString);
    }

    /**
     *Constructor for LongJump Result
     * @param Object the object with the parameters described above
     */
    public LongJumpResult(LongJumpResult Object){
    this.startNumber=Object.getStartNumber();
    this.nameOfAthlete=Object.getNameOfAthlete();
    this.resultLength=Object.getResultLength();
    this.valid=Object.isValid();
    this.time=Object.getTime();
    }

    /**
     * Get start number (the example from 2 b) shows only start number, not last names)
     * therefore I decided to only use numbers. That is because I interpreted
     * the task in a way that I can decide whether to use the last name of the
     * athlete or the start number
     * @return startNumber as an int
     */
    public int getStartNumber() {
        return startNumber;
    }

    /**
     * get name of athelte
     * @return nameOfAthlete as a String
     * which is logical because it is a name (letters)
     */
    public String getNameOfAthlete() {
        return nameOfAthlete;
    }

    /**
     * Get result
     * @return resultLength as a double (meters)
     * because the time often will be a decimal number (most likely)
     */
    public double getResultLength() {
        return resultLength;
    }

    /**
     * Decides whether the jump is valid
     * @return valid as a boolean
     * depending on whether the jump is valid or not
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Get time
     * @return time as LocalDate
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * toString-Method
     * @return startNumber, nameOfAthlete, result, valid, time as Strings
     * It is important to notice that the method overrides a built in method, hence @Override
     * The reason a gap is added in the end (\n), is for better readability and
     * representation of the register of results
     */
    @Override
    public String toString() {
        return "LongJumpResult{" +
                "startNumber=" + startNumber +
                ", nameOfAthlete='" + nameOfAthlete + '\'' +
                ", result=" + resultLength + " m"+
                ", valid=" + valid +
                ", time=" + time +
                '}' + "\n";
    }

    /**
     *Compare one object with another
     * @param o the object that is compared to
     * @return boolean based on all the parameters from the
     * primary constructor. All of them has to be
     * included to identify an object(result). This is because one athlete can do mulitple
     * long jumps, and therefore their result can not be identified by their name (they can have mulitple results).
     * It is also worth to mention that the method overrides a built in method, hence @Override
     * the method is for help when using the contains() method later
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongJumpResult that = (LongJumpResult) o;
        return startNumber == that.startNumber && Double.compare(that.resultLength, resultLength) == 0 && valid == that.valid && nameOfAthlete.equals(that.nameOfAthlete) && time.equals(that.time);
    }

    /**
     * No set-methods has been implemented because in my opinion it would not be logicial
     * This is because startNumber is a number that often wont change
     *The name of the athlete will in most cases be the same
     * the result is in most cases final
     * Either the result is valid or it is not
     * The time is also registered once at the end of the jump
     * Keep in mind that this information is given after a jump is already registered,
     * hence the information at that time is constant
     */
}
