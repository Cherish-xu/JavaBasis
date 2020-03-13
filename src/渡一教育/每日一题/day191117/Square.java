package 渡一教育.每日一题.day191117;

public class Square {
    long width;
    public Square(long i){
        width = i;
    }
    public static void main(String[] args) {
        Square a,b,c;
        a = new Square(42L);
        b = new Square(42L);
        c = b;
        long s = 42L;

        System.out.println(a==c);
    }
}
