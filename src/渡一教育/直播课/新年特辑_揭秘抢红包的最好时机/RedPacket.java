package src.渡一教育.直播课.新年特辑_揭秘抢红包的最好时机;

import java.util.ArrayList;
import java.util.List;

public class RedPacket {
    //常量    最大  最小值金额
    public static final int MIN_Money = 1;
    public static final int MAX_MONEY = 200*200;

    //最大红包金额    比上  平均红包金额  的倍数
    public static final int TIMES = 2;
    public static List<Integer> splitRedPacket(int money,int count){

        List<Integer> list = new ArrayList<>(count);
        for (int i = 0;i < count;i++){
            //随机出一个值
            int random = 0;
            list.add(random);
        }
        return list;
    }
    public static int random(int money,int count,int min,int max){

        return 0;
    }
}
