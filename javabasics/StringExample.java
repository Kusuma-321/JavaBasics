package javabasics;

public class StringExample {
    public static void main(String args[])
    {
        String s="Kusuma";
        String s1=new String("Kusuma").intern();
        System.out.println(s==s1);
check(null);
    }
    public static void check(String str)
    {
        String s="Kusuma";
        System.out.println(s.equals(str));
    }
}
