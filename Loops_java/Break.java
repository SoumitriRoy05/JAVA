package Loops_java;

public class Break {
 public static void main(String[] args) {
    int num=1;
    while(true)
    {
        if((num%5==0)&&(num%7==0))
        {
            System.out.println("Ans:"+num);
            break;
        }
        num++;
    }
 }   
}
