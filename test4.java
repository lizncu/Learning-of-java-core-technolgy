package testasd;

public class test4 {
    public static void main(String args[])
    {
        employee alice1=new employee("Alice Adams",75000,1987,12,15);
        employee alice2=alice1;
        employee alice3=new employee("Alice Adams",75000,1987,12,15);
        employee bob=new employee("Bob Brandson",50000,1989,10,1);
        String q=bob.toString();
        System.out.println(q);
    }
}
