package Loops_java;

public class Continue {
 public static void main(String[] args) {
    int num=1;
    for(num=1;num<=50;num++)
    {
        if(num%3==0)
        {
            continue;
        }
        System.out.println(num);
    }
 }   
}
