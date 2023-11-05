package automationtest;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        String[] arrayList = {"Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", "Rest Assured"};
        //Method 1
        for (String groupName : arrayList) {
            System.out.println(groupName);
        }

        //Method 2
        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }

    }
}
