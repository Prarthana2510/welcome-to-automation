package automationtest;

public class ifThenElse_Q3 {

    public static void main(String[] args) {
        ifThenElse_Q3 q3 = new ifThenElse_Q3();
        System.out.println(q3.isTeen(15));
        System.out.println(q3.isTeen(25));
    }

    public boolean isTeen(int age){

        if (age <= 18) {
            return true;
        }else {
            return false;
        }
    }

}
