package katas;

public class RegexvalidatePINcode {
    public static boolean validatePin(String pin){
        return (pin.length() == 4 || pin.length() == 6) && pin.matches("^\\d+$");
    }
}
