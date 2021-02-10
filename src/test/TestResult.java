package test;
import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String mesage = "228SYDORENKO228";
        System.out.println(mesage+" :");
        byte[] m = Exercise.Encrypt(mesage, "stack_overlow");
        for (byte i : m) System.out.print(i);
        System.out.println();
        }
}
