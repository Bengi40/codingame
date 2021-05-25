import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String binary = "";

        for(int i = 0; i < MESSAGE.length(); i++) {
            Character test = MESSAGE.charAt(i);
            int monAscii = new String(test.toString()).hashCode();
            binary += Integer.toBinaryString(monAscii).length()<7 ? "0" + Integer.toBinaryString(monAscii) : Integer.toBinaryString(monAscii) ;
        }

        Character charPrecedent = binary.charAt(0); 
        String codeChuck = charPrecedent.toString().equals("0") ? "00 " : "0 ";
        
        for (int i = 1; i < binary.length(); i++) {
            if(binary.charAt(i) == charPrecedent) {
                codeChuck += "0";
            } else {
                codeChuck += "0";
                charPrecedent = binary.charAt(i);
                codeChuck += charPrecedent.toString().equals("0") ? " 00 " : " 0 ";
            }
        }
        codeChuck += "0";
        in.close();
        System.out.println(codeChuck);
    }
}