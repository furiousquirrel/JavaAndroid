package lesson1;

public class MyMath {
    public int getCount (int c, int d, int... a) {
        int e=0;
        if (d<c) {
            e=d;
            d=c;
            c=e;
            e=0;
        }
        for (Integer st:a) {
            if (c<=st && st<=d) {
                e++;
            }
        }
    return e;
    }
}
