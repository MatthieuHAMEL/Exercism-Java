import java.util.ArrayList;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        var digits = new ArrayList<Integer>();

        int tmp_numberToCheck = numberToCheck;
        while(tmp_numberToCheck != 0)
        {   
            digits.add(tmp_numberToCheck % 10);
            tmp_numberToCheck = tmp_numberToCheck / 10;
        }

        int armstrongSum = 0;
        for (int elt : digits) {
            armstrongSum += (int) Math.pow(elt, digits.size());
        }

        return armstrongSum == numberToCheck;
    }

}
