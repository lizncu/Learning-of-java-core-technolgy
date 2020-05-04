package testasd;

import java.util.ArrayList;

public class test1 {
    public static <p> void main(String[] args){

        manager boss=new manager("x li",5000,1996,11,15);
        boss.setBonus(10000);
        manager boss2=new manager("x li",5000,1996,11,15);
        boss2.setBonus(10000);
        employee[] staff=new employee[5];
        staff[0]=boss;
        staff[1]=new employee("C Su",6000,1997,12,16);
        staff[2]=new employee("F Li",10000,1996,12,16);
        staff[3]=new employee("F Li",10000,1996,12,16);
        staff[4]=boss2;

        ArrayList<employee> employees=new ArrayList<>();//建立数组的第二种办法
        employees.add(new employee("Harry potter",15500,1936,11,15));
        employees.set(1,new employee("Heremoine",20000,1997,11,16));//设置第i个元素
        employee e=employees.get(1);//将变量e赋予employees[1]
        employees.ensureCapacity(100);//确定最小容量
        int a=employees.size();
        employees.trimToSize();//固定分配内存

        for(employee f:staff)
        {System.out.println("the name is "+f.getName());}

        boolean p=staff[2].equals1(staff[1]);
        if (p)
            System.out.println("they are same!");


        else
            System.out.println("they are different");

        String q=staff[2].toString();
        System.out.println(q);



    }
}
