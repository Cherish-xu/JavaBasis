package src.渡一一阶付费课.开班测试;

public class one {
    public static void main(String[] args) {
        for (int i = 2;i <= 100;i++){
            if (one.f(i) == true){
                System.out.println(i+"是素数");
            }else if (one.f(i) == false){
                System.out.println(i+"不是素数");
            }
        }
    }
    public static boolean f(int n){
        for (int i = 2;i < n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
