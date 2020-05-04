package testasd;

public class test2 {
    public static void main(String[] args) {
        Person p = new employee2("XTL", "teacher", 120, 1996, 11, 15);
        Person l = new Student("SCN", "maths");
        String S = p.getDescription();
        String K = l.getDescription();
        System.out.println(S);
        System.out.println(K);
    }

}
