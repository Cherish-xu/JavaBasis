package 渡一教育.直播课.二分查找_约瑟夫环_贪心算法;

public class TestArithmetic {

    public static void main(String[] args) {
        TestArithmetic ta = new TestArithmetic();
        int[] array = {1,2,3,5,7,8,10,12,16,17,18,20};
        int key = 18;

        //循环遍历查找
        int index = ta.search(array,key);
        //System.out.println(index);

        //二分查找
        int index2 = ta.binaryearch(array,key);
        //System.out.println(index2);

        //约瑟夫环
        int end = ta.josephusRound(41,3);
        //System.out.println("最后剩余的是第"+(end+1)+"号玩家");

        //约瑟夫环--递归
        int x = ta.josephusByRec(41,3);
        System.out.println(x);
    }

    //解决一个元素查找问题

    //按照循环的方式逐个找寻元素
    //参数 ---数组+值   返回值
    public int search(int[] array,int key){
        int index = -1;//记录找到元素的位置
        for (int i = 0;i < array.length;i++){
            if (array[i] == key){//证明找到了
                index = i;//用i记录找到的位置
                break;
            }
        }
        return index;
    }


    //二分查找
    public int binaryearch(int[] array,int key){
        int start = 0;//开始的索引位置
        int end = array.length-1;//记录结束位置的索引
        int middle = 0;//记录中间位置的索引
        //为了保证程序的健壮性，做一个严谨的判断
        if (start > end || key < array[start] || key > array[end]){//判断数组中是否有要找的元素
            return -1;
        }
       while (start <= end){
           middle = (start+end)/2;//middle是中间的索引
           if (key < array[middle]){//要找的数在前半部分
               end = middle-1;
           }else if (key > array[middle]){
               start = middle+1;
           }else {//刚好找到
               return middle;
           }
       }
       return -1;
    }


    //约瑟夫环
    //参数--几个人喝酒+数到那个数
    //返回值--最后那个人的位置
    public int josephusRound(int playersCount,int luckNumber){
        int result = -1;//记录最后那个人的位置
        //记录那个人的状态，是死是活，死了的话无法数数，或者可以数数
        //数组动态初始化的时候    默认值是false   false==没死   true==死了
        boolean[] players = new boolean[playersCount];
        //记录数到几了
        int count = 0;
        //记录已经死掉的人数
        int deadCount = 0;

        over:while (true) {//控制玩的轮次
            //循环--挨个报数
            for (int i = 0; i < players.length; i++) {
                if (players[i] == true) {//人已近死了
                    continue;
                }
                //我如果人是正常的，继续数数
                count++;
                if (count == luckNumber) {//数到的数字与规定的数字相同，死了
                    players[i] = true;
                    //System.out.println((i+1)+"号玩家死掉了");
                    count = 0;//计数器归零
                    deadCount++;//记录多一个死人
                    if (deadCount == players.length) {
                        result = i;
                        break over;
                    }
                }
            }
        }
        return result;
    }


    //约瑟夫环--递归
    public int josephusByRec(int players,int key){
        if (players == 1){
            return 0;
        }
        return (this.josephusByRec(players-1,key) % players);
    }


}
