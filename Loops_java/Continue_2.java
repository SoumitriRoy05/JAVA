package Loops_java;

public class Continue_2 {
    public static void main(String[] args) {
        int num=1;
        while(num<=50)
        {
            if(num%3==0)
            {
                num++;
                continue;
            }
            System.out.println(num);
         num++;
        }
    }
}
