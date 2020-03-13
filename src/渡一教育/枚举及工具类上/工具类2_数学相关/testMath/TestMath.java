package 渡一教育.枚举及工具类上.工具类2_数学相关.testMath;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;

public class TestMath {

    //设计一个方法，用来计算给定数字的阶乘
    public static BigInteger factorial(int num){
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= num;i++){
            result = result.multiply(new BigInteger(i+""));
        }
        return result;
    }

    public static void main(String[] args) {
        Math.abs(-10);//返回绝对值
        // 返回数字临近的整数
        Double c = Math.ceil(10.3);//向上取整
        Double f = Math.floor(10.2);//向下取整
        Double r = Math.rint(1.4);//返回最近的整数，如果正好在中间    则返回偶数
        long ro = Math.round(1.5);//四舍五入

        Math.max(1,2);//返回两个参数中的最大值
        Math.min(2,1);//返回两个参数中的最小值

        Math.pow(2,3);//a的b次方   2*2*2

        Math.sqrt(9);//开平方

        Math.random();//随机产生一个从0.0到1.0之间的一个double类型的随机数[0.0,1.0),取左不取右

        //Random    用来做产生随机数的类
        Random random = new Random();
        int value = random.nextInt();//产生一个随机数  无参的  随机没有范围的产生

        //随机产生一个从0到参数的随机数   左闭右开    取左不取右
        int result = random.nextInt(10);//范围[0,10)

        //5.0-10.9
        float ss = random.nextInt(6)+5+random.nextFloat();



        //UUID类
        //无任何继承关系
        UUID uuid = UUID.randomUUID();//随机产生一个32位的随机数
        //用处：产生数据库的主键  作为唯一标识来用
        //System.out.println(uuid.toString());


        //java.math
        BigInteger bigInteger = new BigInteger("123");


        BigInteger b1 = TestMath.factorial(10);
        System.out.println(b1);

        //处理超过double范围的小数
        BigDecimal bigDecimal = new BigDecimal(123.456);
        //小数点之后1位，按照四舍五入
        System.out.println(bigDecimal.setScale(1,BigDecimal.ROUND_HALF_DOWN));


        //将小数点之前和之后的位数都可以处理的类
        DecimalFormat df = new DecimalFormat("0000.##");//格式：两种    0和#
        String dfs = df.format(123.456);
        System.out.println(dfs);


        /*System.out.println(c);
        System.out.println(f);
        System.out.println(r);
        System.out.println(ro);*/
    }
}
