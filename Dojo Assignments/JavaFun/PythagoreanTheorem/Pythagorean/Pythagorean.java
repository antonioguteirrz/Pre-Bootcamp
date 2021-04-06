

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        int doublelegA = legA *legA;
        int doublelegB = legB * legB;
        int calculation = doublelegA + doublelegB;
        double squareroot = Math.sqrt(calculation);
        return squareroot;
    }
}
