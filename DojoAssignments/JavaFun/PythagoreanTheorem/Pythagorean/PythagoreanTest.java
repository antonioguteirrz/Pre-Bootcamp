package DojoAssignments.JavaFun.PythagoreanTheorem.Pythagorean;


public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean che = new Pythagorean();
        double answer = che.calculateHypotenuse(20, 20);
        System.out.printf("This is the answer: %s", answer);
    }
}
