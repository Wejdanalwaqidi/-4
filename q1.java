import java.awt.*;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int w,e;
        Scanner input=new Scanner(System.in);
        System.out.println("enter width:");
        w= input.nextInt();
        System.out.println("enter height:");
        e= input.nextInt();
        Rectangle x=new Rectangle(w,e);
        System.out.println("actual perimeter="+2*(x.getWidth()+ x.getHeight()));
        System.out.println("expected perimeter="+2*(e+w));


    }
}



