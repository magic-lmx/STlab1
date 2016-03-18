/**
 * Created by magic on 16/3/18.
 */
public class triangle {
    public String judge(int a,int b, int c) {
        if(a == b && b==c)
            return "equilateral";
        else if (( a == b || b == c) && a*a+b*b == c*c)
            return "right angle isosceles";
        else if (a == b || b == c)
            return "isosceles";
        else if (a*a+b*b == c*c)
            return "right angle";
        else
            return "scalene";
    }
}
