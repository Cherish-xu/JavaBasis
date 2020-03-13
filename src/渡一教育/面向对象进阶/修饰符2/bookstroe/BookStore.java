package 渡一教育.面向对象进阶.修饰符2.bookstroe;
/**书店*/
public class BookStore {

    private final static int BOOKSTORE_ADMIN = 0;
    private final static int BOOKSTORE_VIP = 1;
    private final static int BOOKSTORE_NORMAL = 2;

    //描述一个书店买买书打折的计算方法
    public void buyBook(float price,int identity){//买书的方法
        switch (identity){
            case BookStore.BOOKSTORE_ADMIN://管理员
                System.out.println("您是书店管理员可享受五折优惠，应付款"+price*0.5);
                break;
            case BookStore.BOOKSTORE_VIP://VIP
                System.out.println("您是本书店VIP会员可享受八折优惠，应付款"+price*0.8);
                break;
            case BookStore.BOOKSTORE_NORMAL://普通顾客
                System.out.println("您是普通顾客暂不可享受优惠，应付款"+price*1.0);
                break;
            default:
                System.out.println("对不起，系统未能查到您的身份");
        }
    }
}
