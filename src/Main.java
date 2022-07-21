import static katas.FindOutlier.find;
import static katas.RegexvalidatePINcode.validatePin;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{160, 3, 1719, 19, 11, 13, -21};
        String e = "12455";

        System.out.print(validatePin(e));
    }
}
