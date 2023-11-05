package automationtest;

public class ForLoop_Q4 {

    public static void main(String[] args) {
        ForLoop_Q4 q4 = new ForLoop_Q4();
        q4.printMyName("Jwalant", 10);
        q4.printMyName("Jwalant", 15);
    }

    public void printMyName(String name, int howManyTime){

        for(int i = 0; i<howManyTime; i++){
            System.out.println(name);
        }
    }
}
