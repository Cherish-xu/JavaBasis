package 渡一教育.直播课.经典排序算法3.test;

import java.net.Socket;
import java.util.Arrays;

public class Sort {

    //排序的本质是什么
    //比较 + 条件 + 交换

    //快速排序
    public void quickSort(int[] array,int start,int end){
        //严谨的判断
        if (start > end){//保证i和j是可以执行的
            return;
        }
        //开始排序
        int i = start;//控制从前往后找寻元素的索引
        int j = end;//控制从后往前找寻元素的索引
        int temp = array[i];//存储的是作为"标兵的值"
        //循环比较
        while (i != j){//证明当前队伍还没有比较完毕
            //让j做事情     从队尾开始挨个找寻元素 拿标兵去比较  如果大 继续  如果小 报告
            while (i < j && array[j] >= temp){
                j--;
            }//j没有碰到i   并且j找到的元素比标兵大    j就继续
            if (i < j){//证明上面的循环执行完了    i和j还没有相遇    循环到一半终止了    找到了一个小的数
                array[i] = array[j];
            }
            //让i做事  从队收开始挨个找寻   去和标兵比   如果小 继续  如果大 报告
            while (i < j && array[i] <= temp){
                i++;
            }
            if (i < j){//i的工作没有做完   找到了一个大数
                array[j] = array[i];
            }
        }
        array[i] = temp;//标兵去那个空的位置     归位
        //标兵的前面比他小  标兵的后面比他大
        //让分开的两个队伍各自去排序
        this.quickSort(array,start,i-1);
        this.quickSort(array,i+1,end);

    }


    //归并排序
    public int[] mergeSort(int[] arr){
        if (arr.length < 2){//数组的长度小于二数组中只有一个元素     合并
            return arr;
        }
        int mid = arr.length/2;//将数组分开的过程
        //根据mid的位置  获取左边和右边的子数组
        int[] left = Arrays.copyOfRange(arr,0,mid);//前半部分
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);//后半部分
        //将left和right两个数组分别再分
        int[] a = this.mergeSort(left);
        int[] b = this.mergeSort(right);
        //重新合并
        return this.merge(a,b);
    }






    //设计一个方法    合并两个数组  合并数组的同时排序
    //数组合并
    //a{1,4,5}  b{2,3,7}
    //c{1,2,3,4,5,7}

    //合并数组并排序       两个数组？两个数组        返回值？一个合并好的新数组
    private int[] merge(int[] left,int[] right){
        //1.创建一个新的数组    用来存放两个数组的全部元素
        int[] result = new int[left.length+right.length];
        //2.将新数组填满
        //控制新数组的索引变化
        //int i = 0;//控制左边数组的索引位置
        //int j = 0;//控制右边数组的索引位置
        //int index = 0;//控制新数组的索引位置
        for (int index=0,i=0,j = 0;index <result.length;index++){
            //1.i走完了    left没有元素了   right数组的全部元素挨个放入新数组
            if (i>=left.length){
                result[index] = right[j++];
            }else if (j>=right.length){//2.j走完了    right没有元素了   left数组的全部元素挨个放入新数组
                result[index] = left[i++];
            }else if (left[i] < right[j]){//3.i和j都没有走完    i的值小就将left的值存入新数组
                result[index] = left[i++];
            }else {//3. j的值小    right值存入数组
                result[index] = right[j++];
            }

        }
        return result;
    }
















    //主方法
    public static void main(String[] args) {
        Sort s = new Sort();

        //快速排序
        int[] array = new int[]{180,185,179,168,178,170};
        s.quickSort(array,0,array.length-1);
        for (int v:array){
            System.out.println(v);
        }

        System.out.println("=================================================================");


        //归并排序--分开
        int[] a = {1,4,5};
        int[] b = {2,6,8};
        s.merge(a,b);


        //归并排序--完整
        array = s.mergeSort(array);//伏兵排序   底层数组的合并     有返回值
        for (int v:array){
            System.out.println(v);
        }
    }
}
