package javaCore.chapter01Variable.exercice;

public class FirstInstruction {
    public static void main(String[] args) {
        int age = 31;
        System.out.println(age);
        String displayAge = "j'ai " + age + " ans.";
        System.out.println(displayAge);

        String firstName = "Alex";
        System.out.println(firstName);
        String displayName = "Je m'appelle " + firstName;
        System.out.println(displayName);

        System.out.println(displayName + " et " + displayAge);
        System.out.println("Je m'appelle " + firstName + " et j'ai " + age + " ans.");
    }
}
